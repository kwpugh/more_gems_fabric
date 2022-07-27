package com.kwpugh.more_gems.items.arrows;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.arrows.entities.TopazArrowEntity;
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

public class TopazArrowItem extends ArrowItem
{
    public TopazArrowItem(Settings settings)
    {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter)
    {
        return new TopazArrowEntity(world, shooter);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(MoreGems.CONFIG.GENERAL.topazExtraDamage > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.damage", MoreGems.CONFIG.GENERAL.topazExtraDamage).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.topazPierceLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.pierce", MoreGems.CONFIG.GENERAL.topazPierceLevel).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.topazPunchLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.punch", MoreGems.CONFIG.GENERAL.topazPunchLevel).formatted(Formatting.GREEN));
        }
    }
}