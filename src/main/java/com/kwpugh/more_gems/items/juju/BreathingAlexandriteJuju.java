package com.kwpugh.more_gems.items.juju;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
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
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(new TranslatableText("item.more_gems.alexandrite_juju.tip1").formatted(Formatting.GREEN));
	} 
}