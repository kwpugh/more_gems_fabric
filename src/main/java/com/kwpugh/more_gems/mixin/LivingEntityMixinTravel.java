package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixinTravel extends Entity
{
    private LivingEntityMixinTravel(EntityType<?> type, World world)
    {
        super(type, world);
    }

    // For walk on water/lava feature to Corundum Juju
    @Inject(at = @At("HEAD"), method = "canWalkOnFluid", cancellable = true)
    public void moregemsCanWalkOnFluid(FluidState state, CallbackInfoReturnable<Boolean> cir)
    {
        LivingEntity livingEntity = (LivingEntity) (Object) this;

        if(livingEntity instanceof PlayerEntity player)
        {
            if(PlayerEquipUtil.hasItemInOffHand(player, ItemInit.CORUNDUM_JUJU) ||
                    PlayerEquipUtil.hasItemInEnder(player, ItemInit.CORUNDUM_JUJU))
            {
                cir.setReturnValue(true);
            }
        }
    }

}
