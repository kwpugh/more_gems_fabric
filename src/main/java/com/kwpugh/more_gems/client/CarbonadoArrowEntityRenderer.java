package com.kwpugh.more_gems.client;

import com.kwpugh.more_gems.items.arrows.entities.CarbonadoArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CarbonadoArrowEntityRenderer extends ProjectileEntityRenderer<CarbonadoArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("more_gems:textures/entity/carbonado_arrow.png");

    public CarbonadoArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(CarbonadoArrowEntity entity)
    {
        return TEXTURE;
    }
}