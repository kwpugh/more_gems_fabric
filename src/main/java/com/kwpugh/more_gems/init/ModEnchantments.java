package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.enchantments.QuickeningEnchantment;
import com.kwpugh.more_gems.enchantments.RazorSharpnessEnchantment;
import com.kwpugh.more_gems.enchantments.ShulkerBladeEnchantment;
import com.kwpugh.more_gems.enchantments.UntouchableEnchantment;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.ThornsEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments
{
	public static final DamageEnchantment RAZOR_SHARPNESS = new RazorSharpnessEnchantment(Enchantment.Rarity.VERY_RARE, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final DamageEnchantment SHULKER_BLADE = new ShulkerBladeEnchantment(Enchantment.Rarity.VERY_RARE, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final DamageEnchantment QUICKENING = new QuickeningEnchantment(Enchantment.Rarity.VERY_RARE, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final ThornsEnchantment UNTOUCHABLE = new UntouchableEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.CHEST});

	static boolean enableRazor = MoreGems.getConfig().ENCHANTMENTS.enableRazorSharpness;
	static boolean enableShulker = MoreGems.getConfig().ENCHANTMENTS.enableShulkerBlade;
	static boolean enableQuickening = MoreGems.getConfig().ENCHANTMENTS.enableQuickening;
	static boolean enableUntouchable = MoreGems.getConfig().ENCHANTMENTS.enableUntouchable;
	
	public static void registerEnchantments()
	{
		if(enableRazor)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "razor_sharpness"), RAZOR_SHARPNESS);
		}
		
		if(enableShulker)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "shulker_blade"), SHULKER_BLADE);
		}
		
		if(enableQuickening)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "quickening"), QUICKENING);
		}
		
		if(enableUntouchable)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "untouchable"), UNTOUCHABLE);
		}
	}
}
