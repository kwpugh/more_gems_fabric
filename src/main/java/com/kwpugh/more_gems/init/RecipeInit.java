package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.recipes.ToolRepair;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RecipeInit
{
    public static SpecialRecipeSerializer<ToolRepair> GEM_TOOL_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);

    public static void registerRecipes()
    {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MoreGems.MOD_ID, "gem_tool_repair"), GEM_TOOL_REPAIR);
    }
}