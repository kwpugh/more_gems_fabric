package com.kwpugh.more_gems.items.juju;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class SaturationSapphireJuju extends BaseJujuItem
{	
	public SaturationSapphireJuju(Settings settings)
	{
		super(settings);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
	{
		StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.SATURATION, 8, 0, false, false);
		LivingEntity player = (LivingEntity) entity;
		{
			player.addStatusEffect(effect2);
		}
	}
	 
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(new TranslatableText("item.more_gems.sapphire_juju.tip1").formatted(Formatting.GREEN));
	} 
}