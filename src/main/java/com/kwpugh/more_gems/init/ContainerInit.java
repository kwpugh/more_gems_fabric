package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.gembag.GembagItem;
import com.kwpugh.more_gems.items.gembag.GembagScreenHandler;
import net.minecraft.item.Item;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ContainerInit
{
	public static ScreenHandlerType<GembagScreenHandler> GEMBAG_SCREEN_HANDLER;
	public static final Item GEMBAG = new GembagItem(new Item.Settings().maxCount(1));
	
	public static void registerContainer()
	{
		GEMBAG_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER, MoreGems.createID("gembag"), new ScreenHandlerType<>(GembagScreenHandler::new));

		Registry.register(Registries.ITEM, MoreGems.createID("gembag"), GEMBAG);
	}
}
