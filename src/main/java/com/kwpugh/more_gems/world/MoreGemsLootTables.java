package com.kwpugh.more_gems.world;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.collect.Lists;
import com.kwpugh.more_gems.init.ItemInit;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class MoreGemsLootTables
{
	private static final List<LootTableInsert> INSERTS = Lists.newArrayList();


	public static void init()
	{
		FabricLootPoolBuilder CITRINE_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.CITRINE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(CITRINE_JUJU,
				new Identifier("minecraft", "chests/desert_pyramid"),
				new Identifier("minecraft", "chests/abandoned_mineshaft"),
				new Identifier("minecraft", "gameplay/fishing/treasure")
		));

		FabricLootPoolBuilder TOURMALINE_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.TOURMALINE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(TOURMALINE_JUJU,
				new Identifier("minecraft", "chests/jungle_temple"),
				new Identifier("minecraft", "chests/underwater_ruin_big"),
				new Identifier("minecraft", "chests/underwater_ruin_small"),
				new Identifier("minecraft", "gameplay/fishing/treasure")
		));
		
		FabricLootPoolBuilder AMETHYST_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.AMETHYST_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(AMETHYST_JUJU,
				new Identifier("minecraft", "chests/simple_dungeon"),
				new Identifier("minecraft", "chests/underwater_ruin_big"),
				new Identifier("minecraft", "chests/underwater_ruin_small"),
				new Identifier("minecraft", "gameplay/fishing/treasure")
		));
		
		FabricLootPoolBuilder EMERALD_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.EMERALD_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(EMERALD_JUJU,
				new Identifier("minecraft", "chests/igloo_chest"),
				new Identifier("minecraft", "chests/simple_dungeon"),
				new Identifier("minecraft", "chests/underwater_ruin_big"),
				new Identifier("minecraft", "chests/underwater_ruin_small"),
				new Identifier("minecraft", "gameplay/fishing/treasure")
		));
		
		FabricLootPoolBuilder TOPAZ_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.TOPAZ_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(TOPAZ_JUJU,
				new Identifier("minecraft", "chests/buried_treasure"),
				new Identifier("minecraft", "chests/stronghold_corridor"),
				new Identifier("minecraft", "chests/shipwreck_supply"),
				new Identifier("minecraft", "chests/shipwreck_map"),
				new Identifier("minecraft", "chests/shipwreck_treasure")
		));

		FabricLootPoolBuilder ALEXANDRITE_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.ALEXANDRITE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(ALEXANDRITE_JUJU,
				new Identifier("minecraft", "chests/buried_treasure"),
				new Identifier("minecraft", "chests/stronghold_library"),
				new Identifier("minecraft", "chests/shipwreck_supply"),
				new Identifier("minecraft", "chests/shipwreck_map"),
				new Identifier("minecraft", "chests/shipwreck_treasure")
		));
		
		FabricLootPoolBuilder CORUNDUM_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.CORUNDUM_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(CORUNDUM_JUJU,
				new Identifier("minecraft", "chests/nether_bridge"),
				new Identifier("minecraft", "chests/ruined_portal"),
				new Identifier("minecraft", "chests/buried_treasure")
		));
		
		FabricLootPoolBuilder SAPPHIRE_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.SAPPHIRE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(SAPPHIRE_JUJU,
				new Identifier("minecraft", "chests/nether_bridge"),
				new Identifier("minecraft", "chests/buried_treasure")
		));
		
		FabricLootPoolBuilder RUBY_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.RUBY_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(RUBY_JUJU,
				new Identifier("minecraft", "chests/pillager_outpost"),
				new Identifier("minecraft", "chests/nether_bridge"),
				new Identifier("minecraft", "chests/bastion_treasure")
		));
		
		FabricLootPoolBuilder CARBONADO_JUJU = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.CARBONADO_JUJU))
				.withCondition(RandomChanceLootCondition.builder(0.40F).build());

		insert(new LootTableInsert(CARBONADO_JUJU,
				new Identifier("minecraft", "chests/end_city_treasure"),
				new Identifier("minecraft", "chests/nether_bridge"),
				new Identifier("minecraft", "chests/bastion_treasure")
		));
		
		LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, identifier, supplier, lootTableSetter) -> {
			INSERTS.forEach(i->{
				if(ArrayUtils.contains(i.tables, identifier))
				{
					i.insert(supplier);
				}
			});
		}));
	}

	public static void insert(LootTableInsert insert)
	{
		INSERTS.add(insert);
	}

	public static class LootTableInsert
	{
		public final Identifier[] tables;
		public final FabricLootPoolBuilder lootPool;

		public LootTableInsert(FabricLootPoolBuilder lootPool, Identifier... tables)
		{
			this.tables = tables;
			this.lootPool = lootPool;
		}

		public void insert(FabricLootSupplierBuilder supplier)
		{
			supplier.withPool(lootPool);
		}
	}
}