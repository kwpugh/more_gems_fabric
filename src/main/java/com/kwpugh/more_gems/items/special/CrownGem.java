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

public class CrownGem extends ArmorItem
{
    StatusEffectInstance conduit = new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 0, 0, false, false);
    StatusEffectInstance dolphin = new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 0, 0, false, false);
    StatusEffectInstance speed = new StatusEffectInstance(StatusEffects.SPEED, 0, 1, false, false);
    StatusEffectInstance strength = new StatusEffectInstance(StatusEffects.STRENGTH, 0, 2, false, false);

    public CrownGem(ArmorMaterial material, EquipmentSlot slot, Settings settings)
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
                player.addStatusEffect(conduit);
                player.addStatusEffect(dolphin);
                player.addStatusEffect(speed);
                player.addStatusEffect(strength);

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
            tooltip.add(Text.translatable("item.more_gems.crown_gem.tip1").formatted(Formatting.GREEN));
        }
        else
        {
            tooltip.add(Text.translatable("item.more_gems.crown_gem.tip2").formatted(Formatting.RED));
        }
    }
}
