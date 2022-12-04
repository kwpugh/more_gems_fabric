package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HungerManager.class)
public class HungerManagerMixin
{
    @Shadow private float exhaustion;
    @Shadow private int foodTickTimer;
    @Shadow private int foodLevel;
    @Shadow private float saturationLevel;

    @Inject(method = "update", at = @At(value = "HEAD"))
    public void updateHead(PlayerEntity player, CallbackInfo ci)
    {
        // NA
    }

    @Inject(method = "update", at = @At(value = "TAIL"))
    public void updateTail(PlayerEntity player, CallbackInfo ci)
    {
        if(PlayerEquipUtil.hasItemInInventory(player, ItemInit.SAPPHIRE_JUJU))
        {
            PlayerSpecialAbilities.giveHealing(player, 1.0F);
        }
    }
}
