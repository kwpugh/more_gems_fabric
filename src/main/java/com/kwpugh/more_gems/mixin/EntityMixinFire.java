package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixinFire
{
    public EntityMixinFire(EntityType<?> type, World world)
    {
        super();
    }

    @Inject(method = "isFireImmune", at = @At("HEAD"), cancellable = true)
    public void moregemsIsFireImmune(CallbackInfoReturnable<Boolean> cir)
    {
        Entity entity = (Entity) (Object) this;

        if(entity instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) entity;

            if(PlayerEquipUtil.hasItemInInventory(player, ItemInit.TOPAZ_JUJU) ||
                    PlayerEquipUtil.hasItemInInventory(player, ItemInit.MOISSANITE_JUJU))
            {
                cir.setReturnValue(true);
            }
        }
    }
}