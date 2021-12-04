package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.List;
import java.util.function.Predicate;

public class GemOrePlacedFeature
{
    public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;

    // OVERWORLD ORES
    public static final PlacedFeature ORE_CITRINE_OVERWORLD = GemOreConfiguredFeature.ORE_CITRINE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.citrinePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(80),YOffset.fixed(CONFIG.citrineMaxLevel))));
    public static final PlacedFeature ORE_TOURMALINE_OVERWORLD = GemOreConfiguredFeature.ORE_TOURMALINE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.tourmalinePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(80),YOffset.fixed(CONFIG.tourmalineMaxLevel))));
    public static final PlacedFeature ORE_KUNZITE_OVERWORLD = GemOreConfiguredFeature.ORE_KUNZITE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.kunzitePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(80),YOffset.fixed(CONFIG.kunziteMaxLevel))));
    public static final PlacedFeature ORE_TOPAZ_OVERWORLD = GemOreConfiguredFeature.ORE_TOPAZ_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.topazPerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(80),YOffset.fixed(CONFIG.topazMaxLevel))));
    public static final PlacedFeature ORE_ALEXANDRITE_OVERWORLD = GemOreConfiguredFeature.ORE_ALEXANDRITE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.alexandritePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.alexandriteMaxLevel))));
    public static final PlacedFeature ORE_CORUNDUM_OVERWORLD = GemOreConfiguredFeature.ORE_CORUNDUM_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.corundumPerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.corundumMaxLevel))));
    public static final PlacedFeature ORE_SAPPHIRE_OVERWORLD = GemOreConfiguredFeature.ORE_SAPPHIRE_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.sapphirePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.sapphireMaxLevel))));
    public static final PlacedFeature ORE_SAPPHIRE_OVERWORLD_DEEPSLATE = GemOreConfiguredFeature.ORE_SAPPHIRE_OVERWORLD_DEEPSLATE.withPlacement(modifiersWithCount(CONFIG.sapphirePerChunkDeepslate, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.sapphireMaxLevelDeepslate))));
    public static final PlacedFeature ORE_SPINEL_OVERWORLD = GemOreConfiguredFeature.ORE_SPINEL_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.spinelPerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.spinelMaxLevel))));
    public static final PlacedFeature ORE_SPINEL_OVERWORLD_DEEPSLATE = GemOreConfiguredFeature.ORE_SPINEL_OVERWORLD_DEEPSLATE.withPlacement(modifiersWithCount(CONFIG.spinelPerChunkDeepslate, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.spinelMaxLevelDeepslate))));
    public static final PlacedFeature ORE_CARBONADO_OVERWORLD = GemOreConfiguredFeature.ORE_CARBONADO_OVERWORLD.withPlacement(modifiersWithCount(CONFIG.carbonadoPerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(70),YOffset.fixed(CONFIG.carbonadoMaxLevel))));
    public static final PlacedFeature ORE_CARBONADO_OVERWORLD_DEEPSLATE = GemOreConfiguredFeature.ORE_CARBONADO_OVERWORLD_DEEPSLATE.withPlacement(modifiersWithCount(CONFIG.carbonadoPerChunkDeepslate, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.carbonadoMaxLevelDeepslate))));

    // NETHER ORES
    public static final PlacedFeature ORE_KUNZITE_NETHER = GemOreConfiguredFeature.ORE_KUNZITE_NETHER.withPlacement(modifiersWithCount(CONFIG.kunzitePerChunkNether, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.kunziteMaxLevelNether))));
    public static final PlacedFeature ORE_ALEXANDRITE_NETHER = GemOreConfiguredFeature.ORE_ALEXANDRITE_NETHER.withPlacement(modifiersWithCount(CONFIG.alexandritePerChunkNether, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.alexandriteMaxLevelNether))));
    public static final PlacedFeature ORE_CORUNDUM_NETHER = GemOreConfiguredFeature.ORE_CORUNDUM_NETHER.withPlacement(modifiersWithCount(CONFIG.corundumPerChunkNether, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.corundumMaxLevelNether))));
    public static final PlacedFeature ORE_MOISSANITE_NETHER = GemOreConfiguredFeature.ORE_MOISSANITE_NETHER.withPlacement(modifiersWithCount(CONFIG.moissanitePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0),YOffset.fixed(CONFIG.moissaniteMaxLevel))));
    public static final PlacedFeature ORE_MOISSANITE_NETHER_HIGH = GemOreConfiguredFeature.ORE_MOISSANITE_NETHER_HIGH.withPlacement(modifiersWithCount(CONFIG.moissanitePerChunk, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(98),YOffset.fixed(CONFIG.moissaniteHighMaxLevel))));


    public static void init()
    {
        // OVERWORLD ORES
        RegistryKey<PlacedFeature> oreCitrineOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_citrine_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCitrineOverworld.getValue(), ORE_CITRINE_OVERWORLD);

        RegistryKey<PlacedFeature> oreTourmalineOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_tourmaline_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTourmalineOverworld.getValue(), ORE_TOURMALINE_OVERWORLD);

        RegistryKey<PlacedFeature> oreKunziteOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_kunzite_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreKunziteOverworld.getValue(), ORE_KUNZITE_OVERWORLD);

        RegistryKey<PlacedFeature> oreTopazOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_topaz_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTopazOverworld.getValue(), ORE_TOPAZ_OVERWORLD);

        RegistryKey<PlacedFeature> oreAlexandriteOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_alexandrite_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreAlexandriteOverworld.getValue(), ORE_ALEXANDRITE_OVERWORLD);

        RegistryKey<PlacedFeature> oreCorundumOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_corundum_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCorundumOverworld.getValue(), ORE_CORUNDUM_OVERWORLD);

        RegistryKey<PlacedFeature> oreSapphireOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSapphireOverworld.getValue(), ORE_SAPPHIRE_OVERWORLD);

        RegistryKey<PlacedFeature> oreSapphireOverworldDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSapphireOverworldDeepslate.getValue(), ORE_SAPPHIRE_OVERWORLD_DEEPSLATE);

        RegistryKey<PlacedFeature> oreSpinelOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_spinel_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSpinelOverworld.getValue(), ORE_SPINEL_OVERWORLD);

        RegistryKey<PlacedFeature> oreSpinelOverworldDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_spinel_overworld_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSpinelOverworldDeepslate.getValue(), ORE_SPINEL_OVERWORLD_DEEPSLATE);

        RegistryKey<PlacedFeature> oreCarbonadoOverworld = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCarbonadoOverworld.getValue(), ORE_CARBONADO_OVERWORLD);

        RegistryKey<PlacedFeature> oreCarbonadoOverworldDeepslate = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld_deepslate"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCarbonadoOverworldDeepslate.getValue(), ORE_CARBONADO_OVERWORLD_DEEPSLATE);


        // NETHER ORES
        RegistryKey<PlacedFeature> oreKunziteNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_kunzite_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreKunziteNether.getValue(), ORE_KUNZITE_NETHER);

        RegistryKey<PlacedFeature> oreAlexandriteNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "alexandrite_ore_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreAlexandriteNether.getValue(), ORE_ALEXANDRITE_NETHER);

        RegistryKey<PlacedFeature> oreCorundumNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_corundum_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCorundumNether.getValue(), ORE_CORUNDUM_NETHER);

        RegistryKey<PlacedFeature> oreMoissaniteNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreMoissaniteNether.getValue(), ORE_MOISSANITE_NETHER);

        RegistryKey<PlacedFeature> oreMoissaniteNetherHigh = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether_high"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreMoissaniteNetherHigh.getValue(), ORE_MOISSANITE_NETHER_HIGH);


        if(CONFIG.citrineEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreCitrineOverworld);
        }

        if(CONFIG.tourmalineEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreTourmalineOverworld);
        }

        if(CONFIG.kunziteEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreKunziteOverworld);
        }

        if(CONFIG.topazEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreTopazOverworld);
        }

        if(CONFIG.alexandriteEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreAlexandriteOverworld);
        }

        if(CONFIG.corundumEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreCorundumOverworld);
        }

        if(CONFIG.sapphireEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworld);
        }

        if(CONFIG.sapphireEnableDeepslate)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworldDeepslate);
        }

        if(CONFIG.spinelEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpinelOverworld);
        }

        if(CONFIG.spinelEnableDeepslate)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpinelOverworldDeepslate);
        }

        if(CONFIG.carbonadoEnable)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarbonadoOverworld);
        }

        if(CONFIG.carbonadoEnableDeepslate)
        {
            BiomeModifications.addFeature(customSelection(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarbonadoOverworldDeepslate);
        }

        if(CONFIG.kunziteEnableNether)
        {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreKunziteNether);
        }

        if(CONFIG.alexandriteEnableNether)
        {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreAlexandriteNether);
        }

        if(CONFIG.corundumEnableNether)
        {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreCorundumNether);
        }

        if(CONFIG.moissaniteEnable)
        {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreMoissaniteNether);
        }

        if(CONFIG.moissaniteEnable)
        {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreMoissaniteNetherHigh);
        }
    }

    // Custom predicate to deal with hardcoded weirdness in vanilla, instead of BiomeSelectors.foundInOverworld()
    public static Predicate<BiomeSelectionContext> customSelection()
    {
        return context -> !NetherBiomes.canGenerateInNether(context.getBiomeKey()) &&
                !TheEndBiomes.canGenerateInTheEnd(context.getBiomeKey()) &&
                context.getBiome().getCategory() != Biome.Category.NONE;
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
