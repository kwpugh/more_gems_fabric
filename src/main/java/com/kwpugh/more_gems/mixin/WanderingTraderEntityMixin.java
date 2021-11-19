package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WanderingTraderEntity.class)
public class WanderingTraderEntityMixin
{
    @Inject(method = "fillRecipes", at = @At("RETURN"))
    private void moregemsFillRecipes(CallbackInfo ci)
    {
        if(MoreGems.CONFIG.GENERAL.enableWanderingTrades)
        {
            TradeOfferList tradeOfferList = ((WanderingTraderEntity) (Object) this).getOffers();
            World world = ((WanderingTraderEntity) (Object) this).world;

            if (world.getRandom().nextDouble() < 0.5D)
            {
                tradeOfferList.add(new TradeOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ItemInit.TREASURE_BAG, 1), 4, 4, 0.5f));
            }
        }
    }
}
