package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.items.arrows.entities.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registries;
import net.minecraft.util.registry.Registry;

public class EntityInit
{
    public static EntityType<CitrineArrowEntity> CITRINE_ARROW;
    public static EntityType<TourmalineArrowEntity> TOURMALINE_ARROW;
    public static EntityType<KunziteArrowEntity> KUNZITE_ARROW;
    public static EntityType<TopazArrowEntity> TOPAZ_ARROW;
    public static EntityType<AlexandriteArrowEntity> ALEXANDRITE_ARROW;
    public static EntityType<CorundumArrowEntity> CORUNDUM_ARROW;
    public static EntityType<SapphireArrowEntity> SAPPHIRE_ARROW;
    public static EntityType<SpinelArrowEntity> SPINEL_ARROW;
    public static EntityType<CarbonadoArrowEntity> CARBONADO_ARROW;
    public static EntityType<MoissaniteArrowEntity> MOISSANITE_ARROW;


    public static void registerEntities()
    {
        CITRINE_ARROW = register("citrine_arrow", createArrowEntityType(CitrineArrowEntity::new));
        TOURMALINE_ARROW = register("tourmaline_arrow", createArrowEntityType(TourmalineArrowEntity::new));
        KUNZITE_ARROW = register("kunzite_arrow", createArrowEntityType(KunziteArrowEntity::new));
        TOPAZ_ARROW = register("topaz_arrow", createArrowEntityType(TopazArrowEntity::new));
        ALEXANDRITE_ARROW = register("alexandrite_arrow", createArrowEntityType(AlexandriteArrowEntity::new));
        CORUNDUM_ARROW = register("corundum_arrow", createArrowEntityType(CorundumArrowEntity::new));
        SAPPHIRE_ARROW = register("sapphire_arrow", createArrowEntityType(SapphireArrowEntity::new));
        SPINEL_ARROW = register("spinel_arrow", createArrowEntityType(SpinelArrowEntity::new));
        CARBONADO_ARROW = register("carbonado_arrow", createArrowEntityType(CarbonadoArrowEntity::new));
        MOISSANITE_ARROW = register("moissanite_arrow", createArrowEntityType(MoissaniteArrowEntity::new));
    }

    private static <T extends Entity> EntityType<T> register(String s, EntityType<T> entityType)
    {
        return Registry.register(Registries.ENTITY_TYPE, MoreGems.MOD_ID + ":" + s, entityType);
    }

    private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory)
    {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();
    }
}