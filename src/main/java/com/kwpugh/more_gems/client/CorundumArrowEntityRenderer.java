package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.CorundumArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CorundumArrowEntityRenderer extends ProjectileEntityRenderer<CorundumArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/corundum_arrow.png");

    public CorundumArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(CorundumArrowEntity entity)
    {
        return TEXTURE;
    }
}