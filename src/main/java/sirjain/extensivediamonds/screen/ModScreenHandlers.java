package sirjain.extensivediamonds.screen;

import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
	public static ScreenHandlerType<GemChargerScreenHandler> GEM_CHARGER_SCREEN_HANDLER;

	public static void registerScreenHandlers() {
		GEM_CHARGER_SCREEN_HANDLER = new ScreenHandlerType<>(GemChargerScreenHandler::new, FeatureSet.of(FeatureFlags.VANILLA));
	}
}