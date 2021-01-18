package com.kwpugh.more_gems.items.areatools;

import java.util.List;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModHammer extends PickaxeItem
{
	public ModHammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	boolean obsidianFlag;
	
    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity playerIn)
    {
        if(!playerIn.isSneaking() && playerIn.getMainHandStack().isEffectiveOn(world.getBlockState(pos)))
    	{
        	obsidianFlag = (state.getBlock() == Blocks.OBSIDIAN || state.getBlock() == Blocks.CRYING_OBSIDIAN) ? true : false;
        	AreaToolUtil.attemptBreakNeighbors(world, playerIn, 1, "hammer", obsidianFlag);
        }

        return true;
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
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(new TranslatableText("item.more_gems.excavator.general1").formatted(Formatting.GREEN));
	}
}
