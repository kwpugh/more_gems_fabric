package com.kwpugh.more_gems.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;

/*
    Relies on mixin to tick() in PlayerEntityMixin
 */

public class AttractingEnchantment extends Enchantment
{
    public AttractingEnchantment(Rarity weight, EnchantmentTarget enchantmentTarget, EquipmentSlot[] slotTypes)
    {
        super(weight, enchantmentTarget, slotTypes);
    }

    @Override
    public int getMinPower(int level)
    {
        return 10 * (level - 1);
    }

    @Override
    public int getMaxPower(int level)
    {
        return super.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel()
    {
        return 3;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack)
    {
        Item tool = stack.getItem();

        if(tool instanceof MiningToolItem)
        {
            return this.type.isAcceptableItem(stack.getItem());
        }
        else
        {
            return false;
        }
    }
}
