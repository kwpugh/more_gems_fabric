package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CorundumArmorMaterial implements ArmorMaterial
{
    private static int durabilityMultiplier = MoreGems.CONFIG.GENERAL.corundumDurabilityMultiplier;
    private static int enchantability = MoreGems.CONFIG.GENERAL.corundumArmorEnchantability;
    private static float toughness = MoreGems.CONFIG.GENERAL.corundumToughness;
    private static float knochback = MoreGems.CONFIG.GENERAL.corundumKnockbackResistance;

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{2, 5, 7, 2};

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
        return Ingredient.ofItems(ItemInit.CORUNDUM);
    }

    @Override
    public String getName()
    {
        return "corundum";
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