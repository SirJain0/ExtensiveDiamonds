package sirjain.extensivediamonds.data.EDOrePlacement;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class EDOreGeneration {
	public static void registerOres() {
		registerFeature(EDPlacedFeatures.RED_DIAMOND_ORE_PLACED_KEY);
		registerFeature(EDPlacedFeatures.GREEN_DIAMOND_ORE_PLACED_KEY);
		registerFeature(EDPlacedFeatures.DARK_DIAMOND_ORE_PLACED_KEY);
	}

	public static void registerFeature(RegistryKey<PlacedFeature> key) {
		BiomeModifications.addFeature(
			BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, key
		);
	}
}
