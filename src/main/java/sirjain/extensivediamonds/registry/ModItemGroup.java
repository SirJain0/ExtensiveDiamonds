package sirjain.extensivediamonds.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sirjain.extensivediamonds.ExtensiveDiamonds;

public class ModItemGroup {
	public static ItemGroup EXTENSIVEDIAMONDS_ITEM_GROUP;

	public static void registerItemGroup() {
		EXTENSIVEDIAMONDS_ITEM_GROUP = Registry.register(
			Registries.ITEM_GROUP,
			new Identifier(ExtensiveDiamonds.MOD_ID, "extensivediamonds_item_group"),
			FabricItemGroup.builder()
				.displayName(Text.translatable("itemGroup.extensivediamonds.extensivediamonds"))
				.icon(() -> new ItemStack(RegisterItems.FUSED_DIAMOND))
				.entries((displayContext, entries) -> {
					entries.add(RegisterItems.RED_DIAMOND);
					entries.add(RegisterItems.GREEN_DIAMOND);
					entries.add(RegisterItems.DARK_DIAMOND);
					entries.add(RegisterItems.FUSED_DIAMOND);
					entries.add(RegisterItems.RED_DIAMOND_SWORD);
					entries.add(RegisterItems.GREEN_DIAMOND_SWORD);
					entries.add(RegisterItems.DARK_DIAMOND_SWORD);
					entries.add(RegisterItems.FUSED_DIAMOND_SWORD);
					entries.add(RegisterItems.FUSED_DIAMOND_AXE);
					entries.add(RegisterItems.FUSED_DIAMOND_SHOVEL);
					entries.add(RegisterItems.FUSED_DIAMOND_HOE);
					entries.add(RegisterItems.FUSED_DIAMOND_PICKAXE);
					entries.add(RegisterItems.FUSED_DIAMOND_HELMET);
					entries.add(RegisterItems.FUSED_DIAMOND_CHEST);
					entries.add(RegisterItems.FUSED_DIAMOND_LEGS);
					entries.add(RegisterItems.FUSED_DIAMOND_BOOTS);

					entries.add(RegisterBlocks.BLOCK_RED_DIAMOND_ORE);
					entries.add(RegisterBlocks.BLOCK_GREEN_DIAMOND_ORE);
					entries.add(RegisterBlocks.BLOCK_DARK_DIAMOND_ORE);
					entries.add(RegisterBlocks.BLOCK_DEEPSLATE_RED_DIAMOND_ORE);
					entries.add(RegisterBlocks.BLOCK_DEEPSLATE_GREEN_DIAMOND_ORE);
					entries.add(RegisterBlocks.BLOCK_DEEPSLATE_DARK_DIAMOND_ORE);
					entries.add(RegisterBlocks.BLOCK_OF_GREEN_DIAMOND_BLOCK);
					entries.add(RegisterBlocks.BLOCK_OF_DARK_DIAMOND_BLOCK);
					entries.add(RegisterBlocks.BLOCK_OF_RED_DIAMOND_BLOCK);
					entries.add(RegisterBlocks.GEM_CHARGER_ITEM);
				}).build()
		);
	}
}
