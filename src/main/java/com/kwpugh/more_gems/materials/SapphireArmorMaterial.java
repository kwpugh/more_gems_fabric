package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SapphireArmorMaterial implements ArmorMaterial
{
    private static int durabilityMultiplier = MoreGems.CONFIG.GENERAL.sapphireDurabilityMultiplier;
    private static int enchantability = MoreGems.CONFIG.GENERAL.sapphireArmorEnchantability;
    private static float toughness = MoreGems.CONFIG.GENERAL.sapphireToughness;
    private static float knochback = MoreGems.CONFIG.GENERAL.sapphireKnockbackResistance;

    private static int sapphireHead = MoreGems.CONFIG.GENERAL.sapphireHeadProtection;
    private static int sapphireChest = MoreGems.CONFIG.GENERAL.sapphireChestProtection;
    private static int sapphireLeggings = MoreGems.CONFIG.GENERAL.sapphireLeggingsProtection;
    private static int sapphireBoots = MoreGems.CONFIG.GENERAL.sapphireBootsProtection;

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{sapphireHead, sapphireLeggings, sapphireChest, sapphireBoots};

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
        return Ingredient.ofItems(ItemInit.SAPPHIRE);
    }

    @Override
    public String getName()
    {
        return "sapphire";
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