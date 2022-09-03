package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.BlockInit;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class GemOreConfiguredFeature

{
    public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_CITRINE_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_TOURMALINE_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_KUNZITE_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_TOPAZ_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_ALEXANDRITE_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_CORUNDUM_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_SAPPHIRE_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_SAPPHIRE_OVERWORLD_DEEPSLATE;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_SPINEL_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_SPINEL_OVERWORLD_DEEPSLATE;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_CARBONADO_OVERWORLD;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_CARBONADO_OVERWORLD_DEEPSLATE;

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_KUNZITE_NETHER;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_ALEXANDRITE_NETHER;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_CORUNDUM_NETHER;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_MOISSANITE_NETHER;
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_MOISSANITE_NETHER_HIGH;


    static
    {
        ORE_CITRINE_OVERWORLD = ConfiguredFeatures.register("ore_citrine_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.CITRINE_ORE.getDefaultState())), CONFIG.citrineVeinSize));

        ORE_TOURMALINE_OVERWORLD = ConfiguredFeatures.register("ore_tourmaline_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.TOURMALINE_ORE.getDefaultState())), CONFIG.tourmalineVeinSize));

        ORE_KUNZITE_OVERWORLD = ConfiguredFeatures.register("ore_kunzite_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.KUNZITE_ORE.getDefaultState())), CONFIG.kunziteVeinSize));

        ORE_TOPAZ_OVERWORLD = ConfiguredFeatures.register("ore_topaz_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.TOPAZ_ORE.getDefaultState())), CONFIG.topazVeinSize));

        ORE_ALEXANDRITE_OVERWORLD = ConfiguredFeatures.register("ore_alexandrite_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.ALEXANDRITE_ORE.getDefaultState())), CONFIG.alexandriteVeinSize));

        ORE_CORUNDUM_OVERWORLD = ConfiguredFeatures.register("ore_corundum_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.CORUNDUM_ORE.getDefaultState())), CONFIG.corundumVeinSize));

        ORE_SAPPHIRE_OVERWORLD = ConfiguredFeatures.register("ore_sapphire_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.SAPPHIRE_ORE.getDefaultState())), CONFIG.sapphireVeinSize));

        ORE_SAPPHIRE_OVERWORLD_DEEPSLATE = ConfiguredFeatures.register("ore_sapphire_overworld_deepslate", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                        BlockInit.SAPPHIRE_ORE_DEEPSLATE.getDefaultState())), CONFIG.sapphireVeinSizeDeepslate));

        ORE_SPINEL_OVERWORLD = ConfiguredFeatures.register("ore_spinel_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.SPINEL_ORE.getDefaultState())), CONFIG.spinelVeinSize));

        ORE_SPINEL_OVERWORLD_DEEPSLATE = ConfiguredFeatures.register("ore_spinel_overworld_deepslate", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                        BlockInit.SPINEL_ORE_DEEPSLATE.getDefaultState())), CONFIG.spinelVeinSizeDeepslate));

        ORE_CARBONADO_OVERWORLD = ConfiguredFeatures.register("ore_carbonado_overworld", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                        BlockInit.CARBONADO_ORE.getDefaultState())), CONFIG.carbonadoVeinSize));

        ORE_CARBONADO_OVERWORLD_DEEPSLATE = ConfiguredFeatures.register("ore_carbonado_overworld_deepslate", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                        BlockInit.CARBONADO_ORE_DEEPSLATE.getDefaultState())), CONFIG.carbonadoVeinSizeDeepslate));

        ORE_KUNZITE_NETHER = ConfiguredFeatures.register("ore_kunzite_nether", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                        BlockInit.KUNZITE_ORE_NETHER.getDefaultState())), CONFIG.kunziteVeinSizeNether));

        ORE_ALEXANDRITE_NETHER = ConfiguredFeatures.register("ore_alexandrite_nether", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                        BlockInit.ALEXANDRITE_ORE_NETHER.getDefaultState())), CONFIG.alexandriteVeinSizeNether));

        ORE_CORUNDUM_NETHER = ConfiguredFeatures.register("ore_corundum_nether", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                        BlockInit.CORUNDUM_ORE_NETHER.getDefaultState())), CONFIG.corundumVeinSizeNether));

        ORE_MOISSANITE_NETHER = ConfiguredFeatures.register("ore_moissanite_nether", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                        BlockInit.MOISSANITE_ORE.getDefaultState())), CONFIG.moissaniteVeinSize));

        ORE_MOISSANITE_NETHER_HIGH = ConfiguredFeatures.register("ore_moissanite_nether_high", Feature.ORE,
                new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                        BlockInit.MOISSANITE_ORE.getDefaultState())), CONFIG.moissaniteVeinSize));
    }


    public static void init()
    {
        // Force load class
    }
}

