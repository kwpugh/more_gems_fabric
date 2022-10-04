package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.init.EnchantmentInit;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Box;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PersistentProjectileEntity.class)
public class PersistentProjectileEntityMixin
{
    @Inject(method = "tick", at = @At("TAIL"))
    private void moregemsGuidingTick(CallbackInfo ci)
    {
        PersistentProjectileEntity projectile = (PersistentProjectileEntity) (Object) this;
        if(projectile.getOwner() instanceof LivingEntity player)
        {
            ItemStack stack = player.getMainHandStack();

            if(EnchantmentHelper.getLevel(EnchantmentInit.GUIDING, stack) > 0)
            {
                if(!projectile.isOnGround() && projectile.isAlive())
                {
                    Box box = projectile.getBoundingBox().expand(MoreGems.CONFIG.GENERAL.guidingTargetArea);
                    LivingEntity target = projectile.world.getClosestEntity(LivingEntity.class,
                            TargetPredicate.DEFAULT,
                            null,
                            projectile.getX(),
                            projectile.getY(),
                            projectile.getZ(), box);

                    if(target != null && !target.isSpectator() && !(target == player) && target.isAlive())
                    {
                        if(projectile.age >= 5)
                        {
                            double x = target.getX() - projectile.getX();
                            double y = target.getEyeY() - projectile.getY();
                            double z = target.getZ() - projectile.getZ();
                            projectile.setVelocity(x, y, z, (float) projectile.getVelocity().length(), 0);
                        }
                    }
                }
            }
        }
    }
}