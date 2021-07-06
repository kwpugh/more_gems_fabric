package com.kwpugh.more_gems.items.areatools;

import com.kwpugh.pugh_tools.Tools.Hammer;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class NewHammer extends Hammer
{
    public NewHammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
    {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("item.more_gems.hammer.tip1").formatted(Formatting.GREEN));
    }
}