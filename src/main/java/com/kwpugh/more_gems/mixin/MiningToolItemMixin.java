package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.util.MiningHelper;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MiningToolItem.class)
public class MiningToolItemMixin
{
    @Inject(method = "postMine", at = @At("HEAD"), cancellable = true)
    public void postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner, CallbackInfoReturnable<Boolean> cir)
    {
        boolean hasSilkTouch = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, miner.getEquippedStack(EquipmentSlot.MAINHAND)) > 0;

        if(miner instanceof PlayerEntity player)
        {
            if(!world.isClient && EnchantmentHelper.getLevel(EnchantmentInit.MINING_HELPER, miner.getEquippedStack(EquipmentSlot.MAINHAND)) > 0)
            {
                MiningHelper.breakOtherOres(world, state, pos, player, hasSilkTouch);
            }
        }
    }
}