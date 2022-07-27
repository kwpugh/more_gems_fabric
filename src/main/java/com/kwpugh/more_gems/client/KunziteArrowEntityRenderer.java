package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.KunziteArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class KunziteArrowEntityRenderer extends ProjectileEntityRenderer<KunziteArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/kunzite_arrow.png");

    public KunziteArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(KunziteArrowEntity entity)
    {
        return TEXTURE;
    }
}