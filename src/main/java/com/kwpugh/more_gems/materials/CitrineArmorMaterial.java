package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CitrineArmorMaterial implements ArmorMaterial
{
    private static int durabilityMultiplier = MoreGems.CONFIG.GENERAL.citrineDurabilityMultiplier;
    private static int enchantability = MoreGems.CONFIG.GENERAL.citrineArmorEnchantability;
    private static float toughness = MoreGems.CONFIG.GENERAL.citrineToughness;
    private static float knochback = MoreGems.CONFIG.GENERAL.citrineKnockbackResistance;

    private static int citrineHead = MoreGems.CONFIG.GENERAL.citrineHeadProtection;
    private static int citrineChest = MoreGems.CONFIG.GENERAL.citrineChestProtection;
    private static int citrineLeggings = MoreGems.CONFIG.GENERAL.citrineLeggingsProtection;
    private static int citrineBoots = MoreGems.CONFIG.GENERAL.citrineBootsProtection;

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{citrineHead, citrineLeggings, citrineChest, citrineBoots};

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
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ItemInit.CITRINE);
    }

    @Override
    public String getName()
    {
        return "citrine";
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

