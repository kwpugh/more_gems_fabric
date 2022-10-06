package com.kwpugh.more_gems.items.juju;

import com.kwpugh.more_gems.util.EnableUtil;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

public class ConduitCarbonadoJuju extends BaseJujuItem
{	
	public ConduitCarbonadoJuju(Settings settings)
	{
		super(settings);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
	{
		if(EnableUtil.isEnabled(stack))
		{
			StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 8, 0, false, false);
			StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 8, 0, false, false);
			LivingEntity player = (LivingEntity) entity;
			{
				player.addStatusEffect(effect);
				player.addStatusEffect(effect2);
			}
		}
	}

	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
	{
		ItemStack itemStack = user.getStackInHand(hand);

		if (!world.isClient)
		{
			EnableUtil.changeEnabled(user, hand);
			user.sendMessage((Text.translatable("Status changed")), true);
		}

		return TypedActionResult.success(itemStack);
	}

	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(Text.translatable("item.more_gems.carbonado_juju.tip1").formatted(Formatting.GREEN));
		tooltip.add(Text.translatable("item.more_gems.juju.no_sneak").formatted(Formatting.BLUE));
		tooltip.add(Text.translatable("itme.more_gems.enable_status", EnableUtil.isEnabled(itemStack)).formatted(Formatting.GOLD));
	} 
}