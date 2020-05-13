package com.kwpugh.more_gems.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class PoisonBladeEnchantment extends DamageEnchantment
{
	public PoisonBladeEnchantment(Rarity weight, int typeIndex, EquipmentSlot[] slots)
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
	    return 3;
	}
	
	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level)
	{
	    if(target instanceof LivingEntity)
	    {
	        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 300 * level, 0));
	    }
	 
	    super.onTargetDamaged(user, target, level);
	}
}
