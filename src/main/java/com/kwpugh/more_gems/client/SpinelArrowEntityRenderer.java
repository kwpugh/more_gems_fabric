package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.SpinelArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SpinelArrowEntityRenderer extends ProjectileEntityRenderer<SpinelArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/spinel_arrow.png");

    public SpinelArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(SpinelArrowEntity entity)
    {
        return TEXTURE;
    }
}