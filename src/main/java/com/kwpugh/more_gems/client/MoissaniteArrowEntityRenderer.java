package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.MoissaniteArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class MoissaniteArrowEntityRenderer extends ProjectileEntityRenderer<MoissaniteArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/moissanite_arrow.png");

    public MoissaniteArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(MoissaniteArrowEntity entity)
    {
        return TEXTURE;
    }
}