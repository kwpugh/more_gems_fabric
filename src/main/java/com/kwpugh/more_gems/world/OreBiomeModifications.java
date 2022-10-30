package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.minecraft.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;
import java.util.function.Predicate;

public class OreBiomeModifications
{
    public static void addOres()
    {
        // Inject into Biomes using tags
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_citrine_overworld")));
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_tourmaline_overworld")));
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_kunzite_overworld")));
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_topaz_overworld")));
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_alexandrite_overworld")));
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_corundum_overworld")));
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld")));
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_spinel_overworld")));
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld")));

        BiomeModifications.addFeature(netherSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_kunzite_nether")));
        BiomeModifications.addFeature(netherSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_alexandrite_nether")));
        BiomeModifications.addFeature(netherSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_corundum_nether")));
        BiomeModifications.addFeature(netherSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MoreGems.MOD_ID, "ore_moissanite_nether")));
    }

    public static Predicate<BiomeSelectionContext> overworldSelector()
    {
        return context -> context.getBiomeRegistryEntry().isIn(BiomeTags.IS_OVERWORLD);
    }

    public static Predicate<BiomeSelectionContext> netherSelector()
    {
        return context -> context.getBiomeRegistryEntry().isIn(BiomeTags.IS_NETHER);
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

