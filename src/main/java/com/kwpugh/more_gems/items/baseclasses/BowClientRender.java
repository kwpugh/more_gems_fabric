package com.kwpugh.more_gems.items.baseclasses;

import com.kwpugh.more_gems.init.ItemInit;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

/*
 * Needed to produce client side animation of bow pulling with arrow 
 */

@Environment(EnvType.CLIENT)
public class BowClientRender implements ClientModInitializer 
{
  @Override
  public void onInitializeClient() 
  {
    FabricModelPredicateProviderRegistry.register(ItemInit.CARBONADO_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
      if (entity == null) 
      {
        return 0.0F;
      } 
      else 
      {
        return entity.getActiveItem() != stack ? 0.0F
            : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
      }
    });
    
    FabricModelPredicateProviderRegistry.register(ItemInit.CARBONADO_BOW, new Identifier("pulling"),
        (stack, world, entity) -> 
    	{
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
        });
  
    
    
    FabricModelPredicateProviderRegistry.register(ItemInit.RUBY_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.RUBY_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });
    
    

    FabricModelPredicateProviderRegistry.register(ItemInit.SAPPHIRE_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.SAPPHIRE_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });
    
    
    
    FabricModelPredicateProviderRegistry.register(ItemInit.CORUNDUM_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.CORUNDUM_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });

  
    
    FabricModelPredicateProviderRegistry.register(ItemInit.ALEXANDRITE_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.ALEXANDRITE_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });

    
    
    FabricModelPredicateProviderRegistry.register(ItemInit.TOPAZ_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.TOPAZ_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });
    

        
    FabricModelPredicateProviderRegistry.register(ItemInit.EMERALD_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.EMERALD_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });
    
    
    
    FabricModelPredicateProviderRegistry.register(ItemInit.AMETHYST_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.AMETHYST_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });
    
    
    
    FabricModelPredicateProviderRegistry.register(ItemInit.TOURMALINE_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.TOURMALINE_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });   
    
    
    
    FabricModelPredicateProviderRegistry.register(ItemInit.CITRINE_BOW, new Identifier("pull"), (stack, world, entity) -> 
    {
    	if (entity == null) 
    {
      return 0.0F;
    } 
    else 
    {
      return entity.getActiveItem() != stack ? 0.0F
          : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
    }
    });
  
    FabricModelPredicateProviderRegistry.register(ItemInit.CITRINE_BOW, new Identifier("pulling"),
      (stack, world, entity) -> 
   	{
        return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });  
    
  }

}