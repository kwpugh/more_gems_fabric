package com.kwpugh.more_gems.util;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;

public interface SheepShearCallback
{
    Event<SheepShearCallback> EVENT = EventFactory.createArrayBacked(SheepShearCallback.class,
        (listeners) -> (player, sheep) -> {
            for (SheepShearCallback listener : listeners) {
                ActionResult result = listener.interact(player, sheep);
                if(result != ActionResult.PASS) {
                    return result;
                }
            }
 
        return ActionResult.PASS;
    });
 
    ActionResult interact(PlayerEntity player, SheepEntity sheep);
}