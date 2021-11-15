package com.kwpugh.more_gems.items.baseclasses;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.util.ObsidianBreaking;
import com.kwpugh.more_gems.util.OreBreaker;
import net.minecraft.block.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;

public class ModPickaxe extends PickaxeItem
{
	static int helperVertical = MoreGems.CONFIG.GENERAL.minngHelperVertical;
	static int helperHoriz = MoreGems.CONFIG.GENERAL.minerHelperHoriz;

	public ModPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state)
	{
		Material material = state.getMaterial();
		
	 	if(ObsidianBreaking.fastAtObsidian(state, stack))
		{
			return ObsidianBreaking.fastObsidianSpeed();
		}
	 	
		return material != Material.METAL && material != Material.REPAIR_STATION && material != Material.STONE ? super.getMiningSpeedMultiplier(stack, state) : this.miningSpeed;
	}

	@Override
	public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner)
	{
		if (!world.isClient && state.getHardness(world, pos) != 0.0F)
		{
			stack.damage(1, miner, (e) -> {
				e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
			});
		}

		if(!world.isClient && EnchantmentHelper.getLevel(EnchantmentInit.MINING_HELPER, miner.getEquippedStack(EquipmentSlot.MAINHAND)) > 0)
		{
			OreBreaker.breakOtherOres(world, state, pos, helperHoriz, helperVertical);

			Block savedBlocked = state.getBlock();

			ArrayList<BlockPos> list = new ArrayList<>();
			Iterable<BlockPos> surroundingPos = BlockPos.iterateOutwards(pos, helperHoriz, helperVertical, helperHoriz);
			for(BlockPos currentPos : surroundingPos)
			{
				BlockState currentState = world.getBlockState(currentPos);
				Block currentBlock = currentState.getBlock();

				if(currentBlock instanceof OreBlock || currentBlock instanceof RedstoneOreBlock)
				{
					if(savedBlocked.equals(currentBlock))
					{
						world.breakBlock(currentPos, true);
					}
				}
			}
		}

		return true;
	}
}