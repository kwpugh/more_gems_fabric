package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.areatools.ModExcavator;
import com.kwpugh.more_gems.items.areatools.ModHammer;
import com.kwpugh.more_gems.items.arrows.*;
import com.kwpugh.more_gems.items.baseclasses.*;
import com.kwpugh.more_gems.items.gembag.GemBase;
import com.kwpugh.more_gems.items.juju.*;
import com.kwpugh.more_gems.items.special.*;
import com.kwpugh.more_gems.materials.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit
{
	static int citrineBow = MoreGems.CONFIG.GENERAL.citrineDurability;
	static int tourmalineBow = MoreGems.CONFIG.GENERAL.tourmalineDurability;
	static int kunziteBow = MoreGems.CONFIG.GENERAL.kunziteDurability;
	static int topazBow = MoreGems.CONFIG.GENERAL.topazDurability;
	static int alexandriteBow = MoreGems.CONFIG.GENERAL.alexandriteDurability;
	static int corundumBow = MoreGems.CONFIG.GENERAL.corundumDurability;
	static int sapphireBow = MoreGems.CONFIG.GENERAL.sapphireDurability;
	static int spinelBow = MoreGems.CONFIG.GENERAL.spinelDurability;
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
	public static final ToolMaterial ALEXANDRITE_TOOL_MATERIAL = new AlexandriteToolMaterial();
	public static final ArmorMaterial ALEXANDRITE_ARMOR_MATERIAL = new AlexandriteArmorMaterial();
	public static final ToolMaterial CORUNDUM_TOOL_MATERIAL = new CorundumToolMaterial();
	public static final ArmorMaterial CORUNDUM_ARMOR_MATERIAL = new CorundumArmorMaterial();
	public static final ToolMaterial SAPPHIRE_TOOL_MATERIAL = new SapphireToolMaterial();
	public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new SapphireArmorMaterial();
	public static final ToolMaterial SPINEL_TOOL_MATERIAL = new SpinelToolMaterial();
	public static final ArmorMaterial SPINEL_ARMOR_MATERIAL = new SpinelArmorMaterial();
	public static final ToolMaterial CARBONADO_TOOL_MATERIAL = new CarbonadoToolMaterial();
	public static final ArmorMaterial CARBONADO_ARMOR_MATERIAL = new CarbonadoArmorMaterial();
	public static final ArmorMaterial CARBONADO_GILDED_ARMOR_MATERIAL = new CarbonadoGildedArmorMaterial();
	public static final ToolMaterial MOISSANITE_TOOL_MATERIAL = new MoissaniteToolMaterial();
	public static final ArmorMaterial MOISSANITE_ARMOR_MATERIAL = new MoissaniteArmorMaterial();

	public static final Item CITRINE = new GemBase((new Item.Settings()));
	public static final Item TOURMALINE = new GemBase((new Item.Settings()));
	public static final Item KUNZITE = new GemBase((new Item.Settings()));
	public static final Item TOPAZ = new GemBase((new Item.Settings()));
	public static final Item ALEXANDRITE = new GemBase((new Item.Settings()));
	public static final Item CORUNDUM = new GemBase((new Item.Settings()));
	public static final Item SAPPHIRE = new GemBase((new Item.Settings()));
	public static final Item SPINEL = new GemBase((new Item.Settings()));
	public static final Item CARBONADO = new GemBase((new Item.Settings()));
	public static final Item MOISSANITE = new GemBase((new Item.Settings()));

	public static final Item CITRINE_SWORD = new ModSword(CITRINE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item CITRINE_BOW = new ModBow((new Item.Settings()).maxDamage(citrineBow));
	public static final Item CITRINE_PICKAXE = new ModPickaxe(CITRINE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item CITRINE_AXE = new ModAxe(CITRINE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item CITRINE_SHOVEL = new ModShovel(CITRINE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item CITRINE_HOE = new ModHoe(CITRINE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()));

	public static final Item TOURMALINE_SWORD = new ModSword(TOURMALINE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item TOURMALINE_BOW = new ModBow((new Item.Settings()).maxDamage(tourmalineBow));
	public static final Item TOURMALINE_PICKAXE = new ModPickaxe(TOURMALINE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item TOURMALINE_AXE = new ModAxe(TOURMALINE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item TOURMALINE_SHOVEL = new ModShovel(TOURMALINE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item TOURMALINE_HOE = new ModHoe(TOURMALINE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()));

	public static final Item KUNZITE_SWORD = new ModSword(KUNZITE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item KUNZITE_BOW = new ModBow((new Item.Settings()).maxDamage(kunziteBow));
	public static final Item KUNZITE_PICKAXE = new ModPickaxe(KUNZITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item KUNZITE_AXE = new ModAxe(KUNZITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item KUNZITE_SHOVEL = new ModShovel(KUNZITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item KUNZITE_HOE = new ModHoe(KUNZITE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()));

	public static final Item TOPAZ_SWORD = new ModSword(TOPAZ_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item TOPAZ_BOW = new ModBow((new Item.Settings()).maxDamage(topazBow));
	public static final Item TOPAZ_PICKAXE = new ModPickaxe(TOPAZ_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item TOPAZ_AXE = new ModAxe(TOPAZ_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item TOPAZ_SHOVEL = new ModShovel(TOPAZ_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item TOPAZ_HOE = new ModHoe(TOPAZ_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()));

	public static final Item ALEXANDRITE_SWORD = new ModSword(ALEXANDRITE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item ALEXANDRITE_BOW = new ModBow((new Item.Settings()).maxDamage(alexandriteBow));
	public static final Item ALEXANDRITE_PICKAXE = new ModPickaxe(ALEXANDRITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item ALEXANDRITE_AXE = new ModAxe(ALEXANDRITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item ALEXANDRITE_SHOVEL = new ModShovel(ALEXANDRITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item ALEXANDRITE_HOE = new ModHoe(ALEXANDRITE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()));

	public static final Item CORUNDUM_SWORD = new ModSword(CORUNDUM_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item CORUNDUM_BOW = new ModBow((new Item.Settings()).maxDamage(corundumBow));
	public static final Item CORUNDUM_PICKAXE = new ModPickaxe(CORUNDUM_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item CORUNDUM_AXE = new ModAxe(CORUNDUM_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item CORUNDUM_SHOVEL = new ModShovel(CORUNDUM_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item CORUNDUM_HOE = new ModHoe(CORUNDUM_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()));

	public static final Item SAPPHIRE_SWORD = new ModSword(SAPPHIRE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item SAPPHIRE_BOW = new ModBow((new Item.Settings()).maxDamage(sapphireBow));
	public static final Item SAPPHIRE_PICKAXE = new ModPickaxe(SAPPHIRE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item SAPPHIRE_AXE = new ModAxe(SAPPHIRE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item SAPPHIRE_SHOVEL = new ModShovel(SAPPHIRE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item SAPPHIRE_HOE = new ModHoe(SAPPHIRE_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()));

	public static final Item SPINEL_SWORD = new ModSword(SPINEL_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item SPINEL_BOW = new ModBow((new Item.Settings()).maxDamage(spinelBow));
	public static final Item SPINEL_PICKAXE = new ModPickaxe(SPINEL_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item SPINEL_AXE = new ModAxe(SPINEL_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item SPINEL_SHOVEL = new ModShovel(SPINEL_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item SPINEL_HOE = new ModHoe(SPINEL_TOOL_MATERIAL, -2, 0.0F, (new Item.Settings()));
	public static final Item SPINEL_HAMMER = new ModHammer(SPINEL_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item SPINEL_EXCAVATOR = new ModExcavator(SPINEL_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item SPINEL_PAXEL = new ModPaxel(SPINEL_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));

	public static final Item CARBONADO_SWORD = new ModSword(CARBONADO_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item CARBONADO_BOW = new ModBow((new Item.Settings()).maxDamage(carbonadoBow));
	public static final Item CARBONADO_PICKAXE = new ModPickaxe(CARBONADO_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item CARBONADO_AXE = new ModAxe(CARBONADO_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item CARBONADO_SHOVEL = new ModShovel(CARBONADO_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item CARBONADO_HOE = new ModHoe(CARBONADO_TOOL_MATERIAL, -3, 0.0F, (new Item.Settings()));

	public static final Item MOISSANITE_SWORD = new ModSword(MOISSANITE_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()).fireproof());
	public static final Item MOISSANITE_BOW = new ModBow((new Item.Settings()).maxDamage(moissaniteBow).fireproof());
	public static final Item MOISSANITE_PICKAXE = new ModPickaxe(MOISSANITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).fireproof());
	public static final Item MOISSANITE_AXE = new ModAxe(MOISSANITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).fireproof());
	public static final Item MOISSANITE_SHOVEL = new ModShovel(MOISSANITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).fireproof());
	public static final Item MOISSANITE_HOE = new ModHoe(MOISSANITE_TOOL_MATERIAL, -3, 0.0F, (new Item.Settings()).fireproof());

	public static final Item CITRINE_HAMMER = new ModHammer(CITRINE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item TOURMALINE_HAMMER = new ModHammer(TOURMALINE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item KUNZITE_HAMMER = new ModHammer(KUNZITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item TOPAZ_HAMMER = new ModHammer(TOPAZ_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item ALEXANDRITE_HAMMER = new ModHammer(ALEXANDRITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item CORUNDUM_HAMMER = new ModHammer(CORUNDUM_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item SAPPHIRE_HAMMER = new ModHammer(SAPPHIRE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item CARBONADO_HAMMER = new ModHammer(CARBONADO_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item MOISSANITE_HAMMER = new ModHammer(MOISSANITE_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()).fireproof());

	public static final Item CITRINE_EXCAVATOR = new ModExcavator(CITRINE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item TOURMALINE_EXCAVATOR = new ModExcavator(TOURMALINE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item KUNZITE_EXCAVATOR = new ModExcavator(KUNZITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item TOPAZ_EXCAVATOR = new ModExcavator(TOPAZ_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item ALEXANDRITE_EXCAVATOR = new ModExcavator(ALEXANDRITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item CORUNDUM_EXCAVATOR = new ModExcavator(CORUNDUM_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item SAPPHIRE_EXCAVATOR = new ModExcavator(SAPPHIRE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item CARBONADO_EXCAVATOR = new ModExcavator(CARBONADO_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item MOISSANITE_EXCAVATOR = new ModExcavator(MOISSANITE_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()).fireproof());

	public static final Item CITRINE_PAXEL = new ModPaxel(CITRINE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item TOURMALINE_PAXEL = new ModPaxel(TOURMALINE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item KUNZITE_PAXEL = new ModPaxel(KUNZITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item TOPAZ_PAXEL = new ModPaxel(TOPAZ_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item ALEXANDRITE_PAXEL = new ModPaxel(ALEXANDRITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item CORUNDUM_PAXEL = new ModPaxel(CORUNDUM_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item SAPPHIRE_PAXEL = new ModPaxel(SAPPHIRE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item CARBONADO_PAXEL = new ModPaxel(CARBONADO_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item MOISSANITE_PAXEL = new ModPaxel(MOISSANITE_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()).fireproof());

	public static final Item CITRINE_ARROW = new CitrineArrowItem((new Item.Settings()));
	public static final Item TOURMALINE_ARROW = new TourmalineArrowItem((new Item.Settings()));
	public static final Item KUNZITE_ARROW = new KunziteArrowItem((new Item.Settings()));
	public static final Item TOPAZ_ARROW = new TopazArrowItem((new Item.Settings()));
	public static final Item ALEXANDRITE_ARROW = new AlexandriteArrowItem((new Item.Settings()));
	public static final Item CORUNDUM_ARROW = new CorundumArrowItem((new Item.Settings()));
	public static final Item SAPPHIRE_ARROW = new SapphireArrowItem((new Item.Settings()));
	public static final Item SPINEL_ARROW = new SpinelArrowItem((new Item.Settings()));
	public static final Item CARBONADO_ARROW = new CarbonadoArrowItem((new Item.Settings()));
	public static final Item MOISSANITE_ARROW = new MoissaniteArrowItem((new Item.Settings()));

	public static final Item CITRINE_HELMET = new ModArmor(CITRINE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item CITRINE_CHESTPLATE = new ModArmor(CITRINE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item CITRINE_LEGGINGS = new ModArmor(CITRINE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item CITRINE_BOOTS = new ModArmor(CITRINE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item TOURMALINE_HELMET = new ModArmor(TOURMALINE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item TOURMALINE_CHESTPLATE = new ModArmor(TOURMALINE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item TOURMALINE_LEGGINGS = new ModArmor(TOURMALINE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item TOURMALINE_BOOTS = new ModArmor(TOURMALINE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item KUNZITE_HELMET = new ModArmor(KUNZITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item KUNZITE_CHESTPLATE = new ModArmor(KUNZITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item KUNZITE_LEGGINGS = new ModArmor(KUNZITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item KUNZITE_BOOTS = new ModArmor(KUNZITE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item TOPAZ_HELMET = new ModArmor(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item TOPAZ_CHESTPLATE = new ModArmor(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item TOPAZ_LEGGINGS = new ModArmor(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item TOPAZ_BOOTS = new ModArmor(TOPAZ_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item ALEXANDRITE_HELMET = new ModArmor(ALEXANDRITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item ALEXANDRITE_CHESTPLATE = new ModArmor(ALEXANDRITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item ALEXANDRITE_LEGGINGS = new ModArmor(ALEXANDRITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item ALEXANDRITE_BOOTS = new ModArmor(ALEXANDRITE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item CORUNDUM_HELMET = new ModArmor(CORUNDUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item CORUNDUM_CHESTPLATE = new ModArmor(CORUNDUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item CORUNDUM_LEGGINGS = new ModArmor(CORUNDUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item CORUNDUM_BOOTS = new ModArmor(CORUNDUM_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item SAPPHIRE_HELMET = new ModArmor(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item SAPPHIRE_CHESTPLATE = new ModArmor(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item SAPPHIRE_LEGGINGS = new ModArmor(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item SAPPHIRE_BOOTS = new ModArmor(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item SPINEL_HELMET = new ModArmor(SPINEL_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item SPINEL_CHESTPLATE = new ModArmor(SPINEL_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item SPINEL_LEGGINGS = new ModArmor(SPINEL_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item SPINEL_BOOTS = new ModArmor(SPINEL_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item CARBONADO_HELMET = new ModArmor(CARBONADO_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item CARBONADO_CHESTPLATE = new ModArmor(CARBONADO_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item CARBONADO_CHESTPLATE_GILDED = new CarbonadoGildedArmor(CARBONADO_GILDED_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item CARBONADO_LEGGINGS = new ModArmor(CARBONADO_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item CARBONADO_BOOTS = new ModArmor(CARBONADO_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item MOISSANITE_HELMET = new ModArmor(MOISSANITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()).fireproof());
	public static final Item MOISSANITE_CHESTPLATE = new ModArmor(MOISSANITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()).fireproof());
	public static final Item MOISSANITE_LEGGINGS = new ModArmor(MOISSANITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()).fireproof());
	public static final Item MOISSANITE_BOOTS = new ModArmor(MOISSANITE_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()).fireproof());

	public static final Item CITRINE_JUJU = new HasteCitrineJuju((new Item.Settings()).maxCount(1));
	public static final Item TOURMALINE_JUJU = new VisionTourmalineJuju((new Item.Settings()).maxCount(1));
	public static final Item KUNZITE_JUJU = new SpeedKunziteJuju((new Item.Settings()).maxCount(1));
	public static final Item EMERALD_JUJU = new HeroEmeraldJuju((new Item.Settings()).maxCount(1));
	public static final Item TOPAZ_JUJU = new FireTopazJuju((new Item.Settings()).maxCount(1));
	public static final Item ALEXANDRITE_JUJU = new BreathingAlexandriteJuju((new Item.Settings()).maxCount(1));
	public static final Item CORUNDUM_JUJU = new FallingCorundumJuju((new Item.Settings()).maxCount(1));
	public static final Item SAPPHIRE_JUJU = new SaturationSapphireJuju((new Item.Settings()).maxCount(1));
	public static final Item SPINEL_JUJU = new StrengthSpinelJuju((new Item.Settings()).maxCount(1));
	public static final Item CARBONADO_JUJU = new ConduitCarbonadoJuju((new Item.Settings()).maxCount(1));
	public static final Item MOISSANITE_JUJU = new PhoenixMoissaniteJuju((new Item.Settings()).maxCount(1));

	public static final Item CROWN = new ModArmor(ArmorMaterials.GOLD, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item CROWN_GEM = new CrownGem(ArmorMaterials.GOLD, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item CROWN_NETHERITE_GEM = new CrownNetheriteGem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, (new Item.Settings()));

	public static final Item SHARPENING_GEM = new SharpeningGem((new Item.Settings()).maxCount(64));
	public static final Item SHARPENING_GEM_GREATER = new SharpeningGemGreater((new Item.Settings()).maxCount(64));
	public static final Item TREASURE_BAG = new TreasureBag((new Item.Settings()).maxCount(1));

	public static void registerItems()
	{
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine"), CITRINE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline"), TOURMALINE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite"), KUNZITE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz"), TOPAZ);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite"), ALEXANDRITE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum"), CORUNDUM);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire"), SAPPHIRE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel"), SPINEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado"), CARBONADO);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite"), MOISSANITE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_sword"), CITRINE_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_pickaxe"), CITRINE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_axe"), CITRINE_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_shovel"), CITRINE_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_hoe"), CITRINE_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_sword"), TOURMALINE_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_pickaxe"), TOURMALINE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_axe"), TOURMALINE_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_shovel"), TOURMALINE_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_hoe"), TOURMALINE_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_sword"), KUNZITE_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_pickaxe"), KUNZITE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_axe"), KUNZITE_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_shovel"), KUNZITE_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_hoe"), KUNZITE_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_sword"), TOPAZ_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_pickaxe"), TOPAZ_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_axe"), TOPAZ_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_shovel"), TOPAZ_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_hoe"), TOPAZ_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_sword"), ALEXANDRITE_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_pickaxe"), ALEXANDRITE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_axe"), ALEXANDRITE_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_shovel"), ALEXANDRITE_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_hoe"), ALEXANDRITE_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_sword"), CORUNDUM_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_pickaxe"), CORUNDUM_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_axe"), CORUNDUM_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_shovel"), CORUNDUM_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_hoe"), CORUNDUM_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_sword"), SAPPHIRE_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_pickaxe"), SAPPHIRE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_axe"), SAPPHIRE_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_shovel"), SAPPHIRE_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_hoe"), SAPPHIRE_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_sword"), SPINEL_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_pickaxe"), SPINEL_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_axe"), SPINEL_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_shovel"), SPINEL_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_hoe"), SPINEL_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_sword"), CARBONADO_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_pickaxe"), CARBONADO_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_axe"), CARBONADO_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_shovel"), CARBONADO_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_hoe"), CARBONADO_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_sword"), MOISSANITE_SWORD);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_pickaxe"), MOISSANITE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_axe"), MOISSANITE_AXE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_shovel"), MOISSANITE_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_hoe"), MOISSANITE_HOE);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_bow"), CITRINE_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_bow"), TOURMALINE_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_bow"), KUNZITE_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_bow"), TOPAZ_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_bow"), ALEXANDRITE_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_bow"), CORUNDUM_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_bow"), SAPPHIRE_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_bow"), SPINEL_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_bow"), CARBONADO_BOW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_bow"), MOISSANITE_BOW);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_arrow"), CITRINE_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_arrow"), TOURMALINE_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_arrow"), KUNZITE_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_arrow"), TOPAZ_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_arrow"), ALEXANDRITE_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_arrow"), CORUNDUM_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_arrow"), SAPPHIRE_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_arrow"), SPINEL_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_arrow"), CARBONADO_ARROW);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_arrow"), MOISSANITE_ARROW);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_hammer"), CITRINE_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_hammer"), TOURMALINE_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_hammer"), KUNZITE_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_hammer"), TOPAZ_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_hammer"), ALEXANDRITE_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_hammer"), CORUNDUM_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_hammer"), SAPPHIRE_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_hammer"), SPINEL_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_hammer"), CARBONADO_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_hammer"), MOISSANITE_HAMMER);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_excavator"), CITRINE_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_excavator"), TOURMALINE_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_excavator"), KUNZITE_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_excavator"), TOPAZ_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_excavator"), ALEXANDRITE_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_excavator"), CORUNDUM_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_excavator"), SAPPHIRE_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_excavator"), SPINEL_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_excavator"), CARBONADO_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_excavator"), MOISSANITE_EXCAVATOR);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_paxel"), CITRINE_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_paxel"), TOURMALINE_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_paxel"), KUNZITE_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_paxel"), TOPAZ_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_paxel"), ALEXANDRITE_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_paxel"), CORUNDUM_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_paxel"), SAPPHIRE_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_paxel"), SPINEL_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_paxel"), CARBONADO_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_paxel"), MOISSANITE_PAXEL);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_helmet"), CITRINE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_chestplate"), CITRINE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_leggings"), CITRINE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_boots"), CITRINE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_helmet"), TOURMALINE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_chestplate"), TOURMALINE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_leggings"), TOURMALINE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_boots"), TOURMALINE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_helmet"), KUNZITE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_chestplate"), KUNZITE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_leggings"), KUNZITE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_boots"), KUNZITE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_helmet"), TOPAZ_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_chestplate"), TOPAZ_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_leggings"), TOPAZ_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_boots"), TOPAZ_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_helmet"), ALEXANDRITE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_chestplate"), ALEXANDRITE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_leggings"), ALEXANDRITE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_boots"), ALEXANDRITE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_helmet"), CORUNDUM_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_chestplate"), CORUNDUM_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_leggings"), CORUNDUM_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_boots"), CORUNDUM_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_helmet"), SAPPHIRE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_chestplate"), SAPPHIRE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_leggings"), SAPPHIRE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_boots"), SAPPHIRE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_helmet"), SPINEL_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_chestplate"), SPINEL_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_leggings"), SPINEL_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_boots"), SPINEL_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_helmet"), CARBONADO_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_chestplate"), CARBONADO_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_chestplate_gilded"), CARBONADO_CHESTPLATE_GILDED);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_leggings"), CARBONADO_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_boots"), CARBONADO_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_helmet"), MOISSANITE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_chestplate"), MOISSANITE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_leggings"), MOISSANITE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_boots"), MOISSANITE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_juju"), CITRINE_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_juju"), TOURMALINE_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_juju"), KUNZITE_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_juju"), EMERALD_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_juju"), TOPAZ_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_juju"), ALEXANDRITE_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_juju"), CORUNDUM_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_juju"), SAPPHIRE_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_juju"), SPINEL_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_juju"), CARBONADO_JUJU);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_juju"), MOISSANITE_JUJU);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "crown"), CROWN);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "crown_gem"), CROWN_GEM);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "crown_netherite_gem"), CROWN_NETHERITE_GEM);

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sharpening_gem"), SHARPENING_GEM);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sharpening_gem_greater"), SHARPENING_GEM_GREATER);
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "treasure_bag"), TREASURE_BAG);
	}
}
