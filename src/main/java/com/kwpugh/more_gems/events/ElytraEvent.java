package com.kwpugh.more_gems.events;

import com.kwpugh.more_gems.init.EnchantmentInit;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;

public class ElytraEvent
{
    public static void init()
    {
        EntityElytraEvents.CUSTOM.register((entity, tickElytra) -> {
            if(EnchantmentHelper.getLevel(EnchantmentInit.GLIDING, entity.getEquippedStack(EquipmentSlot.CHEST)) > 0)
            {
                if (tickElytra)
                {
                    // Optionally consume some resources that are being used up in order to fly, for example damaging an item.
                    // Optionally perform other side effects of elytra flight, for example playing a sound.
                }
                // Allow entering/continuing elytra flight with this custom elytra
                return true;
            }
            // Condition for the custom elytra is not met: don't let players enter or continue elytra flight (unless another elytra is available).
            return false;
        });
    }
}
