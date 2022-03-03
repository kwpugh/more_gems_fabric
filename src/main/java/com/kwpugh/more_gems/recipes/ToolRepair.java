package com.kwpugh.more_gems.recipes;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.init.RecipeInit;
import com.kwpugh.more_gems.init.TagInit;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ToolRepair extends SpecialCraftingRecipe
{
    ItemStack materialType = ItemStack.EMPTY;

    public ToolRepair(Identifier identifier)
    {
        super(identifier);
    }

    @Override
    public boolean matches(CraftingInventory inventory, World world)
    {
        return matchStack(inventory).matches();
    }

    @Override
    public ItemStack craft(CraftingInventory inventory)
    {
        MatchStack matchStack = matchStack(inventory);

        if (matchStack.matches())
        {
            ItemStack toolStack = matchStack.getToolStack();

            // Test if the tool is in the gem_tools.json
            //if(TagInit.GEM_TOOLS.contains(toolStack.getItem()))
            if(toolStack.isIn(TagInit.GEM_TOOLS))
            {
                ItemStack craftStack = toolStack.copy();
                Item materialToTest = materialType.getItem();

                int damage = 0;

                if(materialToTest.equals(ItemInit.SHARPENING_GEM))
                {
                    damage = Math.max(craftStack.getDamage() - MoreGems.CONFIG.GENERAL.sharpeningGemRepairAmount, 0);
                }
                else if(materialToTest.equals(ItemInit.SHARPENING_GEM_GREATER))
                {
                    damage = Math.max(craftStack.getDamage() - MoreGems.CONFIG.GENERAL.sharpeningGemGreaterRepairAmount, 0);
                }

                craftStack.setDamage(damage);

                return craftStack;
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

    private MatchStack matchStack(CraftingInventory inventory)
    {
        ItemStack toolStack = ItemStack.EMPTY;
        ItemStack materialStack = ItemStack.EMPTY;

        for (int i = 0; i < inventory.size(); i++)
        {
            ItemStack stackToTest = inventory.getStack(i);

            if (!stackToTest.isEmpty())
            {
                Item itemToTest = stackToTest.getItem();

                if(itemToTest instanceof BowItem || itemToTest instanceof ToolItem)
                {
                    if(!toolStack.isEmpty())
                    {
                        return MatchStack.EMPTY;
                    }

                    toolStack = stackToTest;
                    continue;
                }
                else if(itemToTest == ItemInit.SHARPENING_GEM || itemToTest == ItemInit.SHARPENING_GEM_GREATER)
                {
                    if(!materialStack.isEmpty())
                    {
                        return MatchStack.EMPTY;
                    }

                    materialType = stackToTest;
                    materialStack = stackToTest;
                    continue;
                }

                return MatchStack.EMPTY;
            }
        }

        return new MatchStack(toolStack, materialStack);
    }

    private record MatchStack(ItemStack toolStack, ItemStack materialStack)
    {
        private static final MatchStack EMPTY = new MatchStack(ItemStack.EMPTY, ItemStack.EMPTY);

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
