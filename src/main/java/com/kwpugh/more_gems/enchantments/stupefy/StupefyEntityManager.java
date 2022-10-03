package com.kwpugh.more_gems.enchantments.stupefy;

import com.kwpugh.more_gems.MoreGems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.HostileEntity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StupefyEntityManager
{
    public static final List<StupefiedEntity> entityList = new ArrayList<>();
    static int levelOneTicks = MoreGems.CONFIG.GENERAL.stupefyLevelOneDurationTicks;
    static int levelTwoTicks = MoreGems.CONFIG.GENERAL.stupefyLevelTwoDurationTicks;
    static int levelThreeTicks = MoreGems.CONFIG.GENERAL.stupefyLevelThreeDurationTicks;

    public static void init()
    {
        ServerTickEvents.END_SERVER_TICK.register(tick -> {
            for(Iterator<StupefiedEntity> iterator = entityList.iterator(); iterator.hasNext();)
            {
                StupefiedEntity stupefiedEntity = iterator.next();

                // ensure only one call of remove() per iteration
                Entity target = stupefiedEntity.getTarget();

                if(target.isAlive())
                {
                    int storedAge = stupefiedEntity.getAge();
                    int storedLevel = stupefiedEntity.getLevel();
                    int duration = 0;

                    duration = switch(storedLevel)
                            {
                                case 1 -> levelOneTicks;
                                case 2 -> levelTwoTicks;
                                case 3 -> levelThreeTicks;
                                default -> 40 * storedLevel;
                            };

                    if(target.age - storedAge > duration)
                    {
                        ((HostileEntity) target).setAiDisabled(false);
                        iterator.remove();
                    }
                }
                else
                {
                    iterator.remove();
                }
            }
        });
    }

    public static void addToList(StupefiedEntity stupefyEntity)
    {
        entityList.add(stupefyEntity);
    }

    // For Debugging
    public static void showList()
    {
        System.out.println("list: " + entityList);
    }
}