package com.kwpugh.more_gems.events;

import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;

public class AfterKilledOtherEntityEvent implements ServerEntityCombatEvents.AfterKilledOtherEntity
{
    @Override
    public void afterKilledOtherEntity(ServerWorld world, Entity entity, LivingEntity killedEntity)
    {
        if(!(entity instanceof LivingEntity)) return;

        if(entity instanceof PlayerEntity player)
        {
            Hand hand = player.getActiveHand();
            ItemStack stack = player.getStackInHand(hand);

            if(EnchantmentHelper.getLevel(EnchantmentInit.WISDOM, stack) > 0)
            {
                int level = EnchantmentHelper.getLevel(EnchantmentInit.WISDOM, stack);
                PlayerSpecialAbilities.giveWisdom(player, stack, level);
            }
        }
    }
}
