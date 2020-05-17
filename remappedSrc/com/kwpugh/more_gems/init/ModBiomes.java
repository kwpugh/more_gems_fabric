package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.biomes.BlueGemBiome;
import com.kwpugh.more_gems.biomes.GreenGemBiome;
import com.kwpugh.more_gems.biomes.OrangeGemBiome;
import com.kwpugh.more_gems.biomes.PurpleGemBiome;
import com.kwpugh.more_gems.biomes.RedGemBiome;

import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomes
{
	public static boolean enableGemBiomes = MoreGems.getConfig().GEM_BIOMES.enableGemBiomes;
	public static double biomeWeight = MoreGems.getConfig().GEM_BIOMES.biomeWeight;
	
	public static final Biome RED_GEM_BIOME = Registry.register(Registry.BIOME, new Identifier("more_gems", "red_gem_biome"), new RedGemBiome(null));
	public static final Biome ORANGE_GEM_BIOME = Registry.register(Registry.BIOME, new Identifier("more_gems", "orange_gem_biome"), new OrangeGemBiome(null));
	public static final Biome GREEN_GEM_BIOME = Registry.register(Registry.BIOME, new Identifier("more_gems", "green_gem_biome"), new GreenGemBiome(null));
	public static final Biome BLUE_GEM_BIOME = Registry.register(Registry.BIOME, new Identifier("more_gems", "blue_gem_biome"), new BlueGemBiome(null));
	public static final Biome PURPLE_GEM_BIOME = Registry.register(Registry.BIOME, new Identifier("more_gems", "purple_gem_biome"), new PurpleGemBiome(null));
	
	public static void registerBiomes()
	{
		if(enableGemBiomes)
		{
	    	OverworldBiomes.addContinentalBiome(ModBiomes.RED_GEM_BIOME, OverworldClimate.TEMPERATE, biomeWeight);
	        OverworldBiomes.addContinentalBiome(ModBiomes.RED_GEM_BIOME, OverworldClimate.DRY, biomeWeight);
	        
	        OverworldBiomes.addContinentalBiome(ModBiomes.ORANGE_GEM_BIOME, OverworldClimate.TEMPERATE, biomeWeight);
	        OverworldBiomes.addContinentalBiome(ModBiomes.ORANGE_GEM_BIOME, OverworldClimate.DRY, biomeWeight);
	        
	        OverworldBiomes.addContinentalBiome(ModBiomes.GREEN_GEM_BIOME, OverworldClimate.TEMPERATE, biomeWeight);
	        OverworldBiomes.addContinentalBiome(ModBiomes.GREEN_GEM_BIOME, OverworldClimate.DRY, biomeWeight);
	        
	        OverworldBiomes.addContinentalBiome(ModBiomes.BLUE_GEM_BIOME, OverworldClimate.COOL, biomeWeight);
	        OverworldBiomes.addContinentalBiome(ModBiomes.BLUE_GEM_BIOME, OverworldClimate.SNOWY, biomeWeight);
	        
	        OverworldBiomes.addContinentalBiome(ModBiomes.PURPLE_GEM_BIOME, OverworldClimate.COOL, biomeWeight);
	        OverworldBiomes.addContinentalBiome(ModBiomes.PURPLE_GEM_BIOME, OverworldClimate.DRY, biomeWeight);
		}
	}
}
