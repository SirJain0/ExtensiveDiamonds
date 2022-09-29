package sirjain.extensivediamonds.block.gem_charger.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import sirjain.extensivediamonds.ExtensiveDiamonds;
import sirjain.extensivediamonds.block.gem_charger.ImplementedInventory;
import sirjain.extensivediamonds.screen.GemChargerScreenHandler;

public class GemChargerBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    protected final PropertyDelegate delegate;
    private int fuelProgress = 0;
    private int maxProgress = 72;

    public GemChargerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GEM_CHARGER, pos, state);
        this.delegate = new PropertyDelegate() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> GemChargerBlockEntity.this.fuelProgress;
                    case 1 -> GemChargerBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> GemChargerBlockEntity.this.fuelProgress = value;
                    case 1 -> GemChargerBlockEntity.this.maxProgress = value;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Gem Charger");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new GemChargerScreenHandler(syncId, playerInventory, this, this.delegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("gem_charger.progress", fuelProgress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        fuelProgress = nbt.getInt("gem_charger.progress");
    }

    private void resetProgress() {
        this.fuelProgress = 0;
    }

    public static void tick(World world, BlockPos blockPos, BlockState blockState, GemChargerBlockEntity charger) {
        if(world.isClient()) {
            return;
        }

        if(hasValidRecipe(charger)) {
            charger.fuelProgress++;
            markDirty(world, blockPos, blockState);
            if(charger.fuelProgress >= charger.maxProgress) {
                craftItem(charger);
            }
        } else {
            charger.resetProgress();
            markDirty(world, blockPos, blockState);
        }
    }

    private static void craftItem(GemChargerBlockEntity charger) {
        SimpleInventory inventory = new SimpleInventory(charger.size());
        for (int i = 0; i < charger.size(); i++) {
            inventory.setStack(i, charger.getStack(i));
        }

        if(hasValidRecipe(charger)) {
            charger.removeStack(0, 1);
            charger.removeStack(1, 1);
            charger.removeStack(2, 1);

            charger.setStack(3, new ItemStack(ExtensiveDiamonds.FUSED_DIAMOND,
                    charger.getStack(3).getCount() + 1));

            charger.resetProgress();
        }
    }

    private static boolean hasValidRecipe(GemChargerBlockEntity charger) {
        SimpleInventory inventory = new SimpleInventory(charger.size());
        for (int i = 0; i < charger.size(); i++) {
            inventory.setStack(i, charger.getStack(i));
        }

        boolean hasGemOne = charger.getStack(0).getItem() == ExtensiveDiamonds.RED_DIAMOND || charger.getStack(1).getItem() == ExtensiveDiamonds.RED_DIAMOND || charger.getStack(2).getItem() == ExtensiveDiamonds.RED_DIAMOND;
        boolean hasGemTwo = charger.getStack(0).getItem() == ExtensiveDiamonds.GREEN_DIAMOND || charger.getStack(1).getItem() == ExtensiveDiamonds.GREEN_DIAMOND || charger.getStack(2).getItem() == ExtensiveDiamonds.GREEN_DIAMOND;
        boolean hasGemThree = charger.getStack(0).getItem() == ExtensiveDiamonds.DARK_DIAMOND || charger.getStack(1).getItem() == ExtensiveDiamonds.DARK_DIAMOND || charger.getStack(2).getItem() == ExtensiveDiamonds.DARK_DIAMOND;

        return hasGemOne && hasGemTwo && hasGemThree && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, ExtensiveDiamonds.FUSED_DIAMOND);
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(3).getItem() == output || inventory.getStack(3).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(3).getMaxCount() > inventory.getStack(3).getCount();
    }
}