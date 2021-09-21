package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public abstract class PiglinBrainMixin
{
    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void moregemsWearsGoldArmor(LivingEntity player, CallbackInfoReturnable<Boolean> cir)
    {
        ItemStack itemStack = player.getEquippedStack(EquipmentSlot.CHEST);

        if (itemStack.getItem() == ItemInit.CARBONADO_CHESTPLATE_GILDED ||
                itemStack.getItem() == ItemInit.MOISSANITE_CHESTPLATE)
        {
            cir.setReturnValue(true);
        }
    }
}