package com.kwpugh.more_gems.util;

import com.kwpugh.more_gems.MoreGems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MiningHelper
{
    static int helperVertical = MoreGems.CONFIG.GENERAL.minngHelperVertical;
    static int helperHoriz = MoreGems.CONFIG.GENERAL.minerHelperHoriz;

    public static void breakOtherOres(World world, BlockState state, BlockPos pos)
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
