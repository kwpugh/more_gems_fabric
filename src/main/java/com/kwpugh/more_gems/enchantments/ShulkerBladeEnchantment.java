package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ShulkerBladeEnchantment extends Enchantment
{
	static int shulkerBladeDurationTicks = MoreGems.CONFIG.GENERAL.shulkerBladeDurationTicks;

	public ShulkerBladeEnchantment(Enchantment.Rarity rarity, EquipmentSlot[] equipmentSlots)
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
	    return 1;
	}
	
	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level)
	{
	    if(target instanceof LivingEntity)
	    {
	        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, shulkerBladeDurationTicks, 0));
	    }
	 
	    super.onTargetDamaged(user, target, level);
	}
}
