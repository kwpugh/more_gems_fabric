package com.kwpugh.more_gems.world;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.collect.Lists;
import com.kwpugh.more_gems.init.ContentInit;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen
{  
	private static final List<Biome> CARBONADO_BIOMES = Lists.newArrayList();
	
//	public static void addNetherGems()
//	{
//		gatherBiomeFromCategory(Biome.Category.NETHER, CARBONADO_BIOMES);
//		CARBONADO_BIOMES.forEach(b->b.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, ContentInit.NETHER_CARBONADO_ORE.getDefaultState(), 2)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(12, 0, 0, 128)))));
//	}		
	
	public static void addGemOres(Biome biome)
	{
		biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, ContentInit.RUBY_ORE.getDefaultState(), 4)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(40, 0, 0, 55))));
		biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, ContentInit.SAPPHIRE_ORE.getDefaultState(), 4)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(20, 0, 0, 40))));
		biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, ContentInit.TOPAZ_ORE.getDefaultState(), 4)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(12, 0, 0, 32))));
		biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, ContentInit.AMETHYST_ORE.getDefaultState(), 4)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(8, 0, 0, 28))));
		biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, ContentInit.CARBONADO_ORE.getDefaultState(), 4)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(8, 0, 0, 28))));
	}

//	public static void addNetherGems(Biome biome)
//	{
//		biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, ContentInit.NETHER_CARBONADO_ORE.getDefaultState(), 10)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(10, 10, 20, 128))));
//	    biome.addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, ContentInit.NETHER_CARBONADO_ORE.getDefaultState(), 14)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(16, 10, 20, 128))));   
//	}
	   
//	private static void gatherBiomeFromCategory(Biome.Category category, List<Biome> list, Biome... exceptions)
//	{
//		Registry.BIOME.forEach(b->{
//			if(b.getCategory() == category && !ArrayUtils.contains(exceptions, b))
//				list.add(b);
//		});
//	}
}