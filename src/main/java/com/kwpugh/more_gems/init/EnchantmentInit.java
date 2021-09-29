package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.enchantments.*;

import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantmentInit
{
	public static final Enchantment RAZOR_SHARPNESS = new RazorSharpnessEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment SHULKER_BLADE = new ShulkerBladeEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final DamageEnchantment QUICKENING = new QuickeningEnchantment(Enchantment.Rarity.VERY_RARE, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final ThornsEnchantment UNTOUCHABLE = new UntouchableEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.CHEST});
	public static final EfficiencyEnchantment FASTER_OBSIDIAN = new FasterObsidianEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment BLINKING = new BlinkingEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment VOID_ESCAPE = new VoidEscapeEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.FEET});
	public static final Enchantment WISDOM = new WisdomEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final DamageEnchantment STUPIFY = new StupifyEnchantment(Enchantment.Rarity.VERY_RARE, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment CREEPERLESS = new CreeperlessEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_LEGS, new EquipmentSlot[]{EquipmentSlot.LEGS});

	static boolean enableRazor = MoreGems.CONFIG.GENERAL.enableRazorSharpness;			
	static boolean enableShulker = MoreGems.CONFIG.GENERAL.enableShulkerBlade;
	static boolean enableQuickening = MoreGems.CONFIG.GENERAL.enableQuickening;
	static boolean enableUntouchable = MoreGems.CONFIG.GENERAL.enableUntouchable;
	static boolean enableFasterObsidian = MoreGems.CONFIG.GENERAL.enableFasterObsidian;
	static boolean enableBlinking = MoreGems.CONFIG.GENERAL.enableBlinking;
	static boolean enableWisdom = MoreGems.CONFIG.GENERAL.enableWisdom;
	static boolean enableStupify = MoreGems.CONFIG.GENERAL.enableStupify;
	static boolean enableVoidEscape = MoreGems.CONFIG.GENERAL.enableVoidEscape;
	static boolean enableCreeperless = MoreGems.CONFIG.GENERAL.enableCreeperless;

	public static void registerEnchantments()
	{
		if(enableRazor)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "razor_sharpness"), RAZOR_SHARPNESS);
		}

		if(enableShulker)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "shulker_blade"), SHULKER_BLADE);
		}

		if(enableQuickening)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "quickening"), QUICKENING);
		}

		if(enableUntouchable)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "untouchable"), UNTOUCHABLE);
		}

		if(enableFasterObsidian)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "faster_obsidian"), FASTER_OBSIDIAN);
		}

		if(enableBlinking)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "blinking"), BLINKING);
		}

		if(enableWisdom)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "wisdom"), WISDOM);
		}

		if(enableStupify)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "stupify"), STUPIFY);
		}

		if(enableVoidEscape)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "void_escape"), VOID_ESCAPE);
		}

		if(enableCreeperless)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "creeperless"), CREEPERLESS);
		}
	}
}
