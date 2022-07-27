package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.TourmalineArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TourmalineArrowEntityRenderer extends ProjectileEntityRenderer<TourmalineArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/tourmaline_arrow.png");

    public TourmalineArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(TourmalineArrowEntity entity)
    {
        return TEXTURE;
    }
}