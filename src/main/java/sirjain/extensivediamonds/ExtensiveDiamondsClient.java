package sirjain.extensivediamonds;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import sirjain.extensivediamonds.block.EDBlocks;
import sirjain.extensivediamonds.block.gem_charger.screen.GemChargerScreen;
import sirjain.extensivediamonds.block.gem_charger.screen.EDScreenHandlers;

public class ExtensiveDiamondsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		HandledScreens.register(EDScreenHandlers.GEM_CHARGER_SCREEN_HANDLER, GemChargerScreen::new);
		BlockRenderLayerMap.INSTANCE.putBlock(EDBlocks.GEM_CHARGER, RenderLayer.getCutout());
	}
}
