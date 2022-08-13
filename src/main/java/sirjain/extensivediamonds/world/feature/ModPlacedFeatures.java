package sirjain.extensivediamonds.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> RED_DIAMOND_ORE_PLACED = PlacedFeatures.register("red_diamond_ore_placed",
            ModConfiguredFeatures.RED_DIAMOND_ORE, modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(-57))));

    public static final RegistryEntry<PlacedFeature> GREEN_DIAMOND_ORE_PLACED = PlacedFeatures.register("green_diamond_ore_placed",
            ModConfiguredFeatures.GREEN_DIAMOND_ORE, modifiersWithCount(4,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-51), YOffset.fixed(-57))));

    public static final RegistryEntry<PlacedFeature> DARK_DIAMOND_ORE_PLACED = PlacedFeatures.register("dark_diamond_ore_placed",
            ModConfiguredFeatures.DARK_DIAMOND_ORE, modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-54), YOffset.fixed(-58))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
