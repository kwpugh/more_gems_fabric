package com.kwpugh.more_gems.items.juju;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class FireTopazJuju extends BaseJujuItem
{
	public FireTopazJuju(Settings settings)
	{
		super(settings);
	}
	 
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(Text.translatable("item.more_gems.topaz_juju.tip1").formatted(Formatting.GREEN));
	} 
}
