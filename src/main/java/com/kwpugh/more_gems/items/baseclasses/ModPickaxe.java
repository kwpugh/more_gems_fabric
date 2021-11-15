package com.kwpugh.more_gems.items.baseclasses;

import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.util.ObsidianBreaking;
import com.kwpugh.more_gems.util.MiningHelper;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
			MiningHelper.breakOtherOres(world, state, pos);
		}

		return true;
	}
}