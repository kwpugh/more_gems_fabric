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
            if(slot == EquipmentSlot.LEGS)
            {
                int i = EnchantmentHelper.getLevel(EnchantmentInit.STOUT, stack);
                if (i > 0)
                {
                    EntityAttributeModifier modifierHealth =
                            new EntityAttributeModifier("More-Gems-Stout-Health",
                                    MoreGems.CONFIG.GENERAL.stoutHealthModifier * i, EntityAttributeModifier.Operation.ADDITION);
                    EntityAttributeModifier modifierArmor =
                            new EntityAttributeModifier("More-Gems-Stout-Armor",
                                    MoreGems.CONFIG.GENERAL.stoutArmorModifier * i, EntityAttributeModifier.Operation.ADDITION);

                    attributeModifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, modifierHealth);
                    attributeModifiers.put(EntityAttributes.GENERIC_ARMOR, modifierArmor);
                }
            }

            if(slot == EquipmentSlot.CHEST)
            {
                int j = EnchantmentHelper.getLevel(EnchantmentInit.MIGHT, stack);
                if (j > 0)
                {
                    EntityAttributeModifier modifierAttack =
                            new EntityAttributeModifier("More-Gems-Might-Attack",
                                    MoreGems.CONFIG.GENERAL.mightAttackModifier * j, EntityAttributeModifier.Operation.ADDITION);
                    EntityAttributeModifier modifierKnockback =
                            new EntityAttributeModifier("More-Gems-Might-Knockback",
                                    MoreGems.CONFIG.GENERAL.mightKnockbackModifier * j, EntityAttributeModifier.Operation.ADDITION);
                    EntityAttributeModifier modifierSpeed =
                            new EntityAttributeModifier("More-Gems-Might-Speed",
                                    MoreGems.CONFIG.GENERAL.mightSpeedModifier * j, EntityAttributeModifier.Operation.ADDITION);

                    attributeModifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, modifierAttack);
                    attributeModifiers.put(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, modifierKnockback);
                    attributeModifiers.put(EntityAttributes.GENERIC_ATTACK_SPEED, modifierSpeed);
                }
            }
        });
    }
}
