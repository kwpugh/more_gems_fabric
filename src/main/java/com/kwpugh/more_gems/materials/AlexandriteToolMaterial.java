package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AlexandriteToolMaterial implements ToolMaterial
{
    private static int durability = MoreGems.CONFIG.GENERAL.alexandriteDurability;
    private static float miningSpeed = MoreGems.CONFIG.GENERAL.alexandriteMiningSpeed;
    private static float attackDamage = MoreGems.CONFIG.GENERAL.alexandriteAttackDamage;
    private static int miningLevel = 2;
    private static int enchantability = MoreGems.CONFIG.GENERAL.alexandriteEnchantability;

    @Override
    public int getDurability()
    {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public int getMiningLevel()
    {
        return miningLevel;
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ItemInit.ALEXANDRITE);
    }
}