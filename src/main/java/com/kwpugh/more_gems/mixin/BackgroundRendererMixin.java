package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.init.EnchantmentInit;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin
{
    @Inject(at = @At("HEAD"), method = "applyFog", cancellable = true)
    private static void moregemsApplyFog(Camera camera, BackgroundRenderer.FogType fogType, float viewDistance, boolean thickFog, CallbackInfo ci)
    {
        Entity entity = camera.getFocusedEntity();

        if (entity instanceof ClientPlayerEntity)
        {
            if (EnchantmentHelper.getLevel(EnchantmentInit.LAVA_VIEW, ((ClientPlayerEntity) entity).getEquippedStack(EquipmentSlot.HEAD)) > 0)
            {
                ci.cancel();
            }
        }
    }
}
