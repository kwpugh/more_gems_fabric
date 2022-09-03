package com.kwpugh.more_gems.items.arrows.entities;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EntityInit;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.init.TagInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class CarbonadoArrowEntity extends PersistentProjectileEntity
{
    private int duration = 300;
    private AreaEffectCloudEntity cloud;

    public CarbonadoArrowEntity(EntityType<? extends CarbonadoArrowEntity> entityType, World world)
    {
        super(entityType, world);
    }

    public CarbonadoArrowEntity(World world, double x, double y, double z)
    {
        super(EntityInit.CARBONADO_ARROW, x, y, z, world);
    }

    public CarbonadoArrowEntity(World world, LivingEntity owner)
    {
        super(EntityInit.CARBONADO_ARROW, owner, world);
    }

    public void tick()
    {
        super.tick();

        if (this.world.isClient && !this.inGround)
        {
            this.world.addParticle(ParticleTypes.INSTANT_EFFECT, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
        }
    }

    protected ItemStack asItemStack()
    {
        return new ItemStack(ItemInit.CARBONADO_ARROW);
    }

    protected void onHit(LivingEntity target)
    {
        super.onHit(target);
        doHit(target);
    }

    protected void onBlockHit(BlockHitResult blockHitResult)
    {
        super.onBlockHit(blockHitResult);
        doExplode(blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
    }

    private void doHit(LivingEntity  target)
    {
        this.setPierceLevel((byte) (this.getPierceLevel() + MoreGems.CONFIG.GENERAL.carbonadoPierceLevel));
        this.setPunch(this.getPunch() + MoreGems.CONFIG.GENERAL.carbonadoPunchLevel);
        target.damage(DamageSource.IN_FIRE, MoreGems.CONFIG.GENERAL.carbonadoExtraDamage);

        StatusEffectInstance slowness = new StatusEffectInstance(StatusEffects.SLOWNESS, MoreGems.CONFIG.GENERAL.carbonadoSlownessDuration, MoreGems.CONFIG.GENERAL.carbonadoSlownessAmplifier);
        target.addStatusEffect(slowness, this.getEffectCause());

        doExplode(target.getX(), target.getBodyY(1.0), target.getZ());
    }

    private void doExplode(double x, double y, double z)
    {
        if(MoreGems.CONFIG.GENERAL.carbonadoExplosion && MoreGems.CONFIG.GENERAL.carbonadoExplosionOnBlock)
        {
            boolean griefingAllowed = this.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING);
            this.world.createExplosion(this, x, y, z, MoreGems.CONFIG.GENERAL.carbonadoExplosionFactor, griefingAllowed ? Explosion.DestructionType.BREAK : Explosion.DestructionType.NONE);
            this.discard();
        }
    }

    public void readCustomDataFromNbt(NbtCompound nbt)
    {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("Duration"))
        {
            this.duration = nbt.getInt("Duration");
        }
    }

    public void writeCustomDataToNbt(NbtCompound nbt)
    {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Duration", this.duration);
    }
}
