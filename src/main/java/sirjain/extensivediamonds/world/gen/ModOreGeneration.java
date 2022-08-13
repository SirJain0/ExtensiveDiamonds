package sirjain.extensivediamonds.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import sirjain.extensivediamonds.world.feature.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RED_DIAMOND_ORE_PLACED.getKey().get());
    }
}
