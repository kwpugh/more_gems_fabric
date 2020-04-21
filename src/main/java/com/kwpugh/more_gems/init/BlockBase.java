package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockBase extends Block
{	
	public BlockBase(String name, float hardness, float resistance)
	{
		super(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).strength(hardness, resistance).build());
	
		Registry.register(Registry.BLOCK, new Identifier(MoreGems.MOD_ID, name), this);
		Registry.register(Registry.ITEM,new Identifier(MoreGems.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(MoreGems.MORE_GEMS_GROUP)));
    }
}