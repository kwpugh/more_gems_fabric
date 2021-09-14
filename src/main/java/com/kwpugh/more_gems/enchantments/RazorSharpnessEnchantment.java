package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class RazorSharpnessEnchantment extends Enchantment
{
	static float razorDamageIncrease = MoreGems.CONFIG.GENERAL.razorDamageIncrease;

	public RazorSharpnessEnchantment(Enchantment.Rarity rarity, EquipmentSlot[] equipmentSlots)
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
	        //TBD
	    }

	    super.onTargetDamaged(user, target, level);
	}

	public float getAttackDamage(int level, EntityGroup group)
	{
		return razorDamageIncrease;
   }
}