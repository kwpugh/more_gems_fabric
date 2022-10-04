package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.enchantments.*;
import com.kwpugh.more_gems.enchantments.bound.BoundEnchantment;
import com.kwpugh.more_gems.enchantments.stupefy.StupefyEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantmentInit
{
	public static final Enchantment ATTRACTING = new AttractingEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment BENEVOLENCE = new BenevolenceEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_LEGS, new EquipmentSlot[]{EquipmentSlot.LEGS});
	public static final Enchantment BLINKING = new BlinkingEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment BOUND = new BoundEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.BREAKABLE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment CLIMBING = new ClimbingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_FEET, new EquipmentSlot[]{EquipmentSlot.FEET});
	public static final Enchantment CREEPERLESS = new CreeperlessEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_LEGS, new EquipmentSlot[]{EquipmentSlot.LEGS});
	public static final Enchantment FLOATING = new FloatingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment FREEZE_PROTECTION = new FreezeProtectionEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST});
	public static final Enchantment GLIDING = new GlidingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST});
	public static final Enchantment GUIDING = new GuidingEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment LAVA_VIEW = new LavaViewEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_HEAD, new EquipmentSlot[]{EquipmentSlot.HEAD});
	public static final Enchantment LIGHTNING = new LightningEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment MERCY_KILL = new MercyKillEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment MINING_HELPER = new MiningHelperEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment OBSIDIANATOR = new ObsidianatorEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment QUICKENING = new QuickeningEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment RAZOR_SHARPNESS = new RazorSharpnessEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment SHULKER_BLADE = new ShulkerBladeEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment STOUT = new StoutEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST});
	public static final Enchantment STUPEFY = new StupefyEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment UNTOUCHABLE = new UntouchableEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST});
	public static final Enchantment VOID_ESCAPE = new VoidEscapeEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_FEET, new EquipmentSlot[]{EquipmentSlot.FEET});
	public static final Enchantment WISDOM = new WisdomEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});


	public static void registerEnchantments()
	{
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "attracting"), ATTRACTING);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "benevolence"), BENEVOLENCE);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "blinking"), BLINKING);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "bound"), BOUND);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "climbing"), CLIMBING);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "creeperless"), CREEPERLESS);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "floating"), FLOATING);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "freeze_protection"), FREEZE_PROTECTION);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "gliding"), GLIDING);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "guiding"), GUIDING);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "lava_view"), LAVA_VIEW);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "lightning"), LIGHTNING);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "mercy_kill"), MERCY_KILL);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "mining_helper"), MINING_HELPER);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "obsidianator"), OBSIDIANATOR);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "quickening"), QUICKENING);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "razor_sharpness"), RAZOR_SHARPNESS);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "shulker_blade"), SHULKER_BLADE);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "stout"), STOUT);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "stupefy"), STUPEFY);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "untouchable"), UNTOUCHABLE);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "wisdom"), WISDOM);
		Registry.register(Registry.ENCHANTMENT, new Identifier(MoreGems.MOD_ID, "void_escape"), VOID_ESCAPE);
	}
}
