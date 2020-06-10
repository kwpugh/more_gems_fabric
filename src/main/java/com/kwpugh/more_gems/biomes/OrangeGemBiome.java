package com.kwpugh.more_gems.biomes;

import com.google.common.collect.ImmutableList;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class OrangeGemBiome extends Biome
{
	public OrangeGemBiome(Settings settings)
	{
	      super((new Biome.Settings()).configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG).precipitation(Biome.Precipitation.RAIN).category(Biome.Category.PLAINS).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).moodSound(BiomeMoodSound.CAVE).build()).parent((String)null).noises(ImmutableList.of(new Biome.MixedNoisePoint(0.0F, 0.0F, 0.0F, 0.0F, 1.0F))));
	      this.addStructureFeature(DefaultBiomeFeatures.PLAINS_VILLAGE);
	      this.addStructureFeature(DefaultBiomeFeatures.PILLAGER_OUTPOST);
	      DefaultBiomeFeatures.method_28440(this);
	      this.addStructureFeature(DefaultBiomeFeatures.STANDARD_RUINED_PORTAL);
	      DefaultBiomeFeatures.addLandCarvers(this);
	      DefaultBiomeFeatures.addDefaultLakes(this);
	      DefaultBiomeFeatures.addDungeons(this);
	      DefaultBiomeFeatures.addPlainsTallGrass(this);
	      DefaultBiomeFeatures.addMineables(this);
	      DefaultBiomeFeatures.addDefaultOres(this);
	      DefaultBiomeFeatures.addDefaultDisks(this);
	      DefaultBiomeFeatures.addPlainsFeatures(this);
	      DefaultBiomeFeatures.addDefaultMushrooms(this);
	      DefaultBiomeFeatures.addDefaultVegetation(this);
	      DefaultBiomeFeatures.addSprings(this);
	      DefaultBiomeFeatures.addFrozenTopLayer(this);
	      this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.SHEEP, 12, 4, 4));
	      this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.PIG, 10, 4, 4));
	      this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
	      this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.COW, 8, 4, 4));
	      this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.HORSE, 5, 2, 6));
	      this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.DONKEY, 1, 1, 3));
	}

	@Environment(EnvType.CLIENT)
	public int getFoliageColor()
	{
		return 7229699;
	}

	@Environment(EnvType.CLIENT)
	public int getGrassColorAt(double x, double z)
	{
		return 15453564;
	}
}