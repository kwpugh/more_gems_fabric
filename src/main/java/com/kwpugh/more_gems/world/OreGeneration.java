package com.kwpugh.more_gems.world;

import com.kwpugh.more_gems.MoreGems;

public class OreGeneration
{
    static boolean enableCAC = MoreGems.CONFIG.ORES.enableCAC;

    public static void intit()
    {
        if(enableCAC)
        {
            CACOreGen.registerConfiguredFeature();
            CACOreGen.registerBiomeModifications();
        }
        else
        {
            ModConfiguredFeatures.Features();
        }
    }
}
