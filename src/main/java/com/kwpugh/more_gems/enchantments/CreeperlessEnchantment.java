package com.kwpugh.more_gems.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class CreeperlessEnchantment extends Enchantment
{
    public CreeperlessEnchantment(Enchantment.Rarity weight, EnchantmentTarget digger, EquipmentSlot... slotTypes)
    {
        super(weight, EnchantmentTarget.ARMOR_LEGS, slotTypes);
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