package com.kwpugh.more_gems.materials;

import java.util.function.Supplier;

import com.kwpugh.more_gems.init.ItemInit;

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
Tourmaline - 6 (936)
Citrine - 5.5 (858)
 */

public enum ModToolMaterial implements ToolMaterial
{	
	CITRINE(2, 825, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ItemInit.CITRINE);
		}),
	TOURMALINE(2, 936, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ItemInit.TOURMALINE);
		}),
	AMETHYST(2, 1092, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ItemInit.AMETHYST);
		}),
	EMERALD(2, 1170, 6.0F, 2.0F, 14, () -> {
		return Ingredient.ofItems(Items.EMERALD);
		}),
	TOPAZ(2, 1248, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ItemInit.TOPAZ);
	    }),
	ALEXANDRITE(2, 1326, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ItemInit.ALEXANDRITE);
	    }),
	CORUNDUM(3, 1404, 6.0F, 2.0F, 14, () -> {
	    return Ingredient.ofItems(ItemInit.CORUNDUM);
    	}),
	SAPPHIRE(3, 1404, 6.0F, 2.0F, 14, () -> {
		return Ingredient.ofItems(ItemInit.SAPPHIRE);
		}),
	RUBY(3, 1404, 6.0F, 2.0F, 14, () -> {
		return Ingredient.ofItems(ItemInit.RUBY);
		}),
	CARBONADO(3, 1561, 8.0F, 3.0F, 10, () -> {
	    return Ingredient.ofItems(ItemInit.CARBONADO);
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
      this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
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
