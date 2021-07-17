package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class LivingEntityMixin
{
    @Shadow @Nullable protected PlayerEntity attackingPlayer;

    @Inject(at = @At("HEAD"), method = "onDeath", cancellable = true)
    private void onDeathWisdom(DamageSource source, CallbackInfo ci)
    {
        if(!(source.getAttacker() instanceof PlayerEntity)) return;

        Hand hand = attackingPlayer.getActiveHand();
        ItemStack stack = attackingPlayer.getStackInHand(hand);

        PlayerSpecialAbilities.giveWisdom(stack, attackingPlayer);
    }
}