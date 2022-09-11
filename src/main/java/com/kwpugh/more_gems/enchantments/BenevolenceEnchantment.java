package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class BenevolenceEnchantment extends Enchantment
{
    public BenevolenceEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
    {
        super(rarity, enchantmentTarget, equipmentSlots);
    }

    @Override
    public int getMinPower(int level)
    {
        return 10 * (level - 1);
    }

    @Override
    public int getMaxPower(int level)
    {
        return super.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel()
    {
        return 1;
    }

    @Override
    public boolean isTreasure()
    {
        return MoreGems.CONFIG.GENERAL.enableBenevolence;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer()
    {
        return MoreGems.CONFIG.GENERAL.enableBenevolence;
    }

    @Override
    public boolean isAvailableForRandomSelection()
    {
        return MoreGems.CONFIG.GENERAL.enableBenevolence;
    }
}
