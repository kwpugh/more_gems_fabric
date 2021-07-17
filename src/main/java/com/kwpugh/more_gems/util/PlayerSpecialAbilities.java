package com.kwpugh.more_gems.util;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Map;

public class PlayerSpecialAbilities
{
	static int duration = MoreGems.CONFIG.GENERAL.durationQuickening;
	static int strengthLevel = MoreGems.CONFIG.GENERAL.strengthLevelQuickening;
	static int speedLevel = MoreGems.CONFIG.GENERAL.speedLevelQuickening;
	static float yellowHearts = MoreGems.CONFIG.GENERAL.amountYellowHeartsQuickening;
	static int enemySlownessDurationTicks = MoreGems.CONFIG.GENERAL.enemySlownessDurationTicksQuickening;
	static int slownessLevel = MoreGems.CONFIG.GENERAL.slownessLevelQuickening;
	static int wisdomMultiplier = MoreGems.CONFIG.GENERAL.wisdomExperienceMultiplier;

	// Used for Wisdom enchantment on swords
	public static void giveWisdom(ItemStack stack, PlayerEntity attackingPlayer)
	{
		Map<Enchantment, Integer> enchantments = EnchantmentHelper.get(attackingPlayer.getMainHandStack());

		if (enchantments.containsKey(EnchantmentInit.WISDOM))
		{
			int level = (EnchantmentHelper.getLevel(EnchantmentInit.WISDOM, stack));

			if (attackingPlayer != null)
			{
				attackingPlayer.addExperience(level * wisdomMultiplier);
			}
		}
	}

	// Used for Blinking enchantment on swords
	public static void giveBlinking(World world, PlayerEntity player)
	{
		double d = player.getX();
		double e = player.getY();
		double f = player.getZ();

		for(int i = 0; i < 16; ++i)
		{
			double g = player.getX() + (player.getRandom().nextDouble() - 0.5D) * 16.0D;
			double h = MathHelper.clamp(player.getY() + (double)(player.getRandom().nextInt(16) - 8), (double)world.getBottomY(), (double)(world.getBottomY() + ((ServerWorld)world).getLogicalHeight() - 1));
			double j = player.getZ() + (player.getRandom().nextDouble() - 0.5D) * 16.0D;
			if (player.hasVehicle())
			{
				player.stopRiding();
			}

			if (player.teleport(g, h, j, false))
			{
				SoundEvent soundEvent = SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
				world.playSound((PlayerEntity)null, d, e, f, soundEvent, SoundCategory.PLAYERS, 1.0F, 1.0F);
				player.playSound(soundEvent, 1.0F, 1.0F);
				break;
			}
		}
	}

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
