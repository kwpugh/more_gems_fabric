package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
    Need for water breathing
 */

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixinBreathing extends Entity
{
    public LivingEntityMixinBreathing(EntityType<?> type, World world)
    {
        super(type, world);
    }

    @Inject(method = "canBreatheInWater", at = @At("HEAD"), cancellable = true)
    public void moregemsCanBreatheInWater(CallbackInfoReturnable<Boolean> cir)
    {
        LivingEntity livingEntity = (LivingEntity) (Object) this;

        if(livingEntity instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) livingEntity;

            if(PlayerEquipUtil.hasItemInInventory(player, ItemInit.ALEXANDRITE_JUJU))
            {
                cir.setReturnValue(true);
            }

            if(MoreGems.CONFIG.GENERAL.enableJujuCrownPowers &&
                    PlayerEquipUtil.isWearingCrown(player))
            {
                cir.setReturnValue(true);
            }
        }
    }
}