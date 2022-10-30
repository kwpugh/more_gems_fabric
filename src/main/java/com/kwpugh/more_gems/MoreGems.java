package com.kwpugh.more_gems;

import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.events.ModEvents;
import com.kwpugh.more_gems.init.*;
import com.kwpugh.more_gems.items.special.TreasureBag;
import com.kwpugh.more_gems.util.MoreGemsGroup;
import com.kwpugh.more_gems.world.OreBiomeModifications;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoreGems implements ModInitializer
{
	public static final String MOD_ID = "more_gems";
	public static final MoreGemsConfig CONFIG = AutoConfig.register(MoreGemsConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();
	public static final Logger LOGGER = LogManager.getLogger(MoreGems.class);

    @Override
    public void onInitialize()
	{
		BlockInit.registerBlocks();
		BlockInit.registerBlockItems();
		ItemInit.registerItems();
		ContainerInit.registerContainer();
		MoreGemsGroup.addGroup();
		OreBiomeModifications.addOres();
		EnchantmentInit.registerEnchantments();
		TagInit.registerTags();
		RecipeInit.registerRecipes();
		TreasureBag.initTreasure();
		EntityInit.registerEntities();
		DispenserBehaviorInit.registerBehaviors();
		TraderOfferInit.registerOffers();
		ModEvents.registerEvents();
	}

	public static Identifier createID(String path)
	{
		return new Identifier(MOD_ID, path);
	}
}