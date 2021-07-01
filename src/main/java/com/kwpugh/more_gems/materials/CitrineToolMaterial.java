package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CitrineToolMaterial implements ToolMaterial
{
    private static int durability = MoreGems.CONFIG.GENERAL.citrineDurability;
    private static float miningSpeed = MoreGems.CONFIG.GENERAL.citrineMiningSpeed;
    private static float attackDamage = MoreGems.CONFIG.GENERAL.citrineAttackDamage;
    private static int miningLevel = MoreGems.CONFIG.GENERAL.citrineMiningLevel;
    private static int enchantability = MoreGems.CONFIG.GENERAL.citrineEnchantability;

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
        return Ingredient.ofItems(ItemInit.CITRINE);
    }
}
