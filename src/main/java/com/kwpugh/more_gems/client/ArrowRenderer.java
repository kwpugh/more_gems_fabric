package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.init.EntityInit;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ArrowRenderer
{
    public static void register()
    {
        EntityRendererRegistry.register(EntityInit.CITRINE_ARROW, CitrineArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.TOURMALINE_ARROW, TourmalineArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.KUNZITE_ARROW, KunziteArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.TOPAZ_ARROW, TopazArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.ALEXANDRITE_ARROW, AlexandriteArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.CORUNDUM_ARROW, CorundumArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.SAPPHIRE_ARROW, SapphireArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.SPINEL_ARROW, SpinelArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.CARBONADO_ARROW, CarbonadoArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.MOISSANITE_ARROW, MoissaniteArrowEntityRenderer::new);
    }
}
