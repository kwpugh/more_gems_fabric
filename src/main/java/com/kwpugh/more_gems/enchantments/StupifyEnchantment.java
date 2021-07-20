package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;

import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.Item;

import java.util.Random;

public class StupifyEnchantment extends DamageEnchantment
{
    public StupifyEnchantment(Rarity weight, int typeIndex, EquipmentSlot[] slots)
    {
        super(weight, typeIndex, slots);
    }

    @Override
    public int getMinPower(int int_1)
    {
        return 1;
    }

    @Override
    public int getMaxLevel()
    {
        return 5;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level)
    {
        PlayerSpecialAbilities.stupifyEnemy(target, level);

        super.onTargetDamaged(user, target, level);
    }
}