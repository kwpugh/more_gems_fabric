package com.kwpugh.more_gems.enchantments.bound;

import com.kwpugh.more_gems.MoreGems;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.world.GameRules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
          +++++  Under development   +++++

    Creates and manages a list of BoundStack
    objects that contain PlayerEntity and ITemStack
    objects that can be added to it by a method call.

    Any BoundStack added to list will be "promptly"
    returned to the user, whether alive or dead.
 */

public class BoundStackManager
{
    public static final List<BoundStack> stackList = new ArrayList<>();

    public static void init()
    {
        // After death, player inventory, with returned itemstacks, is copied to new player
        ServerPlayerEvents.COPY_FROM.register((oldPlayer, newPlayer, alive) -> {

            if(!alive)
            {
                boolean ruleTest = newPlayer.world.getGameRules().getBoolean(GameRules.KEEP_INVENTORY);

                if(!ruleTest && !oldPlayer.isSpectator())
                {
                    newPlayer.getInventory().clone(oldPlayer.getInventory());
                }
            }

            MoreGems.LOGGER.info("Bound Enchantment Message: Copied data for {} to {}", oldPlayer.getGameProfile().getName(), newPlayer);
        });

        // Return any itemstacks to the player, if they are in the list
        ServerTickEvents.END_SERVER_TICK.register(tick -> {
            for(Iterator<BoundStack> iterator = stackList.iterator(); iterator.hasNext();)
            {
                BoundStack boundStack = iterator.next();
                boundStack.returnBoundStack();
                iterator.remove();
            }
        });
    }

    public static void addToList(BoundStack boundStack)
    {
        stackList.add(boundStack);
    }

    // For Debugging
    public static void showList()
    {
        System.out.println("list: " + stackList);
    }
}