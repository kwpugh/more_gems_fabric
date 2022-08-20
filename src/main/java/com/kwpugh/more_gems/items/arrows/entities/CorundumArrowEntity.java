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

public class CorundumArrowEntity extends PersistentProjectileEntity
{
    private int duration = 300;
    private AreaEffectCloudEntity cloud;

    public CorundumArrowEntity(EntityType<? extends CorundumArrowEntity> entityType, World world)
    {
        super(entityType, world);
    }

    public CorundumArrowEntity(World world, double x, double y, double z)
    {
        super(EntityInit.CORUNDUM_ARROW, x, y, z, world);
    }

    public CorundumArrowEntity(World world, LivingEntity owner)
    {
        super(EntityInit.CORUNDUM_ARROW, owner, world);
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
        return new ItemStack(ItemInit.CORUNDUM_ARROW);
    }

    protected void onHit(LivingEntity target)
    {
        super.onHit(target);

        this.setPierceLevel((byte) (this.getPierceLevel() + MoreGems.CONFIG.GENERAL.corundumPierceLevel));
        this.setPunch(this.getPunch() + MoreGems.CONFIG.GENERAL.corundumPunchLevel);
        target.damage(DamageSource.IN_FIRE, MoreGems.CONFIG.GENERAL.corundumExtraDamage);

        StatusEffectInstance darkness = new StatusEffectInstance(StatusEffects.BLINDNESS, MoreGems.CONFIG.GENERAL.corundumBlindnessDuration, MoreGems.CONFIG.GENERAL.corundumBlindnessAmplifier);
        target.addStatusEffect(darkness, this.getEffectCause());

        BlockPos pos;
        BlockState state;
        Block block;

        if(MoreGems.CONFIG.GENERAL.corundumCobwebs)
        {
            for (int x = 2; x >= -2; x--)
            {
                for (int y = 1; y >= 0; y--)
                {
                    for (int z = 2; z >= -2; z--)
                    {
                        pos = target.getBlockPos().add(x, 0, z);
                        state = world.getBlockState(pos);
                        block = state.getBlock();

                        if(state.isIn(TagInit.AIR_BLOCKS))
                        {
                            world.setBlockState(pos, Blocks.COBWEB.getDefaultState());
                        }
                    }
                }
            }
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
