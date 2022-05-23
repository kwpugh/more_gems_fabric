package com.kwpugh.more_gems.items.juju;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class BreathingAlexandriteJuju extends BaseJujuItem
{
	public BreathingAlexandriteJuju(Settings settings)
	{
		super(settings);
	}

	@Override
	public boolean hasRecipeRemainder()
	{
		return true;
	}

	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(Text.translatable("item.more_gems.alexandrite_juju.tip1").formatted(Formatting.GREEN));
	} 
}