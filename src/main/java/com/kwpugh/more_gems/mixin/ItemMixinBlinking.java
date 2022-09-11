package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(Item.class)
public class ItemMixinBlinking
{
    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    public void useBlinking(World world, PlayerEntity player, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir)
    {
        ItemStack stack = player.getStackInHand(hand);

        Map<Enchantment, Integer> enchantments = EnchantmentHelper.get(player.getMainHandStack());

        if (enchantments.containsKey(EnchantmentInit.BLINKING))
        {
            if (!world.isClient)
            {
                PlayerSpecialAbilities.giveBlinkingEvade(world, player);
            }

            cir.setReturnValue(TypedActionResult.pass(stack));
        }
    }
}