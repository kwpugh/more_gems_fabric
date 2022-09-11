package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(StatusEffect.class)
public class StatusEffectMixin
{
    @Inject(method = "applyUpdateEffect", at = @At("HEAD"), cancellable = true)
    private void moregemsApplyUpdateEffect(LivingEntity entity, int amplifier, CallbackInfo ci)
    {
        if(MoreGems.CONFIG.GENERAL.enableMoissaniteCuring)
        {
            StatusEffect effect = (StatusEffect) (Object) this;

            if(entity instanceof PlayerEntity player)
            {
                if((effect == StatusEffects.POISON || effect == StatusEffects.WITHER) &&
                        player.getEquippedStack(EquipmentSlot.HEAD).isOf(ItemInit.MOISSANITE_HELMET) &&
                        player.getEquippedStack(EquipmentSlot.CHEST).isOf(ItemInit.MOISSANITE_CHESTPLATE) &&
                        player.getEquippedStack(EquipmentSlot.LEGS).isOf(ItemInit.MOISSANITE_LEGGINGS) &&
                        player.getEquippedStack(EquipmentSlot.FEET).isOf(ItemInit.MOISSANITE_BOOTS))
                {
                    ci.cancel();
                }
            }
        }

        if(MoreGems.CONFIG.GENERAL.enableJujuCrownNetheritePowers)
        {
            StatusEffect effect = (StatusEffect) (Object) this;

            if(entity instanceof PlayerEntity player)
            {
                if((effect == StatusEffects.POISON || effect == StatusEffects.WITHER) &&
                        player.getEquippedStack(EquipmentSlot.HEAD).isOf(ItemInit.CROWN_NETHERITE_GEM))
                {
                    ci.cancel();
                }
            }
        }
    }
}