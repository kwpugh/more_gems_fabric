package com.kwpugh.more_gems.init;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TagInit
{
    public static final TagKey<Item> COMMON_LOOT = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "common_loot"));

    // Fabric c tags used by Treasure Bag
    public static final TagKey<Item> TREASURE_BAG = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "treasure_bag"));

    // Mod tags used for sharpening gems
    public static final TagKey<Item> GEM_TOOLS = TagKey.of(Registry.ITEM_KEY, new Identifier("more_gems", "gem_tools"));
    public static final TagKey<Item> GEMS_LESSER = TagKey.of(Registry.ITEM_KEY, new Identifier("more_gems", "gem_lesser"));
    public static final TagKey<Item> GEMS_GREATER = TagKey.of(Registry.ITEM_KEY, new Identifier("more_gems", "gem_greater"));

    public static void registerTags()
    {
        // Force class load
    }
}
