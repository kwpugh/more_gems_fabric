package com.kwpugh.more_gems.enchantments.bound;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

/*
           +++++  Under development   +++++

        Simple object used to hold a PlayerEntity
        and a ItemStack.  USed in conjunction with
        BoundManager, which manages a List of BoundStacks.
        This object provides a method to return a BoundStack
        to the player, called from the Iterator in
        BoundManager
 */
public class BoundStack
{
    private PlayerEntity player;
    private ItemStack stack;
    private int slotIndex;

    public BoundStack(PlayerEntity player, ItemStack stack)
    {
        this.player = player;
        this.stack = stack;
    }

    public void returnBoundStack()
    {
        PlayerEntity player = this.player;
        ItemStack stack = this.stack;
        MoreGems.LOGGER.info("Bound Enchantment Message: ItemStack {} returned to {}", stack, player.getGameProfile().getName());
        player.giveItemStack(stack);
    }

    public String toString()
    {
        return "[player: " + this.player + ", stack: " + this.stack + "]";
    }
}

