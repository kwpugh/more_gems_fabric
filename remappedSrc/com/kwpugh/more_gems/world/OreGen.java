package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.BlockInit;

import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen
{
	public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;
	
	public static final ConfiguredFeature<?, ?> ORE_CITRINE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.CITRINE_ORE.getDefaultState(),
			 CONFIG.citrineVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.citrineMinLevel, // min y level
			  CONFIG.citrineMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.citrinePerChunk); // number of veins per chunk		


	public static ConfiguredFeature<?, ?> ORE_TOURMALINE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.TOURMALINE_ORE.getDefaultState(),
			  CONFIG.tourmalineVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.tourmalineMinLevel, // min y level
			  CONFIG.tourmalineMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.tourmalinePerChunk); // number of veins per chunk
	
	public static ConfiguredFeature<?, ?> ORE_AMETHYST_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.AMETHYST_ORE.getDefaultState(),
			  CONFIG.amethystVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.amethystMinLevel, // min y level
			  CONFIG.amethystMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.amethystPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_TOPAZ_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.TOPAZ_ORE.getDefaultState(),
			  CONFIG.topazVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.topazMinLevel, // min y level
			  CONFIG.topazMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.topazPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_ALEXANDRITE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.ALEXANDRITE_ORE.getDefaultState(),
			  CONFIG.alexandriteVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.alexandriteMinLevel, // min y level
			  CONFIG.alexandriteMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.alexandritePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.SAPPHIRE_ORE.getDefaultState(),
			  CONFIG.sapphireVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.sapphireMinLevel, // min y level
			  CONFIG.sapphireMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.sapphirePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.RUBY_ORE.getDefaultState(),
			  CONFIG.rubyVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.rubyMinLevel, // min y level
			  CONFIG.rubyMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.rubyPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_CORUNDUM_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.CORUNDUM_ORE.getDefaultState(),
			  CONFIG.conrundumVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.conrundumMinLevel, // min y level
			  CONFIG.conrundumMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.conrundumPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.CARBONADO_ORE.getDefaultState(),
			  CONFIG.carbonadoVeinSize)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  CONFIG.carbonadoMinLevel, // min y level
			  CONFIG.carbonadoMaxLevel))) // max y level
			.spreadHorizontally()
			.repeat(CONFIG.carbonadoPerChunk); // number of veins per chunk	
}
