package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.util.ClimbingUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixinClimbing extends Entity
{
    public LivingEntityMixinClimbing(EntityType<?> type, World world)
    {
        super(type, world);
    }

    @Inject(at = @At("RETURN"), method = "isClimbing", cancellable = true)
    public void moregemsClimbing(CallbackInfoReturnable<Boolean> cir)
    {
        if(!cir.getReturnValue())
        {
            LivingEntity livingEntity = (LivingEntity) (Object) this;
            boolean value = ClimbingUtil.canClimb(world, livingEntity);
            cir.setReturnValue(value);
        }
    }
}
