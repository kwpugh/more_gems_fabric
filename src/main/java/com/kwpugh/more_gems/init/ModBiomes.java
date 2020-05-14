package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.biomes.EmeraldBiome;
import com.kwpugh.more_gems.biomes.RubyBiome;
import com.kwpugh.more_gems.biomes.SapphireBiome;

import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomes
{
	public static final Biome RUBY_BIOME = Registry.register(Registry.BIOME, new Identifier("more_gems", "ruby_biome"), new RubyBiome(null));
	public static final Biome SAPPHIRE_BIOME = Registry.register(Registry.BIOME, new Identifier("more_gems", "sapphire_biome"), new SapphireBiome(null));
	public static final Biome EMERALD_BIOME = Registry.register(Registry.BIOME, new Identifier("more_gems", "emerald_biome"), new EmeraldBiome(null));
	
	public static void registerBiomes()
	{
    	OverworldBiomes.addContinentalBiome(ModBiomes.RUBY_BIOME, OverworldClimate.TEMPERATE, 1D);
        OverworldBiomes.addContinentalBiome(ModBiomes.RUBY_BIOME, OverworldClimate.TEMPERATE, 1D);
        
    	OverworldBiomes.addContinentalBiome(ModBiomes.SAPPHIRE_BIOME, OverworldClimate.TEMPERATE, 1D);
        OverworldBiomes.addContinentalBiome(ModBiomes.SAPPHIRE_BIOME, OverworldClimate.TEMPERATE, 1D);
        
    	OverworldBiomes.addContinentalBiome(ModBiomes.EMERALD_BIOME, OverworldClimate.TEMPERATE, 1D);
        OverworldBiomes.addContinentalBiome(ModBiomes.EMERALD_BIOME, OverworldClimate.TEMPERATE, 1D);
	}
}
