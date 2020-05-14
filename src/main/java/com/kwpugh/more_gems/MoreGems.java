package com.kwpugh.more_gems;

import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.BlockInit;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.init.ModBiomes;
import com.kwpugh.more_gems.init.ModEnchantments;
import com.kwpugh.more_gems.init.ModLootTables;
import com.kwpugh.more_gems.world.OreGen;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class MoreGems implements ModInitializer
{	
	public static final String MOD_ID = "more_gems";
	public static final ItemGroup MORE_GEMS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "more_gems_group"), () -> new ItemStack(ItemInit.ALEXANDRITE));
	
	public static final MoreGems INSTANCE = new MoreGems();	
	
    @Override
    public void onInitialize()
    {
    	AutoConfig.register(MoreGemsConfig.class, GsonConfigSerializer::new);
    	
    	BlockInit.registerBlocks();
    	BlockInit.registerBlockItems();
    	
    	ItemInit.registerItems();
        
    	ModBiomes.registerBiomes();   	
        
    	for (Biome biome : Registry.BIOME)
		{
    		System.out.println(biome);
    		
			OreGen.addGemOres(biome);
		} 
    	
    	ModLootTables.init();
    	
    	ModEnchantments.registerEnchantments();
    }
    
    public static MoreGemsConfig getConfig()
    {
        return AutoConfig.getConfigHolder(MoreGemsConfig.class).getConfig();
    }
}