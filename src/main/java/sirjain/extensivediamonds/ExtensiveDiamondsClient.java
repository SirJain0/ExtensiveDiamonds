package sirjain.extensivediamonds;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import sirjain.extensivediamonds.registry.RegisterBlocks;
import sirjain.extensivediamonds.screen.GemChargerScreen;
import sirjain.extensivediamonds.screen.ModScreenHandlers;

public class ExtensiveDiamondsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // For gem charger
        HandledScreens.register(ModScreenHandlers.GEM_CHARGER_SCREEN_HANDLER, GemChargerScreen::new);

        // For gem charger's cutout
        BlockRenderLayerMap.INSTANCE.putBlock(RegisterBlocks.GEM_CHARGER, RenderLayer.getCutout());
    }
}
