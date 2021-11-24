package com.kwpugh.more_gems.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public abstract class ServerPlayerEntityMixinBound
{
    // Also need dropItem mixin in PlayerEntityMixin for Bound enchantment
    @Inject(method="copyFrom", at = @At(value="RETURN"))
    public void moregemsCopyFrom(ServerPlayerEntity oldPlayer, boolean alive, CallbackInfo ci)
    {
        if(!alive)
        {
            ServerPlayerEntity currentPlayer = (ServerPlayerEntity) (Object) this;
            boolean ruleTest = currentPlayer.world.getGameRules().getBoolean(GameRules.KEEP_INVENTORY);

            if(!ruleTest && !oldPlayer.isSpectator())
            {
                currentPlayer.getInventory().clone(oldPlayer.getInventory());
            }
        }
    }
}
