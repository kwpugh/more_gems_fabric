package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.areatools.ModExcavator;
import com.kwpugh.more_gems.items.areatools.ModHammer;
import com.kwpugh.more_gems.items.baseclasses.ModArmor;
import com.kwpugh.more_gems.items.baseclasses.ModAxe;
import com.kwpugh.more_gems.items.baseclasses.ModBow;
import com.kwpugh.more_gems.items.baseclasses.ModHoe;
import com.kwpugh.more_gems.items.baseclasses.ModPaxel;
import com.kwpugh.more_gems.items.baseclasses.ModPickaxe;
import com.kwpugh.more_gems.items.baseclasses.ModShovel;
import com.kwpugh.more_gems.items.baseclasses.ModSword;
import com.kwpugh.more_gems.items.gembag.GemBase;
import com.kwpugh.more_gems.items.juju.ItemAlexandriteJuju;
import com.kwpugh.more_gems.items.juju.ItemAmethystJuju;
import com.kwpugh.more_gems.items.juju.ItemCarbonadoJuju;
import com.kwpugh.more_gems.items.juju.ItemCitrineJuju;
import com.kwpugh.more_gems.items.juju.ItemCorundumJuju;
import com.kwpugh.more_gems.items.juju.ItemEmeraldJuju;
import com.kwpugh.more_gems.items.juju.ItemRubyJuju;
import com.kwpugh.more_gems.items.juju.ItemSapphireJuju;
import com.kwpugh.more_gems.items.juju.ItemTopazJuju;
import com.kwpugh.more_gems.items.juju.ItemTourmalineJuju;
import com.kwpugh.more_gems.materials.ModArmorMaterial;
import com.kwpugh.more_gems.materials.ModToolMaterial;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit
{
	static boolean jujuEnable = MoreGems.CONFIG.GENERAL.jujuEnable;
	static boolean extraToolsEnable = MoreGems.CONFIG.GENERAL.extraToolsEnable;
	static boolean enableBows = MoreGems.CONFIG.GENERAL.bowsEnable;
	
	public static final Item CITRINE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO = new GemBase((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CITRINE_SWORD = new ModSword(ModToolMaterial.CITRINE, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_BOW = new ModBow((new Item.Settings()).maxDamage(825).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_PICKAXE = new ModPickaxe(ModToolMaterial.CITRINE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_AXE = new ModAxe(ModToolMaterial.CITRINE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_SHOVEL = new ModShovel(ModToolMaterial.CITRINE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_HOE = new ModHoe(ModToolMaterial.CITRINE, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_HAMMER = new ModHammer(ModToolMaterial.CITRINE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_EXCAVATOR = new ModExcavator(ModToolMaterial.CITRINE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_PAXEL = new ModPaxel(ModToolMaterial.CITRINE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item TOURMALINE_SWORD = new ModSword(ModToolMaterial.TOURMALINE, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_BOW = new ModBow((new Item.Settings()).maxDamage(936).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_PICKAXE = new ModPickaxe(ModToolMaterial.TOURMALINE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_AXE = new ModAxe(ModToolMaterial.TOURMALINE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_SHOVEL = new ModShovel(ModToolMaterial.TOURMALINE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_HOE = new ModHoe(ModToolMaterial.TOURMALINE, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_HAMMER = new ModHammer(ModToolMaterial.TOURMALINE, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_EXCAVATOR = new ModExcavator(ModToolMaterial.TOURMALINE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_PAXEL = new ModPaxel(ModToolMaterial.TOURMALINE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item AMETHYST_SWORD = new ModSword(ModToolMaterial.AMETHYST, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_BOW = new ModBow((new Item.Settings()).maxDamage(1092).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_PICKAXE = new ModPickaxe(ModToolMaterial.AMETHYST, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_AXE = new ModAxe(ModToolMaterial.AMETHYST, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_SHOVEL = new ModShovel(ModToolMaterial.AMETHYST, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_HOE = new ModHoe(ModToolMaterial.AMETHYST, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_HAMMER = new ModHammer(ModToolMaterial.AMETHYST, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_EXCAVATOR = new ModExcavator(ModToolMaterial.AMETHYST, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_PAXEL = new ModPaxel(ModToolMaterial.AMETHYST, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item EMERALD_SWORD = new ModSword(ModToolMaterial.EMERALD, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_BOW = new ModBow((new Item.Settings()).maxDamage(1170).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_PICKAXE = new ModPickaxe(ModToolMaterial.EMERALD, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_AXE = new ModAxe(ModToolMaterial.EMERALD, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_SHOVEL = new ModShovel(ModToolMaterial.EMERALD, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_HOE = new ModHoe(ModToolMaterial.EMERALD, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_HAMMER = new ModHammer(ModToolMaterial.EMERALD, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_EXCAVATOR = new ModExcavator(ModToolMaterial.EMERALD, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_PAXEL = new ModPaxel(ModToolMaterial.EMERALD, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item TOPAZ_SWORD = new ModSword(ModToolMaterial.TOPAZ, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_BOW = new ModBow((new Item.Settings()).maxDamage(1248).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_PICKAXE = new ModPickaxe(ModToolMaterial.TOPAZ, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_AXE = new ModAxe(ModToolMaterial.TOPAZ, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_SHOVEL = new ModShovel(ModToolMaterial.TOPAZ, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_HOE = new ModHoe(ModToolMaterial.TOPAZ, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_HAMMER = new ModHammer(ModToolMaterial.TOPAZ, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_EXCAVATOR = new ModExcavator(ModToolMaterial.TOPAZ, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_PAXEL = new ModPaxel(ModToolMaterial.TOPAZ, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item ALEXANDRITE_SWORD = new ModSword(ModToolMaterial.ALEXANDRITE, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_BOW = new ModBow((new Item.Settings()).maxDamage(1326).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_PICKAXE = new ModPickaxe(ModToolMaterial.ALEXANDRITE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_AXE = new ModAxe(ModToolMaterial.ALEXANDRITE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_SHOVEL = new ModShovel(ModToolMaterial.ALEXANDRITE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_HOE = new ModHoe(ModToolMaterial.ALEXANDRITE, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_HAMMER = new ModHammer(ModToolMaterial.ALEXANDRITE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_EXCAVATOR = new ModExcavator(ModToolMaterial.ALEXANDRITE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_PAXEL = new ModPaxel(ModToolMaterial.ALEXANDRITE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item CORUNDUM_SWORD = new ModSword(ModToolMaterial.CORUNDUM, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_BOW = new ModBow((new Item.Settings()).maxDamage(1404).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_PICKAXE = new ModPickaxe(ModToolMaterial.CORUNDUM, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_AXE = new ModAxe(ModToolMaterial.CORUNDUM, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_SHOVEL = new ModShovel(ModToolMaterial.CORUNDUM, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_HOE = new ModHoe(ModToolMaterial.CORUNDUM, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_HAMMER = new ModHammer(ModToolMaterial.CORUNDUM, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_EXCAVATOR = new ModExcavator(ModToolMaterial.CORUNDUM, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_PAXEL = new ModPaxel(ModToolMaterial.CORUNDUM, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item SAPPHIRE_SWORD = new ModSword(ModToolMaterial.SAPPHIRE, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_BOW = new ModBow((new Item.Settings()).maxDamage(1404).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_PICKAXE = new ModPickaxe(ModToolMaterial.SAPPHIRE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_AXE = new ModAxe(ModToolMaterial.SAPPHIRE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_SHOVEL = new ModShovel(ModToolMaterial.SAPPHIRE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_HOE = new ModHoe(ModToolMaterial.SAPPHIRE, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_HAMMER = new ModHammer(ModToolMaterial.SAPPHIRE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_EXCAVATOR = new ModExcavator(ModToolMaterial.SAPPHIRE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_PAXEL = new ModPaxel(ModToolMaterial.SAPPHIRE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item RUBY_SWORD = new ModSword(ModToolMaterial.RUBY, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_BOW = new ModBow((new Item.Settings()).maxDamage(1404).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_PICKAXE = new ModPickaxe(ModToolMaterial.RUBY, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_AXE = new ModAxe(ModToolMaterial.RUBY, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_SHOVEL = new ModShovel(ModToolMaterial.RUBY, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_HOE = new ModHoe(ModToolMaterial.RUBY, -2, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_HAMMER = new ModHammer(ModToolMaterial.RUBY, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_EXCAVATOR = new ModExcavator(ModToolMaterial.RUBY, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_PAXEL = new ModPaxel(ModToolMaterial.RUBY, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item CARBONADO_SWORD = new ModSword(ModToolMaterial.CARBONADO, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_BOW = new ModBow((new Item.Settings()).maxDamage(1561).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_PICKAXE = new ModPickaxe(ModToolMaterial.CARBONADO, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_AXE = new ModAxe(ModToolMaterial.CARBONADO, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_SHOVEL = new ModShovel(ModToolMaterial.CARBONADO, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_HOE = new ModHoe(ModToolMaterial.CARBONADO, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_HAMMER = new ModHammer(ModToolMaterial.CARBONADO, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_EXCAVATOR = new ModExcavator(ModToolMaterial.CARBONADO, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_PAXEL = new ModPaxel(ModToolMaterial.CARBONADO, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	
	public static final Item CITRINE_HELMET = new ModArmor(ModArmorMaterial.CITRINE, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_CHESTPLATE = new ModArmor(ModArmorMaterial.CITRINE, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_LEGGINGS = new ModArmor(ModArmorMaterial.CITRINE, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CITRINE_BOOTS = new ModArmor(ModArmorMaterial.CITRINE, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item TOURMALINE_HELMET = new ModArmor(ModArmorMaterial.TOURMALINE, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_CHESTPLATE = new ModArmor(ModArmorMaterial.TOURMALINE, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_LEGGINGS = new ModArmor(ModArmorMaterial.TOURMALINE, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_BOOTS = new ModArmor(ModArmorMaterial.TOURMALINE, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item AMETHYST_HELMET = new ModArmor(ModArmorMaterial.AMETHYST, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_CHESTPLATE = new ModArmor(ModArmorMaterial.AMETHYST, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_LEGGINGS = new ModArmor(ModArmorMaterial.AMETHYST, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_BOOTS = new ModArmor(ModArmorMaterial.AMETHYST, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item EMERALD_HELMET = new ModArmor(ModArmorMaterial.EMERALD, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_CHESTPLATE = new ModArmor(ModArmorMaterial.EMERALD, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_LEGGINGS = new ModArmor(ModArmorMaterial.EMERALD, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_BOOTS = new ModArmor(ModArmorMaterial.EMERALD, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item TOPAZ_HELMET = new ModArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_CHESTPLATE = new ModArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_LEGGINGS = new ModArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_BOOTS = new ModArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item ALEXANDRITE_HELMET = new ModArmor(ModArmorMaterial.ALEXANDRITE, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_CHESTPLATE = new ModArmor(ModArmorMaterial.ALEXANDRITE, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_LEGGINGS = new ModArmor(ModArmorMaterial.ALEXANDRITE, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_BOOTS = new ModArmor(ModArmorMaterial.ALEXANDRITE, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CORUNDUM_HELMET = new ModArmor(ModArmorMaterial.CORUNDUM, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_CHESTPLATE = new ModArmor(ModArmorMaterial.CORUNDUM, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_LEGGINGS = new ModArmor(ModArmorMaterial.CORUNDUM, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_BOOTS = new ModArmor(ModArmorMaterial.CORUNDUM, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item SAPPHIRE_HELMET = new ModArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_CHESTPLATE = new ModArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_LEGGINGS = new ModArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_BOOTS = new ModArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item RUBY_HELMET = new ModArmor(ModArmorMaterial.RUBY, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_CHESTPLATE = new ModArmor(ModArmorMaterial.RUBY, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_LEGGINGS = new ModArmor(ModArmorMaterial.RUBY, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_BOOTS = new ModArmor(ModArmorMaterial.RUBY, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CARBONADO_HELMET = new ModArmor(ModArmorMaterial.CARBONADO, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_CHESTPLATE = new ModArmor(ModArmorMaterial.CARBONADO, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_LEGGINGS = new ModArmor(ModArmorMaterial.CARBONADO, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_BOOTS = new ModArmor(ModArmorMaterial.CARBONADO, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP));

	public static final Item CITRINE_JUJU = new ItemCitrineJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOURMALINE_JUJU = new ItemTourmalineJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item AMETHYST_JUJU = new ItemAmethystJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item EMERALD_JUJU = new ItemEmeraldJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item TOPAZ_JUJU = new ItemTopazJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item ALEXANDRITE_JUJU = new ItemAlexandriteJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CORUNDUM_JUJU = new ItemCorundumJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item SAPPHIRE_JUJU = new ItemSapphireJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item RUBY_JUJU = new ItemRubyJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));
	public static final Item CARBONADO_JUJU = new ItemCarbonadoJuju((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));

	public static void registerItems()
	{
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine"), CITRINE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline"), TOURMALINE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst"), AMETHYST);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz"), TOPAZ);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite"), ALEXANDRITE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum"), CORUNDUM);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire"), SAPPHIRE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby"), RUBY);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado"), CARBONADO);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_sword"), CITRINE_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_bow"), CITRINE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_pickaxe"), CITRINE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_axe"), CITRINE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_shovel"), CITRINE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_hoe"), CITRINE_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_hammer"), CITRINE_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_excavator"), CITRINE_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_paxel"), CITRINE_PAXEL);		
		}
	
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_sword"), TOURMALINE_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_bow"), TOURMALINE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_pickaxe"), TOURMALINE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_axe"), TOURMALINE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_shovel"), TOURMALINE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_hoe"), TOURMALINE_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_hammer"), TOURMALINE_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_excavator"), TOURMALINE_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_paxel"), TOURMALINE_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_sword"), AMETHYST_SWORD);
		
		if(enableBows)
		{	
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_bow"), AMETHYST_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_pickaxe"), AMETHYST_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_axe"), AMETHYST_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_shovel"), AMETHYST_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_hoe"), AMETHYST_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_hammer"), AMETHYST_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_excavator"), AMETHYST_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_paxel"), AMETHYST_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_sword"), EMERALD_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_bow"), EMERALD_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_pickaxe"), EMERALD_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_axe"), EMERALD_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_shovel"), EMERALD_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_hoe"), EMERALD_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_hammer"), EMERALD_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_excavator"), EMERALD_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_paxel"), EMERALD_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_sword"), TOPAZ_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_bow"), TOPAZ_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_pickaxe"), TOPAZ_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_axe"), TOPAZ_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_shovel"), TOPAZ_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_hoe"), TOPAZ_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_hammer"), TOPAZ_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_excavator"), TOPAZ_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_paxel"), TOPAZ_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_sword"), ALEXANDRITE_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_bow"), ALEXANDRITE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_pickaxe"), ALEXANDRITE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_axe"), ALEXANDRITE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_shovel"), ALEXANDRITE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_hoe"), ALEXANDRITE_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_hammer"), ALEXANDRITE_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_excavator"), ALEXANDRITE_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_paxel"), ALEXANDRITE_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_sword"), CORUNDUM_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_bow"), CORUNDUM_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_pickaxe"), CORUNDUM_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_axe"), CORUNDUM_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_shovel"), CORUNDUM_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_hoe"), CORUNDUM_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_hammer"), CORUNDUM_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_excavator"), CORUNDUM_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_paxel"), CORUNDUM_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_sword"), SAPPHIRE_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_bow"), SAPPHIRE_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_pickaxe"), SAPPHIRE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_axe"), SAPPHIRE_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_shovel"), SAPPHIRE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_hoe"), SAPPHIRE_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_hammer"), SAPPHIRE_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_excavator"), SAPPHIRE_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_paxel"), SAPPHIRE_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_sword"), RUBY_SWORD);
		
		if(enableBows)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_bow"), RUBY_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_axe"), RUBY_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_hoe"), RUBY_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_hammer"), RUBY_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_excavator"), RUBY_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_paxel"), RUBY_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_sword"), CARBONADO_SWORD);
		
		if(enableBows)
		{	
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_bow"), CARBONADO_BOW);
		}
		
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_pickaxe"), CARBONADO_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_axe"), CARBONADO_AXE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_shovel"), CARBONADO_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_hoe"), CARBONADO_HOE);
		
		if(extraToolsEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_hammer"), CARBONADO_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_excavator"), CARBONADO_EXCAVATOR);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_paxel"), CARBONADO_PAXEL);	
		}

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_helmet"), CITRINE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_chestplate"), CITRINE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_leggings"), CITRINE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_boots"), CITRINE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_helmet"), TOURMALINE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_chestplate"), TOURMALINE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_leggings"), TOURMALINE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_boots"), TOURMALINE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_helmet"), AMETHYST_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_chestplate"), AMETHYST_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_leggings"), AMETHYST_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_boots"), AMETHYST_BOOTS);

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
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_leggings"), CARBONADO_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_boots"), CARBONADO_BOOTS);

		if(jujuEnable)
		{
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_juju"), CITRINE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_juju"), TOURMALINE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "amethyst_juju"), AMETHYST_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "emerald_juju"), EMERALD_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_juju"), TOPAZ_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_juju"), ALEXANDRITE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_juju"), CORUNDUM_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_juju"), SAPPHIRE_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "ruby_juju"), RUBY_JUJU);
			Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_juju"), CARBONADO_JUJU);
		}
	}
}
