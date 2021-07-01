package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.init.ItemInit;

import net.minecraft.enchantment.EfficiencyEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FasterObsidianEnchantment extends EfficiencyEnchantment
{
	public FasterObsidianEnchantment(Rarity weight, EquipmentSlot[] slotTypes)
	{
		super(weight, slotTypes);
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
	public boolean isAcceptableItem(ItemStack stack)
	{
		Item pickaxe = stack.getItem();

		if(pickaxe == ItemInit.CORUNDUM_PICKAXE ||
				pickaxe == ItemInit.SAPPHIRE_PICKAXE ||
				pickaxe == ItemInit.RUBY_PICKAXE ||
				pickaxe == ItemInit.CARBONADO_PICKAXE ||
				pickaxe == ItemInit.CORUNDUM_PAXEL || 
				pickaxe == ItemInit.SAPPHIRE_PAXEL ||
				pickaxe == ItemInit.RUBY_PAXEL ||
				pickaxe == ItemInit.CARBONADO_PAXEL ||
				pickaxe == ItemInit.CORUNDUM_HAMMER ||
				pickaxe == ItemInit.SAPPHIRE_HAMMER ||
				pickaxe == ItemInit.RUBY_HAMMER ||
				pickaxe == ItemInit.CARBONADO_HAMMER)
		{
			return this.type.isAcceptableItem(stack.getItem());
		}
		else
		{
			return false;
		}

	}
}
