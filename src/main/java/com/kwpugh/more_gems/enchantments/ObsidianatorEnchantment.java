package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.areatools.ModHammer;
import com.kwpugh.more_gems.items.baseclasses.ModPaxel;
import com.kwpugh.more_gems.items.baseclasses.ModPickaxe;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;

public class ObsidianatorEnchantment extends Enchantment
{
	public ObsidianatorEnchantment(Rarity weight, EnchantmentTarget enchantmentTarget, EquipmentSlot[] slotTypes)
	{
		super(weight, enchantmentTarget, slotTypes);
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
	public boolean isAcceptableItem(ItemStack stack)
	{
		Item tool = stack.getItem();

		if(tool instanceof PickaxeItem || tool instanceof ModPickaxe || tool instanceof ModHammer || tool instanceof ModPaxel)
		{
			return this.type.isAcceptableItem(stack.getItem());
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean isTreasure()
	{
		return MoreGems.CONFIG.GENERAL.enableObsidinator;
	}

	@Override
	public boolean isAvailableForEnchantedBookOffer()
	{
		return MoreGems.CONFIG.GENERAL.enableObsidinator;
	}

	@Override
	public boolean isAvailableForRandomSelection()
	{
		return MoreGems.CONFIG.GENERAL.enableObsidinator;
	}
}
