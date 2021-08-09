package com.kwpugh.more_gems.mixin;

import java.util.Map;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.kwpugh.more_gems.init.EnchantmentInit;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

/*
    Just a demo for showing ZestyBlaze
 */

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixinTick extends LivingEntity
{
    protected PlayerEntityMixinTick(EntityType<? extends LivingEntity> entityType_1, World world_1)
    {
        super(entityType_1, world_1);
    }

    @Inject(method = "tick", at = @At(value = "HEAD"))
    private void zenchantTick(CallbackInfo ci)
    {
        PlayerEntity self = ((PlayerEntity) (Object) this);
        Item item = self.getMainHandStack().getItem();
        ItemStack stack = self.getMainHandStack();

        Map<Enchantment, Integer> enchantments = EnchantmentHelper.get(self.getMainHandStack());

        if (enchantments.containsKey(EnchantmentInit.QUICKENING) && item instanceof SwordItem)
        {
            int level = (EnchantmentHelper.getLevel(EnchantmentInit.QUICKENING, stack));

            StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.STRENGTH, 150, level, false, false);
            self.addStatusEffect(effect);
        }
    }
}