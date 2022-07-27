package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.TopazArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TopazArrowEntityRenderer extends ProjectileEntityRenderer<TopazArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/topaz_arrow.png");

    public TopazArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(TopazArrowEntity entity)
    {
        return TEXTURE;
    }
}