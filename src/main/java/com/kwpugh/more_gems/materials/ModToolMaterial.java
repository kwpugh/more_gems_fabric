package com.kwpugh.more_gems.materials;

import java.util.function.Supplier;

import com.kwpugh.more_gems.init.ContentInit;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum ModToolMaterial implements ToolMaterial
{
	EMERALD(3, 725, 8.0F, 2.0F, 10, () -> {
		return Ingredient.ofItems(Items.EMERALD);
		}),
	RUBY(3, 960, 8.0F, 2.0F, 10, () -> {
		return Ingredient.ofItems(ContentInit.RUBY);
		}),
	SAPPHIRE(3, 1040, 8.0F, 2.0F, 10, () -> {
		return Ingredient.ofItems(ContentInit.SAPPHIRE);
		}),
	AMETHYST(3, 1290, 8.0F, 2.0F, 10, () -> {
	    return Ingredient.ofItems(ContentInit.AMETHYST);
		}),
	TOPAZ(3, 1360, 8.0F, 2.0F, 10, () -> {
	    return Ingredient.ofItems(ContentInit.TOPAZ);
	    }),
	CARBONADO(3, 1490, 8.0F, 3.0F, 15, () -> {
	    return Ingredient.ofItems(ContentInit.CARBONADO);
	    });

   private final int miningLevel;
   private final int itemDurability;
   private final float miningSpeed;
   private final float attackDamage;
   private final int enchantability;
   private final Lazy<Ingredient> repairIngredient;

   private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantibility, Supplier<Ingredient> repairIngredient)
   {
      this.miningLevel = miningLevel;
      this.itemDurability = itemDurability;
      this.miningSpeed = miningSpeed;
      this.attackDamage = attackDamage;
      this.enchantability = enchantibility;
      this.repairIngredient = new Lazy(repairIngredient);
   }

   public int getDurability()
   {
      return this.itemDurability;
   }

   public float getMiningSpeedMultiplier()
   {
      return this.miningSpeed;
   }

   public float getAttackDamage()
   {
      return this.attackDamage;
   }

   public int getMiningLevel()
   {
      return this.miningLevel;
   }

   public int getEnchantability()
   {
      return this.enchantability;
   }

   public Ingredient getRepairIngredient()
   {
      return (Ingredient)this.repairIngredient.get();
   }
}
