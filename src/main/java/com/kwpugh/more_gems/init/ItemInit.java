package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.areatools.ModExcavator;
import com.kwpugh.more_gems.items.areatools.ModHammer;
import com.kwpugh.more_gems.items.baseclasses.*;
import com.kwpugh.more_gems.items.gembag.GemBase;
import com.kwpugh.more_gems.items.juju.*;
import com.kwpugh.more_gems.items.special.CarbonadoGildedArmor;
import com.kwpugh.more_gems.items.special.SharpeningGem;
import com.kwpugh.more_gems.items.special.TreasureBag;
import com.kwpugh.more_gems.materials.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit
{
	static boolean jujuEnable = MoreGems.CONFIG.GENERAL.jujuEnable;
	static boolean enableTreasureBag = MoreGems.CONFIG.GENERAL.enableTreasureBag;
	static boolean enableExtraTools = MoreGems.CONFIG.GENERAL.enableExtraTools;
	static boolean enableHammers  = MoreGems.CONFIG.GENERAL.enableHammers;
	static boolean enableExcavators  = MoreGems.CONFIG.GENERAL.enableExcavators;
	static boolean enablePaxels  = MoreGems.CONFIG.GENERAL.enablePaxels;
	static boolean enableBows = MoreGems.CONFIG.GENERAL.enableBows;
	static boolean enableSharpeningGem = MoreGems.CONFIG.GENERAL.enableSharpeningGem;

	static int citrineBow = MoreGems.CONFIG.GENERAL.citrineDurability;
	static int tourmalineBow = MoreGems.CONFIG.GENERAL.tourmalineDurability;
	static int kunziteBow = MoreGems.CONFIG.GENERAL.kunziteDurability;
	static int topazBow = MoreGems.CONFIG.GENERAL.topazDurability;
	static int emeraldBow = MoreGems.CONFIG.GENERAL.emeraldDurability;
	static int alexandriteBow = MoreGems.CONFIG.GENERAL.alexandriteDurability;
	static int corundumBow = MoreGems.CONFIG.GENERAL.corundumDurability;
	static int sapphireBow = MoreGems.CONFIG.GENERAL.sapphireDurability;
	static int rubyBow = MoreGems.CONFIG.GENERAL.rubyDurability;
	static int carbonadoBow = MoreGems.CONFIG.GENERAL.carbonadoDurability;
	static int moissaniteBow = MoreGems.CONFIG.GENERAL.moissaniteDurability;

	public static final ToolMaterial CITRINE_TOOL_MATERIAL = new CitrineToolMaterial();
	public static final ArmorMaterial CITRINE_ARMOR_MATERIAL = new CitrineArmorMaterial();
	public static final ToolMaterial TOURMALINE_TOOL_MATERIAL = new TourmalineToolMaterial();
	public static final ArmorMaterial TOURMALINE_ARMOR_MATERIAL = new TourmalineArmorMaterial();
	public static final ToolMaterial KUNZITE_TOOL_MATERIAL = new KunziteToolMaterial();
	public static final ArmorMaterial KUNZITE_ARMOR_MATERIAL = new KunziteArmorMaterial();
	public static final ToolMaterial TOPAZ_TOOL_MATERIAL = new TopazToolMaterial();
	public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new TopazArmorMaterial();
	public static final ToolMaterial EMERALD_TOOL_MATERIAL = new EmeraldToolMaterial();
	public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new EmeraldArmorMaterial();
	public static final ToolMaterial ALEXANDRITE_TOOL_MATERIAL = new AlexandriteToolMaterial();
	public static final ArmorMaterial ALEXANDRITE_ARMOR_MATERIAL = new AlexandriteArmorMaterial();
	public static final ToolMaterial CORUNDUM_TOOL_MATERIAL = new CorundumToolMaterial();
	public static final ArmorMaterial CORUNDUM_ARMOR_MATERIAL = new CorundumArmorMaterial();
	public static final ToolMaterial SAPPHIRE_TOOL_MATERIAL = new SapphireToolMaterial();
	public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new SapphireArmorMaterial();
	public static final ToolMaterial RUBY_TOOL_MATERIAL = new RubyToolMaterial();
	public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new RubyArmorMaterial();
	public static final ToolMaterial CARBONADO_TOOL_MATERIAL = new CarbonadoToolMaterial();
	public static final ArmorMaterial CARBONADO_ARMOR_MATERIAL = new CarbonadoArmorMaterial();
	public static final ArmorMaterial CARBONADO_GILDED_ARMOR_MATERIAL = new CarbonadoGildedArmorMaterial();
	public static final ToolMaterial MOISSANITE_TOOL_MATERIAL = new MoissaniteToolMaterial();
	public static final ArmorMaterial MOISSANITE_ARMOR_MATERIAL = new MoissaniteArmorMaterial();

	public static final Item CITRINE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CITRINE_SWORD = new ModSword(CITRINE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_BOW = new ModBow((new Item.Settings()).maxDamage(citrineBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_PICKAXE = new ModPickaxe(CITRINE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_AXE = new ModAxe(CITRINE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_SHOVEL = new ModShovel(CITRINE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_HOE = new ModHoe(CITRINE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item TOURMALINE_SWORD = new ModSword(TOURMALINE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_BOW = new ModBow((new Item.Settings()).maxDamage(tourmalineBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_PICKAXE = new ModPickaxe(TOURMALINE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_AXE = new ModAxe(TOURMALINE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_SHOVEL = new ModShovel(TOURMALINE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_HOE = new ModHoe(TOURMALINE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item KUNZITE_SWORD = new ModSword(KUNZITE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_BOW = new ModBow((new Item.Settings()).maxDamage(kunziteBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_PICKAXE = new ModPickaxe(KUNZITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_AXE = new ModAxe(KUNZITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_SHOVEL = new ModShovel(KUNZITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_HOE = new ModHoe(KUNZITE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item EMERALD_SWORD = new ModSword(EMERALD_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_BOW = new ModBow((new Item.Settings()).maxDamage(emeraldBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_PICKAXE = new ModPickaxe(EMERALD_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_AXE = new ModAxe(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_SHOVEL = new ModShovel(EMERALD_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_HOE = new ModHoe(EMERALD_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item TOPAZ_SWORD = new ModSword(TOPAZ_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_BOW = new ModBow((new Item.Settings()).maxDamage(topazBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_PICKAXE = new ModPickaxe(TOPAZ_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_AXE = new ModAxe(TOPAZ_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_SHOVEL = new ModShovel(TOPAZ_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_HOE = new ModHoe(TOPAZ_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item ALEXANDRITE_SWORD = new ModSword(ALEXANDRITE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_BOW = new ModBow((new Item.Settings()).maxDamage(alexandriteBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_PICKAXE = new ModPickaxe(ALEXANDRITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_AXE = new ModAxe(ALEXANDRITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_SHOVEL = new ModShovel(ALEXANDRITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_HOE = new ModHoe(ALEXANDRITE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CORUNDUM_SWORD = new ModSword(CORUNDUM_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_BOW = new ModBow((new Item.Settings()).maxDamage(corundumBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_PICKAXE = new ModPickaxe(CORUNDUM_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_AXE = new ModAxe(CORUNDUM_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_SHOVEL = new ModShovel(CORUNDUM_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_HOE = new ModHoe(CORUNDUM_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item SAPPHIRE_SWORD = new ModSword(SAPPHIRE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_BOW = new ModBow((new Item.Settings()).maxDamage(sapphireBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_PICKAXE = new ModPickaxe(SAPPHIRE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_AXE = new ModAxe(SAPPHIRE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_SHOVEL = new ModShovel(SAPPHIRE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_HOE = new ModHoe(SAPPHIRE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item RUBY_SWORD = new ModSword(RUBY_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_BOW = new ModBow((new Item.Settings()).maxDamage(rubyBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_PICKAXE = new ModPickaxe(RUBY_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_AXE = new ModAxe(RUBY_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_SHOVEL = new ModShovel(RUBY_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_HOE = new ModHoe(RUBY_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_HAMMER = new ModHammer(RUBY_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_EXCAVATOR = new ModExcavator(RUBY_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_PAXEL = new ModPaxel(RUBY_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item CARBONADO_SWORD = new ModSword(CARBONADO_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_BOW = new ModBow((new Item.Settings()).maxDamage(carbonadoBow).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_PICKAXE = new ModPickaxe(CARBONADO_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_AXE = new ModAxe(CARBONADO_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_SHOVEL = new ModShovel(CARBONADO_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_HOE = new ModHoe(CARBONADO_TOOL_MATERIAL, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item MOISSANITE_SWORD = new ModSword(MOISSANITE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_BOW = new ModBow((new Item.Settings()).maxDamage(moissaniteBow).fireproof().group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_PICKAXE = new ModPickaxe(MOISSANITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_AXE = new ModAxe(MOISSANITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_SHOVEL = new ModShovel(MOISSANITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_HOE = new ModHoe(MOISSANITE_TOOL_MATERIAL, -3, 0.0F, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CITRINE_HAMMER = new ModHammer(CITRINE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_HAMMER = new ModHammer(TOURMALINE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_HAMMER = new ModHammer(KUNZITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_HAMMER = new ModHammer(EMERALD_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_HAMMER = new ModHammer(TOPAZ_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_HAMMER = new ModHammer(ALEXANDRITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_HAMMER = new ModHammer(CORUNDUM_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_HAMMER = new ModHammer(SAPPHIRE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_HAMMER = new ModHammer(CARBONADO_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_HAMMER = new ModHammer(MOISSANITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CITRINE_EXCAVATOR = new ModExcavator(CITRINE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_EXCAVATOR = new ModExcavator(TOURMALINE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_EXCAVATOR = new ModExcavator(KUNZITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_EXCAVATOR = new ModExcavator(EMERALD_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_EXCAVATOR = new ModExcavator(TOPAZ_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_EXCAVATOR = new ModExcavator(ALEXANDRITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_EXCAVATOR = new ModExcavator(CORUNDUM_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_EXCAVATOR = new ModExcavator(SAPPHIRE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_EXCAVATOR = new ModExcavator(CARBONADO_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_EXCAVATOR = new ModExcavator(MOISSANITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CITRINE_PAXEL = new ModPaxel(CITRINE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_PAXEL = new ModPaxel(TOURMALINE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_PAXEL = new ModPaxel(KUNZITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_PAXEL = new ModPaxel(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_PAXEL = new ModPaxel(TOPAZ_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_PAXEL = new ModPaxel(ALEXANDRITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_PAXEL = new ModPaxel(CORUNDUM_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_PAXEL = new ModPaxel(SAPPHIRE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_PAXEL = new ModPaxel(CARBONADO_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_PAXEL = new ModPaxel(MOISSANITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CITRINE_HELMET = new ModArmor(CITRINE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_CHESTPLATE = new ModArmor(CITRINE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_LEGGINGS = new ModArmor(CITRINE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_BOOTS = new ModArmor(CITRINE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item TOURMALINE_HELMET = new ModArmor(TOURMALINE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_CHESTPLATE = new ModArmor(TOURMALINE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_LEGGINGS = new ModArmor(TOURMALINE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_BOOTS = new ModArmor(TOURMALINE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item KUNZITE_HELMET = new ModArmor(KUNZITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_CHESTPLATE = new ModArmor(KUNZITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_LEGGINGS = new ModArmor(KUNZITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_BOOTS = new ModArmor(KUNZITE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item EMERALD_HELMET = new ModArmor(EMERALD_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_CHESTPLATE = new ModArmor(EMERALD_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_LEGGINGS = new ModArmor(EMERALD_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_BOOTS = new ModArmor(EMERALD_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item TOPAZ_HELMET = new ModArmor(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_CHESTPLATE = new ModArmor(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_LEGGINGS = new ModArmor(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_BOOTS = new ModArmor(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item ALEXANDRITE_HELMET = new ModArmor(ALEXANDRITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_CHESTPLATE = new ModArmor(ALEXANDRITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_LEGGINGS = new ModArmor(ALEXANDRITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_BOOTS = new ModArmor(ALEXANDRITE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CORUNDUM_HELMET = new ModArmor(CORUNDUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_CHESTPLATE = new ModArmor(CORUNDUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_LEGGINGS = new ModArmor(CORUNDUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_BOOTS = new ModArmor(CORUNDUM_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item SAPPHIRE_HELMET = new ModArmor(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_CHESTPLATE = new ModArmor(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_LEGGINGS = new ModArmor(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_BOOTS = new ModArmor(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item RUBY_HELMET = new ModArmor(RUBY_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_CHESTPLATE = new ModArmor(RUBY_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_LEGGINGS = new ModArmor(RUBY_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_BOOTS = new ModArmor(RUBY_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CARBONADO_HELMET = new ModArmor(CARBONADO_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_CHESTPLATE = new ModArmor(CARBONADO_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_CHESTPLATE_GILDED = new CarbonadoGildedArmor(CARBONADO_GILDED_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_LEGGINGS = new ModArmor(CARBONADO_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_BOOTS = new ModArmor(CARBONADO_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item MOISSANITE_HELMET = new ModArmor(MOISSANITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_CHESTPLATE = new ModArmor(MOISSANITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_LEGGINGS = new ModArmor(MOISSANITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_BOOTS = new ModArmor(MOISSANITE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).fireproof().group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CITRINE_JUJU = new HasteCitrineJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_JUJU = new VisionTourmalineJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item KUNZITE_JUJU = new SpeedKunziteJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_JUJU = new HeroEmeraldJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_JUJU = new FireTopazJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_JUJU = new BreathingAlexandriteJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_JUJU = new FallingCorundumJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_JUJU = new SaturationSapphireJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_JUJU = new StrengthRubyJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_JUJU = new ConduitCarbonadoJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item MOISSANITE_JUJU = new PhoenixMoissaniteJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item SHARPENING_GEM = new SharpeningGem((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TREASURE_BAG = new TreasureBag((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));

	public static void registerItems()
	{
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine"), CITRINE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline"), TOURMALINE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite"), KUNZITE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz"), TOPAZ);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite"), ALEXANDRITE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum"), CORUNDUM);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire"), SAPPHIRE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby"), RUBY);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado"), CARBONADO);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite"), MOISSANITE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_sword"), CITRINE_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_bow"), CITRINE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_pickaxe"), CITRINE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_axe"), CITRINE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_shovel"), CITRINE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_hoe"), CITRINE_HOE);
	
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_sword"), TOURMALINE_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_bow"), TOURMALINE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_pickaxe"), TOURMALINE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_axe"), TOURMALINE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_shovel"), TOURMALINE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_hoe"), TOURMALINE_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_sword"), KUNZITE_SWORD);
		
		if(enableBows)
		{	
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_bow"), KUNZITE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_pickaxe"), KUNZITE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_axe"), KUNZITE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_shovel"), KUNZITE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_hoe"), KUNZITE_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_sword"), EMERALD_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_bow"), EMERALD_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_pickaxe"), EMERALD_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_axe"), EMERALD_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_shovel"), EMERALD_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_hoe"), EMERALD_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_sword"), TOPAZ_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_bow"), TOPAZ_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_pickaxe"), TOPAZ_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_axe"), TOPAZ_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_shovel"), TOPAZ_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_hoe"), TOPAZ_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_sword"), ALEXANDRITE_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_bow"), ALEXANDRITE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_pickaxe"), ALEXANDRITE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_axe"), ALEXANDRITE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_shovel"), ALEXANDRITE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_hoe"), ALEXANDRITE_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_sword"), CORUNDUM_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_bow"), CORUNDUM_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_pickaxe"), CORUNDUM_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_axe"), CORUNDUM_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_shovel"), CORUNDUM_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_hoe"), CORUNDUM_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_sword"), SAPPHIRE_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_bow"), SAPPHIRE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_pickaxe"), SAPPHIRE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_axe"), SAPPHIRE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_shovel"), SAPPHIRE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_hoe"), SAPPHIRE_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_sword"), RUBY_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_bow"), RUBY_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_axe"), RUBY_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_hoe"), RUBY_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_sword"), CARBONADO_SWORD);
		
		if(enableBows)
		{	
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_bow"), CARBONADO_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_pickaxe"), CARBONADO_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_axe"), CARBONADO_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_shovel"), CARBONADO_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_hoe"), CARBONADO_HOE);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_sword"), MOISSANITE_SWORD);

		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_bow"), MOISSANITE_BOW);
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_pickaxe"), MOISSANITE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_axe"), MOISSANITE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_shovel"), MOISSANITE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_hoe"), MOISSANITE_HOE);

		if(enableExtraTools)
		{
			if(enableHammers)
			{
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_hammer"), CITRINE_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_hammer"), TOURMALINE_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_hammer"), KUNZITE_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_hammer"), EMERALD_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_hammer"), TOPAZ_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_hammer"), ALEXANDRITE_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_hammer"), CORUNDUM_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_hammer"), SAPPHIRE_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_hammer"), RUBY_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_hammer"), CARBONADO_HAMMER);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_hammer"), MOISSANITE_HAMMER);
			}

			if(enableExcavators)
			{
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_excavator"), CITRINE_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_excavator"), TOURMALINE_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_excavator"), KUNZITE_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_excavator"), EMERALD_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_excavator"), TOPAZ_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_excavator"), ALEXANDRITE_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_excavator"), CORUNDUM_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_excavator"), SAPPHIRE_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_excavator"), RUBY_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_excavator"), CARBONADO_EXCAVATOR);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_excavator"), MOISSANITE_EXCAVATOR);
			}

			if(enablePaxels)
			{
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_paxel"), CITRINE_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_paxel"), TOURMALINE_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_paxel"), KUNZITE_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_paxel"), EMERALD_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_paxel"), TOPAZ_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_paxel"), ALEXANDRITE_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_paxel"), CORUNDUM_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_paxel"), SAPPHIRE_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_paxel"), RUBY_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_paxel"), CARBONADO_PAXEL);
				Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_paxel"), MOISSANITE_PAXEL);
			}
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_helmet"), CITRINE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_chestplate"), CITRINE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_leggings"), CITRINE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_boots"), CITRINE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_helmet"), TOURMALINE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_chestplate"), TOURMALINE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_leggings"), TOURMALINE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_boots"), TOURMALINE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_helmet"), KUNZITE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_chestplate"), KUNZITE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_leggings"), KUNZITE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_boots"), KUNZITE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_helmet"), EMERALD_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_chestplate"), EMERALD_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_leggings"), EMERALD_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_boots"), EMERALD_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_helmet"), TOPAZ_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_chestplate"), TOPAZ_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_leggings"), TOPAZ_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_boots"), TOPAZ_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_helmet"), ALEXANDRITE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_chestplate"), ALEXANDRITE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_leggings"), ALEXANDRITE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_boots"), ALEXANDRITE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_helmet"), CORUNDUM_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_chestplate"), CORUNDUM_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_leggings"), CORUNDUM_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_boots"), CORUNDUM_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_helmet"), SAPPHIRE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_chestplate"), SAPPHIRE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_leggings"), SAPPHIRE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_boots"), SAPPHIRE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_helmet"), RUBY_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_boots"), RUBY_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_helmet"), CARBONADO_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_chestplate"), CARBONADO_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_chestplate_gilded"), CARBONADO_CHESTPLATE_GILDED);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_leggings"), CARBONADO_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_boots"), CARBONADO_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_helmet"), MOISSANITE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_chestplate"), MOISSANITE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_leggings"), MOISSANITE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_boots"), MOISSANITE_BOOTS);

		if(jujuEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_juju"), CITRINE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_juju"), TOURMALINE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_juju"), KUNZITE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_juju"), EMERALD_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_juju"), TOPAZ_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_juju"), ALEXANDRITE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_juju"), CORUNDUM_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_juju"), SAPPHIRE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_juju"), RUBY_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_juju"), CARBONADO_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_juju"), MOISSANITE_JUJU);
		}

		if(enableTreasureBag)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "treasure_bag"), TREASURE_BAG);
		}

		if(enableSharpeningGem)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sharpening_gem"), SHARPENING_GEM);
		}
	}
}
