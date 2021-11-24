package com.kwpugh.more_gems.init;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class TagInit
{
    // Fabric c tags used by Treasure Bag
    public static final Tag<Item> TREASURE_BAG = TagFactory.ITEM.create(new Identifier("c", "treasure_bag"));

    // Mod tags used for sharpening gems
    public static final Tag<Item> GEM_TOOLS = TagFactory.ITEM.create(new Identifier("more_gems", "gem_tools"));
    public static final Tag<Item> GEMS_LESSER = TagFactory.ITEM.create(new Identifier("more_gems", "gem_lesser"));
    public static final Tag<Item> GEMS_GREATER = TagFactory.ITEM.create(new Identifier("more_gems", "gem_greater"));

    public static void registerTags()
    {
        // No Op
    }
}
