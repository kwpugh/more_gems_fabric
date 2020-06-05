package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class RazorSharpnessEnchantment extends DamageEnchantment
{
	static float razorDamageIncrease = MoreGems.getConfig().ENCHANTMENTS.razorDamageIncrease;

	public RazorSharpnessEnchantment(Rarity weight, int typeIndex, EquipmentSlot[] slots)
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