package com.kwpugh.more_gems.events;

import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;

public class ModEvents
{
    public static void registerEvents()
    {
        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register(new AfterKilledOtherEntityEvent());
        BoundStackManager.init();
        ElytraEvent.register();
        ItemAttributeEvent.register();
        StupefyEntityManager.init();
        LootTableEvent.registerLoot();
    }
}
