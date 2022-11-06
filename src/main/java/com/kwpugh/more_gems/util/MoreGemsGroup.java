package com.kwpugh.more_gems.util;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.BlockInit;
import com.kwpugh.more_gems.init.ContainerInit;
import com.kwpugh.more_gems.init.ItemInit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreGemsGroup
{
    public static void addGroup()
    {
        // force class run when we want
    }

    public static final ItemGroup MORE_GEMS_GROUP = new FabricItemGroup(new Identifier(MoreGems.MOD_ID,"more_gems_group"))
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.ALEXANDRITE);
        }

        @Override
        protected void addItems(FeatureSet enabledFeatures, Entries entries, boolean hasPermission)
        {
            entries.add(BlockInit.CITRINE_ORE);
            entries.add(BlockInit.TOURMALINE_ORE);
            entries.add(BlockInit.KUNZITE_ORE);
            entries.add(BlockInit.TOPAZ_ORE);
            entries.add(BlockInit.ALEXANDRITE_ORE);
            entries.add(BlockInit.CORUNDUM_ORE);
            entries.add(BlockInit.SAPPHIRE_ORE);
            entries.add(BlockInit.SPINEL_ORE);
            entries.add(BlockInit.CARBONADO_ORE);

            entries.add(BlockInit.SAPPHIRE_ORE_DEEPSLATE);
            entries.add(BlockInit.SPINEL_ORE_DEEPSLATE);
            entries.add(BlockInit.CARBONADO_ORE_DEEPSLATE);

            entries.add(BlockInit.KUNZITE_ORE_NETHER);
            entries.add(BlockInit.ALEXANDRITE_ORE_NETHER);
            entries.add(BlockInit.CORUNDUM_ORE_NETHER);
            entries.add(BlockInit.MOISSANITE_ORE);

            entries.add(BlockInit.CITRINE_BLOCK);
            entries.add(BlockInit.TOURMALINE_BLOCK);
            entries.add(BlockInit.KUNZITE_BLOCK);
            entries.add(BlockInit.TOPAZ_BLOCK);
            entries.add(BlockInit.ALEXANDRITE_BLOCK);
            entries.add(BlockInit.CORUNDUM_BLOCK);
            entries.add(BlockInit.SAPPHIRE_BLOCK);
            entries.add(BlockInit.SPINEL_BLOCK);
            entries.add(BlockInit.CARBONADO_BLOCK);
            entries.add(BlockInit.MOISSANITE_BLOCK);
            
            entries.add(ItemInit.CITRINE);
            entries.add(ItemInit.TOURMALINE);
            entries.add(ItemInit.KUNZITE);
            entries.add(ItemInit.TOPAZ);
            entries.add(ItemInit.ALEXANDRITE);
            entries.add(ItemInit.CORUNDUM);
            entries.add(ItemInit.SAPPHIRE);
            entries.add(ItemInit.SPINEL);
            entries.add(ItemInit.CARBONADO);
            entries.add(ItemInit.MOISSANITE);

            entries.add(ItemInit.CITRINE_SWORD);
            entries.add(ItemInit.CITRINE_PICKAXE);
            entries.add(ItemInit.CITRINE_AXE);
            entries.add(ItemInit.CITRINE_SHOVEL);
            entries.add(ItemInit.CITRINE_HOE);

            entries.add(ItemInit.TOURMALINE_SWORD);
            entries.add(ItemInit.TOURMALINE_PICKAXE);
            entries.add(ItemInit.TOURMALINE_AXE);
            entries.add(ItemInit.TOURMALINE_SHOVEL);
            entries.add(ItemInit.TOURMALINE_HOE);

            entries.add(ItemInit.KUNZITE_SWORD);
            entries.add(ItemInit.KUNZITE_PICKAXE);
            entries.add(ItemInit.KUNZITE_AXE);
            entries.add(ItemInit.KUNZITE_SHOVEL);
            entries.add(ItemInit.KUNZITE_HOE);

            entries.add(ItemInit.TOPAZ_SWORD);
            entries.add(ItemInit.TOPAZ_PICKAXE);
            entries.add(ItemInit.TOPAZ_AXE);
            entries.add(ItemInit.TOPAZ_SHOVEL);
            entries.add(ItemInit.TOPAZ_HOE);

            entries.add(ItemInit.ALEXANDRITE_SWORD);
            entries.add(ItemInit.ALEXANDRITE_PICKAXE);
            entries.add(ItemInit.ALEXANDRITE_AXE);
            entries.add(ItemInit.ALEXANDRITE_SHOVEL);
            entries.add(ItemInit.ALEXANDRITE_HOE);

            entries.add(ItemInit.CORUNDUM_SWORD);
            entries.add(ItemInit.CORUNDUM_PICKAXE);
            entries.add(ItemInit.CORUNDUM_AXE);
            entries.add(ItemInit.CORUNDUM_SHOVEL);
            entries.add(ItemInit.CORUNDUM_HOE);

            entries.add(ItemInit.SAPPHIRE_SWORD);
            entries.add(ItemInit.SAPPHIRE_PICKAXE);
            entries.add(ItemInit.SAPPHIRE_AXE);
            entries.add(ItemInit.SAPPHIRE_SHOVEL);
            entries.add(ItemInit.SAPPHIRE_HOE);

            entries.add(ItemInit.SPINEL_SWORD);
            entries.add(ItemInit.SPINEL_PICKAXE);
            entries.add(ItemInit.SPINEL_AXE);
            entries.add(ItemInit.SPINEL_SHOVEL);
            entries.add(ItemInit.SPINEL_HOE);

            entries.add(ItemInit.CARBONADO_SWORD);
            entries.add(ItemInit.CARBONADO_PICKAXE);
            entries.add(ItemInit.CARBONADO_AXE);
            entries.add(ItemInit.CARBONADO_SHOVEL);
            entries.add(ItemInit.CARBONADO_HOE);

            entries.add(ItemInit.MOISSANITE_SWORD);
            entries.add(ItemInit.MOISSANITE_PICKAXE);
            entries.add(ItemInit.MOISSANITE_AXE);
            entries.add(ItemInit.MOISSANITE_SHOVEL);
            entries.add(ItemInit.MOISSANITE_HOE);

            entries.add(ItemInit.CITRINE_BOW);
            entries.add(ItemInit.TOURMALINE_BOW);
            entries.add(ItemInit.KUNZITE_BOW);
            entries.add(ItemInit.TOPAZ_BOW);
            entries.add(ItemInit.ALEXANDRITE_BOW);
            entries.add(ItemInit.CORUNDUM_BOW);
            entries.add(ItemInit.SAPPHIRE_BOW);
            entries.add(ItemInit.SPINEL_BOW);
            entries.add(ItemInit.CARBONADO_BOW);
            entries.add(ItemInit.MOISSANITE_BOW);

            entries.add(ItemInit.CITRINE_ARROW);
            entries.add(ItemInit.TOURMALINE_ARROW);
            entries.add(ItemInit.KUNZITE_ARROW);
            entries.add(ItemInit.TOPAZ_ARROW);
            entries.add(ItemInit.ALEXANDRITE_ARROW);
            entries.add(ItemInit.CORUNDUM_ARROW);
            entries.add(ItemInit.SAPPHIRE_ARROW);
            entries.add(ItemInit.SPINEL_ARROW);
            entries.add(ItemInit.CARBONADO_ARROW);
            entries.add(ItemInit.MOISSANITE_ARROW);

            entries.add(ItemInit.CITRINE_HAMMER);
            entries.add(ItemInit.TOURMALINE_HAMMER);
            entries.add(ItemInit.KUNZITE_HAMMER);
            entries.add(ItemInit.TOPAZ_HAMMER);
            entries.add(ItemInit.ALEXANDRITE_HAMMER);
            entries.add(ItemInit.CORUNDUM_HAMMER);
            entries.add(ItemInit.SAPPHIRE_HAMMER);
            entries.add(ItemInit.SPINEL_HAMMER);
            entries.add(ItemInit.CARBONADO_HAMMER);
            entries.add(ItemInit.MOISSANITE_HAMMER);

            entries.add(ItemInit.CITRINE_EXCAVATOR);
            entries.add(ItemInit.TOURMALINE_EXCAVATOR);
            entries.add(ItemInit.KUNZITE_EXCAVATOR);
            entries.add(ItemInit.TOPAZ_EXCAVATOR);
            entries.add(ItemInit.ALEXANDRITE_EXCAVATOR);
            entries.add(ItemInit.CORUNDUM_EXCAVATOR);
            entries.add(ItemInit.SAPPHIRE_EXCAVATOR);
            entries.add(ItemInit.SPINEL_EXCAVATOR);
            entries.add(ItemInit.CARBONADO_EXCAVATOR);
            entries.add(ItemInit.MOISSANITE_EXCAVATOR);

            entries.add(ItemInit.CITRINE_PAXEL);
            entries.add(ItemInit.TOURMALINE_PAXEL);
            entries.add(ItemInit.KUNZITE_PAXEL);
            entries.add(ItemInit.TOPAZ_PAXEL);
            entries.add(ItemInit.ALEXANDRITE_PAXEL);
            entries.add(ItemInit.CORUNDUM_PAXEL);
            entries.add(ItemInit.SAPPHIRE_PAXEL);
            entries.add(ItemInit.SPINEL_PAXEL);
            entries.add(ItemInit.CARBONADO_PAXEL);
            entries.add(ItemInit.MOISSANITE_PAXEL);

            entries.add(ItemInit.CITRINE_HELMET);
            entries.add(ItemInit.CITRINE_CHESTPLATE);
            entries.add(ItemInit.CITRINE_LEGGINGS);
            entries.add(ItemInit.CITRINE_BOOTS);

            entries.add(ItemInit.TOURMALINE_HELMET);
            entries.add(ItemInit.TOURMALINE_CHESTPLATE);
            entries.add(ItemInit.TOURMALINE_LEGGINGS);
            entries.add(ItemInit.TOURMALINE_BOOTS);

            entries.add(ItemInit.KUNZITE_HELMET);
            entries.add(ItemInit.KUNZITE_CHESTPLATE);
            entries.add(ItemInit.KUNZITE_LEGGINGS);
            entries.add(ItemInit.KUNZITE_BOOTS);

            entries.add(ItemInit.TOPAZ_HELMET);
            entries.add(ItemInit.TOPAZ_CHESTPLATE);
            entries.add(ItemInit.TOPAZ_LEGGINGS);
            entries.add(ItemInit.TOPAZ_BOOTS);

            entries.add(ItemInit.ALEXANDRITE_HELMET);
            entries.add(ItemInit.ALEXANDRITE_CHESTPLATE);
            entries.add(ItemInit.ALEXANDRITE_LEGGINGS);
            entries.add(ItemInit.ALEXANDRITE_BOOTS);

            entries.add(ItemInit.CORUNDUM_HELMET);
            entries.add(ItemInit.CORUNDUM_CHESTPLATE);
            entries.add(ItemInit.CORUNDUM_LEGGINGS);
            entries.add(ItemInit.CORUNDUM_BOOTS);

            entries.add(ItemInit.SAPPHIRE_HELMET);
            entries.add(ItemInit.SAPPHIRE_CHESTPLATE);
            entries.add(ItemInit.SAPPHIRE_LEGGINGS);
            entries.add(ItemInit.SAPPHIRE_BOOTS);

            entries.add(ItemInit.SPINEL_HELMET);
            entries.add(ItemInit.SPINEL_CHESTPLATE);
            entries.add(ItemInit.SPINEL_LEGGINGS);
            entries.add(ItemInit.SPINEL_BOOTS);

            entries.add(ItemInit.CARBONADO_HELMET);
            entries.add(ItemInit.CARBONADO_CHESTPLATE);
            entries.add(ItemInit.CARBONADO_CHESTPLATE_GILDED);
            entries.add(ItemInit.CARBONADO_LEGGINGS);
            entries.add(ItemInit.CARBONADO_BOOTS);

            entries.add(ItemInit.MOISSANITE_HELMET);
            entries.add(ItemInit.MOISSANITE_CHESTPLATE);
            entries.add(ItemInit.MOISSANITE_LEGGINGS);
            entries.add(ItemInit.MOISSANITE_BOOTS);

            entries.add(ItemInit.CITRINE_JUJU);
            entries.add(ItemInit.TOURMALINE_JUJU);
            entries.add(ItemInit.KUNZITE_JUJU);
            entries.add(ItemInit.EMERALD_JUJU);
            entries.add(ItemInit.TOPAZ_JUJU);
            entries.add(ItemInit.ALEXANDRITE_JUJU);
            entries.add(ItemInit.CORUNDUM_JUJU);
            entries.add(ItemInit.SAPPHIRE_JUJU);
            entries.add(ItemInit.SPINEL_JUJU);
            entries.add(ItemInit.CARBONADO_JUJU);
            entries.add(ItemInit.MOISSANITE_JUJU);

            entries.add(ContainerInit.GEMBAG);

            entries.add(ItemInit.CROWN);
            entries.add(ItemInit.CROWN_GEM);
            entries.add(ItemInit.CROWN_NETHERITE_GEM);

            entries.add(ItemInit.SHARPENING_GEM);
            entries.add(ItemInit.SHARPENING_GEM_GREATER);
            entries.add(ItemInit.TREASURE_BAG);
        }
    };
}