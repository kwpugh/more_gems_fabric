package com.kwpugh.more_gems.init;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class TraderOfferInit
{
    public static void registerOffers()
    {
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.BOOK), EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantmentInit.CREEPERLESS, 1)), 1, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 7), new ItemStack(Items.BOOK), EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantmentInit.BOUND, 1)), 3, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.BOOK), EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantmentInit.ATTRACTING, 1)), 1, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.BOOK), EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantmentInit.WISDOM, 1)), 2, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.BOOK), EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantmentInit.CLIMBING, 1)), 1, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.BOOK), EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantmentInit.GLIDING, 1)), 1, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.BOOK), EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantmentInit.GUIDING, 1)), 2, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.BOOK), EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantmentInit.STOUT, 1)), 2, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(ItemInit.TOURMALINE, 3), new ItemStack(ItemInit.TOURMALINE_JUJU), 3, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(ItemInit.CITRINE, 3), new ItemStack(ItemInit.CITRINE_JUJU), 3, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(ItemInit.KUNZITE, 3), new ItemStack(ItemInit.KUNZITE_JUJU), 3, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(ItemInit.TOPAZ, 3), new ItemStack(ItemInit.TOPAZ_JUJU), 3, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(ItemInit.ALEXANDRITE, 3), new ItemStack(ItemInit.ALEXANDRITE_JUJU), 3, 2, 0.05f)));
            factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(ItemInit.CARBONADO, 2), new ItemStack(ItemInit.TREASURE_BAG), 3, 2, 0.05f)));
        });
    }
}