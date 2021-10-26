package com.kwpugh.more_gems.util;

import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;

public final class PlayerEquipUtil
{
	public static boolean hasBreathingJuju(PlayerEntity player)
	{
		PlayerInventory inv = player.getInventory();
		int size = inv.size();

		//Is the ring in the player inventory?
		for (int slot = 0; slot < size; slot++)
		{
			ItemStack stack = inv.getStack(slot);
			if (stack.getItem() == ItemInit.ALEXANDRITE_JUJU)
			{
				return true;
			}
		}

		return false;
	}

	public static boolean hasPhoenixJuju(PlayerEntity player)
	{
		PlayerInventory inv = player.getInventory();
		int size = inv.size();

		//Is the ring in the player inventory?
		for (int slot = 0; slot < size; slot++)
		{
			ItemStack stack = inv.getStack(slot);
			if (stack.getItem() == ItemInit.TOPAZ_JUJU ||
					stack.getItem() == ItemInit.MOISSANITE_JUJU)
			{
				return true;
			}
		}

		return false;
	}
} 