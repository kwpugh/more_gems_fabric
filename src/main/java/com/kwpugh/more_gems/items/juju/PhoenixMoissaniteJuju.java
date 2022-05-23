package com.kwpugh.more_gems.items.juju;

import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class PhoenixMoissaniteJuju extends BaseJujuItem
{
	public PhoenixMoissaniteJuju(Settings settings)
	{
		super(settings);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
	{
		if(entity instanceof PlayerEntity)
		{
			PlayerEntity player = (PlayerEntity) entity;
			PlayerSpecialAbilities.givePhoenixEffect(world, player);
		}
	}
	  
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(Text.translatable("item.more_gems.moissanite_juju.tip1").formatted(Formatting.GREEN));
		tooltip.add(Text.translatable("item.more_gems.moissanite_juju.tip2").formatted(Formatting.GREEN));
		tooltip.add(Text.translatable("item.more_gems.moissanite_juju.tip3").formatted(Formatting.GREEN));
	} 
}