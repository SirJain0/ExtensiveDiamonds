package sirjain.extensivediamonds.items.other;

import sirjain.extensivediamonds.ExtensiveDiamonds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DiamondItem extends Item {
    private final boolean hasGlint;

    public DiamondItem(boolean hasGlint) {
        super(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP));
        this.hasGlint = hasGlint;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return hasGlint;
    }
}
