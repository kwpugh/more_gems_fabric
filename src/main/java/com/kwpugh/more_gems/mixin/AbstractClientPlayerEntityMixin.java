package com.kwpugh.more_gems.mixin;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.baseclasses.ModBow;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

/*
    Injects method same as vanilla bow
    that provides zoom effect when
    pulling the modded bow.
    Zoom multiplier can be set in config
 */
@Mixin(AbstractClientPlayerEntity.class)
public class AbstractClientPlayerEntityMixin
{
    @Inject(method = "getFovMultiplier", at = @At(value = "RETURN"), locals = LocalCapture.CAPTURE_FAILSOFT, cancellable = true)
    public void moregemsBowsZoom(CallbackInfoReturnable<Float> cir, float f)
    {
        AbstractClientPlayerEntity abstractPlayer = MinecraftClient.getInstance().player;

        if(abstractPlayer == null)
            return;
        if(abstractPlayer.getActiveItem() == null)
            return;

        ItemStack itemStack = abstractPlayer.getActiveItem();

        if(abstractPlayer.isUsingItem())
        {
            if(itemStack.getItem() instanceof ModBow)
            {
                int i = abstractPlayer.getItemUseTime();
                float g = (float)i / 20.0F;

                if (g > 1.0F)
                {
                    g = 1.0F;
                }
                else
                {
                    g *= g;
                }

                f *= 1.0F - g * MoreGems.CONFIG.GENERAL.bowZoomMultiplier;

                cir.setReturnValue(MathHelper.lerp(MinecraftClient.getInstance().options.getFovEffectScale().getValue().floatValue(), 1.0F, f));
            }
        }
    }
}
