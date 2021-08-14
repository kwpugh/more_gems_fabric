package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.biomes.CarbonadoBiome;
import com.kwpugh.more_gems.biomes.RubyBiome;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

public class BiomeInit
{
    public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;

    public static void init()
    {
        if(CONFIG.enableCarbonadoBiome)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(MoreGems.MOD_ID, "carbonado"), CarbonadoBiome.CARBONADO_SURFACE_BUILDER);
            Registry.register(BuiltinRegistries.BIOME, CarbonadoBiome.CARBONADO_KEY.getValue(), CarbonadoBiome.CARBONADO_LAND);

            OverworldBiomes.addContinentalBiome(CarbonadoBiome.CARBONADO_KEY, OverworldClimate.SNOWY, CONFIG.carbonadoBiomeWeight);
        }

        if(CONFIG.enableRubyBiome)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(MoreGems.MOD_ID, "ruby"), RubyBiome.RUBY_SURFACE_BUILDER);
            Registry.register(BuiltinRegistries.BIOME, RubyBiome.RUBY_KEY.getValue(), RubyBiome.RUBY_LAND);

            OverworldBiomes.addContinentalBiome(RubyBiome.RUBY_KEY, OverworldClimate.SNOWY, CONFIG.rubyBiomeWeight);
        }
    }
}
