package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.SapphireArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SapphireArrowEntityRenderer extends ProjectileEntityRenderer<SapphireArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/sapphire_arrow.png");

    public SapphireArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(SapphireArrowEntity entity)
    {
        return TEXTURE;
    }
}