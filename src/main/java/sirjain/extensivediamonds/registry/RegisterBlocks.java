package sirjain.extensivediamonds.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
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

    // Includes deepslate and regular ore blocks.
    public static void registerOres() {
        RED_DIAMOND_ORE = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
                new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_RED_DIAMOND_ORE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
                new BlockItem(RED_DIAMOND_ORE, new Item.Settings())
        );

        GREEN_DIAMOND_ORE = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
                new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_GREEN_DIAMOND_ORE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
                new BlockItem(GREEN_DIAMOND_ORE, new Item.Settings())
        );

        DARK_DIAMOND_ORE = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
                new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_DARK_DIAMOND_ORE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
                new BlockItem(DARK_DIAMOND_ORE, new Item.Settings())
        );

        DEEPSLATE_RED_DIAMOND_ORE = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_red_diamond_ore"),
                new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_DEEPSLATE_RED_DIAMOND_ORE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_red_diamond_ore"),
                new BlockItem(DEEPSLATE_RED_DIAMOND_ORE, new Item.Settings())
        );

        DEEPSLATE_GREEN_DIAMOND_ORE = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_green_diamond_ore"),
                new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_DEEPSLATE_GREEN_DIAMOND_ORE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_green_diamond_ore"),
                new BlockItem(DEEPSLATE_GREEN_DIAMOND_ORE, new Item.Settings())
        );

        DEEPSLATE_DARK_DIAMOND_ORE = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_dark_diamond_ore"),
                new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
        );

        BLOCK_DEEPSLATE_DARK_DIAMOND_ORE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_dark_diamond_ore"),
                new BlockItem(DEEPSLATE_DARK_DIAMOND_ORE, new Item.Settings())
        );
    }

    public static void registerOreBlocks() {
        BLOCK_OF_GREEN_DIAMOND = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
                new BlockOfGreenDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
        );

        BLOCK_OF_GREEN_DIAMOND_BLOCK = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
                new BlockItem(BLOCK_OF_GREEN_DIAMOND, new Item.Settings())
        );

        BLOCK_OF_RED_DIAMOND = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
                new BlockOfRedDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
        );

        BLOCK_OF_RED_DIAMOND_BLOCK = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
                new BlockItem(BLOCK_OF_RED_DIAMOND, new Item.Settings())
        );

        BLOCK_OF_DARK_DIAMOND = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
                new BlockOfDarkDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
        );

        BLOCK_OF_DARK_DIAMOND_BLOCK = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
                new BlockItem(BLOCK_OF_DARK_DIAMOND, new Item.Settings())
        );
    }

    public static void registerGemCharger() {
        GEM_CHARGER = Registry.register(
                Registries.BLOCK,
                new Identifier(ExtensiveDiamonds.MOD_ID, "gem_charger"),
                new GemChargerBlock(FabricBlockSettings.of(Material.STONE).requiresTool().nonOpaque().strength(3.0f, 3.0f).luminance((state) -> 6))
        );

        GEM_CHARGER_ITEM = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "gem_charger"),
                new BlockItem(GEM_CHARGER, new Item.Settings())
        );
    }

    public static void addItemsToTabs() {
        addItemToTab(BLOCK_RED_DIAMOND_ORE);
        addItemToTab(BLOCK_GREEN_DIAMOND_ORE);
        addItemToTab(BLOCK_DARK_DIAMOND_ORE);
        addItemToTab(BLOCK_DEEPSLATE_RED_DIAMOND_ORE);
        addItemToTab(BLOCK_DEEPSLATE_GREEN_DIAMOND_ORE);
        addItemToTab(BLOCK_DEEPSLATE_DARK_DIAMOND_ORE);
        addItemToTab(BLOCK_OF_GREEN_DIAMOND_BLOCK);
        addItemToTab(BLOCK_OF_DARK_DIAMOND_BLOCK);
        addItemToTab(BLOCK_OF_RED_DIAMOND_BLOCK);
        addItemToTab(GEM_CHARGER_ITEM);
    }

    public static void addItemToTab(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).register(entries -> entries.add(item));
    }
}