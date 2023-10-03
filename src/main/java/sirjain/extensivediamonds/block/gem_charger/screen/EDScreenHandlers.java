package sirjain.extensivediamonds.block.gem_charger.screen;

import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;

public class EDScreenHandlers {
	public static ScreenHandlerType<GemChargerScreenHandler> GEM_CHARGER_SCREEN_HANDLER;

	public static void registerScreenHandlers() {
		GEM_CHARGER_SCREEN_HANDLER = new ScreenHandlerType<>(
			GemChargerScreenHandler::new,
			FeatureSet.of(FeatureFlags.VANILLA)
		);
	}
}