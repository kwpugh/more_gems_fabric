package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class KunziteToolMaterial implements ToolMaterial
{
    private static int durability = MoreGems.CONFIG.GENERAL.kunziteDurability;
    private static float miningSpeed = MoreGems.CONFIG.GENERAL.kunziteMiningSpeed;
    private static float attackDamage = MoreGems.CONFIG.GENERAL.kunziteAttackDamage;
    private static int miningLevel = MoreGems.CONFIG.GENERAL.kunziteMiningLevel;
    private static int enchantability = MoreGems.CONFIG.GENERAL.kunziteEnchantability;

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
        return Ingredient.ofItems(ItemInit.KUNZITE);
    }
}
