package com.kwpugh.more_gems.blocks;

import java.util.Iterator;
import java.util.List;

import com.kwpugh.more_gems.init.BlockInit;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Tickable;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

//public class CarbonadoBlockEntity extends BlockEntity implements Tickable
//{	
//	public CarbonadoBlockEntity()
//	{
//		super(BlockInit.CARBONADO_BLOCK_ENTITY);
//	}
//   
//	@Override
//	public void tick()
//	{
//		if(!this.world.isClient && this.world.isReceivingRedstonePower(this.pos))
//		{
//			{
//				Box box = (new Box(this.pos)).expand(16.0D, 5.0D, 16.0D);
//				List<PlayerEntity> list = this.world.getNonSpectatingEntities(PlayerEntity.class, box);
//				Iterator var = list.iterator();
//
//				PlayerEntity targetPlayer;
//				
//				while(var.hasNext())
//				{
//					targetPlayer = (PlayerEntity)var.next();
//					giveRegenffect(world, targetPlayer, null, 20, 20.0F);
//					giveGreaterExtraHearts(world, targetPlayer, null);
//				}
//				
//				Box box2 = (new Box(this.pos)).expand(16.0D, 5.0D, 16.0D);
//				List<Entity> list2 = this.world.getNonSpectatingEntities(Entity.class, box);
//				Iterator var2 = list2.iterator();
//
//				
//				Entity targetEntity;
//				
//				while(var2.hasNext())
//				{
//					targetEntity = (Entity)var2.next();
//					if(targetEntity instanceof MobEntity)
//					{
//						targetEntity.remove();
//						this.world.spawnEntity(new ExperienceOrbEntity(world, this.pos.getX(), this.pos.getY(), this.pos.getZ(), 1));					
//					}
//				}
//			}
//		}
//	}
//	
//	//Increases the player's food level to max on tick update, based on inputs
//	public static void giveRegenffect(World world, PlayerEntity player, ItemStack itemstack, int newfoodlevel, float newsatlevel)
//	{
//		player.getHungerManager().setFoodLevel(newfoodlevel);
//		player.getHungerManager().setSaturationLevelClient(newsatlevel);
//    	return;
//	}
//	
//	//Faster increase of yellow hearts on tick update
//	public static void giveGreaterExtraHearts(World world, LivingEntity player, ItemStack itemstack)
//	{
//		float current = player.getAbsorptionAmount();
//		
//		if(player.getHealth() < 20 || current >= 20)
//		{
//			return;
//		}
//		
//		if(current >= 19)
//		{
//			if (player.age % 20 == 0)
//			{
//				player.setAbsorptionAmount(20);
//			} 
//			return;
//		}
//		if(current < 19)
//		{
//			if (player.age % 20 == 0)
//			{
//				player.setAbsorptionAmount(current + 1.0F);
//			} 
//			return;
//		}
//		
//    	return;
//	}	
//}
