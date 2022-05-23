package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.gembag.GembagItem;
import com.kwpugh.more_gems.items.gembag.GembagScreenHandler;
import net.minecraft.item.Item;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

public class ContainerInit
{
	public static ScreenHandlerType<GembagScreenHandler> GEMBAG_SCREEN_HANDLER;
	public static final Item GEMBAG = new GembagItem(new Item.Settings().group(MoreGems.MORE_GEMS_GROUP).maxCount(1));
	
	public static void registerContainer()
	{
		GEMBAG_SCREEN_HANDLER = Registry.register(Registry.SCREEN_HANDLER, MoreGems.createID("gembag"), new ScreenHandlerType<>(GembagScreenHandler::new));

		Registry.register(Registry.ITEM, MoreGems.createID("gembag"), GEMBAG);
	}
}
