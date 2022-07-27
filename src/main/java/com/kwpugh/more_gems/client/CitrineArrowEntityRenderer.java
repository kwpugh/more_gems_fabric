package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.CitrineArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CitrineArrowEntityRenderer extends ProjectileEntityRenderer<CitrineArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/citrine_arrow.png");

    public CitrineArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(CitrineArrowEntity entity)
    {
        return TEXTURE;
    }
}