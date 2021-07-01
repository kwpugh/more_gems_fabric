package com.kwpugh.more_gems.util;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.world.World;

public class PlayerSpecialAbilities
{
	static int duration = MoreGems.CONFIG.GENERAL.durationQuickening;
	static int strengthLevel = MoreGems.CONFIG.GENERAL.strengthLevelQuickening;
	static int speedLevel = MoreGems.CONFIG.GENERAL.speedLevelQuickening;
	static float yellowHearts = MoreGems.CONFIG.GENERAL.amountYellowHeartsQuickening;

	static int enemySlownessDurationTicks = MoreGems.CONFIG.GENERAL.enemySlownessDurationTicksQuickening;
	static int slownessLevel = MoreGems.CONFIG.GENERAL.slownessLevelQuickening;

	// Effects for Quickening Enchantment called my mixin
	public static void giveQuickening(World world, LivingEntity player, Entity target)
	{
		if(!world.isClient)
		{
			System.out.println("call from special abilities");

			// Slow down the enemy
			if(target instanceof LivingEntity)
			{
				((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, enemySlownessDurationTicks, slownessLevel));
			}

			// Juice up the player
			StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.STRENGTH, duration, strengthLevel, false, false);
			StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, duration, 0, false, false);
			StatusEffectInstance effect3 = new StatusEffectInstance(StatusEffects.SPEED, duration, speedLevel, false, false);

			player.addStatusEffect(effect);
			player.addStatusEffect(effect2);
			player.addStatusEffect(effect3);

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
