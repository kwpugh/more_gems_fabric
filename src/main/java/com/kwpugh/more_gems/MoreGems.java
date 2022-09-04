package com.kwpugh.more_gems;

import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.enchantments.bound.BoundStackManager;
import com.kwpugh.more_gems.enchantments.stupefy.StupefyEntityManager;
import com.kwpugh.more_gems.init.*;
import com.kwpugh.more_gems.items.special.TreasureBag;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoreGems implements ModInitializer
{
	public static final String MOD_ID = "more_gems";
	public static final ItemGroup MORE_GEMS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "more_gems_group"), () -> new ItemStack(ItemInit.ALEXANDRITE));
	public static final MoreGemsConfig CONFIG = AutoConfig.register(MoreGemsConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();
	public static final Logger LOGGER = LogManager.getLogger(MoreGems.class);

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
		BoundStackManager.init();
		StupefyEntityManager.init();
		TreasureBag.initEnchantmentEntries();
		EntityInit.registerEntities();
		DispenserBehaviorInit.registerBehaviors();
	}

	public static Identifier createID(String path)
	{
		return new Identifier(MOD_ID, path);
	}
}