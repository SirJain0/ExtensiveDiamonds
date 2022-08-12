package sirjain.extensivediamonds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirjain.extensivediamonds.items.DarkDiamondSwordItem;
import sirjain.extensivediamonds.items.FusedDiamondItem;
import sirjain.extensivediamonds.items.GreenDiamondSwordItem;
import sirjain.extensivediamonds.items.RedDiamondSwordItem;
import sirjain.extensivediamonds.items.material.tool.DarkdiamondToolMaterial;
import sirjain.extensivediamonds.items.material.tool.GreendiamondToolMaterial;
import sirjain.extensivediamonds.items.material.tool.ReddiamondToolMaterial;
import sirjain.extensivediamonds.painting.ModPaintings;

public class ExtensiveDiamonds implements ModInitializer {
	public static final String MOD_ID = "extensivediamonds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup EXTENSIVEDIAMONDS_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, MOD_ID), () -> new ItemStack(Items.BEDROCK));

	public static final Item RED_DIAMOND = new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP));
	public static final Item GREEN_DIAMOND = new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP));
	public static final Item DARK_DIAMOND = new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP));

	// ORE

	public static final Block RED_DIAMOND_ORE_BLOCK = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item RED_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
			new BlockItem(RED_DIAMOND_ORE_BLOCK, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block GREEN_DIAMOND_ORE_BLOCK = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item GREEN_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
			new BlockItem(GREEN_DIAMOND_ORE_BLOCK, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block DARK_DIAMOND_ORE_BLOCK = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item DARK_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
			new BlockItem(DARK_DIAMOND_ORE_BLOCK, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// ORE BLOCKS

	public static final Block BLOCK_OF_GREEN_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_OF_GREEN_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
			new BlockItem(BLOCK_OF_GREEN_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block BLOCK_OF_RED_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_OF_RED_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
			new BlockItem(BLOCK_OF_RED_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block BLOCK_OF_DARK_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_OF_DARK_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
			new BlockItem(BLOCK_OF_DARK_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item RED_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_sword"),
			new RedDiamondSwordItem(ReddiamondToolMaterial.INSTANCE, 5, -2.4f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item GREEN_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_sword"),
			new GreenDiamondSwordItem(GreendiamondToolMaterial.INSTANCE, 6, -2.4f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item DARK_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_sword"),
			new DarkDiamondSwordItem(DarkdiamondToolMaterial.INSTANCE, 8, -2.4f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond"),
			new FusedDiamondItem(true)
	);

	// SWORDS

	@Override
	public void onInitialize() {

		// ==== gems ====

		Registry.register(
				Registry.ITEM,
				new Identifier("extensivediamonds", "red_diamond"), RED_DIAMOND
		);

		Registry.register(
				Registry.ITEM,
				new Identifier("extensivediamonds", "green_diamond"), GREEN_DIAMOND
		);

		Registry.register(
				Registry.ITEM,
				new Identifier("extensivediamonds", "dark_diamond"), DARK_DIAMOND
		);

		ModPaintings.registerPaintings();
	}
}
