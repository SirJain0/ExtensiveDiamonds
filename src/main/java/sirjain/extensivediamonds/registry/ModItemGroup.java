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
    public static ItemGroup CITRINE = Registry.register(Registries.ITEM_GROUP, new Identifier(ExtensiveDiamonds.MOD_ID, "extensivediamonds_group"),
        FabricItemGroup.builder().displayName(Text.translatable("itemGroup.extensivediamonds.extensivediamonds"))
            .icon(() -> new ItemStack(RegisterItems.)).entries((displayContext, entries) -> {
                entries.add(ModItems.RAW_CITRINE);
                entries.add(ModItems.CITRINE);
                entries.add(ModItems.ANIMATED_ITEM);
                entries.add(ModItems.ANIMATED_BLOCK_ITEM);

                entries.add(ModItems.MUSIC_BOX_MUSIC_DISC);
                entries.add(ModItems.TIGER_SPAWN_EGG);

                entries.add(ModItems.AMETHYST_HELMET);
                entries.add(ModItems.AMETHYST_CHESTPLATE);
                entries.add(ModItems.AMETHYST_LEGGINGS);
                entries.add(ModItems.AMETHYST_BOOTS);

                entries.add(ModBlocks.CITRINE_BLOCK);
                entries.add(ModBlocks.CITRINE_ORE);
                entries.add(ModBlocks.DEEPSLATE_CITRINE_ORE);

                entries.add(ModBlocks.RED_MAPLE_LOG);
                entries.add(ModBlocks.RED_MAPLE_LEAVES);
                entries.add(ModBlocks.RED_MAPLE_WOOD);
                entries.add(ModBlocks.STRIPPED_RED_MAPLE_LOG);
                entries.add(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
                entries.add(ModBlocks.RED_MAPLE_PLANKS);
                entries.add(ModBlocks.RED_MAPLE_SAPLING);

            }).build());
}
