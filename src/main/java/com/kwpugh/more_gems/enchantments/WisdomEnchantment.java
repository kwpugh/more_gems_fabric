package com.kwpugh.more_gems.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class WisdomEnchantment extends Enchantment
{
    public WisdomEnchantment(Rarity rarity, EquipmentSlot[] equipmentSlots)
    {
        super(rarity, EnchantmentTarget.WEAPON, equipmentSlots);
    }

    @Override
    public int getMinPower(int int_1)
    {
        return 1;
    }

    @Override
    public int getMaxLevel()
    {
        return 3;
    }
}