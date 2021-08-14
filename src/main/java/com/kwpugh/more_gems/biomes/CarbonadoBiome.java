package com.kwpugh.more_gems.biomes;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class CarbonadoBiome
{
    public static final RegistryKey<Biome> CARBONADO_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MoreGems.MOD_ID, "carbonado"));

    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> CARBONADO_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.GRASS_BLOCK.getDefaultState(),
                    Blocks.DIRT.getDefaultState(),
                    Blocks.GRAVEL.getDefaultState()));

    public static final Biome CARBONADO_LAND = createCarbonadoland();

    public static Biome createCarbonadoland()
    {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(CARBONADO_SURFACE_BUILDER);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addDefaultFlowers(generationSettings);
        DefaultBiomeFeatures.addDefaultGrass(generationSettings);
        DefaultBiomeFeatures.addForestTrees(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);

        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.NONE)
                .category(Biome.Category.NONE)
                .depth(0.225F)
                .scale(0.32F)
                .temperature(0.2F)
                .downfall(0.0F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xc1b1c7)
                        .waterFogColor(0xc1b1c7)
                        .fogColor(0xc0d8ff)
                        .skyColor(0xf0ccfc)
                        .grassColor(0x68048c)
                        .foliageColor(0xf0ccfc)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
}
