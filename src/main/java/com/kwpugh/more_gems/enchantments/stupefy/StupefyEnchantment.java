package com.kwpugh.more_gems.enchantments.stupefy;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class StupefyEnchantment extends Enchantment
{
    public StupefyEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
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
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level)
    {
        PlayerSpecialAbilities.stupefyEnemy(target, level);
    }

    @Override
    public boolean isTreasure()
    {
        return MoreGems.CONFIG.GENERAL.enableStupefy;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer()
    {
        return MoreGems.CONFIG.GENERAL.enableStupefy;
    }

    @Override
    public boolean isAvailableForRandomSelection()
    {
        return MoreGems.CONFIG.GENERAL.enableStupefy;
    }
}