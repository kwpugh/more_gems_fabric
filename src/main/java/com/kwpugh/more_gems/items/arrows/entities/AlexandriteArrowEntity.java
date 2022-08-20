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

public class AlexandriteArrowEntity extends PersistentProjectileEntity
{
    private int duration = 300;
    private AreaEffectCloudEntity cloud;

    public AlexandriteArrowEntity(EntityType<? extends AlexandriteArrowEntity> entityType, World world)
    {
        super(entityType, world);
    }

    public AlexandriteArrowEntity(World world, LivingEntity owner)
    {
        super(EntityInit.ALEXANDRITE_ARROW, owner, world);
    }

    public AlexandriteArrowEntity(World world, double x, double y, double z)
    {
        super(EntityInit.ALEXANDRITE_ARROW, x, y, z, world);
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
        return new ItemStack(ItemInit.ALEXANDRITE_ARROW);
    }

    protected void onHit(LivingEntity target)
    {
        super.onHit(target);

        this.setPierceLevel((byte) (this.getPierceLevel() + MoreGems.CONFIG.GENERAL.alexandritePierceLevel));
        this.setPunch(this.getPunch() + MoreGems.CONFIG.GENERAL.alexandritePunchLevel);
        target.damage(DamageSource.GENERIC, MoreGems.CONFIG.GENERAL.alexandriteExtraDamage);

        StatusEffectInstance slowness = new StatusEffectInstance(StatusEffects.SLOWNESS, MoreGems.CONFIG.GENERAL.alexandriteSlownessDuration, MoreGems.CONFIG.GENERAL.alexandriteSlownessAmplifier);
        target.addStatusEffect(slowness, this.getEffectCause());

        BlockPos pos;
        BlockState state;
        Block block;

        if (MoreGems.CONFIG.GENERAL.alexandritePowderSnow)
        {
            for (int x = 2; x >= -2; x--)
            {
                //for (int y = 0; y >= -1; y--)
                {
                    for (int z = 2; z >= -2; z--)
                    {
                        pos = target.getBlockPos().add(x, -1, z);
                        state = world.getBlockState(pos);
                        block = state.getBlock();

                        if (!state.isIn(TagInit.AIR_BLOCKS))
                        {
                            world.setBlockState(pos, Blocks.POWDER_SNOW.getDefaultState());
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
