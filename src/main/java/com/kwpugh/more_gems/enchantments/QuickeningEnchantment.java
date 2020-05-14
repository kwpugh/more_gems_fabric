package com.kwpugh.more_gems.enchantments;

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

	public QuickeningEnchantment(Rarity weight, int typeIndex, EquipmentSlot[] slots)
	{
		super(weight, typeIndex, slots);
	}

	@Override
	public int getMinimumPower(int int_1)
	{
	    return 1;
	}
	
	@Override
	public int getMaximumLevel()
	{
	    return 1;
	}
	
	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level)
	{
		ServerWorld world = (ServerWorld) user.world.getWorld();
		
	    if(target instanceof LivingEntity)
	    {
	        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 0));
	    }
	 
	    PlayerSpecialAbilities.giveQuickening(world, user, 10);

	    super.onTargetDamaged(user, target, level);
	}
}
