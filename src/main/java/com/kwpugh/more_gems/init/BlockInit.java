package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.blocks.BaseOreBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit
{
	public static final Block CITRINE_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block TOURMALINE_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block KUNZITE_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block TOPAZ_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block ALEXANDRITE_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block CORUNDUM_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block SAPPHIRE_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block SPINEL_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block CARBONADO_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));

	public static final Block SAPPHIRE_ORE_DEEPSLATE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block SPINEL_ORE_DEEPSLATE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block CARBONADO_ORE_DEEPSLATE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));

	public static final Block KUNZITE_ORE_NETHER = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block ALEXANDRITE_ORE_NETHER = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block CORUNDUM_ORE_NETHER = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block MOISSANITE_ORE = new BaseOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));

	public static final Block CITRINE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block TOURMALINE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block KUNZITE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block TOPAZ_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block ALEXANDRITE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block CORUNDUM_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block SPINEL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block CARBONADO_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));
	public static final Block MOISSANITE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 2.0F));

	public static void registerBlocks()
	{
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "citrine_ore"), CITRINE_ORE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "tourmaline_ore"), TOURMALINE_ORE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "kunzite_ore"), KUNZITE_ORE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "topaz_ore"), TOPAZ_ORE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "alexandrite_ore"), ALEXANDRITE_ORE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "corundum_ore"), CORUNDUM_ORE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "spinel_ore"), SPINEL_ORE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "carbonado_ore"), CARBONADO_ORE);

		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "sapphire_ore_deepslate"), SAPPHIRE_ORE_DEEPSLATE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "spinel_ore_deepslate"), SPINEL_ORE_DEEPSLATE);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "carbonado_ore_deepslate"), CARBONADO_ORE_DEEPSLATE);

		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "kunzite_ore_nether"), KUNZITE_ORE_NETHER);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "alexandrite_ore_nether"), ALEXANDRITE_ORE_NETHER);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "corundum_ore_nether"), CORUNDUM_ORE_NETHER);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "moissanite_ore"), MOISSANITE_ORE);

		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "citrine_block"), CITRINE_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "tourmaline_block"), TOURMALINE_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "kunzite_block"), KUNZITE_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "alexandrite_block"), ALEXANDRITE_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "corundum_block"), CORUNDUM_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "spinel_block"), SPINEL_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "carbonado_block"), CARBONADO_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MoreGems.MOD_ID, "moissanite_block"), MOISSANITE_BLOCK);
	}
	
	public static void registerBlockItems()
	{
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_ore"), new BlockItem(CITRINE_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_ore"), new BlockItem(TOURMALINE_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_ore"), new BlockItem(KUNZITE_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_ore"), new BlockItem(TOPAZ_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_ore"), new BlockItem(ALEXANDRITE_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_ore"), new BlockItem(CORUNDUM_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_ore"), new BlockItem(SPINEL_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_ore"), new BlockItem(CARBONADO_ORE, new Item.Settings()));

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_ore_deepslate"), new BlockItem(SAPPHIRE_ORE_DEEPSLATE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_ore_deepslate"), new BlockItem(SPINEL_ORE_DEEPSLATE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_ore_deepslate"), new BlockItem(CARBONADO_ORE_DEEPSLATE, new Item.Settings()));

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_ore_nether"), new BlockItem(KUNZITE_ORE_NETHER, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_ore_nether"), new BlockItem(ALEXANDRITE_ORE_NETHER, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_ore_nether"), new BlockItem(CORUNDUM_ORE_NETHER, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_ore"), new BlockItem(MOISSANITE_ORE, new Item.Settings()));

		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "citrine_block"), new BlockItem(CITRINE_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "tourmaline_block"), new BlockItem(TOURMALINE_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "kunzite_block"), new BlockItem(KUNZITE_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "topaz_block"), new BlockItem(TOPAZ_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "alexandrite_block"), new BlockItem(ALEXANDRITE_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "corundum_block"), new BlockItem(CORUNDUM_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "sapphire_block"), new BlockItem(SAPPHIRE_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "spinel_block"), new BlockItem(SPINEL_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "carbonado_block"), new BlockItem(CARBONADO_BLOCK, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(MoreGems.MOD_ID, "moissanite_block"), new BlockItem(MOISSANITE_BLOCK, new Item.Settings()));
	}
	
	public static void registerBlockEntities()
	{
		//TBD
	}
}
