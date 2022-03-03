package com.kwpugh.more_gems.init;

import com.google.common.collect.Lists;
import com.kwpugh.more_gems.MoreGems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;

public class LootTableInit
{
	static float jujuChance = MoreGems.CONFIG.GENERAL.jujuChance;
	static float treasueBagChance = MoreGems.CONFIG.GENERAL.treasureBagChance;
	static float coalDropGems = MoreGems.CONFIG.ORES.coalDropGemsChance;
	static float deepslateCoalDropGems = MoreGems.CONFIG.ORES.deepslateCoalDropGemsChance;
	static boolean enableCoalGemDrops = MoreGems.CONFIG.ORES.enableCoalGemDrops;

	private static final List<LootTableInsert> INSERTS = Lists.newArrayList();

	public static void registerLoot()
	{
		if(enableCoalGemDrops)
		{
			// Alternate way to get gem drops from vanilla ores
			FabricLootPoolBuilder CITRINE = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.CITRINE))
					.withCondition(RandomChanceLootCondition.builder(coalDropGems).build());

			insert(new LootTableInsert(CITRINE,
					new Identifier("minecraft", "blocks/coal_ore")
			));

			FabricLootPoolBuilder TOURMALINE = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.TOURMALINE))
					.withCondition(RandomChanceLootCondition.builder(coalDropGems).build());

			insert(new LootTableInsert(TOURMALINE,
					new Identifier("minecraft", "blocks/coal_ore")
			));

			FabricLootPoolBuilder KUNZITE = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.KUNZITE))
					.withCondition(RandomChanceLootCondition.builder(coalDropGems).build());

			insert(new LootTableInsert(KUNZITE,
					new Identifier("minecraft", "blocks/coal_ore")
			));

			FabricLootPoolBuilder TOPAZ = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.TOPAZ))
					.withCondition(RandomChanceLootCondition.builder(coalDropGems).build());

			insert(new LootTableInsert(TOPAZ,
					new Identifier("minecraft", "blocks/coal_ore")
			));

			FabricLootPoolBuilder ALEXANDRITE = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.ALEXANDRITE))
					.withCondition(RandomChanceLootCondition.builder(deepslateCoalDropGems).build());

			insert(new LootTableInsert(ALEXANDRITE,
					new Identifier("minecraft", "blocks/deepslate_coal_ore")
			));

			FabricLootPoolBuilder CORUNDUM = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.CORUNDUM))
					.withCondition(RandomChanceLootCondition.builder(deepslateCoalDropGems).build());

			insert(new LootTableInsert(CORUNDUM,
					new Identifier("minecraft", "blocks/deepslate_coal_ore")
			));

			FabricLootPoolBuilder SAPPHIRE = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.SAPPHIRE))
					.withCondition(RandomChanceLootCondition.builder(deepslateCoalDropGems).build());

			insert(new LootTableInsert(SAPPHIRE,
					new Identifier("minecraft", "blocks/deepslate_coal_ore")
			));

			FabricLootPoolBuilder SPINEL = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.SPINEL))
					.withCondition(RandomChanceLootCondition.builder(deepslateCoalDropGems).build());

			insert(new LootTableInsert(SPINEL,
					new Identifier("minecraft", "blocks/deepslate_coal_ore")
			));

			FabricLootPoolBuilder CARBONADO = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.CARBONADO))
					.withCondition(RandomChanceLootCondition.builder(deepslateCoalDropGems).build());

			insert(new LootTableInsert(CARBONADO,
					new Identifier("minecraft", "blocks/deepslate_coal_ore")
			));

			FabricLootPoolBuilder MOISSANITE = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(ItemInit.MOISSANITE))
					.withCondition(RandomChanceLootCondition.builder(deepslateCoalDropGems).build());

			insert(new LootTableInsert(MOISSANITE,
					new Identifier("minecraft", "blocks/deepslate_coal_ore")
			));
		}


		// Insert treasure bags into vanilla chests
		FabricLootPoolBuilder TREASURE_BAG = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.TREASURE_BAG))
				.withCondition(RandomChanceLootCondition.builder(treasueBagChance).build());

		insert(new LootTableInsert(TREASURE_BAG,
				new Identifier("minecraft", "chests/desert_pyramid"),
				new Identifier("minecraft", "chests/jungle_temple")
		));



		// Insert jujus into vanilla chests
		FabricLootPoolBuilder CITRINE_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.CITRINE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(CITRINE_JUJU,
				new Identifier("minecraft", "chests/desert_pyramid"),
				new Identifier("minecraft", "chests/abandoned_mineshaft"),
				new Identifier("minecraft", "gameplay/fishing/treasure")
		));

		FabricLootPoolBuilder TOURMALINE_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.TOURMALINE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(TOURMALINE_JUJU,
				new Identifier("minecraft", "chests/jungle_temple"),
				new Identifier("minecraft", "chests/underwater_ruin_big"),
				new Identifier("minecraft", "chests/underwater_ruin_small"),
				new Identifier("minecraft", "gameplay/fishing/treasure")
		));

		FabricLootPoolBuilder KUNZITE_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.KUNZITE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(KUNZITE_JUJU,
				new Identifier("minecraft", "chests/simple_dungeon"),
				new Identifier("minecraft", "chests/underwater_ruin_big"),
				new Identifier("minecraft", "chests/underwater_ruin_small"),
				new Identifier("minecraft", "gameplay/fishing/treasure")
		));

		FabricLootPoolBuilder TOPAZ_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.TOPAZ_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(TOPAZ_JUJU,
				new Identifier("minecraft", "chests/buried_treasure"),
				new Identifier("minecraft", "chests/stronghold_corridor"),
				new Identifier("minecraft", "chests/shipwreck_supply"),
				new Identifier("minecraft", "chests/shipwreck_map"),
				new Identifier("minecraft", "chests/shipwreck_treasure")
		));

		FabricLootPoolBuilder ALEXANDRITE_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.ALEXANDRITE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(ALEXANDRITE_JUJU,
				new Identifier("minecraft", "chests/buried_treasure"),
				new Identifier("minecraft", "chests/stronghold_library"),
				new Identifier("minecraft", "chests/shipwreck_supply"),
				new Identifier("minecraft", "chests/shipwreck_map"),
				new Identifier("minecraft", "chests/shipwreck_treasure")
		));

		FabricLootPoolBuilder CORUNDUM_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.CORUNDUM_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(CORUNDUM_JUJU,
				new Identifier("minecraft", "chests/nether_bridge"),
				new Identifier("minecraft", "chests/ruined_portal"),
				new Identifier("minecraft", "chests/buried_treasure")
		));

		FabricLootPoolBuilder SAPPHIRE_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.SAPPHIRE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(SAPPHIRE_JUJU,
				new Identifier("minecraft", "chests/nether_bridge"),
				new Identifier("minecraft", "chests/buried_treasure")
		));

		FabricLootPoolBuilder SPINEL_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.SPINEL_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(SPINEL_JUJU,
				new Identifier("minecraft", "chests/pillager_outpost"),
				new Identifier("minecraft", "chests/nether_bridge"),
				new Identifier("minecraft", "chests/bastion_treasure")
		));

		FabricLootPoolBuilder CARBONADO_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.CARBONADO_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(CARBONADO_JUJU,
				new Identifier("minecraft", "chests/end_city_treasure"),
				new Identifier("minecraft", "chests/nether_bridge"),
				new Identifier("minecraft", "chests/bastion_treasure")
		));

		FabricLootPoolBuilder MOISSANITE_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.MOISSANITE_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(MOISSANITE_JUJU,
				new Identifier("minecraft", "chests/bastion_treasure"),
				new Identifier("minecraft", "chests/bastion_bridge"),
				new Identifier("minecraft", "chests/bastion_hoglin_stable"),
				new Identifier("minecraft", "chests/bastion_other")
		));

		FabricLootPoolBuilder EMERALD_JUJU = FabricLootPoolBuilder.builder()
				.rolls(ConstantLootNumberProvider.create(1))
				.with(ItemEntry.builder(ItemInit.EMERALD_JUJU))
				.withCondition(RandomChanceLootCondition.builder(jujuChance).build());

		insert(new LootTableInsert(EMERALD_JUJU,
				new Identifier("minecraft", "chests/buried_treasure"),
				new Identifier("minecraft", "chests/stronghold_corridor"),
				new Identifier("minecraft", "chests/shipwreck_supply"),
				new Identifier("minecraft", "chests/shipwreck_map"),
				new Identifier("minecraft", "chests/shipwreck_treasure")
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
			supplier.pool(lootPool);
		}
	}
}