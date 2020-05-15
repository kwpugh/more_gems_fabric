package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen
{  
	static boolean citrineEnable = MoreGems.getConfig().CITRINE.citrine;
	static int citrineSize = MoreGems.getConfig().CITRINE.citrineSize;
	static int citrineMinLevel = MoreGems.getConfig().CITRINE.citrineMinLevel;
	static int citrineMaxLevel = MoreGems.getConfig().CITRINE.citrineMaxLevel;
	
	static boolean tourmalineEnable = MoreGems.getConfig().TOURMALINE.tourmaline;
	static int tourmalineSize = MoreGems.getConfig().TOURMALINE.tourmalineSize;
	static int tourmalineMinLevel = MoreGems.getConfig().TOURMALINE.tourmalineMinLevel;
	static int tourmalineMaxLevel = MoreGems.getConfig().TOURMALINE.tourmalineMaxLevel;
	
	static boolean amethystEnable = MoreGems.getConfig().AMETHYST.amethyst;
	static int amethystSize = MoreGems.getConfig().AMETHYST.amethystSize;
	static int amethystMinLevel = MoreGems.getConfig().AMETHYST.amethystMinLevel;
	static int amethystMaxLevel = MoreGems.getConfig().AMETHYST.amethystMaxLevel;
	
	static boolean topazEnable = MoreGems.getConfig().TOPAZ.topaz;
	static int topazSize = MoreGems.getConfig().TOPAZ.topazSize;
	static int topazMinLevel = MoreGems.getConfig().TOPAZ.topazMinLevel;
	static int topazMaxLevel = MoreGems.getConfig().TOPAZ.topazMaxLevel;
	
	static boolean alexandriteEnable = MoreGems.getConfig().ALEXANDRITE.alexandrite;
	static int alexandriteSize = MoreGems.getConfig().ALEXANDRITE.alexandriteSize;
	static int alexandriteMinLevel = MoreGems.getConfig().ALEXANDRITE.alexandriteMinLevel;
	static int alexandriteMaxLevel = MoreGems.getConfig().ALEXANDRITE.alexandriteMaxLevel;
	
	static boolean sapphireEnable = MoreGems.getConfig().SAPPHIRE.sapphire;
	static int sapphireSize = MoreGems.getConfig().SAPPHIRE.sapphireSize;
	static int sapphireMinLevel = MoreGems.getConfig().SAPPHIRE.sapphireMinLevel;
	static int sapphireMaxLevel = MoreGems.getConfig().SAPPHIRE.sapphireMaxLevel;
	
	static boolean rubyEnable = MoreGems.getConfig().RUBY.ruby;
	static int rubySize = MoreGems.getConfig().RUBY.rubySize;
	static int rubyMinLevel = MoreGems.getConfig().RUBY.rubyMinLevel;
	static int rubyMaxLevel = MoreGems.getConfig().RUBY.rubyMaxLevel;
	
	static boolean corundumEnable = MoreGems.getConfig().CORUNDUM.corundum;
	static int corundumSize = MoreGems.getConfig().CORUNDUM.corundumSize;
	static int corundumMinLevel = MoreGems.getConfig().CORUNDUM.corundumMinLevel;
	static int corundumMaxLevel = MoreGems.getConfig().CORUNDUM.corundumMaxLevel;
	
	static boolean carbonadoEnable = MoreGems.getConfig().CARBONADO.carbonado;
	static int carbonadoSize = MoreGems.getConfig().CARBONADO.carbonadoSize;
	static int carbonadoMinLevel = MoreGems.getConfig().CARBONADO.carbonadoMinLevel;
	static int carbonadoMaxLevel = MoreGems.getConfig().CARBONADO.carbonadoMaxLevel;
	
	static int gemBiomeBonus = MoreGems.getConfig().GEM_BIOMES.gemBiomeBonus;
	
	public static void addGemOres(Biome biome)
	{
		String biomeName = biome.toString();
		
		if(citrineEnable)
		{		
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CITRINE_ORE.getDefaultState(), citrineSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(citrineMinLevel, 0, 0, citrineMaxLevel))));
			if(biomeName.contains("OrangeGemBiome"))
			{
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CITRINE_ORE.getDefaultState(), citrineSize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(citrineMinLevel, 0, 0, citrineMaxLevel))));
			}
		}
		
		if(tourmalineEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.TOURMALINE_ORE.getDefaultState(), tourmalineSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(tourmalineMinLevel, 0, 0, tourmalineMaxLevel))));	
			if(biomeName.contains("GreenGemBiome"))
			{
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.TOURMALINE_ORE.getDefaultState(), tourmalineSize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(tourmalineMinLevel, 0, 0, tourmalineMaxLevel))));
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Blocks.EMERALD_ORE.getDefaultState(), tourmalineSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(tourmalineMinLevel, 0, 0, tourmalineMaxLevel))));
			}
		}
		
		if(amethystEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.AMETHYST_ORE.getDefaultState(), amethystSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(amethystMinLevel, 0, 0, amethystMaxLevel))));
			if(biomeName.contains("PurpleGemBiome"))
			{	
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.AMETHYST_ORE.getDefaultState(), amethystSize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(amethystMinLevel, 0, 0, amethystMaxLevel))));
			}
		}
		
		if(topazEnable)
		{		
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.TOPAZ_ORE.getDefaultState(), topazSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(topazMinLevel, 0, 0, topazMaxLevel))));
			if(biomeName.contains("OrangeGemBiome"))
			{
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.TOPAZ_ORE.getDefaultState(), topazSize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(topazMinLevel, 0, 0, topazMaxLevel))));
			}
		}
		
		if(alexandriteEnable)
		{	
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.ALEXANDRITE_ORE.getDefaultState(), alexandriteSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(alexandriteMinLevel, 0, 0, alexandriteMaxLevel))));
			if(biomeName.contains("BlueGemBiome"))
			{	
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.ALEXANDRITE_ORE.getDefaultState(), alexandriteSize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(alexandriteMinLevel, 0, 0, alexandriteMaxLevel))));
			}
		}
		
		if(sapphireEnable)
		{		
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.getDefaultState(), sapphireSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(sapphireMinLevel, 0, 0, sapphireMaxLevel))));	
			if(biomeName.contains("BlueGemBiome"))
			{	
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.getDefaultState(), sapphireSize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(sapphireMinLevel, 0, 0, sapphireMaxLevel))));	
			}
		}
		
		if(rubyEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.RUBY_ORE.getDefaultState(), rubySize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(rubyMinLevel, 0, 0, rubyMaxLevel))));
			if(biomeName.contains("RedGemBiome"))
			{	
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.RUBY_ORE.getDefaultState(), rubySize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(rubyMinLevel, 0, 0, rubyMaxLevel))));
			}
		}
		
		if(corundumEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CORUNDUM_ORE.getDefaultState(), corundumSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(corundumMinLevel, 0, 0, corundumMaxLevel))));		
			if(biomeName.contains("RedGemBiome"))
			{	
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CORUNDUM_ORE.getDefaultState(), corundumSize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(corundumMinLevel, 0, 0, corundumMaxLevel))));
			}
		}
		
		if(carbonadoEnable)
		{
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CARBONADO_ORE.getDefaultState(), carbonadoSize)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(carbonadoMinLevel, 0, 0, carbonadoMaxLevel))));
			if(biomeName.contains("PurpleGemBiome"))
			{	
				biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BlockInit.CARBONADO_ORE.getDefaultState(), carbonadoSize * gemBiomeBonus)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(carbonadoMinLevel, 0, 0, carbonadoMaxLevel))));
			}
		}
	}
}