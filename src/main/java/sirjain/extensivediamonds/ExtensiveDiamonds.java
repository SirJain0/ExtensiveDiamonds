package sirjain.extensivediamonds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfDarkDiamond;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfGreenDiamond;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfRedDiamond;
import sirjain.extensivediamonds.block.gem_charger.GemChargerBlock;
import sirjain.extensivediamonds.block.gem_charger.entity.ModBlockEntities;
import sirjain.extensivediamonds.items.material.FusedDiamondArmor;
import sirjain.extensivediamonds.items.material.FusedDiamondArmorMaterial;
import sirjain.extensivediamonds.items.swords.DarkDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.FusedDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.GreenDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.RedDiamondSwordItem;
import sirjain.extensivediamonds.items.material.ModToolMaterials;
import sirjain.extensivediamonds.items.toolset.*;
import sirjain.extensivediamonds.painting.ModPaintings;
import sirjain.extensivediamonds.screen.ModScreenHandlers;
import sirjain.extensivediamonds.world.feature.ModConfiguredFeatures;
import sirjain.extensivediamonds.world.gen.ModOreGeneration;

public class ExtensiveDiamonds implements ModInitializer {
	public static final String MOD_ID = "extensivediamonds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup EXTENSIVEDIAMONDS_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, MOD_ID), () -> new ItemStack(Items.BEDROCK));

	// ORE BLOCKS

	public static final Block RED_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
			new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_RED_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
			new BlockItem(RED_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block GREEN_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
			new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_GREEN_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
			new BlockItem(GREEN_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block DARK_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
			new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_DARK_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
			new BlockItem(DARK_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// DEEPSLATE ORE

	public static final Block DEEPSLATE_RED_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_red_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_DEEPSLATE_RED_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_red_diamond_ore"),
			new BlockItem(DEEPSLATE_RED_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// deepslate ore blocks

	public static final Block DEEPSLATE_GREEN_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_green_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_DEEPSLATE_GREEN_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_green_diamond_ore"),
			new BlockItem(DEEPSLATE_GREEN_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block DEEPSLATE_DARK_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_dark_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_DEEPSLATE_DARK_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_dark_diamond_ore"),
			new BlockItem(DEEPSLATE_DARK_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// ORE BLOCKS

	public static final Block BLOCK_OF_GREEN_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
			new BlockOfGreenDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
	);

	public static final Item BLOCK_OF_GREEN_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
			new BlockItem(BLOCK_OF_GREEN_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block BLOCK_OF_RED_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
			new BlockOfRedDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
	);

	public static final Item BLOCK_OF_RED_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
			new BlockItem(BLOCK_OF_RED_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block BLOCK_OF_DARK_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
			new BlockOfDarkDiamond(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f))
	);

	public static final Item BLOCK_OF_DARK_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
			new BlockItem(BLOCK_OF_DARK_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// == GEMS ==

	public static final Item RED_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond"),
			new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item GREEN_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond"),
			new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item DARK_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond"),
			new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond"),
			new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// SWORDS

	public static final Item RED_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_sword"),
			new RedDiamondSwordItem(ModToolMaterials.RED_DIAMOND, 5, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item GREEN_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_sword"),
			new GreenDiamondSwordItem(ModToolMaterials.GREEN_DIAMOND, 6, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item DARK_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_sword"),
			new DarkDiamondSwordItem(ModToolMaterials.DARK_DIAMOND, 8, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_sword"),
			new FusedDiamondSwordItem(ModToolMaterials.FUSED_DIAMOND, 13, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND_AXE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_axe"),
			new FusedDiamondAxeItem(ModToolMaterials.FUSED_DIAMOND, 6, 2.5f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND_HOE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_hoe"),
			new FusedDiamondHoeItem(ModToolMaterials.FUSED_DIAMOND, 3, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND_SHOVEL = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_shovel"),
			new FusedDiamondShovelItem(ModToolMaterials.FUSED_DIAMOND, 4, 2.5f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND_PICKAXE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_pickaxe"),
			new FusedDiamondPickaxeItem(ModToolMaterials.FUSED_DIAMOND, 5, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block GEM_CHARGER = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "gem_charger"),
			new GemChargerBlock(FabricBlockSettings.of(Material.STONE).requiresTool().nonOpaque().strength(3.0f, 3.0f).luminance((state) -> 6))
	);

	public static final Item FUSED_DIAMOND_HELMET = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_helmet"),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.HEAD, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND_CHEST = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_chestplate"),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.CHEST, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND_LEGS = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_leggings"),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.LEGS, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND_BOOTS = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_boots"),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.FEET, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item GEM_CHARGER_ITEM = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "gem_charger"),
			new BlockItem(GEM_CHARGER, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();
		ModPaintings.registerPaintings();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}
