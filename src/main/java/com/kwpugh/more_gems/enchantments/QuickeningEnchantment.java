package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;

public class QuickeningEnchantment extends DamageEnchantment
{
	static float amountHalfHeartsQuickening = MoreGems.CONFIG.GENERAL.amountHalfHeartsQuickening;
	static int enemySlownessDurationTicks = MoreGems.CONFIG.GENERAL.enemySlownessDurationTicksQuickening;
	
	public QuickeningEnchantment(Rarity weight, int typeIndex, EquipmentSlot[] slots)
	{
		super(weight, typeIndex, slots);
	}

	@Override
	public int getMinPower(int int_1)
	{
	    return 1;
	}

	@Override
	public int getMaxLevel()
	{
	    return 1;
	}

	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level)
	{
		ServerWorld world = (ServerWorld) user.getEntityWorld();

	    if(target instanceof LivingEntity)
	    {
	        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, enemySlownessDurationTicks, 0));
	    }

	    PlayerSpecialAbilities.giveQuickening(world, user, amountHalfHeartsQuickening);

	    super.onTargetDamaged(user, target, level);
	}
}
