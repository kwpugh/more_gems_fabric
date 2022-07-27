package com.kwpugh.more_gems;

import com.kwpugh.more_gems.client.*;
import com.kwpugh.more_gems.init.ContainerInit;
import com.kwpugh.more_gems.init.EntityInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class MoreGemsClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        HandledScreens.register(ContainerInit.GEMBAG_SCREEN_HANDLER, GenericContainerScreen::new);
        ArrowRenderer.register();
    }
}