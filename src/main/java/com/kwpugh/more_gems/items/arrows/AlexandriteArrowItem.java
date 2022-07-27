package com.kwpugh.more_gems.items.arrows;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.arrows.entities.AlexandriteArrowEntity;
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

public class AlexandriteArrowItem extends ArrowItem
{
    public AlexandriteArrowItem(Settings settings)
    {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter)
    {
        return new AlexandriteArrowEntity(world, shooter);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(MoreGems.CONFIG.GENERAL.alexandriteExtraDamage > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.damage", MoreGems.CONFIG.GENERAL.alexandriteExtraDamage).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.alexandritePierceLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.pierce", MoreGems.CONFIG.GENERAL.alexandritePierceLevel).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.alexandritePunchLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.punch", MoreGems.CONFIG.GENERAL.alexandritePunchLevel).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.alexandriteSlownessAmplifier > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.slowness", MoreGems.CONFIG.GENERAL.alexandriteSlownessAmplifier + 1).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.alexandritePowderSnow)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.powder_snow").formatted(Formatting.YELLOW));
        }
    }
}