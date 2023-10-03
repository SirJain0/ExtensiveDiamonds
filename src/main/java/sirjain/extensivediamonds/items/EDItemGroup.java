package sirjain.extensivediamonds.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sirjain.extensivediamonds.ExtensiveDiamonds;
import sirjain.extensivediamonds.block.EDBlocks;

public class EDItemGroup {
	public static ItemGroup EXTENSIVEDIAMONDS_ITEM_GROUP;

	public static void registerItemGroup() {
		EXTENSIVEDIAMONDS_ITEM_GROUP = Registry.register(
			Registries.ITEM_GROUP,
			new Identifier(ExtensiveDiamonds.MOD_ID, "extensivediamonds_item_group"),
			FabricItemGroup.builder()
				.displayName(Text.translatable("itemGroup.extensivediamonds.extensivediamonds"))
				.icon(() -> new ItemStack(EDItems.FUSED_DIAMOND))
				.entries((displayContext, entries) -> {
					entries.add(EDItems.RED_DIAMOND);
					entries.add(EDItems.GREEN_DIAMOND);
					entries.add(EDItems.DARK_DIAMOND);
					entries.add(EDItems.FUSED_DIAMOND);
					entries.add(EDItems.RED_DIAMOND_SWORD);
					entries.add(EDItems.GREEN_DIAMOND_SWORD);
					entries.add(EDItems.DARK_DIAMOND_SWORD);
					entries.add(EDItems.FUSED_DIAMOND_SWORD);
					entries.add(EDItems.FUSED_DIAMOND_AXE);
					entries.add(EDItems.FUSED_DIAMOND_SHOVEL);
					entries.add(EDItems.FUSED_DIAMOND_HOE);
					entries.add(EDItems.FUSED_DIAMOND_PICKAXE);
					entries.add(EDItems.FUSED_DIAMOND_HELMET);
					entries.add(EDItems.FUSED_DIAMOND_CHEST);
					entries.add(EDItems.FUSED_DIAMOND_LEGS);
					entries.add(EDItems.FUSED_DIAMOND_BOOTS);

					entries.add(EDBlocks.BLOCK_RED_DIAMOND_ORE);
					entries.add(EDBlocks.BLOCK_GREEN_DIAMOND_ORE);
					entries.add(EDBlocks.BLOCK_DARK_DIAMOND_ORE);
					entries.add(EDBlocks.BLOCK_DEEPSLATE_RED_DIAMOND_ORE);
					entries.add(EDBlocks.BLOCK_DEEPSLATE_GREEN_DIAMOND_ORE);
					entries.add(EDBlocks.BLOCK_DEEPSLATE_DARK_DIAMOND_ORE);
					entries.add(EDBlocks.BLOCK_OF_GREEN_DIAMOND_BLOCK);
					entries.add(EDBlocks.BLOCK_OF_DARK_DIAMOND_BLOCK);
					entries.add(EDBlocks.BLOCK_OF_RED_DIAMOND_BLOCK);
					entries.add(EDBlocks.GEM_CHARGER_ITEM);
				}).build()
		);
	}
}
