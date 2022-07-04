package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.RavagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.raid.RaiderEntity;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Iterator;
import java.util.List;

@Mixin(RavagerEntity.class)
public abstract class RavagerEntityMixin extends RaiderEntity
{
    @Shadow private int stunTick;

    protected RavagerEntityMixin (EntityType<? extends RaiderEntity> entityType, World world)
    {
        super(entityType, world);
    }


    @Inject(method = "tickMovement", at = @At("HEAD"), cancellable = true)
    public void tickMovement(CallbackInfo ci)
    {
        RavagerEntity ravager = (RavagerEntity) (Object) this;
        Box mobBox = (new Box(ravager.getBlockPos())).expand(4, 2, 4);
        List<Entity> list = ravager.world.getNonSpectatingEntities(Entity.class, mobBox);
        Iterator<Entity> iterator = list.iterator();
        Entity targetEntity;

        // Cycle through box looking for players with enchantment
        while(iterator.hasNext())
        {
            targetEntity = iterator.next();
            if(targetEntity instanceof PlayerEntity)
            {
                PlayerEntity player = (PlayerEntity) targetEntity;
                if (EnchantmentHelper.getLevel(EnchantmentInit.BENEVOLENCE, player.getEquippedStack(EquipmentSlot.LEGS)) > 0)
                {
                    this.stunTick++;
                    ci.cancel();
                }

                if(MoreGems.CONFIG.GENERAL.enableJujuCrownNetheritePowers &&
                        PlayerEquipUtil.isWearingCrownNetherite(player))
                {
                    ci.cancel();
                }

                if(MoreGems.CONFIG.GENERAL.enableJujuCrownPowers &&
                        PlayerEquipUtil.isWearingCrown(player))
                {
                    ci.cancel();
                }
            }
        }
    }
}