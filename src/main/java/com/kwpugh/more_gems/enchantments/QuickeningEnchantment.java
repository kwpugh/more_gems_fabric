package com.kwpugh.more_gems.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.entity.EquipmentSlot;

public class QuickeningEnchantment extends DamageEnchantment
{
	public QuickeningEnchantment(Rarity weight, int typeIndex, EquipmentSlot[] slots)
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
}
