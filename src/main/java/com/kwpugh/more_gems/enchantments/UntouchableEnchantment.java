package com.kwpugh.more_gems.enchantments;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class UntouchableEnchantment extends Enchantment
{
	public UntouchableEnchantment(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot[] equipmentSlots)
	{
		super(rarity, enchantmentTarget, equipmentSlots);
	}

	@Override
	public int getMinPower(int level)
	{
		return 10 * (level - 1);
	}

	@Override
	public int getMaxPower(int level)
	{
		return super.getMinPower(level) + 50;
	}

	@Override
	public int getMaxLevel()
	{
	    return 4;
	}

	@Override
	public void onUserDamaged(LivingEntity user, Entity attacker, int level)
	{
		if (user.getRandom().nextFloat() <= (MoreGems.CONFIG.GENERAL.untouchableChance + (level / 10)))
		{
			if (attacker != null)
			{
				attacker.damage(DamageSource.thorns(user), MoreGems.CONFIG.GENERAL.untouchableBaseDamage + (level * 1.5F));
			}
		}
	}

	@Override
	public boolean isTreasure()
	{
		return MoreGems.CONFIG.GENERAL.enableUntouchable;
	}

	@Override
	public boolean isAvailableForEnchantedBookOffer()
	{
		return MoreGems.CONFIG.GENERAL.enableUntouchable;
	}

	@Override
	public boolean isAvailableForRandomSelection()
	{
		return MoreGems.CONFIG.GENERAL.enableUntouchable;
	}
}
