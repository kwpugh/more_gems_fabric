package com.kwpugh.more_gems.items.special;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class SharpeningGem extends Item
{
    public SharpeningGem(Settings settings)
    {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("item.more_gems.sharpening_gem.tip1").formatted(Formatting.GREEN));
        tooltip.add(new TranslatableText("item.more_gems.sharpening_gem.tip2", MoreGems.CONFIG.GENERAL.sharpeningGemRepairAmount).formatted(Formatting.GREEN));
    }
}
