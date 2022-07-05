package com.kwpugh.more_gems.util;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Random;

public class PlayerSpecialAbilities
{
	static int duration = MoreGems.CONFIG.GENERAL.durationQuickening;
	static int strengthLevel = MoreGems.CONFIG.GENERAL.strengthLevelQuickening;
	static int speedLevel = MoreGems.CONFIG.GENERAL.speedLevelQuickening;
	static float yellowHearts = MoreGems.CONFIG.GENERAL.amountYellowHeartsQuickening;
	static int enemySlownessDurationTicks = MoreGems.CONFIG.GENERAL.enemySlownessDurationTicksQuickening;
	static int slownessLevel = MoreGems.CONFIG.GENERAL.slownessLevelQuickening;
	static int wisdomMultiplier = MoreGems.CONFIG.GENERAL.wisdomExperienceMultiplier;

	public static void stupifyEnemy(Entity target, int level)
	{
		Random random = new Random();
		World world = target.getEntityWorld();

		if(!world.isClient)
		{
			if(target instanceof HostileEntity &&
					!(target instanceof WitherEntity))
			{
				double r = random.nextDouble();
				if (r <= (.20 * level))
				{
					((HostileEntity) target).setAiDisabled(true);
				}
				else
				{
					((HostileEntity) target).setAiDisabled(false);
				}
			}
		}
	}

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
				world.playSound((PlayerEntity)null, d, e, f, soundEvent, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
				player.playSound(soundEvent, 1.0F, 1.0F);
				break;
			}
		}
	}

	public static void giveVoidEscape(World world, PlayerEntity player)
	{
		if(world.isClient) return;

		if(player.hasVehicle())
		{
			player.stopRiding();
		}

		if(player.teleport(0, 81, 0, false))
		{
			SoundEvent soundEvent = SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
			world.playSound((PlayerEntity)null, 0, 81, 0, soundEvent, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
			player.playSound(soundEvent, 1.0F, 1.0F);
		}
	}

	// Effects for Quickening Enchantment called my mixin
	public static void giveQuickening(World world, LivingEntity player, Entity target, int level)
	{
		if(!MoreGems.CONFIG.GENERAL.enableQuickeningEffect) return;

		if(!world.isClient)
		{
			// Slow down the enemy
			if(target instanceof LivingEntity)
			{
				((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, enemySlownessDurationTicks, slownessLevel));
			}

			// Juice up the player
			StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.STRENGTH, duration * level, strengthLevel, false, false);
			StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, duration * level, 0, false, false);
			StatusEffectInstance effect3 = new StatusEffectInstance(StatusEffects.SPEED, duration * level, speedLevel, false, false);

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
		}
	}

	// Restores health while in lava, float over magma blocks
	// Works with EntityMixinPhoenix
	public static void givePhoenixEffect(World world, PlayerEntity player)
	{
		if(world.isClient) return;

		if(player.isInLava())
		{
			StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 8, 0, false, false);
			StatusEffectInstance effect3 = new StatusEffectInstance(StatusEffects.SATURATION, 8, 0, false, false);

			{
				player.addStatusEffect(effect2);
				player.addStatusEffect(effect3);
			}
		}
	}

	// Checks if player has negative effects and removes them, used on Gem Crown
	public static void giveCuringEffect(World world, PlayerEntity player)
	{
		if (!world.isClient)
		{
			if(player.hasStatusEffect(StatusEffects.BLINDNESS))
			{
				player.removeStatusEffect(StatusEffects.BLINDNESS);
			}

			if(player.hasStatusEffect(StatusEffects.HUNGER))
			{
				player.removeStatusEffect(StatusEffects.HUNGER);
			}

			if(player.hasStatusEffect(StatusEffects.MINING_FATIGUE))
			{
				player.removeStatusEffect(StatusEffects.MINING_FATIGUE);
			}

			if(player.hasStatusEffect(StatusEffects.NAUSEA))
			{
				player.removeStatusEffect(StatusEffects.NAUSEA);
			}

			if(player.hasStatusEffect(StatusEffects.POISON))
			{
				player.removeStatusEffect(StatusEffects.POISON);
			}

			if(player.hasStatusEffect(StatusEffects.SLOWNESS))
			{
				player.removeStatusEffect(StatusEffects.SLOWNESS);
			}

			if(player.hasStatusEffect(StatusEffects.UNLUCK))
			{
				player.removeStatusEffect(StatusEffects.UNLUCK);
			}

			if(player.hasStatusEffect(StatusEffects.WEAKNESS))
			{
				player.removeStatusEffect(StatusEffects.WEAKNESS);
			}

			if(player.hasStatusEffect(StatusEffects.WITHER))
			{
				player.removeStatusEffect(StatusEffects.WITHER);
			}

			if(player.hasStatusEffect(StatusEffects.INSTANT_DAMAGE))
			{
				player.removeStatusEffect(StatusEffects.INSTANT_DAMAGE);
			}

			if(player.hasStatusEffect(StatusEffects.DARKNESS))
			{
				player.removeStatusEffect(StatusEffects.DARKNESS);
			}
		}
	}
}
