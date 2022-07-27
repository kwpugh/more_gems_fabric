package com.kwpugh.more_gems.items.arrows;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.arrows.entities.CitrineArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class CitrineArrowItem extends ArrowItem
{
    public CitrineArrowItem(Settings settings)
    {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter)
    {
        return new CitrineArrowEntity(world, shooter);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(MoreGems.CONFIG.GENERAL.citrineExtraDamage > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.damage", MoreGems.CONFIG.GENERAL.citrineExtraDamage).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.citrinePierceLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.pierce", MoreGems.CONFIG.GENERAL.citrinePierceLevel).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.citrinePunchLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.punch", MoreGems.CONFIG.GENERAL.citrinePunchLevel).formatted(Formatting.GREEN));
        }
    }
}