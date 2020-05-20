package com.kwpugh.more_gems.util;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.world.World;

public class PlayerSpecialAbilities
{
	public static void giveQuickening(World world, LivingEntity player, float yellowHearts)
	{
		if(!world.isClient)
		{
			StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 8, 0, false, false);
			StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.SPEED, 60, 0, false, false);
			player.addStatusEffect(effect);
			player.addStatusEffect(effect2);

			float current = player.getAbsorptionAmount();

			if(player.getHealth() < yellowHearts || current >= yellowHearts)
			{
				return;
			}

			if(current >= (yellowHearts - 1.0F))
			{
				player.setAbsorptionAmount(yellowHearts);

				return;
			}
			if(current < (yellowHearts - 1.0F))
			{

				player.setAbsorptionAmount(current + 1.0F);

				return;
			}

			return;
		}
	}
}
