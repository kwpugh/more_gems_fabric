package com.kwpugh.more_gems.materials;

import java.util.function.Supplier;

import com.kwpugh.more_gems.init.ContentInit;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

/*
 * Mohs Scale of Hardness
Diamond -10 (1561)
Carbonado - 10 (1561)
Ruby - 9 (1404)
Sapphire - 9 (1404)
Corundum - 9 (1404)
Alexandrite - 8.5 (1326)
Topaz - 8 (1248)
Emerald - 7.5 (1170)
Amethyst - 7 (1092)
 */

public enum ModToolMaterial implements ToolMaterial
{
	AMETHYST(2, 1092, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ContentInit.AMETHYST);
		}),
	EMERALD(2, 1170, 6.0F, 2.0F, 14, () -> {
		return Ingredient.ofItems(Items.EMERALD);
		}),
	TOPAZ(2, 1248, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ContentInit.TOPAZ);
	    }),
	ALEXANDRITE(2, 1326, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ContentInit.ALEXANDRITE);
	    }),
	CORUNDUM(3, 1404, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ContentInit.CORUNDUM);
    	}),
	SAPPHIRE(3, 1404, 6.0F, 2.0F, 14, () -> {
		return Ingredient.ofItems(ContentInit.SAPPHIRE);
		}),
	RUBY(3, 1404, 6.0F, 2.0F, 14, () -> {
		return Ingredient.ofItems(ContentInit.RUBY);
		}),
	CARBONADO(3, 1561, 8.0F, 3.0F, 10, () -> {
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
