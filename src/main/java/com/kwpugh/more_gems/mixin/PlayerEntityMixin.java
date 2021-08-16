package com.kwpugh.more_gems.mixin;

import java.util.Map;

import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.kwpugh.more_gems.init.EnchantmentInit;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity
{
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType_1, World world_1)
    {
        super(entityType_1, world_1);
    }

    @Inject(method = "attack", at = @At(value = "HEAD"))
    private void attackQuickening(Entity target_1, CallbackInfo ci)
    {
        PlayerEntity self = ((PlayerEntity) (Object) this);

        Map<Enchantment, Integer> enchantments = EnchantmentHelper.get(self.getMainHandStack());

        if (enchantments.containsKey(EnchantmentInit.QUICKENING))
        {
            PlayerSpecialAbilities.giveQuickening(world, self, target_1);
        }
    }

    @Inject(at = @At(value="HEAD"), method = "damage", cancellable = true)
    private void damageVoidEscape(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir)
    {
        PlayerEntity self = (PlayerEntity) (Object) this;

        if(EnchantmentHelper.getLevel(EnchantmentInit.VOID_ESCAPE, self.getEquippedStack(EquipmentSlot.FEET)) > 0)
        {
            self.fallDistance = 0.0F;

            if(source.isOutOfWorld())
            {
                PlayerSpecialAbilities.giveVoidEscape(world, self);
                cir.setReturnValue(false);
            }
        }

    }
}