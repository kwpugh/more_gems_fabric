package com.kwpugh.more_gems.items.baseclasses;

import com.kwpugh.pugh_tools.Tools.Paxel;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ModPaxel extends Paxel
{
    public ModPaxel(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings)
    {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("item.more_gems.paxel.tip1").formatted(Formatting.GREEN));
    }
}
