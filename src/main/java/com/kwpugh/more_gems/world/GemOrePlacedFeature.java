package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.List;

public class GemOrePlacedFeature
{
    public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;


    // OVERWORLD ORES
    public static final PlacedFeature ORE_CITRINE_OVERWORLD = GemOreConfiguredFeature
            .ORE_CITRINE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.citrinePerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.citrineMaxLevel))));

    public static final PlacedFeature ORE_TOURMALINE_OVERWORLD = GemOreConfiguredFeature
            .ORE_TOURMALINE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.tourmalinePerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.tourmalineMaxLevel))));

    public static final PlacedFeature ORE_KUNZITE_OVERWORLD = GemOreConfiguredFeature
            .ORE_KUNZITE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.kunzitePerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.kunziteMaxLevel))));

    public static final PlacedFeature ORE_TOPAZ_OVERWORLD = GemOreConfiguredFeature
            .ORE_TOPAZ_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.topazPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.topazMaxLevel))));

    public static final PlacedFeature ORE_ALEXANDRITE_OVERWORLD = GemOreConfiguredFeature
            .ORE_ALEXANDRITE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.alexandritePerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.alexandriteMaxLevel))));

    public static final PlacedFeature ORE_CORUNDUM_OVERWORLD = GemOreConfiguredFeature
            .ORE_CORUNDUM_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.conrundumPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.conrundumMaxLevel))));

    public static final PlacedFeature ORE_SAPPHIRE_OVERWORLD = GemOreConfiguredFeature
            .ORE_SAPPHIRE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.sapphirePerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.sapphireMaxLevel))));

    public static final PlacedFeature ORE_SAPPHIRE_OVERWORLD_DEEPSLATE = GemOreConfiguredFeature
            .ORE_SAPPHIRE_OVERWORLD_DEEPSLATE.withPlacement(modifiersWithCount(CONFIG.sapphirePerChunkDeepslate,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.sapphireMaxLevelDeepslate))));

    public static final PlacedFeature ORE_RUBY_OVERWORLD = GemOreConfiguredFeature
            .ORE_RUBY_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.rubyPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.rubyMaxLevel))));

    public static final PlacedFeature ORE_RUBY_OVERWORLD_DEEPSLATE = GemOreConfiguredFeature
            .ORE_RUBY_OVERWORLD_DEEPSLATE.withPlacement(modifiersWithCount(CONFIG.rubyPerChunkDeepslate,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.rubyMaxLevelDeepslate))));

    public static final PlacedFeature ORE_CARBONADO_OVERWORLD = GemOreConfiguredFeature
            .ORE_CARBONADO_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.carbonadoPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.carbonadoMaxLevel))));

    public static final PlacedFeature ORE_CARBONADO_OVERWORLD_DEEPSLATE = GemOreConfiguredFeature
            .ORE_CARBONADO_OVERWORLD_DEEPSLATE.withPlacement(modifiersWithCount(CONFIG.carbonadoPerChunkDeepslate,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.carbonadoMaxLevelDeepslate))));



    // NETHER ORES
    public static final PlacedFeature ORE_MOISSANITE_NETHER = GemOreConfiguredFeature
            .ORE_MOISSANITE_NETHER.withPlacement(modifiersWithCount(CONFIG.moissanitePerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.moissaniteMaxLevel))));

    public static final PlacedFeature ORE_MOISSANITE_NETHER_HIGH = GemOreConfiguredFeature
            .ORE_MOISSANITE_NETHER_HIGH.withPlacement(modifiersWithCount(CONFIG.moissanitePerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(98),YOffset.fixed(CONFIG.moissaniteHighMaxLevel))));



    public static void init()
    {
        // OVERWORLD ORES
        RegistryKey<PlacedFeature> oreCitrineOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_citrine_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCitrineOverworld.getValue(), ORE_CITRINE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCitrineOverworld);

        RegistryKey<PlacedFeature> oreTourmalineOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_tourmaline_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTourmalineOverworld.getValue(), ORE_TOURMALINE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTourmalineOverworld);

        RegistryKey<PlacedFeature> oreKunziteOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_kunzite_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreKunziteOverworld.getValue(), ORE_KUNZITE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreKunziteOverworld);

        RegistryKey<PlacedFeature> oreTopazOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_topaz_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTopazOverworld.getValue(), ORE_TOPAZ_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTopazOverworld);

        RegistryKey<PlacedFeature> oreAlexandriteOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_alexandrite_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreAlexandriteOverworld.getValue(), ORE_ALEXANDRITE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAlexandriteOverworld);

        RegistryKey<PlacedFeature> oreCorundumOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_corundum_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCorundumOverworld.getValue(), ORE_CORUNDUM_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCorundumOverworld);

        RegistryKey<PlacedFeature> oreSapphireOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSapphireOverworld.getValue(), ORE_SAPPHIRE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworld);

        RegistryKey<PlacedFeature> oreSapphireOverworldDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSapphireOverworldDeepslate.getValue(), ORE_SAPPHIRE_OVERWORLD_DEEPSLATE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworldDeepslate);

        RegistryKey<PlacedFeature> oreRubyOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_ruby_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreRubyOverworld.getValue(), ORE_RUBY_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyOverworld);

        RegistryKey<PlacedFeature> oreRubyOverworldDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_ruby_overworld_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreRubyOverworldDeepslate.getValue(), ORE_RUBY_OVERWORLD_DEEPSLATE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyOverworldDeepslate);

        RegistryKey<PlacedFeature> oreCarbonadoOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCarbonadoOverworld.getValue(), ORE_CARBONADO_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarbonadoOverworld);

        RegistryKey<PlacedFeature> oreCarbonadoOverworldDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCarbonadoOverworldDeepslate.getValue(), ORE_CARBONADO_OVERWORLD_DEEPSLATE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarbonadoOverworldDeepslate);



        // NETHER ORES
        RegistryKey<PlacedFeature> oreMoissaniteNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreMoissaniteNether.getValue(), ORE_MOISSANITE_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreMoissaniteNether);

        RegistryKey<PlacedFeature> oreMoissaniteNetherHigh = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether_high"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreMoissaniteNetherHigh.getValue(), ORE_MOISSANITE_NETHER_HIGH);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreMoissaniteNetherHigh);
    }




    // Just in here until accessors are added to Fabric
    private static List<PlacementModifier> modifiers(PlacementModifier first, PlacementModifier second)
    {
        return List.of(first, SquarePlacementModifier.of(), second, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier modifier)
    {
        return modifiers(CountPlacementModifier.of(count), modifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier modifier)
    {
        return modifiers(RarityFilterPlacementModifier.of(chance), modifier);
    }
}
