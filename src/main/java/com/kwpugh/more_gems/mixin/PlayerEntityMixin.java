package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.enchantments.bound.BoundStack;
import com.kwpugh.more_gems.enchantments.bound.BoundStackManager;
import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
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
    private void tickMagnetic(CallbackInfo ci)
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