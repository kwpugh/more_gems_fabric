package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class LootTableInit
{
	static float jujuChance = MoreGems.CONFIG.GENERAL.jujuChance;
	static float treasueBagChance = MoreGems.CONFIG.GENERAL.treasureBagChance;
    static float spinelArrowChance = MoreGems.CONFIG.GENERAL.spinelArrowLootChance;
    static float carbonadoArrowChance = MoreGems.CONFIG.GENERAL.carbonadoArrowLootChance;
    static float moissaniteArrowChance = MoreGems.CONFIG.GENERAL.moissaniteArrowLootChance;

	public static void registerLoot()
	{
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(id.equals(LootTables.VILLAGE_FLETCHER_CHEST))
            {
                LootPool SPINEL_ARROW = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.MOISSANITE_ARROW))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(spinelArrowChance).build())
                        .build();

                LootPool CARBONADO_ARROW = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.MOISSANITE_ARROW))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(carbonadoArrowChance).build())
                        .build();

                LootPool MOISSANITE_ARROW = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.MOISSANITE_ARROW))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(moissaniteArrowChance).build())
                        .build();

                tableBuilder.pool(SPINEL_ARROW);
                tableBuilder.pool(CARBONADO_ARROW);
                tableBuilder.pool(MOISSANITE_ARROW);
            }

            if(id.equals(LootTables.DESERT_PYRAMID_CHEST) ||
                    id.equals(LootTables.JUNGLE_TEMPLE_CHEST))
            {
                LootPool TREASURE_BAG = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.TREASURE_BAG))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(treasueBagChance).build())
                        .build();

                tableBuilder.pool(TREASURE_BAG);
            }

            if(id.equals(LootTables.DESERT_PYRAMID_CHEST) ||
                    id.equals(LootTables.ABANDONED_MINESHAFT_CHEST) ||
                    id.equals(LootTables.FISHING_TREASURE_GAMEPLAY))
            {
                LootPool CITRINE_JUJU = LootPool.builder()
                            .with(ItemEntry.builder(ItemInit.CITRINE_JUJU))
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                            .build();

                    tableBuilder.pool(CITRINE_JUJU);
            }

            if(id.equals(LootTables.JUNGLE_TEMPLE_CHEST) ||
                    id.equals(LootTables.UNDERWATER_RUIN_BIG_CHEST) ||
                    id.equals(LootTables.UNDERWATER_RUIN_SMALL_CHEST) ||
                    id.equals(LootTables.FISHING_TREASURE_GAMEPLAY))
            {
                LootPool TOURMALINE_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.TOURMALINE_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(TOURMALINE_JUJU);
            }

            if(id.equals(LootTables.SIMPLE_DUNGEON_CHEST) ||
                    id.equals(LootTables.UNDERWATER_RUIN_BIG_CHEST) ||
                    id.equals(LootTables.UNDERWATER_RUIN_SMALL_CHEST) ||
                    id.equals(LootTables.FISHING_TREASURE_GAMEPLAY))
            {
                LootPool KUNZITE_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.KUNZITE_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(KUNZITE_JUJU);
            }

            if(id.equals(LootTables.BURIED_TREASURE_CHEST) ||
                    id.equals(LootTables.STRONGHOLD_CORRIDOR_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_SUPPLY_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_MAP_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_TREASURE_CHEST))
            {
                LootPool TOPAZ_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.TOPAZ_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(TOPAZ_JUJU);
            }

            if(id.equals(LootTables.BURIED_TREASURE_CHEST) ||
                    id.equals(LootTables.STRONGHOLD_LIBRARY_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_SUPPLY_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_MAP_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_TREASURE_CHEST))
            {
                LootPool ALEXANDRITE_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.ALEXANDRITE_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(ALEXANDRITE_JUJU);
            }

            if(id.equals(LootTables.NETHER_BRIDGE_CHEST) ||
                    id.equals(LootTables.RUINED_PORTAL_CHEST) ||
                    id.equals(LootTables.BURIED_TREASURE_CHEST))
            {
                LootPool CORUNDUM_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.CORUNDUM_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(CORUNDUM_JUJU);
            }

            if(id.equals(LootTables.NETHER_BRIDGE_CHEST) ||
                    id.equals(LootTables.BURIED_TREASURE_CHEST))
            {
                LootPool SAPPHIRE_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.SAPPHIRE_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(SAPPHIRE_JUJU);
            }

            if(id.equals(LootTables.PILLAGER_OUTPOST_CHEST) ||
                    id.equals(LootTables.NETHER_BRIDGE_CHEST) ||
                    id.equals(LootTables.BASTION_TREASURE_CHEST))
            {
                LootPool SPINEL_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.SPINEL_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(SPINEL_JUJU);
            }

            if(id.equals(LootTables.END_CITY_TREASURE_CHEST) ||
                    id.equals(LootTables.NETHER_BRIDGE_CHEST) ||
                    id.equals(LootTables.BASTION_TREASURE_CHEST))
            {
                LootPool CARBONADO_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.CARBONADO_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(CARBONADO_JUJU);
            }

            if(id.equals(LootTables.BASTION_TREASURE_CHEST) ||
                    id.equals(LootTables.BASTION_BRIDGE_CHEST) ||
                    id.equals(LootTables.BASTION_HOGLIN_STABLE_CHEST) ||
                    id.equals(LootTables.BASTION_OTHER_CHEST))
            {
                LootPool MOISSANITE_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.MOISSANITE_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(MOISSANITE_JUJU);
            }

            if(id.equals(LootTables.STRONGHOLD_CORRIDOR_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_SUPPLY_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_MAP_CHEST) ||
                    id.equals(LootTables.SHIPWRECK_TREASURE_CHEST) ||
                    id.equals(LootTables.BURIED_TREASURE_CHEST))
            {
                LootPool EMERALD_JUJU = LootPool.builder()
                        .with(ItemEntry.builder(ItemInit.EMERALD_JUJU))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(jujuChance).build())
                        .build();

                tableBuilder.pool(EMERALD_JUJU);
            }
        });
    }
}