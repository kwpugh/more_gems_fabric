package com.kwpugh.more_gems.items.special;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class CrownNetheriteGem extends ArmorItem
{
    StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 8, 0, false, false);
    StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 8, 0, false, false);
    StatusEffectInstance effect3 = new StatusEffectInstance(StatusEffects.HASTE, 8, 1, false, false);
    StatusEffectInstance effect4 = new StatusEffectInstance(StatusEffects.SPEED, 8, 1, false, false);
    StatusEffectInstance effect5 = new StatusEffectInstance(StatusEffects.STRENGTH, 8, 2, false, false);
    StatusEffectInstance effect6 = new StatusEffectInstance(StatusEffects.NIGHT_VISION, 8, 0, false, false);
    StatusEffectInstance effect7 = new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 8, 0, false, false);
    StatusEffectInstance effect8 = new StatusEffectInstance(StatusEffects.SLOW_FALLING, 8, 0, false, false);
    StatusEffectInstance effect9 = new StatusEffectInstance(StatusEffects.SATURATION, 8, 0, false, false);

    public CrownNetheriteGem(ArmorMaterial material, EquipmentSlot slot, Settings settings)
    {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        if(entity instanceof PlayerEntity player)
        {
            if(PlayerEquipUtil.isWearingCrown(player) && MoreGems.CONFIG.GENERAL.enableJujuCrownPowers)
            {
                player.addStatusEffect(effect);
                player.addStatusEffect(effect2);
                player.addStatusEffect(effect3);
                player.addStatusEffect(effect4);
                player.addStatusEffect(effect5);
                player.addStatusEffect(effect6);
                player.addStatusEffect(effect7);
                player.addStatusEffect(effect8);
                player.addStatusEffect(effect9);

                PlayerSpecialAbilities.givePhoenixEffect(world, player);
                PlayerSpecialAbilities.giveCuringEffect(world, player);
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(MoreGems.CONFIG.GENERAL.enableJujuCrownPowers)
        {
            tooltip.add(Text.translatable("item.more_gems.crown_netherite_gem.tip1").formatted(Formatting.GREEN));
        }
        else
        {
            tooltip.add(Text.translatable("item.more_gems.crown_netherite_gem.tip2").formatted(Formatting.RED));
        }
    }
}
