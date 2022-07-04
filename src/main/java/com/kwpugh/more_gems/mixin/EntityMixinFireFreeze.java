package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import com.kwpugh.more_gems.init.ItemInit;
import com.kwpugh.more_gems.util.PlayerEquipUtil;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixinFireFreeze
{
    public EntityMixinFireFreeze(EntityType<?> type, World world)
    {
        super();
    }

    @Inject(method = "isFireImmune", at = @At("HEAD"), cancellable = true)
    public void moregemsIsFireImmune(CallbackInfoReturnable<Boolean> cir)
    {
        Entity entity = (Entity) (Object) this;

        if(entity instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) entity;

            if(MoreGems.CONFIG.GENERAL.enableJujuCrownNetheritePowers &&
                    PlayerEquipUtil.isWearingCrownNetherite(player))
            {
                cir.setReturnValue(true);
            }

            if(MoreGems.CONFIG.GENERAL.enableJujuCrownPowers &&
                    PlayerEquipUtil.isWearingCrown(player))
            {
                cir.setReturnValue(true);
            }

            if(PlayerEquipUtil.hasItemInInventory(player, ItemInit.TOPAZ_JUJU) ||
                    PlayerEquipUtil.hasItemInInventory(player, ItemInit.MOISSANITE_JUJU))
            {
                cir.setReturnValue(true);
            }
        }
    }

    // Prevent freezing damage from powdered snow and other sources
    @Inject(method = "setFrozenTicks", at = @At("HEAD"), cancellable = true)
    public void moregemsSetFrozenTicks(int frozenTicks, CallbackInfo ci)
    {
        Entity entity = (Entity) (Object) this;

        if(entity instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) entity;

            if (EnchantmentHelper.getLevel(EnchantmentInit.FREEZE_PROTECTION, player.getEquippedStack(EquipmentSlot.CHEST)) > 0)
            {
                ci.cancel();
            }
        }
    }
}