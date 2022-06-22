package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;
import java.util.function.BiConsumer;

public class GemOrePlacedFeature
{
    public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;

    public static final RegistryEntry<PlacedFeature> ORE_CITRINE_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_TOURMALINE_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_KUNZITE_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_TOPAZ_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_ALEXANDRITE_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_CORUNDUM_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_SAPPHIRE_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_SAPPHIRE_OVERWORLD_DEEPSLATE;
    public static final RegistryEntry<PlacedFeature> ORE_SPINEL_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_SPINEL_OVERWORLD_DEEPSLATE;
    public static final RegistryEntry<PlacedFeature> ORE_CARBONADO_OVERWORLD;
    public static final RegistryEntry<PlacedFeature> ORE_CARBONADO_OVERWORLD_DEEPSLATE;

    public static final RegistryEntry<PlacedFeature> ORE_KUNZITE_NETHER;
    public static final RegistryEntry<PlacedFeature> ORE_ALEXANDRITE_NETHER;
    public static final RegistryEntry<PlacedFeature> ORE_CORUNDUM_NETHER;
    public static final RegistryEntry<PlacedFeature> ORE_MOISSANITE_NETHER;
    public static final RegistryEntry<PlacedFeature> ORE_MOISSANITE_NETHER_HIGH;


    static
    {
        ORE_CITRINE_OVERWORLD = PlacedFeatures.register("ore_citrine_overworld", GemOreConfiguredFeature.ORE_CITRINE_OVERWORLD, modifiersWithCount(CONFIG.citrinePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(80),YOffset.fixed(CONFIG.citrineMaxLevel)) ));
        ORE_TOURMALINE_OVERWORLD = PlacedFeatures.register("ore_tourmaline_overworld", GemOreConfiguredFeature.ORE_TOURMALINE_OVERWORLD, modifiersWithCount(CONFIG.tourmalinePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(80),YOffset.fixed(CONFIG.tourmalineMaxLevel)) ));
        ORE_KUNZITE_OVERWORLD = PlacedFeatures.register("ore_kunzite_overworld", GemOreConfiguredFeature.ORE_KUNZITE_OVERWORLD, modifiersWithCount(CONFIG.kunzitePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(80),YOffset.fixed(CONFIG.kunziteMaxLevel)) ));
        ORE_TOPAZ_OVERWORLD = PlacedFeatures.register("ore_topaz_overworld", GemOreConfiguredFeature.ORE_TOPAZ_OVERWORLD, modifiersWithCount(CONFIG.topazPerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(80),YOffset.fixed(CONFIG.topazMaxLevel)) ));
        ORE_ALEXANDRITE_OVERWORLD = PlacedFeatures.register("ore_alexandrite_overworld", GemOreConfiguredFeature.ORE_ALEXANDRITE_OVERWORLD, modifiersWithCount(CONFIG.alexandritePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.alexandriteMaxLevel)) ));
        ORE_CORUNDUM_OVERWORLD = PlacedFeatures.register("ore_corundum_overworld", GemOreConfiguredFeature.ORE_CORUNDUM_OVERWORLD, modifiersWithCount(CONFIG.corundumPerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.corundumMaxLevel)) ));
        ORE_SAPPHIRE_OVERWORLD = PlacedFeatures.register("ore_sapphire_overworld", GemOreConfiguredFeature.ORE_SAPPHIRE_OVERWORLD, modifiersWithCount(CONFIG.sapphirePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.sapphireMaxLevel)) ));
        ORE_SAPPHIRE_OVERWORLD_DEEPSLATE = PlacedFeatures.register("ore_sapphire_overworld_deepslate", GemOreConfiguredFeature.ORE_SAPPHIRE_OVERWORLD_DEEPSLATE, modifiersWithCount(CONFIG.sapphirePerChunkDeepslate, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.sapphireMaxLevelDeepslate)) ));
        ORE_SPINEL_OVERWORLD = PlacedFeatures.register("ore_spinel_overworld", GemOreConfiguredFeature.ORE_SPINEL_OVERWORLD, modifiersWithCount(CONFIG.spinelPerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.spinelMaxLevel)) ));
        ORE_SPINEL_OVERWORLD_DEEPSLATE = PlacedFeatures.register("ore_spinel_overworld_deepslate", GemOreConfiguredFeature.ORE_SPINEL_OVERWORLD_DEEPSLATE, modifiersWithCount(CONFIG.spinelPerChunkDeepslate, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.spinelMaxLevelDeepslate)) ));
        ORE_CARBONADO_OVERWORLD = PlacedFeatures.register("ore_carbonado_overworld", GemOreConfiguredFeature.ORE_CARBONADO_OVERWORLD, modifiersWithCount(CONFIG.carbonadoPerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.carbonadoMaxLevel)) ));
        ORE_CARBONADO_OVERWORLD_DEEPSLATE = PlacedFeatures.register("ore_carbonado_overworld_deepslate", GemOreConfiguredFeature.ORE_CARBONADO_OVERWORLD_DEEPSLATE, modifiersWithCount(CONFIG.carbonadoPerChunkDeepslate, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.carbonadoMaxLevelDeepslate)) ));

        ORE_KUNZITE_NETHER = PlacedFeatures.register("ore_kunzite_nether", GemOreConfiguredFeature.ORE_KUNZITE_NETHER, modifiersWithCount(CONFIG.kunzitePerChunkNether, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.kunziteMaxLevelNether)) ));
        ORE_ALEXANDRITE_NETHER = PlacedFeatures.register("ore_alexandrite_nether", GemOreConfiguredFeature.ORE_ALEXANDRITE_NETHER, modifiersWithCount(CONFIG.alexandritePerChunkNether, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.alexandriteMaxLevelNether)) ));
        ORE_CORUNDUM_NETHER = PlacedFeatures.register("ore_corundum_nether", GemOreConfiguredFeature.ORE_CORUNDUM_NETHER, modifiersWithCount(CONFIG.corundumPerChunkNether, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.corundumMaxLevelNether)) ));
        ORE_MOISSANITE_NETHER = PlacedFeatures.register("ore_moissanite_nether", GemOreConfiguredFeature.ORE_MOISSANITE_NETHER, modifiersWithCount(CONFIG.moissanitePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.moissaniteMaxLevel)) ));
        ORE_MOISSANITE_NETHER_HIGH = PlacedFeatures.register("ore_moissanite_nether_high", GemOreConfiguredFeature.ORE_MOISSANITE_NETHER_HIGH, modifiersWithCount(CONFIG.moissanitePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(98),YOffset.fixed(CONFIG.moissaniteHighMaxLevel)) ));
    }


    public static void init()
    {
        // Cast the RegistryEntry to RegistryKey for use with BiomModification API
        RegistryKey<PlacedFeature> oreCitrineOverworld = ORE_CITRINE_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreTourmalineOverworld = ORE_TOURMALINE_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreKunziteOverworld = ORE_KUNZITE_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreTopazOverworld = ORE_TOPAZ_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreAlexandriteOverworld = ORE_ALEXANDRITE_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreCorundumOverworld = ORE_CORUNDUM_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreSapphireOverworld = ORE_SAPPHIRE_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreSapphireOverworldDeepslate = ORE_SAPPHIRE_OVERWORLD_DEEPSLATE.getKey().get();
        RegistryKey<PlacedFeature> oreSpinelOverworld = ORE_SPINEL_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreSpinelOverworldDeepslate = ORE_SPINEL_OVERWORLD_DEEPSLATE.getKey().get();
        RegistryKey<PlacedFeature> oreCarbonadoOverworld = ORE_CARBONADO_OVERWORLD.getKey().get();
        RegistryKey<PlacedFeature> oreCarbonadoOverworldDeepslate = ORE_CARBONADO_OVERWORLD_DEEPSLATE.getKey().get();

        RegistryKey<PlacedFeature> oreKunziteNether = ORE_KUNZITE_NETHER.getKey().get();
        RegistryKey<PlacedFeature> oreAlexandriteNether = ORE_ALEXANDRITE_NETHER.getKey().get();
        RegistryKey<PlacedFeature> oreCorundumNether = ORE_CORUNDUM_NETHER.getKey().get();
        RegistryKey<PlacedFeature> oreMoissaniteNether = ORE_MOISSANITE_NETHER.getKey().get();
        RegistryKey<PlacedFeature> oreMoissaniteNetherHigh = ORE_MOISSANITE_NETHER_HIGH.getKey().get();


        // Inject into Biomes
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCitrineOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTourmalineOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreKunziteOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTopazOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAlexandriteOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCorundumOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworldDeepslate);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpinelOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpinelOverworldDeepslate);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarbonadoOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarbonadoOverworldDeepslate);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreKunziteNether);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreAlexandriteNether);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreCorundumNether);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreMoissaniteNether);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreMoissaniteNetherHigh);
    }


    // Used here because the vanilla ones are private
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}

