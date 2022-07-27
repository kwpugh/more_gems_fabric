package com.kwpugh.more_gems.blocks;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.config.MoreGemsConfig;
import com.kwpugh.more_gems.init.BlockInit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class BaseOreBlock extends OreBlock
{
    public static final MoreGemsConfig.Ores CONFIG = MoreGems.CONFIG.ORES;
    private int maxLevel;
    private int veinSize;
    private int chunkChance;
    private static String miningLevel;
    private static String spawnDim;

    public BaseOreBlock(FabricBlockSettings settings)
    {
        super(settings);
        this.settings.requiresTool();
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack, boolean dropExperience)
    {
        super.onStacksDropped(state, world, pos, stack, dropExperience);

        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0)
        {
            this.dropExperience(world, pos, 2);
        }
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext options)
    {
        oreTips(stack);

        tooltip.add(Text.translatable("item.more_gems.ore.tip1", maxLevel).formatted(Formatting.YELLOW));
        tooltip.add(Text.translatable("item.more_gems.ore.tip2", veinSize).formatted(Formatting.YELLOW));
        tooltip.add(Text.translatable("item.more_gems.ore.tip3", chunkChance).formatted(Formatting.YELLOW));
        tooltip.add(Text.translatable("item.more_gems.ore_dim.tip1", spawnDim).formatted(Formatting.GREEN));
        tooltip.add(Text.translatable("item.more_gems.ore_mining.tip1", miningLevel).formatted(Formatting.GREEN));
    }

    public void oreTips(ItemStack stack)
    {
        miningLevel = "Iron";
        spawnDim = "Overworld";

        if(stack.isOf(BlockInit.CITRINE_ORE.asItem()))
        {
            maxLevel = CONFIG.citrineMaxLevel;
            veinSize = CONFIG.citrineVeinSize;
            chunkChance = CONFIG.citrinePerChunk;
        }
        else if(stack.isOf(BlockInit.TOURMALINE_ORE.asItem()))
        {
            maxLevel = CONFIG.tourmalineMaxLevel;
            veinSize = CONFIG.tourmalineVeinSize;
            chunkChance = CONFIG.tourmalinePerChunk;
        }
        else if(stack.isOf(BlockInit.KUNZITE_ORE.asItem()))
        {
            maxLevel = CONFIG.kunziteMaxLevel;
            veinSize = CONFIG.kunziteVeinSize;
            chunkChance = CONFIG.kunzitePerChunk;
        }
        else if(stack.isOf(BlockInit.KUNZITE_ORE_NETHER.asItem()))
        {
            maxLevel = CONFIG.kunziteMaxLevelNether;
            veinSize = CONFIG.kunziteVeinSizeNether;
            chunkChance = CONFIG.kunzitePerChunkNether;
            spawnDim = "Nether";
        }
        else if(stack.isOf(BlockInit.TOPAZ_ORE.asItem()))
        {
            maxLevel = CONFIG.topazMaxLevel;
            veinSize = CONFIG.topazVeinSize;
            chunkChance = CONFIG.topazPerChunk;
        }
        else if(stack.isOf(BlockInit.ALEXANDRITE_ORE.asItem()))
        {
            maxLevel = CONFIG.alexandriteMaxLevel;
            veinSize = CONFIG.alexandriteVeinSize;
            chunkChance = CONFIG.alexandritePerChunk;
        }
        else if(stack.isOf(BlockInit.ALEXANDRITE_ORE_NETHER.asItem()))
        {
            maxLevel = CONFIG.alexandriteMaxLevelNether;
            veinSize = CONFIG.alexandriteVeinSizeNether;
            chunkChance = CONFIG.alexandritePerChunkNether;
            spawnDim = "Nether";
        }
        else if(stack.isOf(BlockInit.CORUNDUM_ORE.asItem()))
        {
            maxLevel = CONFIG.corundumMaxLevel;
            veinSize = CONFIG.corundumVeinSize;
            chunkChance = CONFIG.corundumPerChunk;
        }
        else if(stack.isOf(BlockInit.CORUNDUM_ORE_NETHER.asItem()))
        {
            maxLevel = CONFIG.corundumMaxLevelNether;
            veinSize = CONFIG.corundumVeinSizeNether;
            chunkChance = CONFIG.corundumPerChunkNether;
            spawnDim = "Nether";
        }
        else if(stack.isOf(BlockInit.SAPPHIRE_ORE.asItem()))
        {
            maxLevel = CONFIG.sapphireMaxLevel;
            veinSize = CONFIG.sapphireVeinSize;
            chunkChance = CONFIG.sapphirePerChunk;
        }
        else if(stack.isOf(BlockInit.SAPPHIRE_ORE_DEEPSLATE.asItem()))
        {
            maxLevel = CONFIG.sapphireMaxLevelDeepslate;
            veinSize = CONFIG.sapphireVeinSizeDeepslate;
            chunkChance = CONFIG.sapphirePerChunkDeepslate;
        }
        else if(stack.isOf(BlockInit.SPINEL_ORE.asItem()))
        {
            maxLevel = CONFIG.spinelMaxLevel;
            veinSize = CONFIG.spinelVeinSize;
            chunkChance = CONFIG.spinelPerChunk;
        }
        else if(stack.isOf(BlockInit.SPINEL_ORE_DEEPSLATE.asItem()))
        {
            maxLevel = CONFIG.spinelMaxLevelDeepslate;
            veinSize = CONFIG.spinelVeinSizeDeepslate;
            chunkChance = CONFIG.spinelPerChunkDeepslate;
        }
        else if(stack.isOf(BlockInit.CARBONADO_ORE.asItem()))
        {
            maxLevel = CONFIG.carbonadoMaxLevel;
            veinSize = CONFIG.carbonadoVeinSize;
            chunkChance = CONFIG.carbonadoPerChunk;
        }
        else if(stack.isOf(BlockInit.CARBONADO_ORE_DEEPSLATE.asItem()))
        {
            maxLevel = CONFIG.carbonadoMaxLevelDeepslate;
            veinSize = CONFIG.carbonadoVeinSizeDeepslate;
            chunkChance = CONFIG.carbonadoPerChunkDeepslate;
        }
        else if(stack.isOf(BlockInit.MOISSANITE_ORE.asItem()))
        {
            maxLevel = CONFIG.moissaniteMaxLevel;
            veinSize = CONFIG.moissaniteVeinSize;
            chunkChance = CONFIG.moissanitePerChunk;
            miningLevel = "Diamond";
            spawnDim = "Overworld";
        }
    }
}





