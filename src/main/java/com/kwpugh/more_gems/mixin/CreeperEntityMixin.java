package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.init.EnchantmentInit;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperEntity.class)
public abstract class CreeperEntityMixin
{
    @Shadow private int currentFuseTime;
    @Shadow private int fuseTime;

    @Inject(at = @At("HEAD"), method = "tick", cancellable = true)
    public void gobberCreeperTick(CallbackInfo ci)
    {
        CreeperEntity self = (CreeperEntity) (Object) this;
        World world = self.getWorld();

        if(world.isClient()) return;

        LivingEntity target = self.getTarget();
        if(target instanceof PlayerEntity)
        {
            if(EnchantmentHelper.getLevel(EnchantmentInit.CREEPERLESS, target.getEquippedStack(EquipmentSlot.LEGS)) > 0)
            {
                this.currentFuseTime = 1;
            }
        }
    }
}
