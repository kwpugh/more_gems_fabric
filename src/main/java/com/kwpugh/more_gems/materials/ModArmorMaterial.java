package com.kwpugh.more_gems.materials;

import java.util.function.Supplier;

import com.kwpugh.more_gems.init.ContentInit;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

/*
 * Mohs Scale of Hardness
Diamond -10
Carbonado - 10
Ruby - 9
Sapphire - 9
Corundum - 9
Alexandrite - 8.5
Topaz - 8
Emerald - 7.5
Amethyst - 7
 */

public enum ModArmorMaterial implements ArmorMaterial
{
	AMETHYST("amethyst", 23, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
		return Ingredient.ofItems(ContentInit.AMETHYST);
		}),
	EMERALD("emerald_", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
		return Ingredient.ofItems(Items.EMERALD);
		}),
	TOPAZ("topaz", 26, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
		return Ingredient.ofItems(ContentInit.TOPAZ);
		}),
	ALEXANDRITE("alexandrite_", 28, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
		return Ingredient.ofItems(ContentInit.ALEXANDRITE);
		}),
	CORUNDUM("corundum", 30, new int[]{2, 5, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.25F, 0.0F, () -> {
		return Ingredient.ofItems(ContentInit.CORUNDUM);
		}),
	SAPPHIRE("sapphire", 30, new int[]{2, 5, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.25F, 0.0F, () -> {
		return Ingredient.ofItems(ContentInit.SAPPHIRE);
		}),
	RUBY("ruby_", 30, new int[]{2, 5, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> {
		return Ingredient.ofItems(ContentInit.RUBY);
		}),
	CARBONADO("carbonado", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.75F, 0.0F, () -> {
		return Ingredient.ofItems(ContentInit.CARBONADO);
		});

	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] protectionAmounts;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Lazy<Ingredient> repairIngredientSupplier;

	private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> supplier)
	{
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.protectionAmounts = protectionAmounts;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredientSupplier = new Lazy(supplier);
	}

	public int getDurability(EquipmentSlot slot)
	{
		return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
	}

	public int getProtectionAmount(EquipmentSlot slot)
	{
		return this.protectionAmounts[slot.getEntitySlotId()];
	}

	public int getEnchantability()
	{
		return this.enchantability;
	}

	public SoundEvent getEquipSound()
	{
		return this.equipSound;
	}

	public Ingredient getRepairIngredient()
	{
		return (Ingredient)this.repairIngredientSupplier.get();
	}

	@Environment(EnvType.CLIENT)
	public String getName()
	{
		return this.name;
	}

	public float getToughness()
	{
		return this.toughness;
	}

	public float getKnockbackResistance()
	{
		return this.knockbackResistance;
	}
}
