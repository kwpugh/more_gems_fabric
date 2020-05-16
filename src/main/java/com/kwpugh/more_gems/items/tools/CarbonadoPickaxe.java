package com.kwpugh.more_gems.items.tools;

import com.kwpugh.more_gems.items.baseclasses.ModPickaxe;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class CarbonadoPickaxe extends ModPickaxe
{
	public CarbonadoPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

//	@Override
//	   public float getMiningSpeedMultiplier(ItemStack stack, BlockState state)
//	{
//		      if (state.isOf(Blocks.OBSIDIAN)  || state.isOf(Blocks.CRYING_OBSIDIAN))
//		      {
//		         return 100.0F;
//		      }
//		      else
//		      {
//		         Material material = state.getMaterial();
//		         return material != Material.METAL && material != Material.ANVIL && material != Material.STONE ? super.getMiningSpeedMultiplier(stack, state) : this.miningSpeed;
//		      }
//		   }


}
