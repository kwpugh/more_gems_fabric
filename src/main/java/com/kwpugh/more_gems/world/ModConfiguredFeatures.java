package com.kwpugh.more_gems.world;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

public class ModConfiguredFeatures
{
	public static void Features()
	{
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_citrine_overworld"), OreGen.ORE_CITRINE_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_tourmaline_overworld"), OreGen.ORE_TOURMALINE_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_amethyst_overworld"), OreGen.ORE_AMETHYST_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_topaz_overworld"), OreGen.ORE_TOPAZ_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_alexandrite_overworld"), OreGen.ORE_ALEXANDRITE_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_sapphire_overworld"), OreGen.ORE_SAPPHIRE_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_ruby_overworld"), OreGen.ORE_RUBY_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_corundum_overworld"), OreGen.ORE_CORUNDUM_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("more_gems", "ore_carbonado_overworld"), OreGen.ORE_CARBONADO_OVERWORLD );
	}

	
}
