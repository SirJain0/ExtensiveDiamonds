package sirjain.extensivediamonds.world.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import sirjain.extensivediamonds.ExtensiveDiamonds;
import sirjain.extensivediamonds.registry.RegisterBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> RED_DIAMOND_ORE_KEY = registerKey("red_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> GREEN_DIAMOND_ORE_KEY = registerKey("green_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> DARK_DIAMOND_ORE_KEY = registerKey("dark_diamond_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> redDiamondOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, RegisterBlocks.RED_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, RegisterBlocks.DEEPSLATE_RED_DIAMOND_ORE.getDefaultState())
                );

        List<OreFeatureConfig.Target> greenDiamondOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, RegisterBlocks.GREEN_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, RegisterBlocks.DEEPSLATE_GREEN_DIAMOND_ORE.getDefaultState())
                );

        List<OreFeatureConfig.Target> darkDiamondOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, RegisterBlocks.DARK_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, RegisterBlocks.DEEPSLATE_DARK_DIAMOND_ORE.getDefaultState())
                );

        register(context, RED_DIAMOND_ORE_KEY, new OreFeatureConfig(redDiamondOres, 12));
        register(context, GREEN_DIAMOND_ORE_KEY, new OreFeatureConfig(greenDiamondOres, 12));
        register(context, DARK_DIAMOND_ORE_KEY, new OreFeatureConfig(darkDiamondOres, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(ExtensiveDiamonds.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?,?>> context,
            RegistryKey<ConfiguredFeature<?,?>> key,
            FC configuration
    ) {
        context.register(key, new ConfiguredFeature<>((F) Feature.ORE, configuration));
    }
}