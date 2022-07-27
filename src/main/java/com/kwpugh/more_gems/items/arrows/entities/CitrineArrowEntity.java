package com.kwpugh.more_gems.items.arrows.entities;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EntityInit;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class CitrineArrowEntity extends PersistentProjectileEntity
{
    private int duration = 300;
    private AreaEffectCloudEntity cloud;

    public CitrineArrowEntity(EntityType<? extends CitrineArrowEntity> entityType, World world)
    {
        super(entityType, world);
    }

    public CitrineArrowEntity(World world, LivingEntity owner)
    {
        super(EntityInit.CITRINE_ARROW, owner, world);
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
        return new ItemStack(ItemInit.CITRINE_ARROW);
    }

    protected void onHit(LivingEntity target)
    {
        super.onHit(target);

        this.setPierceLevel((byte) (this.getPierceLevel() + MoreGems.CONFIG.GENERAL.citrinePierceLevel));
        this.setPunch(this.getPunch() + MoreGems.CONFIG.GENERAL.citrinePunchLevel);
        target.damage(DamageSource.GENERIC, MoreGems.CONFIG.GENERAL.citrineExtraDamage);
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
