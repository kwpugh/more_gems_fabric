package com.kwpugh.more_gems.items.gembag;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.util.collection.DefaultedList;

public interface GembagInventoryInterface
{
    public default Inventory getInventory()
    {
        return (Inventory) this;
    }

    public int getInventoryWidth();
    public int getInventoryHeight();

    default void writeItemsToTag(DefaultedList<ItemStack> inventory, CompoundTag tag)
    {
        ListTag listTag = new ListTag();

        for(int i = 0; i < inventory.size(); ++i)
        {
            ItemStack itemStack = (ItemStack)inventory.get(i);

            if (!itemStack.isEmpty())
            {
                CompoundTag compoundTag = new CompoundTag();
                compoundTag.putInt("slot", i);
                itemStack.toTag(compoundTag);
                listTag.add(compoundTag);
            }
        }

        tag.put("items", listTag);
    }

    default void readItemsFromTag(DefaultedList<ItemStack> inventory, CompoundTag tag)
    {
        ListTag listTag = tag.getList("items", 10);

        for(int i = 0; i < listTag.size(); ++i)
        {
            CompoundTag compoundTag = listTag.getCompound(i);
            int j = compoundTag.getInt("slot");

            if (j >= 0 && j < inventory.size())
            {
                inventory.set(j, ItemStack.fromTag(compoundTag));
            }
        }
    }
}