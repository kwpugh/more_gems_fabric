package com.kwpugh.more_gems.items.hammer;

import java.util.List;

import net.minecraft.block.BlockState;
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

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity playerIn)
    {
        if(!playerIn.isSneaking() && playerIn.getMainHandStack().isEffectiveOn(world.getBlockState(pos)))
    	{
        	AreaToolUtil.attemptBreakNeighbors(world, playerIn, 1);
        }

        return true;
    }

	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(new TranslatableText("item.more_gems.excavator.general1").formatted(Formatting.GREEN));
	}
}
