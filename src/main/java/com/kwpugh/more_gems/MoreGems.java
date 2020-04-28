package com.kwpugh.more_gems;

import com.kwpugh.more_gems.init.BlockInit;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.world.OreGen;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class MoreGems implements ModInitializer
{	
	public static final String MOD_ID = "more_gems";
	public static final ItemGroup MORE_GEMS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "more_gems_group"), () -> new ItemStack(ItemInit.ALEXANDRITE));
	
	public static final MoreGems INSTANCE = new MoreGems();
	
    @Override
    public void onInitialize()
    {
    	BlockInit.registerBlocks();
    	BlockInit.registerBlockItems();
    	//BlockInit.registerBlockEntities();
    	
    	ItemInit.registerItems();
        
    	for (Biome biome : Biome.BIOMES)
		{
			OreGen.addGemOres(biome);
		} 
    }
}