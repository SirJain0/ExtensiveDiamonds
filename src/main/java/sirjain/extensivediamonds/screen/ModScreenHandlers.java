package sirjain.extensivediamonds.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<GemChargerScreenHandler> GEM_CHARGER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        GEM_CHARGER_SCREEN_HANDLER = new ScreenHandlerType<>(GemChargerScreenHandler::new);
    }
}
