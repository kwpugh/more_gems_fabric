package com.kwpugh.more_gems.items.arrows;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.arrows.entities.CarbonadoArrowEntity;
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

public class CarbonadoArrowItem extends ArrowItem
{
    public CarbonadoArrowItem(Settings settings)
    {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter)
    {
        return new CarbonadoArrowEntity(world, shooter);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(MoreGems.CONFIG.GENERAL.carbonadoExtraDamage > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.damage", MoreGems.CONFIG.GENERAL.carbonadoExtraDamage).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.carbonadoPierceLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.pierce", MoreGems.CONFIG.GENERAL.carbonadoPierceLevel).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.carbonadoPunchLevel > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.punch", MoreGems.CONFIG.GENERAL.carbonadoPunchLevel).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.carbonadoSlownessAmplifier > 0)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.slowness", MoreGems.CONFIG.GENERAL.carbonadoSlownessAmplifier + 1).formatted(Formatting.GREEN));
        }

        if(MoreGems.CONFIG.GENERAL.carbonadoExplosion)
        {
            tooltip.add(Text.translatable("item.more_gems.arrow.explosion").formatted(Formatting.YELLOW));
        }
    }
}