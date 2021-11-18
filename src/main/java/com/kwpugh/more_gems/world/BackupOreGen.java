package com.kwpugh.more_gems.world;//package com.kwpugh.more_gems.world;
//
//import com.kwpugh.more_gems.MoreGems;
//import com.kwpugh.more_gems.config.MoreGemsConfig;
//import com.kwpugh.more_gems.init.BlockInit;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.registry.BuiltinRegistries;
//import net.minecraft.util.registry.Registry;
//import net.minecraft.util.registry.RegistryKey;
//import net.minecraft.world.gen.YOffset;
//import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
//import net.minecraft.world.gen.feature.ConfiguredFeature;
//import net.minecraft.world.gen.feature.Feature;
//import net.minecraft.world.gen.feature.OreFeatureConfig;
//import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
//
//public class OreGen
//
//{
//	public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;
//
//	public static final ConfiguredFeature<?, ?> ORE_CITRINE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.CITRINE_ORE.getDefaultState(),
//					CONFIG.citrineVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.citrineMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.citrinePerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_TOURMALINE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.TOURMALINE_ORE.getDefaultState(),
//					CONFIG.tourmalineVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.tourmalineMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.tourmalinePerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_KUNZITE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.KUNZITE_ORE.getDefaultState(),
//					CONFIG.kunziteVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.kunziteMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.kunzitePerChunk); // number of veins per chunk
//
//	// NETHER
//	public static ConfiguredFeature<?, ?> ORE_KUNZITE_NETHER = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.BASE_STONE_NETHER,
//					BlockInit.KUNZITE_ORE_NETHER.getDefaultState(),
//					CONFIG.kunziteVeinSizeNether)) // vein size
//			.uniformRange(YOffset.getBottom(), YOffset.fixed(CONFIG.kunziteMaxLevelNether))
//			.spreadHorizontally()
//			.repeat(CONFIG.kunzitePerChunkNether); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_TOPAZ_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.TOPAZ_ORE.getDefaultState(),
//					CONFIG.topazVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.topazMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.topazPerChunk); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_ALEXANDRITE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.ALEXANDRITE_ORE.getDefaultState(),
//					CONFIG.alexandriteVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.alexandriteMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.alexandritePerChunk); // number of veins per chunk
//
//	// NETHER
//	public static ConfiguredFeature<?, ?> ORE_ALEXANDRITE_NETHER = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.BASE_STONE_NETHER,
//					BlockInit.ALEXANDRITE_ORE_NETHER.getDefaultState(),
//					CONFIG.alexandriteVeinSizeNether)) // vein size
//			.uniformRange(YOffset.getBottom(), YOffset.fixed(CONFIG.alexandriteMaxLevelNether))
//			.spreadHorizontally()
//			.repeat(CONFIG.alexandritePerChunkNether); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_CORUNDUM_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.CORUNDUM_ORE.getDefaultState(),
//					CONFIG.conrundumVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.conrundumMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.conrundumPerChunk); // number of veins per chunk
//
//	// NETHER
//	public static ConfiguredFeature<?, ?> ORE_CORUNDUM_NETHER = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.BASE_STONE_NETHER,
//					BlockInit.CORUNDUM_ORE_NETHER.getDefaultState(),
//					CONFIG.conrundumVeinSizeNether)) // vein size
//			.uniformRange(YOffset.getBottom(), YOffset.fixed(CONFIG.conrundumMaxLevelNether))
//			.spreadHorizontally()
//			.repeat(CONFIG.conrundumPerChunkNether); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.SAPPHIRE_ORE.getDefaultState(),
//					CONFIG.sapphireVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.sapphireMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.sapphirePerChunk); // number of veins per chunk
//
//	// DEEPSLATE
//	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD_DEEPSLATE = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
//					BlockInit.CARBONADO_ORE_DEEPSLATE.getDefaultState(),
//					CONFIG.sapphireVeinSizeDeepslate)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(CONFIG.sapphireMaxLevelDeepslate)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.sapphirePerChunkDeepslate); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.RUBY_ORE.getDefaultState(),
//					CONFIG.rubyVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.rubyMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.rubyPerChunk); // number of veins per chunk
//
//	//DEEPSLATE
//	public static ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD_DEEPSLATE = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
//					BlockInit.RUBY_ORE_DEEPSLATE.getDefaultState(),
//					CONFIG.rubyVeinSizeDeepslate)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(CONFIG.rubyMaxLevelDeepslate)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.rubyPerChunkDeepslate); // number of veins per chunk
//
//	public static ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
//					BlockInit.CARBONADO_ORE.getDefaultState(),
//					CONFIG.carbonadoVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.carbonadoMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.carbonadoPerChunk); // number of veins per chunk
//
//	// DEEPSLATE
//	public static ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD_DEEPSLATE = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
//					BlockInit.CARBONADO_ORE_DEEPSLATE.getDefaultState(),
//					CONFIG.carbonadoVeinSizeDeepslate)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(CONFIG.carbonadoMaxLevelDeepslate)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.carbonadoPerChunkDeepslate); // number of veins per chunk
//
//	// Low vein
//	public static ConfiguredFeature<?, ?> ORE_MOISSANITE_NETHER = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.BASE_STONE_NETHER,
//					BlockInit.MOISSANITE_ORE.getDefaultState(),
//					CONFIG.moissaniteVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(CONFIG.moissaniteMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.moissanitePerChunk); // number of veins per chunk
//
//	// High vein
//	public static ConfiguredFeature<?, ?> ORE_MOISSANITE_NETHER_HIGH = Feature.ORE
//			.configure(new OreFeatureConfig(
//					OreFeatureConfig.Rules.BASE_STONE_NETHER,
//					BlockInit.MOISSANITE_ORE.getDefaultState(),
//					CONFIG.moissaniteVeinSize)) // vein size
//			.range(new RangeDecoratorConfig(
//					UniformHeightProvider.create(YOffset.aboveBottom(98), YOffset.fixed(CONFIG.moissaniteHighMaxLevel)))) // Inclusive min and max height
//			.spreadHorizontally()
//			.repeat(CONFIG.moissanitePerChunk); // number of veins per chunk
//
//	public static void Features()
//	{
//		if(CONFIG.citrineEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreCitrineOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_citrine_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCitrineOverworld.getValue(), ORE_CITRINE_OVERWORLD);
//		}
//
//		if(CONFIG.tourmalineEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreTourmalineOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_tourmaline_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTourmalineOverworld.getValue(), ORE_TOURMALINE_OVERWORLD);
//		}
//
//		if(CONFIG.kunziteEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreKunziteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_kunzite_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreKunziteOverworld.getValue(), ORE_KUNZITE_OVERWORLD);
//		}
//
//		if(CONFIG.kunziteEnableNether)
//		{
//			// NETHER
//			RegistryKey<ConfiguredFeature<?, ?>> oreKunziteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_kunzite_nether"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreKunziteNether.getValue(), ORE_KUNZITE_NETHER);
//		}
//
//		if(CONFIG.topazEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreTopazOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_topaz_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTopazOverworld.getValue(), ORE_TOPAZ_OVERWORLD);
//		}
//
//		if(CONFIG.alexandriteEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreAlexandriteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_alexandrite_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAlexandriteOverworld.getValue(), ORE_ALEXANDRITE_OVERWORLD);
//		}
//
//		if(CONFIG.alexandriteEnableNether)
//		{
//			// NETHER
//			RegistryKey<ConfiguredFeature<?, ?>> oreAlexandriteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "alexandrite_ore_nether"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAlexandriteNether.getValue(), ORE_ALEXANDRITE_NETHER);
//		}
//
//		if(CONFIG.conrundumEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreCorundumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_corundum_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCorundumOverworld.getValue(), ORE_CORUNDUM_OVERWORLD);
//		}
//
//		if(CONFIG.conrundumEnableNether)
//		{
//			// NETHER
//			RegistryKey<ConfiguredFeature<?, ?>> oreCorundumNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_corundum_nether"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCorundumNether.getValue(), ORE_CORUNDUM_NETHER);
//		}
//
//		if(CONFIG.sapphireEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreSapphireOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireOverworld.getValue(), ORE_SAPPHIRE_OVERWORLD);
//		}
//
//		if(CONFIG.sapphireEnableDeepslate)
//		{
//			// DEEPSLATE
//			RegistryKey<ConfiguredFeature<?, ?>> oreSapphireOverworldDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld_deepslate"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireOverworldDeepslate.getValue(), ORE_SAPPHIRE_OVERWORLD_DEEPSLATE);
//		}
//
//		if(CONFIG.rubyEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreRubyOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_ruby_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyOverworld.getValue(), ORE_RUBY_OVERWORLD);
//		}
//
//		if(CONFIG.rubyEnableDeepslate)
//		{
//			//DEEPSLATE
//			RegistryKey<ConfiguredFeature<?, ?>> oreRubyOverworldDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_ruby_overworld_deepslate"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyOverworldDeepslate.getValue(), ORE_RUBY_OVERWORLD_DEEPSLATE);
//
//		}
//
//		if(CONFIG.carbonadoEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreCarbonadoOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCarbonadoOverworld.getValue(), ORE_CARBONADO_OVERWORLD);
//		}
//
//		if(CONFIG.carbonadoEnableDeepslate)
//		{
//			// DEEPSLATE
//			RegistryKey<ConfiguredFeature<?, ?>> oreCarbonadoOverworldDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld_deepslate"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCarbonadoOverworldDeepslate.getValue(), ORE_CARBONADO_OVERWORLD_DEEPSLATE);
//		}
//
//		if(CONFIG.moissaniteEnable)
//		{
//			RegistryKey<ConfiguredFeature<?, ?>> oreMoissaniteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMoissaniteNether.getValue(), ORE_MOISSANITE_NETHER);
//
//			RegistryKey<ConfiguredFeature<?, ?>> oreMoissaniteNetherHigh = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
//					new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether_high"));
//			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMoissaniteNetherHigh.getValue(), ORE_MOISSANITE_NETHER_HIGH);
//		}
//	}
//}
