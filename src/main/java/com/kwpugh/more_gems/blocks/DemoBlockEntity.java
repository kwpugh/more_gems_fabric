package com.kwpugh.more_gems.blocks;

import com.kwpugh.more_gems.init.BlockInit;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.Tickable;

public class DemoBlockEntity extends BlockEntity implements Tickable
{
	   public DemoBlockEntity()
	   {
	      super(BlockInit.DEMO_BLOCK_ENTITY);
	      
	      System.out.println("Hello from DemoBlockEntity");  //debug message
	   }

	@Override
	public void tick()
	{
		System.out.println("tick");  // debug message
	} 
}
