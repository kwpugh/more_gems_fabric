package com.kwpugh.more_gems;


import com.kwpugh.more_gems.init.ContainerInit;
import com.kwpugh.more_gems.items.gembag.GembagClientScreen;
import com.kwpugh.more_gems.items.gembag.GembagScreenHandler;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.TranslatableText;

@Environment(EnvType.CLIENT)
public class MoreGemsClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
    	ScreenProviderRegistry.INSTANCE.<GembagScreenHandler>registerFactory(ContainerInit.GEMBAG_IDENTIFIER, (container -> new GembagClientScreen(container, MinecraftClient.getInstance().player.getInventory(), new TranslatableText(ContainerInit.GEMBAG_TRANSLATION_KEY))));
    }
}