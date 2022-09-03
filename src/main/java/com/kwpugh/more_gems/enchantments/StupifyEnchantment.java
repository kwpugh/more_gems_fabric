package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class StupifyEnchantment extends Enchantment
{
    public StupifyEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
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
    public void onTargetDamaged(LivingEntity user, Entity target, int level)
    {
        PlayerSpecialAbilities.stupifyEnemy(target, level);
    }
}