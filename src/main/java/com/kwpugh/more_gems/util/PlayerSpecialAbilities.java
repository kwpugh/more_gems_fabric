package com.kwpugh.more_gems.util;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.enchantments.stupefy.StupefiedEntity;
import com.kwpugh.more_gems.events.StupefyEntityManager;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.chunk.Chunk;

import java.util.Random;

public class PlayerSpecialAbilities
{
	static int duration = MoreGems.CONFIG.GENERAL.quickeningDuration;
	static int strengthLevel = MoreGems.CONFIG.GENERAL.quickeningStrengthLevel;
	static int speedLevel = MoreGems.CONFIG.GENERAL.quickeningSpeedLevel;
	static float yellowHearts = MoreGems.CONFIG.GENERAL.quickeningAmountYellowHearts;
	static int enemySlownessDurationTicks = MoreGems.CONFIG.GENERAL.quickeningEnemySlownessDurationTicks;
	static int slownessLevel = MoreGems.CONFIG.GENERAL.quickeningSlownessLevel;
	static int wisdomMultiplier = MoreGems.CONFIG.GENERAL.wisdomExpMultiplier;
	static int wisdomExpBase = MoreGems.CONFIG.GENERAL.wisdomExpBaseValue;
	static boolean weaknessEnable = MoreGems.CONFIG.GENERAL.quickeningWeaknessEnable;
	static boolean strengthEnable = MoreGems.CONFIG.GENERAL.quickeningStrengthEnable;
	static boolean healthEnable = MoreGems.CONFIG.GENERAL.quickeningHealthEnable;
	static boolean speedEnable = MoreGems.CONFIG.GENERAL.quickeningSpeedEnable;
	static double chanceMultiplier = MoreGems.CONFIG.GENERAL.stupefyChanceMultiplier;
	static int blinkingAttackDistance = MoreGems.CONFIG.GENERAL.blinkingAttackSafeDistance;
	static int blinkingEvadeMin = MoreGems.CONFIG.GENERAL.blinkingEvadeStarting;
	static int blinkingEvadeMax = MoreGems.CONFIG.GENERAL.blinkingEvadeEnding;

	public static void stupefyEnemy(Entity target, int level)
	{
		Random random = new Random();
		World world = target.getEntityWorld();

		if(!world.isClient)
		{
			if(target instanceof HostileEntity &&
					!(target instanceof WitherEntity))
			{
				double r = random.nextDouble();
				if (r <= (chanceMultiplier * level))
				{
					int age = target.age;
					((HostileEntity) target).setAiDisabled(true);
					StupefiedEntity stupifyEntity = new StupefiedEntity(target, level, age);
					StupefyEntityManager.addToList(stupifyEntity);
				}
			}
		}
	}

	// Used for Wisdom enchantment on swords
	public static void giveWisdom(PlayerEntity attackingPlayer, ItemStack stack, int level)
	{
		if (attackingPlayer != null)
		{
			attackingPlayer.addExperience(wisdomExpBase + (level * wisdomMultiplier));
		}
	}

	// Logic for blinking enchantment when player hits entity with sword
	public static void giveBlinkingAttack(Entity target, PlayerEntity player)
	{
		if(player.hasVehicle()) player.stopRiding();

		Direction oppositeFacing = target.getHorizontalFacing().getOpposite();
		double safeDistance = blinkingAttackDistance + target.getBoundingBox().getZLength();

		BlockPos blinkedPos = new BlockPos(target.getX() + (oppositeFacing.getOffsetX() * safeDistance),
				target.getY() + (oppositeFacing.getOffsetY() * safeDistance),
				target.getZ() + (oppositeFacing.getOffsetZ() * safeDistance));

		BlockState blinkedPosState = player.world.getBlockState(blinkedPos);

		if(!blinkedPosState.isOpaque())
		{
			player.teleport(blinkedPos.getX(),blinkedPos.getY(),blinkedPos.getZ());
			player.setYaw(target.getHorizontalFacing().asRotation());
		}
		else
		{
			blinkedPos = blinkedPos.add(0,1,0);
			blinkedPosState = player.world.getBlockState(blinkedPos);

			if(!blinkedPosState.isOpaque())
			{
				player.teleport(blinkedPos.getX(),blinkedPos.getY(),blinkedPos.getZ());
				player.setYaw(target.getHorizontalFacing().asRotation());
			}
		}

		SoundEvent soundEvent = SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
		player.world.playSound(null, player.getX(), player.getY(), player.getZ(), soundEvent, SoundCategory.NEUTRAL, 0.5F, 0.4F / (player.world.getRandom().nextFloat() * 0.4F + 0.8F));
		player.playSound(soundEvent, 1.0F, 1.0F);
	}

	//  Logic used for Blinking enchantment on right-click of swords
	public static void giveBlinkingEvade(World world, PlayerEntity player)
	{
		Random rand = new Random();

		if (!world.isClient)
		{
			if (world instanceof ServerWorld)
			{
				// Check a number of times for a safe spot
				for(int i = 1; i < 6; i++)
				{
					ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;

					if(i == 1)
					{
						serverPlayer.sendMessage((Text.translatable("Checking for a safe spot, please wait a moment")), true);
					}

					if(i > 1 && i < 6)
					{
						serverPlayer.sendMessage((Text.translatable("Still checking...")), true);
					}

					BlockPos startingPos = player.getBlockPos();

					int x = Math.round(startingPos.getX()) + rand.nextInt(blinkingEvadeMax + blinkingEvadeMin) - blinkingEvadeMin;
					int y = 180;
					int z = Math.round(startingPos.getZ()) + rand.nextInt(blinkingEvadeMax + blinkingEvadeMin) - blinkingEvadeMin;

					Chunk chunk = world.getChunk(x >> 4, z >> 4);
					RegistryEntry<Biome> registryEntry = world.getBiome(startingPos);
					if (registryEntry.matchesKey(BiomeKeys.OCEAN) ||
							registryEntry.matchesKey(BiomeKeys.RIVER) ||
							registryEntry.matchesKey(BiomeKeys.BEACH))
					{
						continue;
					}

					//Let's avoid putting them underground
					while (y > 61)
					{
						y--;
						BlockPos groundPos = new BlockPos(x, y-2, z);
						if(!chunk.getBlockState(groundPos).getMaterial().equals(Material.AIR) &&
								(!chunk.getBlockState(groundPos).getBlock().equals(Blocks.BEDROCK) &&
										(!chunk.getBlockState(groundPos).getBlock().equals(Blocks.WATER) &&
												(y-2) > 60)))
						{
							BlockPos legPos = new BlockPos(x, y-1, z);
							if (chunk.getBlockState(legPos).getMaterial().equals(Material.AIR))
							{
								BlockPos headPos = new BlockPos(x, y, z);
								if (chunk.getBlockState(headPos).getMaterial().equals(Material.AIR))
								{
									serverPlayer.stopRiding();
									serverPlayer.requestTeleport(x, y, z);
									serverPlayer.fallDistance = 0.0F;

									world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));

									serverPlayer.sendMessage((Text.translatable("Blink evade success")), true);

								}
							}
						}
					}
				}
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
		if(!MoreGems.CONFIG.GENERAL.quickeningEnableEffect) return;

		if(!world.isClient)
		{
			// Slow down the enemy
			if(target instanceof LivingEntity && weaknessEnable)
			{
				((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, enemySlownessDurationTicks, slownessLevel));
			}

			// Juice up the player
			StatusEffectInstance strength = new StatusEffectInstance(StatusEffects.STRENGTH, duration * level, strengthLevel, false, false);
			StatusEffectInstance health = new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, duration * level, 0, false, false);
			StatusEffectInstance speed = new StatusEffectInstance(StatusEffects.SPEED, duration * level, speedLevel, false, false);

			if(strengthEnable) player.addStatusEffect(strength);
			if(healthEnable) player.addStatusEffect(health);
			if(speedEnable) player.addStatusEffect(speed);

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
