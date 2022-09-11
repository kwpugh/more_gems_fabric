package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class BlinkingEnchantment extends Enchantment
{
    public BlinkingEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
    {
        super(rarity, enchantmentTarget, equipmentSlots);
    }

    @Override
    public void onTargetDamaged(LivingEntity livingEntity, Entity target, int level)
    {
        if(livingEntity instanceof PlayerEntity player)
        {
            PlayerSpecialAbilities.giveBlinkingAttack(target, player);
            //super.onTargetDamaged(player, target, level);
        }

        //super.onTargetDamaged(livingEntity, target, level);
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
        return MoreGems.CONFIG.GENERAL.enableBlinking;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer()
    {
        return MoreGems.CONFIG.GENERAL.enableBlinking;
    }

    @Override
    public boolean isAvailableForRandomSelection()
    {
        return MoreGems.CONFIG.GENERAL.enableBlinking;
    }
}