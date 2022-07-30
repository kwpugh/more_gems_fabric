package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

/*
 * Needed to produce client side animation of bow pulling with arrow 
 */

public class BowModelPredicates
{
    public static void register()
    {
      ModelPredicateProviderRegistry.register(ItemInit.MOISSANITE_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.MOISSANITE_BOW, new Identifier("pulling"),
              (stack, world, entity, i) ->
              {
                return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
              });



      ModelPredicateProviderRegistry.register(ItemInit.CARBONADO_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.CARBONADO_BOW, new Identifier("pulling"),
          (stack, world, entity, i) ->
          {
            return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
          });



      ModelPredicateProviderRegistry.register(ItemInit.SPINEL_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.SPINEL_BOW, new Identifier("pulling"),
        (stack, world, entity, i) ->
      {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
      });



      ModelPredicateProviderRegistry.register(ItemInit.SAPPHIRE_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.SAPPHIRE_BOW, new Identifier("pulling"),
        (stack, world, entity, i) ->
      {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
      });



      ModelPredicateProviderRegistry.register(ItemInit.CORUNDUM_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.CORUNDUM_BOW, new Identifier("pulling"),
        (stack, world, entity, i) ->
      {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
      });



      ModelPredicateProviderRegistry.register(ItemInit.ALEXANDRITE_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.ALEXANDRITE_BOW, new Identifier("pulling"),
        (stack, world, entity,i ) ->
      {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
      });



      ModelPredicateProviderRegistry.register(ItemInit.TOPAZ_BOW, new Identifier("pull"), (stack, world, entity,i ) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.TOPAZ_BOW, new Identifier("pulling"),
        (stack, world, entity, i) ->
      {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
      });



      ModelPredicateProviderRegistry.register(ItemInit.KUNZITE_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.KUNZITE_BOW, new Identifier("pulling"),
        (stack, world, entity, i) ->
      {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
      });



      ModelPredicateProviderRegistry.register(ItemInit.TOURMALINE_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.TOURMALINE_BOW, new Identifier("pulling"),
        (stack, world, entity, i) ->
      {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
      });



      ModelPredicateProviderRegistry.register(ItemInit.CITRINE_BOW, new Identifier("pull"), (stack, world, entity, i) ->
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

      ModelPredicateProviderRegistry.register(ItemInit.CITRINE_BOW, new Identifier("pulling"),
        (stack, world, entity, i) ->
      {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
      });
    }
}