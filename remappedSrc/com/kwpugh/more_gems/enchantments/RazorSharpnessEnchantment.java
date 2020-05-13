package com.kwpugh.more_gems.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class RazorSharpnessEnchantment extends DamageEnchantment
{
	public RazorSharpnessEnchantment(Rarity weight, int typeIndex, EquipmentSlot[] slots)
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
	    if(target instanceof LivingEntity)
	    {
	        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2 * level, level - 1));
	    }
	 
	    super.onTargetDamaged(user, target, level);
	}
	
	public float getAttackDamage(int level, EntityGroup group)
	{
		return 7.0F + (float)Math.max(0, level - 1) * 1.5F;
   }
}