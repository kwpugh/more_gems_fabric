package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FloatingEnchantment extends Enchantment
{
    static int baseDuration = MoreGems.CONFIG.GENERAL.floatingBaseDuration;

    public FloatingEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
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
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level)
    {
        if(target instanceof LivingEntity)
        {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, baseDuration * level, level - 1, true, false));
        }

        super.onTargetDamaged(user, target, level);
    }
}