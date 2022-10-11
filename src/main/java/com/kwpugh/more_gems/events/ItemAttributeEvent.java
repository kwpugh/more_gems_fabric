package com.kwpugh.more_gems.events;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import net.fabricmc.fabric.api.item.v1.ModifyItemAttributeModifiersCallback;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;

import java.util.UUID;

public class ItemAttributeEvent
{
    static String uuidString = "4b677ac0-497a-11ed-b878-0242ac120002";

    public static void register()
    {
        ModifyItemAttributeModifiersCallback.EVENT.register((stack, slot, attributeModifiers) -> {
            if(slot == EquipmentSlot.LEGS)  // legs
            {
                int i = EnchantmentHelper.getLevel(EnchantmentInit.STOUT, stack);
                if (i > 0)
                {
                    EntityAttributeModifier modifierToughness =
                            new EntityAttributeModifier(UUID.fromString(uuidString), "more-gems-stout-toughness",
                                    MoreGems.CONFIG.GENERAL.stoutToughnessModifier * i, EntityAttributeModifier.Operation.ADDITION);
                    EntityAttributeModifier modifierArmor =
                            new EntityAttributeModifier(UUID.fromString(uuidString),"more-gems-stout-armor",
                                    MoreGems.CONFIG.GENERAL.stoutArmorModifier * i, EntityAttributeModifier.Operation.ADDITION);
                    EntityAttributeModifier modifierHealth =
                            new EntityAttributeModifier(UUID.fromString(uuidString),"more-gems-stout-health",
                                    MoreGems.CONFIG.GENERAL.stoutHealthModifier * i, EntityAttributeModifier.Operation.ADDITION);

                    attributeModifiers.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, modifierToughness);
                    attributeModifiers.put(EntityAttributes.GENERIC_ARMOR, modifierArmor);
                    attributeModifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, modifierHealth);
                }
            }

            if(slot == EquipmentSlot.CHEST)  // chest
            {
                int j = EnchantmentHelper.getLevel(EnchantmentInit.MIGHT, stack);
                if (j > 0)
                {
                    EntityAttributeModifier modifierAttackDamage =
                            new EntityAttributeModifier(UUID.fromString(uuidString), "more-gems-might-attack",
                                    MoreGems.CONFIG.GENERAL.mightAttackDamageModifier * j, EntityAttributeModifier.Operation.ADDITION);
                    EntityAttributeModifier modifierKnockback =
                            new EntityAttributeModifier(UUID.fromString(uuidString), "more-gems-might-knockback",
                                    MoreGems.CONFIG.GENERAL.mightKnockbackModifier * j, EntityAttributeModifier.Operation.ADDITION);
                    EntityAttributeModifier modifierAttackSpeed =
                            new EntityAttributeModifier(UUID.fromString(uuidString), "more-gems-might-attack-speed",
                                    MoreGems.CONFIG.GENERAL.mightAttackSpeedModifier * j, EntityAttributeModifier.Operation.ADDITION);

                    attributeModifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, modifierAttackDamage);
                    attributeModifiers.put(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, modifierKnockback);
                    attributeModifiers.put(EntityAttributes.GENERIC_ATTACK_SPEED, modifierAttackSpeed);
                }
            }
        });
    }
}
