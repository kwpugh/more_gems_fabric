package com.kwpugh.more_gems.enchantments.bound;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

/*
           +++++  Under development   +++++
        Simple object used to hold a PlayerEntity
        and a ItemStack.  Used in conjunction with
        BoundManager, which manages a List of BoundStacks.
        This object provides a method to return a BoundStack
        to the player, called from the Iterator in
        BoundManager
 */
public class BoundStack
{
    private PlayerEntity player;
    private ItemStack stack;

    public BoundStack(PlayerEntity player, ItemStack stack)
    {
        this.player = player;
        this.stack = stack;
    }

    public void returnBoundStack()
    {
        PlayerEntity player = this.player;
        ItemStack stack = this.stack;

        if(player.canEquip(stack) &&
                (stack.getItem() instanceof ArmorItem
                || stack.getItem() instanceof ShieldItem
                || stack.getItem() instanceof ElytraItem))
        {
            EquipmentSlot equipmentSlot = LivingEntity.getPreferredEquipmentSlot(stack);
            ItemStack split = stack.split(1);
            player.equipStack(equipmentSlot, split);
        }
        else
        {
            player.giveItemStack(stack);
        }
    }

    public String toString()
    {
        return "[player: " + this.player + ", stack: " + this.stack + "]";
    }
}

