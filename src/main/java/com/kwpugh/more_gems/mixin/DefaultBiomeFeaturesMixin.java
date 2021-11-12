//package com.kwpugh.more_gems.mixin;
//
//import com.kwpugh.more_gems.world.OreGen;
//import net.minecraft.world.biome.GenerationSettings;
//import net.minecraft.world.gen.GenerationStep;
//import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//@Mixin(DefaultBiomeFeatures.class)
//public class DefaultBiomeFeaturesMixin
//{
//  @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At(value = "TAIL"))
//
//  private static void moregemsAddDefaultOres(GenerationSettings.Builder builder, CallbackInfo ci)
//  {
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_CITRINE_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_CITRINE_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_TOURMALINE_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_KUNZITE_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_TOPAZ_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_ALEXANDRITE_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_SAPPHIRE_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_RUBY_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_CORUNDUM_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_CARBONADO_OVERWORLD);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_SAPPHIRE_OVERWORLD_DEEPSLATE);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_RUBY_OVERWORLD_DEEPSLATE);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_CARBONADO_OVERWORLD_DEEPSLATE);
//  }
//
//  // Inject Nether Ore into the Nether
//  @Inject(method = "addNetherMineables",  at = @At(value = "TAIL"))
//  private static void moregemsAddNetherMineables(GenerationSettings.Builder builder, CallbackInfo ci)
//  {
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_KUNZITE_NETHER);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_ALEXANDRITE_NETHER);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_CORUNDUM_NETHER);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_MOISSANITE_NETHER);
//    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreGen.ORE_MOISSANITE_NETHER_HIGH);
//
//  }
//}