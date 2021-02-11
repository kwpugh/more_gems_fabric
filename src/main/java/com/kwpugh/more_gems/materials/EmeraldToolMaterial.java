package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial
{
    private static int durability = MoreGems.CONFIG.GENERAL.emeraldDurability;
    private static float miningSpeed = MoreGems.CONFIG.GENERAL.emeraldMiningSpeed;
    private static float attackDamage = MoreGems.CONFIG.GENERAL.emeraldAttackDamage;
    private static int miningLevel = MoreGems.CONFIG.GENERAL.emeraldMiningLevel;
    private static int enchantability = MoreGems.CONFIG.GENERAL.emeraldEnchantability;

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
        return Ingredient.ofItems(Items.EMERALD);
    }
}
