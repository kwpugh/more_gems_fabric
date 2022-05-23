package com.kwpugh.more_gems;

import com.kwpugh.more_gems.init.ContainerInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class MoreGemsClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        HandledScreens.register(ContainerInit.GEMBAG_SCREEN_HANDLER, GenericContainerScreen::new);
    }
}