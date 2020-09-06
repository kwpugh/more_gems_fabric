package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.init.BlockInit;

import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;


public class OreGen
{	
	public static ConfiguredFeature<?, ?> ORE_CITRINE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.CITRINE_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  45, // min y level
			  60))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_TOURMALINE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.TOURMALINE_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  40, // min y level
			  50))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk
	
	public static ConfiguredFeature<?, ?> ORE_AMETHYST_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.AMETHYST_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  40, // min y level
			  50))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_TOPAZ_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.TOPAZ_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  40, // min y level
			  50))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_ALEXANDRITE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.ALEXANDRITE_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  30, // min y level
			  40))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.SAPPHIRE_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  20, // min y level
			  30))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.RUBY_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  20, // min y level
			  30))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_CORUNDUM_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.CORUNDUM_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  10, // min y level
			  20))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.CARBONADO_ORE.getDefaultState(),
			  3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  1, // min y level
			  15))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk
	
	
}
