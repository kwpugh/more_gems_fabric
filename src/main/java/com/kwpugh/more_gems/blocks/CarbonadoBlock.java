package com.kwpugh.more_gems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;

public class CarbonadoBlock extends Block implements BlockEntityProvider
{
	public CarbonadoBlock(Settings settings)
	{
		super(settings);
	}

	@Override
	public BlockEntity createBlockEntity(BlockView blockView)
	{
		return new CarbonadoBlockEntity();
	}
}