package com.kwpugh.more_gems.materials;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TopazArmorMaterial implements ArmorMaterial
{
    private static int durabilityMultiplier = MoreGems.CONFIG.GENERAL.topazDurabilityMultiplier;
    private static int enchantability = MoreGems.CONFIG.GENERAL.topazArmorEnchantability;
    private static float toughness = MoreGems.CONFIG.GENERAL.topazToughness;
    private static float knochback = MoreGems.CONFIG.GENERAL.topazKnockbackResistance;

    private static int topazHead = MoreGems.CONFIG.GENERAL.topazHeadProtection;
    private static int topazChest = MoreGems.CONFIG.GENERAL.topazChestProtection;
    private static int topazLeggings = MoreGems.CONFIG.GENERAL.topazLeggingsProtection;
    private static int topazBoots = MoreGems.CONFIG.GENERAL.topazBootsProtection;

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{topazHead, topazLeggings, topazChest, topazBoots};

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
        return Ingredient.ofItems(ItemInit.TOPAZ);
    }

    @Override
    public String getName()
    {
        return "topaz";
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
