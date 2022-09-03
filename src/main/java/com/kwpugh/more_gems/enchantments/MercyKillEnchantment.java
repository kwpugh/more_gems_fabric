package com.kwpugh.more_gems.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;

public class MercyKillEnchantment extends Enchantment
{
	public MercyKillEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
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
	    if(target instanceof AnimalEntity)
	    {
			target.damage(DamageSource.GENERIC, 100);
	    }
	}
}
