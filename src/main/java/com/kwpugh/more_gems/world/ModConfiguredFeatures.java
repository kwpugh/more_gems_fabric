package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig2;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

public class ModConfiguredFeatures
{
	public static final MoreGemsConfig2.Ores CONFIG2 = MoreGems.CONFIG.ORES;
	
	public static void Features()
	{

		if(CONFIG2.citrineEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_citrine_overworld"), OreGen.ORE_CITRINE_OVERWORLD );			
		}
		
		if(CONFIG2.tourmalineEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_tourmaline_overworld"), OreGen.ORE_TOURMALINE_OVERWORLD );
		}
		
		if(CONFIG2.amethystEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_amethyst_overworld"), OreGen.ORE_AMETHYST_OVERWORLD );
		}
		
		if(CONFIG2.topazEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_topaz_overworld"), OreGen.ORE_TOPAZ_OVERWORLD );
		}
		
		if(CONFIG2.alexandriteEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_alexandrite_overworld"), OreGen.ORE_ALEXANDRITE_OVERWORLD );
		}
		
		if(CONFIG2.sapphireEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_sapphire_overworld"), OreGen.ORE_SAPPHIRE_OVERWORLD );
		}
		
		if(CONFIG2.rubyEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_ruby_overworld"), OreGen.ORE_RUBY_OVERWORLD );
		}
		
		if(CONFIG2.conrundumEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_corundum_overworld"), OreGen.ORE_CORUNDUM_OVERWORLD );
		}
		
		if(CONFIG2.carbonadoEnable)
		{
			Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MoreGems.MOD_ID, "ore_carbonado_overworld"), OreGen.ORE_CARBONADO_OVERWORLD );
		}
	}	
}
