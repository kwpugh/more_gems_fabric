package com.kwpugh.more_gems.enchantments;

import java.util.Random;
import com.kwpugh.more_gems.MoreGems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class UntouchableEnchantment extends Enchantment
{
	static int untouchableDamage = MoreGems.CONFIG.GENERAL.untouchableDamage;
	
	public UntouchableEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
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
	    return 3;
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
