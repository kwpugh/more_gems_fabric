package com.kwpugh.more_gems.items.baseclasses;

import com.kwpugh.more_gems.util.ObsidianBreaking;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxe extends PickaxeItem
{
	public ModPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state)
	{
		Material material = state.getMaterial();
		Block block = state.getBlock();

	 	if(ObsidianBreaking.fastAtObsidian(state, stack))
		{
			return ObsidianBreaking.fastObsidianSpeed();
		}
	 	
		return material != Material.METAL && material != Material.REPAIR_STATION && material != Material.STONE ? super.getMiningSpeedMultiplier(stack, state) : this.miningSpeed;
	}
}