package sirjain.extensivediamonds.data.EDOrePlacement;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class EDOreGeneration {
	public static void registerOres() {
		BiomeModifications.addFeature(
			BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, EDPlacedFeatures.RED_DIAMOND_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
			BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, EDPlacedFeatures.GREEN_DIAMOND_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
			BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, EDPlacedFeatures.DARK_DIAMOND_ORE_PLACED_KEY
		);
	}
}
