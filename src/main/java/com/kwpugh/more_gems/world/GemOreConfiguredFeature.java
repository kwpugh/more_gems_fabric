package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.BlockInit;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class GemOreConfiguredFeature

{
	public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;


    // OVERWORLD ORES
    public static final ConfiguredFeature<?, ?> ORE_CITRINE_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.CITRINE_ORE.getDefaultState(), CONFIG.citrineVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_TOURMALINE_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.TOURMALINE_ORE.getDefaultState(), CONFIG.tourmalineVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_KUNZITE_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.KUNZITE_ORE.getDefaultState(), CONFIG.kunziteVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_TOPAZ_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.TOPAZ_ORE.getDefaultState(), CONFIG.topazVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_ALEXANDRITE_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.ALEXANDRITE_ORE.getDefaultState(), CONFIG.alexandriteVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_CORUNDUM_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.CORUNDUM_ORE.getDefaultState(), CONFIG.corundumVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.SAPPHIRE_ORE.getDefaultState(), CONFIG.sapphireVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_SAPPHIRE_OVERWORLD_DEEPSLATE
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
            BlockInit.SAPPHIRE_ORE.getDefaultState(), CONFIG.sapphireVeinSizeDeepslate));

    public static final ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.RUBY_ORE.getDefaultState(), CONFIG.rubyVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_RUBY_OVERWORLD_DEEPSLATE
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
            BlockInit.RUBY_ORE_DEEPSLATE.getDefaultState(), CONFIG.rubyVeinSizeDeepslate));

    public static final ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD,
            BlockInit.CARBONADO_ORE.getDefaultState(), CONFIG.carbonadoVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_CARBONADO_OVERWORLD_DEEPSLATE
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
            BlockInit.CARBONADO_ORE.getDefaultState(), CONFIG.carbonadoVeinSizeDeepslate));



    // NETHER ORE
    public static final ConfiguredFeature<?, ?> ORE_KUNZITE_NETHER
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK,
            BlockInit.KUNZITE_ORE_NETHER.getDefaultState(), CONFIG.kunziteVeinSizeNether));

    public static final ConfiguredFeature<?, ?> ORE_ALEXANDRITE_NETHER
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK,
            BlockInit.ALEXANDRITE_ORE_NETHER.getDefaultState(), CONFIG.alexandriteVeinSizeNether));

    public static final ConfiguredFeature<?, ?> ORE_CORUNDUM_NETHER
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK,
            BlockInit.CORUNDUM_ORE_NETHER.getDefaultState(), CONFIG.corundumVeinSizeNether));

    public static final ConfiguredFeature<?, ?> ORE_MOISSANITE_NETHER
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK,
            BlockInit.MOISSANITE_ORE.getDefaultState(), CONFIG.moissaniteVeinSize));

    public static final ConfiguredFeature<?, ?> ORE_MOISSANITE_NETHER_HIGH
            = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK,
            BlockInit.MOISSANITE_ORE.getDefaultState(), CONFIG.moissaniteVeinSize));



	public static void init()
    {
        // OVERWORLD ORES
        RegistryKey<ConfiguredFeature<?, ?>> oreCitrineOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_citrine_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCitrineOverworld.getValue(), ORE_CITRINE_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreTourmalineOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_tourmaline_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTourmalineOverworld.getValue(), ORE_TOURMALINE_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreKunziteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_kunzite_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreKunziteOverworld.getValue(), ORE_KUNZITE_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreTopazOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_topaz_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTopazOverworld.getValue(), ORE_TOPAZ_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreAlexandriteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_alexandrite_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAlexandriteOverworld.getValue(), ORE_ALEXANDRITE_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreCorundumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_corundum_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCorundumOverworld.getValue(), ORE_CORUNDUM_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireOverworld.getValue(), ORE_SAPPHIRE_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireOverworldDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld_deepslate"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireOverworldDeepslate.getValue(), ORE_SAPPHIRE_OVERWORLD_DEEPSLATE);

        RegistryKey<ConfiguredFeature<?, ?>> oreRubyOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_ruby_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyOverworld.getValue(), ORE_RUBY_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreRubyOverworldDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_ruby_overworld_deepslate"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyOverworldDeepslate.getValue(), ORE_RUBY_OVERWORLD_DEEPSLATE);

        RegistryKey<ConfiguredFeature<?, ?>> oreCarbonadoOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCarbonadoOverworld.getValue(), ORE_CARBONADO_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreCarbonadoOverworldDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld_deepslate"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCarbonadoOverworldDeepslate.getValue(), ORE_CARBONADO_OVERWORLD_DEEPSLATE);


        // NETHER ORES
        RegistryKey<ConfiguredFeature<?, ?>> oreKunziteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_kunzite_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreKunziteNether.getValue(), ORE_KUNZITE_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreAlexandriteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "alexandrite_ore_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAlexandriteNether.getValue(), ORE_ALEXANDRITE_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreCorundumNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_corundum_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCorundumNether.getValue(), ORE_CORUNDUM_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreMoissaniteNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMoissaniteNether.getValue(), ORE_MOISSANITE_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreMoissaniteNetherHigh = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether_high"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMoissaniteNetherHigh.getValue(), ORE_MOISSANITE_NETHER_HIGH);
    }
}
