package com.kwpugh.more_gems.items.special;

import com.kwpugh.more_gems.util.EnableUtil;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
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
    StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 8, 0, false, false);
    StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 8, 0, false, false);
    StatusEffectInstance effect3 = new StatusEffectInstance(StatusEffects.HASTE, 8, 1, false, false);
    StatusEffectInstance effect4 = new StatusEffectInstance(StatusEffects.SPEED, 8, 1, false, false);
    StatusEffectInstance effect5 = new StatusEffectInstance(StatusEffects.STRENGTH, 8, 2, false, false);

    public CrownGem(ArmorMaterial material, EquipmentSlot slot, Settings settings)
    {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        if(entity instanceof PlayerEntity player)
        {
            if(PlayerEquipUtil.isWearingCrown(player))
            {
                player.addStatusEffect(effect);
                player.addStatusEffect(effect2);
                player.addStatusEffect(effect3);
                player.addStatusEffect(effect4);
                player.addStatusEffect(effect5);

                PlayerSpecialAbilities.givePhoenixEffect(world, player);
                PlayerSpecialAbilities.giveCuringEffect(world, player);
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(Text.translatable("item.more_gems.crown_gem.tip1").formatted(Formatting.GREEN));
    }
}
