package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CarbonadoArmorMaterial implements ArmorMaterial
{
    private static int durabilityMultiplier = MoreGems.CONFIG.GENERAL.carbonadoDurabilityMultiplier;
    private static int enchantability = MoreGems.CONFIG.GENERAL.carbonadoArmorEnchantability;
    private static float toughness = MoreGems.CONFIG.GENERAL.carbonadoToughness;
    private static float knochback = MoreGems.CONFIG.GENERAL.carbonadoKnockbackResistance;

    private static int carbonadoHead = MoreGems.CONFIG.GENERAL.carbonadoHeadProtection;
    private static int carbonadoChest = MoreGems.CONFIG.GENERAL.carbonadoChestProtection;
    private static int carbonadoLeggings = MoreGems.CONFIG.GENERAL.carbonadoLeggingsProtection;
    private static int carbonadoBoots = MoreGems.CONFIG.GENERAL.carbonadoBootsProtection;

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{carbonadoHead, carbonadoLeggings, carbonadoChest, carbonadoBoots};

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
        return Ingredient.ofItems(ItemInit.CARBONADO);
    }

    @Override
    public String getName()
    {
        return "carbonado";
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