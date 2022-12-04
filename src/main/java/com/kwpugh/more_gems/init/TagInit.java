package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TagInit
{
    public static final TagKey<Item> COMMON_LOOT = TagKey.of(RegistryKeys.ITEM, new Identifier("c", "common_loot"));

    // Fabric c tags used by Treasure Bag
    public static final TagKey<Item> TREASURE_BAG = TagKey.of(RegistryKeys.ITEM, new Identifier("c", "treasure_bag"));

    // Mod tags used for sharpening gems
    public static final TagKey<Item> GEM_TOOLS = TagKey.of(RegistryKeys.ITEM, new Identifier("more_gems", "gem_tools"));
    public static final TagKey<Item> GEM_ARMORS = TagKey.of(RegistryKeys.ITEM, new Identifier("more_gems", "gem_armors"));
    public static final TagKey<Item> GEMS_LESSER = TagKey.of(RegistryKeys.ITEM, new Identifier("more_gems", "gem_lesser"));
    public static final TagKey<Item> GEMS_GREATER = TagKey.of(RegistryKeys.ITEM, new Identifier("more_gems", "gem_greater"));

    // Tag for air blocks
    public static final TagKey<Block> AIR_BLOCKS = TagKey.of(RegistryKeys.BLOCK, new Identifier(MoreGems.MOD_ID, "air_blocks"));

    public static void registerTags()
    {
        // Force class load
    }
}
