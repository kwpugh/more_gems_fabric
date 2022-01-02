package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.enchantments.*;
import com.kwpugh.more_gems.enchantments.bound.BoundEnchantment;
import com.kwpugh.more_gems.enchantments.bound.FreezeProtectionEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantmentInit
{
	public static final Enchantment RAZOR_SHARPNESS = new RazorSharpnessEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment SHULKER_BLADE = new ShulkerBladeEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment QUICKENING = new QuickeningEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment UNTOUCHABLE = new UntouchableEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.CHEST});
	public static final Enchantment OBSIDIANATOR = new ObsidianatorEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment BLINKING = new BlinkingEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment VOID_ESCAPE = new VoidEscapeEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_FEET, new EquipmentSlot[]{EquipmentSlot.FEET});
	public static final Enchantment WISDOM = new WisdomEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment STUPIFY = new StupifyEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment CREEPERLESS = new CreeperlessEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_LEGS, new EquipmentSlot[]{EquipmentSlot.LEGS});
	public static final Enchantment FREEZE_PROTECTION = new FreezeProtectionEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST});
	public static final Enchantment FLOATING = new FloatingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment LIGHTNING = new LightningEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment LAVA_VIEW = new LavaViewEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_HEAD, new EquipmentSlot[]{EquipmentSlot.HEAD});
	public static final Enchantment BENEVOLENCE = new BenevolenceEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_LEGS, new EquipmentSlot[]{EquipmentSlot.LEGS});
	public static final Enchantment MINING_HELPER = new MiningHelperEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment BOUND = new BoundEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.BREAKABLE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment ATTRACTING = new AttractingEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

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
	static boolean enableFloating = MoreGems.CONFIG.GENERAL.enableFloating;
	static boolean enableLightning = MoreGems.CONFIG.GENERAL.enableLightning;
	static boolean enableLavaView = MoreGems.CONFIG.GENERAL.enableLavaView;
	static boolean enableBenevolence = MoreGems.CONFIG.GENERAL.enableBenevolence;
	static boolean enableMiningHelper = MoreGems.CONFIG.GENERAL.enableMiningHelper;
	static boolean enableBound = MoreGems.CONFIG.GENERAL.enableBound;
	static boolean enableAttracting = MoreGems.CONFIG.GENERAL.enableAttracting;
	static boolean enableFreezeProtection = MoreGems.CONFIG.GENERAL.enableFreezeProtection;

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
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "obsidianator"), OBSIDIANATOR);
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

		if(enableFloating)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "floating"), FLOATING);
		}

		if(enableLightning)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "lightning"), LIGHTNING);
		}

		if(enableLavaView)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "lava_view"), LAVA_VIEW);
		}

		if(enableBenevolence)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "benevolence"), BENEVOLENCE);
		}

		if(enableMiningHelper)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "mining_helper"), MINING_HELPER);
		}

		if(enableBound)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "bound"), BOUND);
		}

		if(enableAttracting)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "attracting"), ATTRACTING);
		}

		if(enableFreezeProtection)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "freeze_protection"), FREEZE_PROTECTION);
		}
	}
}
