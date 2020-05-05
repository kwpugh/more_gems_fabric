package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen
{  
	static boolean citrineEnable = MoreGems.getConfig().ORES.citrine;
	static boolean tourmalineEnable = MoreGems.getConfig().ORES.tourmaline;
	static boolean amethystEnable = MoreGems.getConfig().ORES.amethyst;
	static boolean topazEnable = MoreGems.getConfig().ORES.topaz;
	static boolean alexandriteEnable = MoreGems.getConfig().ORES.alexandrite;
	static boolean sapphireEnable = MoreGems.getConfig().ORES.sapphire;
	static boolean rubyEnable = MoreGems.getConfig().ORES.ruby;
	static boolean corundumEnable = MoreGems.getConfig().ORES.corundum;
	static boolean carbonadoEnable = MoreGems.getConfig().ORES.carbonado;
	
	public static void addGemOres(Biome biome)
	{
		if(citrineEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CITRINE_ORE.getDefaultState(), 3)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(45, 0, 0, 60))));
		}
		
		if(tourmalineEnable)
		{		
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.TOURMALINE_ORE.getDefaultState(), 3)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(40, 0, 0, 50))));
		}
		
		if(amethystEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.AMETHYST_ORE.getDefaultState(), 3)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(40, 0, 0, 50))));
		}
		
		if(topazEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.TOPAZ_ORE.getDefaultState(), 3)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(40, 0, 0, 50))));		
		}
		
		if(alexandriteEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.ALEXANDRITE_ORE.getDefaultState(), 3)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(30, 0, 0, 40))));
		}
		
		if(sapphireEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.getDefaultState(), 3)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(20, 0, 0, 30))));
		}
		
		if(rubyEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.RUBY_ORE.getDefaultState(), 3)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(20, 0, 0, 30))));		
		}
		
		if(corundumEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CORUNDUM_ORE.getDefaultState(), 3)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(10, 0, 0, 20))));		
		}
		
		if(carbonadoEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CARBONADO_ORE.getDefaultState(), 5)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(1, 0, 0, 15))));
		}
	}
}