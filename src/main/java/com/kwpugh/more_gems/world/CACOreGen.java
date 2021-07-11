package com.kwpugh.more_gems.world;

import com.google.common.collect.ImmutableList;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.BlockInit;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;

/*
************
OreGen approach that works with CavesAndCliffsPreview.zip, but not with 1.17 Part I
************
 */

public class CACOreGen
{
    public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;
    static boolean enableCAC = CONFIG.enableCAC;

    public static final ImmutableList<OreFeatureConfig.Target> CITRINE_ORE_TARGETS;
    public static final ImmutableList<OreFeatureConfig.Target> TOURMALINE_ORE_TARGETS;
    public static final ImmutableList<OreFeatureConfig.Target> KUNZITE_ORE_TARGETS;
    public static final ImmutableList<OreFeatureConfig.Target> TOPAZ_ORE_TARGETS;
    public static final ImmutableList<OreFeatureConfig.Target> ALEXANDRITE_ORE_TARGETS;
    public static final ImmutableList<OreFeatureConfig.Target> SAPPHIRE_ORE_TARGETS;
    public static final ImmutableList<OreFeatureConfig.Target> RUBY_ORE_TARGETS;
    public static final ImmutableList<OreFeatureConfig.Target> CORUNDUM_ORE_TARGETS;
    public static final ImmutableList<OreFeatureConfig.Target> CARBONADO_ORE_TARGETS;

    public static final ConfiguredFeature<?, ?> CITRINE_ORE;
    public static final ConfiguredFeature<?, ?> TOURMALINE_ORE;
    public static final ConfiguredFeature<?, ?> KUNZITE_ORE;
    public static final ConfiguredFeature<?, ?> TOPAZ_ORE;
    public static final ConfiguredFeature<?, ?> ALEXANDRITE_ORE;
    public static final ConfiguredFeature<?, ?> SAPPHIRE_ORE;
    public static final ConfiguredFeature<?, ?> RUBY_ORE;
    public static final ConfiguredFeature<?, ?> CORUNDUM_ORE;
    public static final ConfiguredFeature<?, ?> CARBONADO_ORE;



    static
    {
        CITRINE_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.CITRINE_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.CITRINE_ORE.getDefaultState()));
        TOURMALINE_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.TOURMALINE_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.TOURMALINE_ORE.getDefaultState()));
        KUNZITE_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.KUNZITE_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.KUNZITE_ORE.getDefaultState()));
        TOPAZ_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.TOPAZ_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.TOPAZ_ORE.getDefaultState()));
        ALEXANDRITE_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.ALEXANDRITE_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.ALEXANDRITE_ORE.getDefaultState()));
        SAPPHIRE_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.SAPPHIRE_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.SAPPHIRE_ORE.getDefaultState()));
        RUBY_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.RUBY_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.RUBY_ORE.getDefaultState()));
        CORUNDUM_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.CORUNDUM_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.CORUNDUM_ORE.getDefaultState()));
        CARBONADO_ORE_TARGETS = ImmutableList.of(OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES, BlockInit.CARBONADO_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, BlockInit.CARBONADO_ORE.getDefaultState()));


        CITRINE_ORE = Feature.ORE.configure(new OreFeatureConfig(CITRINE_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(130)).spreadHorizontally().repeat(12);
        TOURMALINE_ORE = Feature.ORE.configure(new OreFeatureConfig(TOURMALINE_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(70)).spreadHorizontally().repeat(12);
        KUNZITE_ORE = Feature.ORE.configure(new OreFeatureConfig(KUNZITE_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(40)).spreadHorizontally().repeat(12);
        TOPAZ_ORE = Feature.ORE.configure(new OreFeatureConfig(TOPAZ_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(30)).spreadHorizontally().repeat(12);
        ALEXANDRITE_ORE = Feature.ORE.configure(new OreFeatureConfig(ALEXANDRITE_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(20)).spreadHorizontally().repeat(12);
        SAPPHIRE_ORE = Feature.ORE.configure(new OreFeatureConfig(SAPPHIRE_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(15)).spreadHorizontally().repeat(12);
        RUBY_ORE = Feature.ORE.configure(new OreFeatureConfig(RUBY_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(10)).spreadHorizontally().repeat(12);
        CORUNDUM_ORE = Feature.ORE.configure(new OreFeatureConfig(CORUNDUM_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(-5)).spreadHorizontally().repeat(12);
        CARBONADO_ORE = Feature.ORE.configure(new OreFeatureConfig(CARBONADO_ORE_TARGETS, 4)).uniformRange(YOffset.getBottom(), YOffset.fixed(-15)).spreadHorizontally().repeat(12);

    }

    public static void registerConfiguredFeature()
    {
        if(enableCAC)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "citrine_ore"), CITRINE_ORE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "tourmaline_ore"), TOURMALINE_ORE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "kunzite_ore"), KUNZITE_ORE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "topaz_ore"), TOPAZ_ORE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "alexandrite_ore"), ALEXANDRITE_ORE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ruby_ore"), RUBY_ORE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "corundum_ore"), CORUNDUM_ORE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "carbonado_ore"), CARBONADO_ORE);

        }
    }

    public static void registerBiomeModifications()
    {
        if(enableCAC)
        {
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(CITRINE_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(TOURMALINE_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(KUNZITE_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(TOPAZ_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(ALEXANDRITE_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(SAPPHIRE_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(RUBY_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(CORUNDUM_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));
            BuiltinRegistries.CONFIGURED_FEATURE.getKey(CARBONADO_ORE)
                    .ifPresent(key -> BiomeModifications.addFeature(ctx -> true, GenerationStep.Feature.UNDERGROUND_ORES, key));


        }
    }
}