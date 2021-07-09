package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.BlockInit;

import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen

 //1.17 world height version
{
	public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;

	static int citrineMaxLevel = CONFIG.citrineMaxLevel;
	static int tourmalineMaxLevel = CONFIG.tourmalineMaxLevel;
	static int kunziteMaxLevel = CONFIG.kunziteMaxLevel;
	static int topazMaxLevel = CONFIG.topazMaxLevel;
	static int alexandriteMaxLevel = CONFIG.alexandriteMaxLevel;
	static int sapphireMaxLevel = CONFIG.sapphireMaxLevel;
	static int rubyMaxLevel = CONFIG.rubyMaxLevel;
	static int corundumMaxLevel = CONFIG.conrundumMaxLevel;
	static int carbonadoMaxLevel = CONFIG.carbonadoMaxLevel;

	public static final ConfiguredFeature<?, ?> ORE_CITRINE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.CITRINE_ORE.getDefaultState(),
					CONFIG.citrineVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(citrineMaxLevel))
			//.averageDepth(YOffset.fixed(50), (20))
			.spreadHorizontally()
			.repeat(CONFIG.citrinePerChunk); // number of veins per chunk


	public static ConfiguredFeature<?, ?> ORE_TOURMALINE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.TOURMALINE_ORE.getDefaultState(),
					CONFIG.tourmalineVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(tourmalineMaxLevel))
			//.averageDepth(YOffset.fixed(40), (20))
			.spreadHorizontally()
			.repeat(CONFIG.tourmalinePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_KUNZITE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.KUNZITE_ORE.getDefaultState(),
					CONFIG.kunziteVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(kunziteMaxLevel))
			//.averageDepth(YOffset.fixed(30), (20))
			.spreadHorizontally()
			.repeat(CONFIG.kunzitePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_TOPAZ_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.TOPAZ_ORE.getDefaultState(),
					CONFIG.topazVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(topazMaxLevel))
			//.averageDepth(YOffset.fixed(20), (20))
			.spreadHorizontally()
			.repeat(CONFIG.topazPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_ALEXANDRITE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.ALEXANDRITE_ORE.getDefaultState(),
					CONFIG.alexandriteVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(alexandriteMaxLevel))
			//.averageDepth(YOffset.fixed(10), (20))
			.spreadHorizontally()
			.repeat(CONFIG.alexandritePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.SAPPHIRE_ORE.getDefaultState(),
					CONFIG.sapphireVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(sapphireMaxLevel))
			//.averageDepth(YOffset.fixed(-20), (10))
			.spreadHorizontally()
			.repeat(CONFIG.sapphirePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.RUBY_ORE.getDefaultState(),
					CONFIG.rubyVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(rubyMaxLevel))
			//.averageDepth(YOffset.fixed(-30), (10))
			.spreadHorizontally()
			.repeat(CONFIG.rubyPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_CORUNDUM_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.CORUNDUM_ORE.getDefaultState(),
					CONFIG.conrundumVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(corundumMaxLevel))
			//.averageDepth(YOffset.fixed(-40), (10))
			.spreadHorizontally()
			.repeat(CONFIG.conrundumPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockInit.CARBONADO_ORE.getDefaultState(),
					CONFIG.carbonadoVeinSize)) // vein size
			.uniformRange(YOffset.getBottom(), YOffset.fixed(carbonadoMaxLevel))
			//.averageDepth(YOffset.fixed(-50), (10))
			.spreadHorizontally()
			.repeat(CONFIG.carbonadoPerChunk); // number of veins per chunk
}


// Possible 1.18 version with new world height
//{
//	public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;
//
//	public static final ConfiguredFeature<?, ?> ORE_CITRINE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.CITRINE_ORE.getDefaultState(),
//			 CONFIG.citrineVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.citrineMinLevel, // min y level
//			  CONFIG.citrineMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.citrinePerChunk); // number of veins per chunk
//
//
//	public static ConfiguredFeature<?, ?> ORE_TOURMALINE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.TOURMALINE_ORE.getDefaultState(),
//			  CONFIG.tourmalineVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.tourmalineMinLevel, // min y level
//			  CONFIG.tourmalineMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.tourmalinePerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_AMETHYST_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.AMETHYST_ORE.getDefaultState(),
//			  CONFIG.amethystVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.amethystMinLevel, // min y level
//			  CONFIG.amethystMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.amethystPerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_TOPAZ_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.TOPAZ_ORE.getDefaultState(),
//			  CONFIG.topazVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.topazMinLevel, // min y level
//			  CONFIG.topazMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.topazPerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_ALEXANDRITE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.ALEXANDRITE_ORE.getDefaultState(),
//			  CONFIG.alexandriteVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.alexandriteMinLevel, // min y level
//			  CONFIG.alexandriteMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.alexandritePerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.SAPPHIRE_ORE.getDefaultState(),
//			  CONFIG.sapphireVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.sapphireMinLevel, // min y level
//			  CONFIG.sapphireMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.sapphirePerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.RUBY_ORE.getDefaultState(),
//			  CONFIG.rubyVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.rubyMinLevel, // min y level
//			  CONFIG.rubyMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.rubyPerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_CORUNDUM_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.CORUNDUM_ORE.getDefaultState(),
//			  CONFIG.conrundumVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.conrundumMinLevel, // min y level
//			  CONFIG.conrundumMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.conrundumPerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
//			  BlockInit.CARBONADO_ORE.getDefaultState(),
//			  CONFIG.carbonadoVeinSize)) // vein size
//			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//			  0, // bottom offset
//			  CONFIG.carbonadoMinLevel, // min y level
//			  CONFIG.carbonadoMaxLevel))) // max y level
//			.spreadHorizontally()
//			.repeat(CONFIG.carbonadoPerChunk); // number of veins per chunk
//}