package sirjain.extensivediamonds.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sirjain.extensivediamonds.ExtensiveDiamonds;

public class ModItemGroup {
    public static ItemGroup EXTENSIVEDIAMONDS_ITEM_GROUP;

    public static void registerItemGroup() {
        EXTENSIVEDIAMONDS_ITEM_GROUP = FabricItemGroup.builder(new Identifier(ExtensiveDiamonds.MOD_ID, "extensivediamonds_item_group"))
                .displayName(Text.literal("Extensive Diamonds"))
                .icon(() -> new ItemStack(RegisterItems.FUSED_DIAMOND)).build();
    }
}
