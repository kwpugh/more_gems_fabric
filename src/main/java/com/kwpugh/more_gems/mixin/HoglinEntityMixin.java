package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Iterator;
import java.util.List;

@Mixin(HoglinEntity.class)
public abstract class HoglinEntityMixin
{
    public HoglinEntityMixin(EntityType<?> type, World world)
    {
        super();
    }

    @Inject(method = "mobTick", at = @At("HEAD"), cancellable = true)
    public void moregemsMobTick(CallbackInfo ci)
    {
        if(MoreGems.CONFIG.GENERAL.enableMoissaniteDocileHoglin)
        {
            HoglinEntity hoglin = (HoglinEntity) (Object) this;
            Box mobBox = (new Box(hoglin.getBlockPos())).expand(2, 2, 2);
            List<Entity> list = hoglin.world.getNonSpectatingEntities(Entity.class, mobBox);
            Iterator<Entity> iterator = list.iterator();
            Entity targetEntity;

            // Cycle through box looking for players with Moissanite Juju
            while(iterator.hasNext())
            {
                targetEntity = iterator.next();
                if(targetEntity instanceof PlayerEntity)
                {
                    PlayerEntity player = (PlayerEntity) targetEntity;
                    if(PlayerEquipUtil.hasItemInInventory(player, ItemInit.MOISSANITE_JUJU))
                    {
                        ci.cancel();
                    }
                }
            }
        }
    }
}