package com.kwpugh.more_gems.events;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import net.fabricmc.fabric.api.item.v1.ModifyItemAttributeModifiersCallback;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;

public class ItemAttributeEvent
{
    public static void register()
    {
        ModifyItemAttributeModifiersCallback.EVENT.register((stack, slot, attributeModifiers) -> {
            if(slot == EquipmentSlot.CHEST)
            {
                int i = EnchantmentHelper.getLevel(EnchantmentInit.STOUT, stack);

                if(i > 0)
                {
                    EntityAttributeModifier modifierHealth =
                            new EntityAttributeModifier("More-Gems-Stout-Health",
                                    MoreGems.CONFIG.GENERAL.stoutHealthModifier * i, EntityAttributeModifier.Operation.ADDITION);
                    EntityAttributeModifier modifierArmor =
                            new EntityAttributeModifier("More-Gems-Stout-Armor",
                                    MoreGems.CONFIG.GENERAL.stoutArmorModifier * i, EntityAttributeModifier.Operation.ADDITION);

                    stack.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, modifierHealth, slot);
                    stack.addAttributeModifier(EntityAttributes.GENERIC_ARMOR, modifierArmor, slot);
                }
            }
        });
    }
}
