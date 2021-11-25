package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.items.gembag.GembagItem;
import com.kwpugh.more_gems.items.juju.BaseJujuItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// BREAKABLE enchantment target
@Mixin(targets = "net/minecraft/enchantment/EnchantmentTarget$2")
public class EnchantmentTargetMixin
{
    @Inject(method = "Lnet/minecraft/enchantment/EnchantmentTarget$2;isAcceptableItem(Lnet/minecraft/item/Item;)Z", at = @At("HEAD"), cancellable = true)
    private void moregemsIsAcceptableItem(Item item, CallbackInfoReturnable<Boolean> cir)
    {
        if (item instanceof GembagItem ||
                item instanceof BaseJujuItem)
        {
            cir.setReturnValue(true);
        }
    }
}