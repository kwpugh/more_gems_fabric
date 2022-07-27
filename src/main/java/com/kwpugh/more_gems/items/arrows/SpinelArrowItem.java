package com.kwpugh.more_gems.items.arrows;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.arrows.entities.SpinelArrowEntity;
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

public class SpinelArrowItem extends ArrowItem
{
    public SpinelArrowItem(Settings settings)
    {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter)
    {
        return new SpinelArrowEntity(world, shooter);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(MoreGems.CONFIG.GENERAL.spinelExtraDamage > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.damage", MoreGems.CONFIG.GENERAL.spinelExtraDamage).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.spinelPierceLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.pierce", MoreGems.CONFIG.GENERAL.spinelPierceLevel).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.spinelPunchLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.punch", MoreGems.CONFIG.GENERAL.spinelPunchLevel).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.spinelPoisonAmplifier > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.poison", MoreGems.CONFIG.GENERAL.spinelPoisonAmplifier + 1).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.spinelPoisonCloud)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.poison_cloud").formatted(Formatting.YELLOW));
        }
    }
}