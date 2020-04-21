package com.kwpugh.more_gems;

import com.kwpugh.more_gems.init.ContentInit;
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
	public static final ItemGroup MORE_GEMS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "more_gems_group"), () -> new ItemStack(ContentInit.SAPPHIRE_SWORD));
	
    @Override
    public void onInitialize()
    {
        new ContentInit();
        
    	for (Biome biome : Biome.BIOMES)
		{
			OreGen.addGemOres(biome);
			//OreGen.addNetherGems();
		}	
    }	
}