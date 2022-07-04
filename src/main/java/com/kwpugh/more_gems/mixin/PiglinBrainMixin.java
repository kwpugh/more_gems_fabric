package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public abstract class PiglinBrainMixin
{
    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void moregemsWearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> cir)
    {
        if(entity instanceof PlayerEntity player)
        {
            ItemStack itemStack = player.getEquippedStack(EquipmentSlot.CHEST);

            if (itemStack.getItem() == ItemInit.CARBONADO_CHESTPLATE_GILDED ||
                    itemStack.getItem() == ItemInit.MOISSANITE_CHESTPLATE)
            {
                cir.setReturnValue(true);
            }

            if(MoreGems.CONFIG.GENERAL.enableJujuCrownNetheritePowers &&
                    PlayerEquipUtil.isWearingCrownNetherite(player))
            {
                cir.setReturnValue(true);
            }

            if(MoreGems.CONFIG.GENERAL.enableJujuCrownPowers &&
                    PlayerEquipUtil.isWearingCrown(player))
            {
                cir.setReturnValue(true);
            }
        }
    }
}