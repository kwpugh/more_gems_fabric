package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.BlockInit;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class OreGen

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
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.CITRINE_ORE.getDefaultState(),
					CONFIG.citrineVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(citrineMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.citrinePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_TOURMALINE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.TOURMALINE_ORE.getDefaultState(),
					CONFIG.tourmalineVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(tourmalineMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.tourmalinePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_KUNZITE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.KUNZITE_ORE.getDefaultState(),
					CONFIG.kunziteVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(kunziteMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.kunzitePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_TOPAZ_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.TOPAZ_ORE.getDefaultState(),
					CONFIG.topazVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(topazMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.topazPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_ALEXANDRITE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.ALEXANDRITE_ORE.getDefaultState(),
					CONFIG.alexandriteVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(alexandriteMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.alexandritePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.SAPPHIRE_ORE.getDefaultState(),
					CONFIG.sapphireVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(sapphireMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.sapphirePerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.RUBY_ORE.getDefaultState(),
					CONFIG.rubyVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(rubyMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.rubyPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_CORUNDUM_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.CORUNDUM_ORE.getDefaultState(),
					CONFIG.conrundumVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(corundumMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.conrundumPerChunk); // number of veins per chunk

	public static ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
					BlockInit.CARBONADO_ORE.getDefaultState(),
					CONFIG.carbonadoVeinSize)) // vein size
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(carbonadoMaxLevel)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(CONFIG.carbonadoPerChunk); // number of veins per chunk


	public static final MoreGemsConfig.Ores CONFIG2 = MoreGems.CONFIG.ORES;

	public static void Features()
	{
		if(CONFIG.citrineEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreCitrineOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_citrine_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCitrineOverworld.getValue(), ORE_CITRINE_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCitrineOverworld);
		}

		if(CONFIG.tourmalineEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreTourmalineOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_tourmaline_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTourmalineOverworld.getValue(), ORE_TOURMALINE_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTourmalineOverworld);
		}

		if(CONFIG.kunziteEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreKunziteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_kunzite_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreKunziteOverworld.getValue(), ORE_KUNZITE_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreKunziteOverworld);
		}

		if(CONFIG.topazEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreTopazOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_topaz_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTopazOverworld.getValue(), ORE_TOPAZ_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTopazOverworld);
		}

		if(CONFIG.alexandriteEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreAlexandriteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_alexandrite_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAlexandriteOverworld.getValue(), ORE_ALEXANDRITE_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAlexandriteOverworld);
		}

		if(CONFIG.sapphireEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreSapphireOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireOverworld.getValue(), ORE_SAPPHIRE_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworld);
		}

		if(CONFIG.rubyEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreRubyOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_ruby_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyOverworld.getValue(), ORE_RUBY_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyOverworld);
		}

		if(CONFIG.conrundumEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreCorundumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_corundum_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCorundumOverworld.getValue(), ORE_CORUNDUM_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCorundumOverworld);
		}

		if(CONFIG.carbonadoEnable)
		{
			RegistryKey<ConfiguredFeature<?, ?>> oreCarbonadoOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
					new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld"));
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCarbonadoOverworld.getValue(), ORE_CARBONADO_OVERWORLD);
			BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarbonadoOverworld);
		}
	}
}
