package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.enchantments.bound.BoundStack;
import com.kwpugh.more_gems.enchantments.bound.BoundStackManager;
import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.util.EnableUtil;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity
{
    private int magneticRadius = MoreGems.CONFIG.GENERAL.attractingBaseHorizontalRadius;

    @Shadow protected abstract void dropInventory();

    public PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world)
    {
        super(entityType, world);
    }

    // Used for the Attracting enchantment
    @Inject(method = "tick", at = @At(value = "TAIL"))
    private void moregemsTick(CallbackInfo ci)
    {
        PlayerEntity self = ((PlayerEntity) (Object) this);

        if(!world.isClient && EnchantmentHelper.getLevel(EnchantmentInit.ATTRACTING, self.getEquippedStack(EquipmentSlot.MAINHAND)) > 0)
        {
            int level = EnchantmentHelper.getLevel(EnchantmentInit.ATTRACTING, self.getEquippedStack(EquipmentSlot.MAINHAND));

            // Scan and collect items
            List<ItemEntity> entityItems = self.getWorld().getEntitiesByClass(ItemEntity.class, self.getBoundingBox().expand(magneticRadius + level), EntityPredicates.VALID_ENTITY);
            for (ItemEntity entityItemNearby : entityItems)
            {
                entityItemNearby.onPlayerCollision(self);
            }

            // Scan and collect XP orbs
            List<ExperienceOrbEntity> entityXP = self.getWorld().getEntitiesByClass(ExperienceOrbEntity.class, self.getBoundingBox().expand(magneticRadius + level), EntityPredicates.VALID_ENTITY);
            for (Entity entityXPNearby : entityXP)
            {
                entityXPNearby.onPlayerCollision(self);
            }
        }

        if(!world.isClient && MoreGems.CONFIG.GENERAL.enableJujuInEnderchest)
        {
            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.CARBONADO_JUJU))
            {
                ItemStack stack = PlayerEquipUtil.getItemStackInEnder(self, ItemInit.CARBONADO_JUJU);

                if(EnableUtil.isEnabled(stack))
                {
                    StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 8, 0, false, false);
                    StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 8, 0, false, false);
                    {
                        self.addStatusEffect(effect);
                        self.addStatusEffect(effect2);
                    }
                }
            }

            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.CORUNDUM_JUJU))
            {
                ItemStack stack = PlayerEquipUtil.getItemStackInEnder(self, ItemInit.CORUNDUM_JUJU);

                if(EnableUtil.isEnabled(stack))
                {
                    StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.SLOW_FALLING, 8, 0, false, false);
                    {
                        self.addStatusEffect(effect);
                    }
                }
            }

            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.CITRINE_JUJU))
            {
                StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.HASTE, 8, 1, false, false);
                {
                    self.addStatusEffect(effect);
                }
            }

            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.EMERALD_JUJU))
            {
                StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 8, 0, false, false);
                {
                    self.addStatusEffect(effect);
                }
            }

            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.MOISSANITE_JUJU))
            {
                PlayerSpecialAbilities.givePhoenixEffect(world, self);
            }

            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.SAPPHIRE_JUJU))
            {
                StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.SATURATION, 8, 0, false, false);
                {
                    self.addStatusEffect(effect2);
                }
            }

            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.KUNZITE_JUJU))
            {
                ItemStack stack = PlayerEquipUtil.getItemStackInEnder(self, ItemInit.KUNZITE_JUJU);

                if(EnableUtil.isEnabled(stack))
                {
                    StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.SPEED, 8, 1, false, false);
                    {
                        self.addStatusEffect(effect);
                    }
                }
            }

            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.SPINEL_JUJU))
            {
                StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.STRENGTH, 8, 2, false, false);
                {
                    self.addStatusEffect(effect);
                }
            }

            if(PlayerEquipUtil.hasItemInEnder(self, ItemInit.TOURMALINE_JUJU))
            {
                ItemStack stack = PlayerEquipUtil.getItemStackInEnder(self, ItemInit.TOURMALINE_JUJU);

                if(EnableUtil.isEnabled(stack))
                {
                    StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.NIGHT_VISION, 8, 0, false, false);
                    {
                        self.addStatusEffect(effect);
                    }
                }
            }
        }
    }

    // Used for the Quickening enchantment
    @Inject(method = "attack", at = @At(value = "HEAD"))
    private void attackQuickening(Entity target, CallbackInfo ci)
    {
        PlayerEntity self = ((PlayerEntity) (Object) this);
        int level = EnchantmentHelper.getLevel(EnchantmentInit.QUICKENING, self.getEquippedStack(EquipmentSlot.MAINHAND));
        if(level > 0)
        {
            PlayerSpecialAbilities.giveQuickening(world, self, target, level);
        }
    }

    // Used for the Void Escape enchantment
    @Inject(method = "damage", at = @At(value="HEAD"), cancellable = true)
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

    // Used by Bound enchantment
    @Inject(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/ItemEntity;", at = @At("HEAD"), cancellable = true)
    private void moregemsDropItem(@NotNull ItemStack stack, boolean throwRandomly, boolean retainOwnership, CallbackInfoReturnable<ItemEntity> cir)
    {
        PlayerEntity currentPlayer = (PlayerEntity) (Object) this;
        World world = currentPlayer.world;

        if (!stack.isEmpty())
        {
            if((EnchantmentHelper.getLevel(EnchantmentInit.BOUND, stack) > 0) || MoreGems.CONFIG.GENERAL.boundReturnAll)
            {
                if(!world.isClient)
                {
                    BoundStack boundStack = new BoundStack(currentPlayer, stack);
                    BoundStackManager.addToList(boundStack);
                }
            }
        }
    }
}