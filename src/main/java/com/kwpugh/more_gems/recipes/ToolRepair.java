package com.kwpugh.more_gems.recipes;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.init.RecipeInit;
import com.kwpugh.more_gems.init.TagInit;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ToolRepair extends SpecialCraftingRecipe
{
    public ToolRepair(Identifier identifier)
    {
        super(identifier);
    }

    @Override
    public boolean matches(CraftingInventory inventory, World world)
    {
        return matchResult(inventory).matches();
    }

    @Override
    public ItemStack craft(CraftingInventory inventory)
    {
        if(MoreGems.CONFIG.GENERAL.enableSharpeningGem)
        {
            MatchResult matchResult = matchResult(inventory);

            if (matchResult.matches())
            {
                ItemStack toolStack = matchResult.getToolStack();

                if(TagInit.GEM_TOOLS.contains(toolStack.getItem()))
                {
                    ItemStack craftStack = toolStack.copy();
                    int damage = Math.max(craftStack.getDamage() - MoreGems.CONFIG.GENERAL.sharpeningGemRepairAmount, 0);
                    craftStack.setDamage(damage);

                    return craftStack;
                }
            }
        }

        return ItemStack.EMPTY;
    }

    @Override
    public boolean fits(int width, int height)
    {
        return width * height >= 2;
    }


    @Override
    public RecipeSerializer<?> getSerializer()
    {
        return RecipeInit.GEM_TOOL_REPAIR;
    }

    private MatchResult matchResult(CraftingInventory inventory)
    {
        ItemStack toolStack = ItemStack.EMPTY;
        ItemStack materialStack = ItemStack.EMPTY;

        for (int i = 0; i < inventory.size(); i++)
        {
            ItemStack stackToTest = inventory.getStack(i);

            if (!stackToTest.isEmpty())
            {
                Item itemToTest = stackToTest.getItem();

                if(itemToTest instanceof ToolItem)
                {
                    if(!toolStack.isEmpty())
                    {
                        return MatchResult.EMPTY;
                    }

                    toolStack = stackToTest;
                    continue;
                }
                else if(itemToTest == ItemInit.SHARPENING_GEM)
                {
                    if(!materialStack.isEmpty())
                    {
                        return MatchResult.EMPTY;
                    }

                    materialStack = stackToTest;
                    continue;
                }

                return MatchResult.EMPTY;
            }
        }

        return new MatchResult(toolStack, materialStack);
    }

    private record MatchResult(ItemStack toolStack, ItemStack materialStack)
    {
        private static final MatchResult EMPTY = new MatchResult(ItemStack.EMPTY, ItemStack.EMPTY);

        private ItemStack getToolStack()
        {
            return toolStack;
        }

        private boolean matches()
        {
            return !toolStack.isEmpty() && !materialStack.isEmpty();
        }
    }
}
