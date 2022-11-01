package sirjain.extensivediamonds.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import sirjain.extensivediamonds.ExtensiveDiamonds;
import sirjain.extensivediamonds.block.gem_charger.GemChargerBlock;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfDarkDiamond;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfGreenDiamond;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfRedDiamond;

public class RegisterBlocks {
    public static Block RED_DIAMOND_ORE;
    public static Block GREEN_DIAMOND_ORE;
    public static Block DARK_DIAMOND_ORE;
    public static Block DEEPSLATE_RED_DIAMOND_ORE;
    public static Block DEEPSLATE_GREEN_DIAMOND_ORE;
    public static Block DEEPSLATE_DARK_DIAMOND_ORE;
    public static Block BLOCK_OF_GREEN_DIAMOND;
    public static Block BLOCK_OF_RED_DIAMOND;
    public static Block BLOCK_OF_DARK_DIAMOND;
    public static Block GEM_CHARGER;

    public static Item BLOCK_RED_DIAMOND_ORE;
    public static Item BLOCK_GREEN_DIAMOND_ORE;
    public static Item BLOCK_DARK_DIAMOND_ORE;
    public static Item BLOCK_DEEPSLATE_RED_DIAMOND_ORE;
    public static Item BLOCK_DEEPSLATE_GREEN_DIAMOND_ORE;
    public static Item BLOCK_DEEPSLATE_DARK_DIAMOND_ORE;
    public static Item BLOCK_OF_GREEN_DIAMOND_BLOCK;
    public static Item BLOCK_OF_DARK_DIAMOND_BLOCK;
    public static Item BLOCK_OF_RED_DIAMOND_BLOCK;
    public static Item GEM_CHARGER_ITEM;

    public static void registerOres() { // Includes deepslate and regular ore blocks.
        RED_DIAMOND_ORE = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_RED_DIAMOND_ORE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
                new BlockItem(RED_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        GREEN_DIAMOND_ORE = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_GREEN_DIAMOND_ORE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
                new BlockItem(GREEN_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        DARK_DIAMOND_ORE = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_DARK_DIAMOND_ORE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
                new BlockItem(DARK_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        DEEPSLATE_RED_DIAMOND_ORE = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_red_diamond_ore"),
                new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_DEEPSLATE_RED_DIAMOND_ORE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_red_diamond_ore"),
                new BlockItem(DEEPSLATE_RED_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        DEEPSLATE_GREEN_DIAMOND_ORE = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_green_diamond_ore"),
                new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_DEEPSLATE_GREEN_DIAMOND_ORE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_green_diamond_ore"),
                new BlockItem(DEEPSLATE_GREEN_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        DEEPSLATE_DARK_DIAMOND_ORE = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_dark_diamond_ore"),
                new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_DEEPSLATE_DARK_DIAMOND_ORE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_dark_diamond_ore"),
                new BlockItem(DEEPSLATE_DARK_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );
    }

    public static void registerOreBlocks() {
        BLOCK_OF_GREEN_DIAMOND = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
                new BlockOfGreenDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
        );

        BLOCK_OF_GREEN_DIAMOND_BLOCK = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
                new BlockItem(BLOCK_OF_GREEN_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        BLOCK_OF_RED_DIAMOND = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
                new BlockOfRedDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
        );

        BLOCK_OF_RED_DIAMOND_BLOCK = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
                new BlockItem(BLOCK_OF_RED_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        BLOCK_OF_DARK_DIAMOND = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
                new BlockOfDarkDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
        );

        BLOCK_OF_DARK_DIAMOND_BLOCK = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
                new BlockItem(BLOCK_OF_DARK_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );
    }

    public static void registerGemCharger() {
        GEM_CHARGER = Registry.register(
                Registry.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "gem_charger"),
                new GemChargerBlock(FabricBlockSettings.of(Material.STONE).requiresTool().nonOpaque().strength(3.0f, 3.0f).luminance((state) -> 6))
        );

        GEM_CHARGER_ITEM = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "gem_charger"),
                new BlockItem(GEM_CHARGER, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );
    }
}