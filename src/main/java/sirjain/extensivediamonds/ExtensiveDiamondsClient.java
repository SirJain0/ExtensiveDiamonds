package sirjain.extensivediamonds;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import sirjain.extensivediamonds.screen.GemChargerScreen;
import sirjain.extensivediamonds.screen.ModScreenHandlers;

public class ExtensiveDiamondsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.GEM_CHARGER_SCREEN_HANDLER, GemChargerScreen::new);
    }
}
