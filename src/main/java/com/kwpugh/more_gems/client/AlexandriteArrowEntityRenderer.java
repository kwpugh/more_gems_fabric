package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.AlexandriteArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class AlexandriteArrowEntityRenderer extends ProjectileEntityRenderer<AlexandriteArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/alexandrite_arrow.png");

    public AlexandriteArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(AlexandriteArrowEntity entity)
    {
        return TEXTURE;
    }
}