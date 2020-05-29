package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.gembag.GembagInventoryInterface;
import com.kwpugh.more_gems.items.gembag.GembagItem;
import com.kwpugh.more_gems.items.gembag.GembagScreenHandler;

import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;

public class ContainerInit
{
	public static final Identifier GEMBAG_IDENTIFIER = new Identifier(MoreGems.MOD_ID, "gembag");
	public static final String GEMBAG_TRANSLATION_KEY = Util.createTranslationKey("container", GEMBAG_IDENTIFIER);
	public static final Item GEMBAG = new GembagItem((new Item.Settings()).maxCount(1).group(MoreGems.MORE_GEMS_GROUP));

	public static void registerContainer()
	{
        ContainerProviderRegistry.INSTANCE.registerFactory(GEMBAG_IDENTIFIER, ((syncId, identifier, player, buf) -> {
            final ItemStack stack = buf.readItemStack();
            final Hand hand = buf.readInt() == 0 ? Hand.MAIN_HAND : Hand.OFF_HAND;
            final GembagInventoryInterface inventory = GembagItem.getInventory(stack, hand, player);

            return new GembagScreenHandler(syncId, player.inventory, inventory.getInventory(), inventory.getInventoryWidth(), inventory.getInventoryHeight(), hand);
        }));

        Registry.register(Registry.ITEM, GEMBAG_IDENTIFIER, GEMBAG);
	}
}
