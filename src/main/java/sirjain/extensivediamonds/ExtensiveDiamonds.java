package sirjain.extensivediamonds;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ExtensiveDiamonds implements ModInitializer {
	public static final String MOD_ID = "extensivediamonds";

	public static final Item RED_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item GREEN_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item DARK_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MISC));

	// ORE

	public static final Block RED_DIAMOND_ORE_BLOCK = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item RED_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
			new BlockItem(RED_DIAMOND_ORE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))
	);

	public static final Block GREEN_DIAMOND_ORE_BLOCK = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item GREEN_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
			new BlockItem(GREEN_DIAMOND_ORE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))
	);

	public static final Block DARK_DIAMOND_ORE_BLOCK = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item DARK_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
			new BlockItem(DARK_DIAMOND_ORE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))
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
			new BlockItem(BLOCK_OF_GREEN_DIAMOND, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))
	);

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
	}
}
