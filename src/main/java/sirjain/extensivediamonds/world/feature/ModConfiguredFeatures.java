package sirjain.extensivediamonds.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import sirjain.extensivediamonds.ExtensiveDiamonds;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_RED_DIAMOND_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ExtensiveDiamonds.RED_DIAMOND_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ExtensiveDiamonds.BLOCK_OF_RED_DIAMOND.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RED_DIAMOND_ORE =
            ConfiguredFeatures.register("red_diamond_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_RED_DIAMOND_ORES, 4));

    public static void registerConfiguredFeatures() {
        ExtensiveDiamonds.LOGGER.debug("Registering the ModConfiguredFeatures for " + ExtensiveDiamonds.MOD_ID);
    }
}
