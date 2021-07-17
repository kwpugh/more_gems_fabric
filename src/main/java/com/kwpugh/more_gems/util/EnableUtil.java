package com.kwpugh.more_gems.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Hand;

public class EnableUtil
{
    public static boolean isEnabled(ItemStack stack)
    {
        return stack.hasNbt() && stack.getNbt().getBoolean("IsEnabled");
    }

    public static void changeEnabled(PlayerEntity player, Hand hand)
    {
        changeEnabled(player.getMainHandStack());
    }

    public static void changeEnabled(ItemStack stack)
    {
        if(!stack.hasNbt())
        {
            stack.setNbt(new NbtCompound());
        }
        boolean isEnabled = isEnabled(stack);
        stack.getNbt().putBoolean("IsEnabled", !isEnabled);
    }
}