package com.kwpugh.more_gems;

import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.*;
import com.kwpugh.more_gems.world.GemOreConfiguredFeature;
import com.kwpugh.more_gems.world.GemOrePlacedFeature;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MoreGems implements ModInitializer
{
	public static final String MOD_ID = "more_gems";
	public static final ItemGroup MORE_GEMS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "more_gems_group"), () -> new ItemStack(ItemInit.ALEXANDRITE));
	public static final MoreGemsConfig CONFIG = AutoConfig.register(MoreGemsConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();

    @Override
    public void onInitialize()
	{
		BlockInit.registerBlocks();
		BlockInit.registerBlockItems();
		ItemInit.registerItems();
		ContainerInit.registerContainer();
		GemOreConfiguredFeature.init();
		GemOrePlacedFeature.init();
		LootTableInit.registerLoot();
		EnchantmentInit.registerEnchantments();
		TagInit.registerTags();
		RecipeInit.registerRecipes();
	}
}