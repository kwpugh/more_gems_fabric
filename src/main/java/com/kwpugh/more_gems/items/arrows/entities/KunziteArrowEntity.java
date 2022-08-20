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

public class KunziteArrowEntity extends PersistentProjectileEntity
{
    private int duration = 300;
    private AreaEffectCloudEntity cloud;

    public KunziteArrowEntity(EntityType<? extends KunziteArrowEntity> entityType, World world)
    {
        super(entityType, world);
    }

    public KunziteArrowEntity(World world, double x, double y, double z)
    {
        super(EntityInit.KUNZITE_ARROW, x, y, z, world);
    }

    public KunziteArrowEntity(World world, LivingEntity owner)
    {
        super(EntityInit.KUNZITE_ARROW, owner, world);
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
        return new ItemStack(ItemInit.KUNZITE_ARROW);
    }

    protected void onHit(LivingEntity target)
    {
        super.onHit(target);

        this.setPierceLevel((byte) (this.getPierceLevel() + MoreGems.CONFIG.GENERAL.kunzitePierceLevel));
        this.setPunch(this.getPunch() + MoreGems.CONFIG.GENERAL.kunzitePunchLevel);
        target.damage(DamageSource.GENERIC, MoreGems.CONFIG.GENERAL.kunziteExtraDamage);
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
