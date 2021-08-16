package com.kwpugh.more_gems.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class VoidEscapeEnchantment extends Enchantment
{
    public VoidEscapeEnchantment(Rarity rarity, EquipmentSlot[] equipmentSlots)
    {
        super(rarity, EnchantmentTarget.ARMOR_FEET, equipmentSlots);
    }

    @Override
    public int getMinPower(int int_1)
    {
        return 1;
    }

    @Override
    public int getMaxLevel()
    {
        return 1;
    }
}