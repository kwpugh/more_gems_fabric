package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.gear.ModArmor;
import com.kwpugh.more_gems.items.gear.ModAxe;
import com.kwpugh.more_gems.items.gear.ModHoe;
import com.kwpugh.more_gems.items.gear.ModPickaxe;
import com.kwpugh.more_gems.items.gear.ModShovel;
import com.kwpugh.more_gems.items.gear.ModSword;
import com.kwpugh.more_gems.items.juju.ItemAlexandriteJuju;
import com.kwpugh.more_gems.items.juju.ItemAmethystJuju;
import com.kwpugh.more_gems.items.juju.ItemCarbonadoJuju;
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

/*
 * Mohs Scale of Hardness
Diamond -10
Carbonado - 10
Ruby - 9
Sapphire - 9
Corundum - 9
Alexandrite - 8.5
Topaz - 8
Emerald - 7.5
Amethyst - 7
Tourmaline - 6
 */

public class ContentInit
{
	public static final BlockBase TOURMALINE_ORE = new BlockBase("tourmaline_ore", 3.0f, 3.0f);
	public static final BlockBase AMETHYST_ORE = new BlockBase("amethyst_ore", 3.0f, 3.0f);
	public static final BlockBase TOPAZ_ORE = new BlockBase("topaz_ore", 3.0f, 3.0f);
	public static final BlockBase ALEXANDRITE_ORE = new BlockBase("alexandrite_ore", 3.0f, 3.0f);
	public static final BlockBase CORUNDUM_ORE = new BlockBase("corundum_ore", 3.0f, 3.0f);
	public static final BlockBase SAPPHIRE_ORE = new BlockBase("sapphire_ore", 3.0f, 3.0f);
	public static final BlockBase RUBY_ORE = new BlockBase("ruby_ore", 3.0f, 3.0f);
	public static final BlockBase CARBONADO_ORE = new BlockBase("carbonado_ore", 3.0f, 3.0f);
	
	public static final Item TOURMALINE = registerItem("tourmaline", new Item((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item AMETHYST = registerItem("amethyst", new Item((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item TOPAZ = registerItem("topaz", new Item((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item ALEXANDRITE = registerItem("alexandrite", new Item((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item CORUNDUM = registerItem("corundum", new Item((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item SAPPHIRE = registerItem("sapphire", new Item((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item RUBY = registerItem("ruby", new Item((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item CARBONADO = registerItem("carbonado", new Item((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	
	public static final BlockBase TOURMALINE_BLOCK = new BlockBase("tourmaline_block", 3.0f, 3.0f);
	public static final BlockBase AMETHYST_BLOCK = new BlockBase("amethyst_block", 3.0f, 3.0f);
	public static final BlockBase TOPAZ_BLOCK = new BlockBase("topaz_block", 3.0f, 3.0f);	
	public static final BlockBase ALEXANDRITE_BLOCK = new BlockBase("alexandrite_block", 3.0f, 3.0f);
	public static final BlockBase CORUNDUM_BLOCK = new BlockBase("corundum_block", 3.0f, 3.0f);
	public static final BlockBase SAPPHIRE_BLOCK = new BlockBase("sapphire_block", 3.0f, 3.0f);	
	public static final BlockBase RUBY_BLOCK = new BlockBase("ruby_block", 3.0f, 3.0f);	
	public static final BlockBase CARBONADO_BLOCK = new BlockBase("carbonado_block", 3.0f, 3.0f);

	public static final Item TOURMALINE_SWORD = registerItem((String)"tourmaline_sword", (Item)(new ModSword(ModToolMaterial.TOURMALINE, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOURMALINE_PICKAXE = registerItem((String)"tourmaline_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.TOURMALINE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOURMALINE_AXE = registerItem((String)"tourmaline_axe", (Item)(new ModAxe(ModToolMaterial.TOURMALINE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOURMALINE_SHOVEL = registerItem((String)"tourmaline_shovel", (Item)(new ModShovel(ModToolMaterial.TOURMALINE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOURMALINE_HOE = registerItem((String)"tourmaline_hoe", (Item)(new ModHoe(ModToolMaterial.TOURMALINE, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item AMETHYST_SWORD = registerItem((String)"amethyst_sword", (Item)(new ModSword(ModToolMaterial.AMETHYST, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item AMETHYST_PICKAXE = registerItem((String)"amethyst_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.AMETHYST, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item AMETHYST_AXE = registerItem((String)"amethyst_axe", (Item)(new ModAxe(ModToolMaterial.AMETHYST, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item AMETHYST_SHOVEL = registerItem((String)"amethyst_shovel", (Item)(new ModShovel(ModToolMaterial.AMETHYST, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item AMETHYST_HOE = registerItem((String)"amethyst_hoe", (Item)(new ModHoe(ModToolMaterial.AMETHYST, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item EMERALD_SWORD = registerItem((String)"emerald_sword", (Item)(new ModSword(ModToolMaterial.EMERALD, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item EMERALD_PICKAXE = registerItem((String)"emerald_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.EMERALD, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item EMERALD_AXE = registerItem((String)"emerald_axe", (Item)(new ModAxe(ModToolMaterial.EMERALD, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item EMERALD_SHOVEL = registerItem((String)"emerald_shovel", (Item)(new ModShovel(ModToolMaterial.EMERALD, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item EMERALD_HOE = registerItem((String)"emerald_hoe", (Item)(new ModHoe(ModToolMaterial.EMERALD, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item TOPAZ_SWORD = registerItem((String)"topaz_sword", (Item)(new ModSword(ModToolMaterial.TOPAZ, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOPAZ_PICKAXE = registerItem((String)"topaz_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.TOPAZ, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOPAZ_AXE = registerItem((String)"topaz_axe", (Item)(new ModAxe(ModToolMaterial.TOPAZ, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOPAZ_SHOVEL = registerItem((String)"topaz_shovel", (Item)(new ModShovel(ModToolMaterial.TOPAZ, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOPAZ_HOE = registerItem((String)"topaz_hoe", (Item)(new ModHoe(ModToolMaterial.TOPAZ, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item ALEXANDRITE_SWORD = registerItem((String)"alexandrite_sword", (Item)(new ModSword(ModToolMaterial.ALEXANDRITE, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item ALEXANDRITE_PICKAXE = registerItem((String)"alexandrite_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.ALEXANDRITE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item ALEXANDRITE_AXE = registerItem((String)"alexandrite_axe", (Item)(new ModAxe(ModToolMaterial.ALEXANDRITE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item ALEXANDRITE_SHOVEL = registerItem((String)"alexandrite_shovel", (Item)(new ModShovel(ModToolMaterial.ALEXANDRITE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item ALEXANDRITE_HOE = registerItem((String)"alexandrite_hoe", (Item)(new ModHoe(ModToolMaterial.ALEXANDRITE, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item CORUNDUM_SWORD = registerItem((String)"corundum_sword", (Item)(new ModSword(ModToolMaterial.CORUNDUM, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CORUNDUM_PICKAXE = registerItem((String)"corundum_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.CORUNDUM, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CORUNDUM_AXE = registerItem((String)"corundum_axe", (Item)(new ModAxe(ModToolMaterial.CORUNDUM, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CORUNDUM_SHOVEL = registerItem((String)"corundum_shovel", (Item)(new ModShovel(ModToolMaterial.CORUNDUM, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CORUNDUM_HOE = registerItem((String)"corundum_hoe", (Item)(new ModHoe(ModToolMaterial.CORUNDUM, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item SAPPHIRE_SWORD = registerItem((String)"sapphire_sword", (Item)(new ModSword(ModToolMaterial.SAPPHIRE, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item SAPPHIRE_PICKAXE = registerItem((String)"sapphire_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.SAPPHIRE, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item SAPPHIRE_AXE = registerItem((String)"sapphire_axe", (Item)(new ModAxe(ModToolMaterial.SAPPHIRE, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item SAPPHIRE_SHOVEL = registerItem((String)"sapphire_shovel", (Item)(new ModShovel(ModToolMaterial.SAPPHIRE, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item SAPPHIRE_HOE = registerItem((String)"sapphire_hoe", (Item)(new ModHoe(ModToolMaterial.SAPPHIRE, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item RUBY_SWORD = registerItem((String)"ruby_sword", (Item)(new ModSword(ModToolMaterial.RUBY, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item RUBY_PICKAXE = registerItem((String)"ruby_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.RUBY, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item RUBY_AXE = registerItem((String)"ruby_axe", (Item)(new ModAxe(ModToolMaterial.RUBY, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item RUBY_SHOVEL = registerItem((String)"ruby_shovel", (Item)(new ModShovel(ModToolMaterial.RUBY, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item RUBY_HOE = registerItem((String)"ruby_hoe", (Item)(new ModHoe(ModToolMaterial.RUBY, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item CARBONADO_SWORD = registerItem((String)"carbonado_sword", (Item)(new ModSword(ModToolMaterial.CARBONADO, 3, -2.4F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CARBONADO_PICKAXE = registerItem((String)"carbonado_pickaxe", (Item)(new ModPickaxe(ModToolMaterial.CARBONADO, 1, -2.8F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CARBONADO_AXE = registerItem((String)"carbonado_axe", (Item)(new ModAxe(ModToolMaterial.CARBONADO, 5.0F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CARBONADO_SHOVEL = registerItem((String)"carbonado_shovel", (Item)(new ModShovel(ModToolMaterial.CARBONADO, 1.5F, -3.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CARBONADO_HOE = registerItem((String)"carbonado_hoe", (Item)(new ModHoe(ModToolMaterial.CARBONADO, -3, 0.0F, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item TOURMALINE_HELMET = registerItem((String)"tourmaline_helmet", (Item)(new ModArmor(ModArmorMaterial.TOURMALINE, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOURMALINE_CHESTPLATE = registerItem((String)"tourmaline_chestplate", (Item)(new ModArmor(ModArmorMaterial.TOURMALINE, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOURMALINE_LEGGINGS = registerItem((String)"tourmaline_leggings", (Item)(new ModArmor(ModArmorMaterial.TOURMALINE, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOURMALINE_BOOTS = registerItem((String)"tourmaline_boots", (Item)(new ModArmor(ModArmorMaterial.TOURMALINE, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item AMETHYST_HELMET = registerItem((String)"amethyst_helmet", (Item)(new ModArmor(ModArmorMaterial.AMETHYST, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item AMETHYST_CHESTPLATE = registerItem((String)"amethyst_chestplate", (Item)(new ModArmor(ModArmorMaterial.AMETHYST, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item AMETHYST_LEGGINGS = registerItem((String)"amethyst_leggings", (Item)(new ModArmor(ModArmorMaterial.AMETHYST, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item AMETHYST_BOOTS = registerItem((String)"amethyst_boots", (Item)(new ModArmor(ModArmorMaterial.AMETHYST, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item EMERALD_HELMET = registerItem((String)"emerald_helmet", (Item)(new ModArmor(ModArmorMaterial.EMERALD, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item EMERALD_CHESTPLATE = registerItem((String)"emerald_chestplate", (Item)(new ModArmor(ModArmorMaterial.EMERALD, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item EMERALD_LEGGINGS = registerItem((String)"emerald_leggings", (Item)(new ModArmor(ModArmorMaterial.EMERALD, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item EMERALD_BOOTS = registerItem((String)"emerald_boots", (Item)(new ModArmor(ModArmorMaterial.EMERALD, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item TOPAZ_HELMET = registerItem((String)"topaz_helmet", (Item)(new ModArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOPAZ_CHESTPLATE = registerItem((String)"topaz_chestplate", (Item)(new ModArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOPAZ_LEGGINGS = registerItem((String)"topaz_leggings", (Item)(new ModArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item TOPAZ_BOOTS = registerItem((String)"topaz_boots", (Item)(new ModArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item ALEXANDRITE_HELMET = registerItem((String)"alexandrite_helmet", (Item)(new ModArmor(ModArmorMaterial.ALEXANDRITE, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item ALEXANDRITE_CHESTPLATE = registerItem((String)"alexandrite_chestplate", (Item)(new ModArmor(ModArmorMaterial.ALEXANDRITE, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item ALEXANDRITE_LEGGINGS = registerItem((String)"alexandrite_leggings", (Item)(new ModArmor(ModArmorMaterial.ALEXANDRITE, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item ALEXANDRITE_BOOTS = registerItem((String)"alexandrite_boots", (Item)(new ModArmor(ModArmorMaterial.ALEXANDRITE, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item CORUNDUM_HELMET = registerItem((String)"corundum_helmet", (Item)(new ModArmor(ModArmorMaterial.CORUNDUM, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CORUNDUM_CHESTPLATE = registerItem((String)"corundum_chestplate", (Item)(new ModArmor(ModArmorMaterial.CORUNDUM, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CORUNDUM_LEGGINGS = registerItem((String)"corundum_leggings", (Item)(new ModArmor(ModArmorMaterial.CORUNDUM, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CORUNDUM_BOOTS = registerItem((String)"corundum_boots", (Item)(new ModArmor(ModArmorMaterial.CORUNDUM, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item SAPPHIRE_HELMET = registerItem((String)"sapphire_helmet", (Item)(new ModArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item SAPPHIRE_CHESTPLATE = registerItem((String)"sapphire_chestplate", (Item)(new ModArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item SAPPHIRE_LEGGINGS = registerItem((String)"sapphire_leggings", (Item)(new ModArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item SAPPHIRE_BOOTS = registerItem((String)"sapphire_boots", (Item)(new ModArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	
	public static final Item RUBY_HELMET = registerItem((String)"ruby_helmet", (Item)(new ModArmor(ModArmorMaterial.RUBY, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item RUBY_CHESTPLATE = registerItem((String)"ruby_chestplate", (Item)(new ModArmor(ModArmorMaterial.RUBY, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item RUBY_LEGGINGS = registerItem((String)"ruby_leggings", (Item)(new ModArmor(ModArmorMaterial.RUBY, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item RUBY_BOOTS = registerItem((String)"ruby_boots", (Item)(new ModArmor(ModArmorMaterial.RUBY, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item CARBONADO_HELMET = registerItem((String)"carbonado_helmet", (Item)(new ModArmor(ModArmorMaterial.CARBONADO, EquipmentSlot.HEAD, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CARBONADO_CHESTPLATE = registerItem((String)"carbonado_chestplate", (Item)(new ModArmor(ModArmorMaterial.CARBONADO, EquipmentSlot.CHEST, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CARBONADO_LEGGINGS = registerItem((String)"carbonado_leggings", (Item)(new ModArmor(ModArmorMaterial.CARBONADO, EquipmentSlot.LEGS, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));
	public static final Item CARBONADO_BOOTS = registerItem((String)"carbonado_boots", (Item)(new ModArmor(ModArmorMaterial.CARBONADO, EquipmentSlot.FEET, (new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP))));

	public static final Item TOURMALINE_JUJU = registerItem("tourmaline_juju", new ItemTourmalineJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item AMETHYST_JUJU = registerItem("amethyst_juju", new ItemAmethystJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item EMERALD_JUJU = registerItem("emerald_juju", new ItemEmeraldJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item TOPAZ_JUJU = registerItem("topaz_juju", new ItemTopazJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item ALEXANDRITE_JUJU = registerItem("alexandrite_juju", new ItemAlexandriteJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item CORUNDUM_JUJU = registerItem("corundum_juju", new ItemCorundumJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item SAPPHIRE_JUJU = registerItem("sapphire_juju", new ItemSapphireJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item RUBY_JUJU = registerItem("ruby_juju", new ItemRubyJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	public static final Item CARBONADO_JUJU = registerItem("carbonado_juju", new ItemCarbonadoJuju((new Item.Settings()).group(MoreGems.MORE_GEMS_GROUP)));
	
	public static Item registerItem(String name, Item item)
	{
	    return Registry.register(Registry.ITEM, new Identifier(MoreGems.MOD_ID, name), item);
	}	
}