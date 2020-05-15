package com.kwpugh.more_gems.enchantments;

import java.util.Random;

import com.kwpugh.more_gems.MoreGems;

import net.minecraft.enchantment.ThornsEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class UntouchableEnchantment extends ThornsEnchantment
{
	static int untouchableDamage = MoreGems.getConfig().ENCHANTMENTS.untouchableDamage;
	
	public UntouchableEnchantment(Rarity weight, EquipmentSlot[] slotTypes)
	{
		super(weight, slotTypes);
	}

	@Override
	public int getMinimumPower(int int_1)
	{
	    return 1;
	}
	
	@Override
	public int getMaximumLevel()
	{
	    return 1;
	}

	@Override
	public boolean isAcceptableItem(ItemStack stack)
	{
		return stack.getItem() instanceof ArmorItem ? true : super.isAcceptableItem(stack);
	}
	
	public void onUserDamaged(LivingEntity user, Entity attacker, int level)
	{
	      Random random = user.getRandom();
	      if (shouldDamageAttacker(level, random))
	      {
	         if (attacker != null)
	         {
	            attacker.damage(DamageSource.thorns(user), (float)getDamageAmount(level, random));
	         }	         
	      }
	   }
	   
	public static boolean shouldDamageAttacker(int level, Random random)
	{
		return true;
	}
	
	public static int getDamageAmount(int level, Random random)
	{
		return untouchableDamage;
	}
}
