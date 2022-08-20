package com.kwpugh.more_gems.items.arrows.entities;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EntityInit;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.init.TagInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpinelArrowEntity extends PersistentProjectileEntity
{
    private int duration = 300;
    private AreaEffectCloudEntity cloud;

    public SpinelArrowEntity(EntityType<? extends SpinelArrowEntity> entityType, World world)
    {
        super(entityType, world);
    }

    public SpinelArrowEntity(World world, double x, double y, double z)
    {
        super(EntityInit.SPINEL_ARROW, x, y, z, world);
    }

    public SpinelArrowEntity(World world, LivingEntity owner)
    {
        super(EntityInit.SPINEL_ARROW, owner, world);
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
        return new ItemStack(ItemInit.SPINEL_ARROW);
    }

    protected void onHit(LivingEntity target)
    {
        super.onHit(target);

        this.setPierceLevel((byte) (this.getPierceLevel() + MoreGems.CONFIG.GENERAL.spinelPierceLevel));
        this.setPunch(this.getPunch() + MoreGems.CONFIG.GENERAL.spinelPunchLevel);
        target.damage(DamageSource.IN_FIRE, MoreGems.CONFIG.GENERAL.spinelExtraDamage);

        StatusEffectInstance poison = new StatusEffectInstance(StatusEffects.POISON, MoreGems.CONFIG.GENERAL.spinelPoisonDuration, MoreGems.CONFIG.GENERAL.spinelPoisonAmplifier);
        target.addStatusEffect(poison, this.getEffectCause());

        if(MoreGems.CONFIG.GENERAL.spinelPoisonCloud)
        {
            StatusEffectInstance weakness = new StatusEffectInstance(StatusEffects.WEAKNESS, MoreGems.CONFIG.GENERAL.spinelPoisonDuration, MoreGems.CONFIG.GENERAL.spinelPoisonAmplifier);

            this.cloud = new AreaEffectCloudEntity(target.world, target.getX(), target.getY(), target.getZ());
            this.cloud.setRadius(4.0F);
            this.cloud.setDuration(300);
            this.cloud.setParticleType(ParticleTypes.MYCELIUM);
            this.cloud.addEffect(poison);
            this.cloud.addEffect(weakness);

            world.spawnEntity(this.cloud);
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
