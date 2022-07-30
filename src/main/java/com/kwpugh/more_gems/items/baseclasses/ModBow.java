package com.kwpugh.more_gems.items.baseclasses;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.pugh_tools.Tools.Bow;

public class ModBow extends Bow
{
    public static float speed = MoreGems.CONFIG.GENERAL.projectileSpeed;
    public static float roll = MoreGems.CONFIG.GENERAL.projectileRoll;
    public static float divergence = MoreGems.CONFIG.GENERAL.projectileDivergence;
    public static double extraDamage = MoreGems.CONFIG.GENERAL.projectileExtraDamage;
    public static double powerBonus = MoreGems.CONFIG.GENERAL.projectilePowerDamageBonus;
    public static float zoomMultiplier = MoreGems.CONFIG.GENERAL.bowZoomMultiplier;
    public static int flameBurnSecond = MoreGems.CONFIG.GENERAL.projectileFlameBurnSeconds;
    public static int dropRange = MoreGems.CONFIG.GENERAL.projectileDropRange;

    public ModBow(Settings settings)
    {
        super(speed, roll, divergence, extraDamage, powerBonus, zoomMultiplier, flameBurnSecond, dropRange, settings);
    }
}
