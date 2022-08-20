package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.items.arrows.entities.*;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class DispenserBehaviors
{
    public static void registerBehaviors()
    {
        DispenserBlock.registerBehavior(ItemInit.CITRINE_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new CitrineArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.TOURMALINE_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new TourmalineArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.KUNZITE_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new KunziteArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.TOPAZ_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new TopazArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.ALEXANDRITE_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new AlexandriteArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.CORUNDUM_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new CorundumArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.SAPPHIRE_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new SapphireArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.SPINEL_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new SpinelArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.CARBONADO_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new CarbonadoArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.MOISSANITE_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new MoissaniteArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });
    }
}
