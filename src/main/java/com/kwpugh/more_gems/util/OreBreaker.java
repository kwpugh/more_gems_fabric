package com.kwpugh.more_gems.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OreBreaker
{
    public static void breakOtherOres(World world, BlockState state, BlockPos pos, int helperHoriz, int helperVertical)
    {
        Block savedBlocked = state.getBlock();

        Iterable<BlockPos> surroundingPos = BlockPos.iterateOutwards(pos, helperHoriz, helperVertical, helperHoriz);
        for(BlockPos currentPos : surroundingPos)
        {
            BlockState currentState = world.getBlockState(currentPos);
            Block currentBlock = currentState.getBlock();

            if(currentBlock instanceof OreBlock || currentBlock instanceof RedstoneOreBlock)
            {
                if(savedBlocked.equals(currentBlock))
                {
                    world.breakBlock(currentPos, true);
                }
            }
        }
    }
}
