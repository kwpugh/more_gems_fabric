package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class MoissaniteArmorMaterial implements ArmorMaterial
{
    private static int durabilityMultiplier = MoreGems.CONFIG.GENERAL.moissaniteDurabilityMultiplier;
    private static int enchantability = MoreGems.CONFIG.GENERAL.moissaniteArmorEnchantability;
    private static float toughness = MoreGems.CONFIG.GENERAL.moissaniteToughness;
    private static float knochback = MoreGems.CONFIG.GENERAL.moissaniteKnockbackResistance;

    private static int moissaniteHead = MoreGems.CONFIG.GENERAL.moissaniteHeadProtection;
    private static int moissaniteChest = MoreGems.CONFIG.GENERAL.moissaniteChestProtection;
    private static int moissaniteLeggings = MoreGems.CONFIG.GENERAL.moissaniteLeggingsProtection;
    private static int moissaniteBoots = MoreGems.CONFIG.GENERAL.moissaniteBootsProtection;

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{moissaniteHead, moissaniteLeggings, moissaniteChest, moissaniteBoots};

    @Override
    public int getDurability(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getEntitySlotId()] * durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot)
    {
        return PROTECTION_AMOUNT[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ItemInit.MOISSANITE);
    }

    @Override
    public String getName()
    {
        return "moissanite";
    }

    @Override
    public float getToughness()
    {
        return toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return knochback;
    }
}