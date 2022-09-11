package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class RazorSharpnessEnchantment extends Enchantment
{
	static float razorDamageIncrease = MoreGems.CONFIG.GENERAL.razorDamageIncrease;

	public RazorSharpnessEnchantment(Enchantment.Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
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
	    if(target instanceof LivingEntity)
	    {
	        //TBD, maybe poison?
	    }
	}

	public float getAttackDamage(int level, EntityGroup group)
	{
		return razorDamageIncrease;
   }

	@Override
	public boolean isTreasure()
	{
		return MoreGems.CONFIG.GENERAL.enableRazorSharpness;
	}

	@Override
	public boolean isAvailableForEnchantedBookOffer()
	{
		return MoreGems.CONFIG.GENERAL.enableRazorSharpness;
	}

	@Override
	public boolean isAvailableForRandomSelection()
	{
		return MoreGems.CONFIG.GENERAL.enableRazorSharpness;
	}
}