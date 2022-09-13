package sirjain.extensivediamonds.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
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
import sirjain.extensivediamonds.screen.GemChargerScreenHandler;

public class GemChargerBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);

    protected final PropertyDelegate delegate;
    private int fuelProgress = 0;
    private int maxProgress = 72;

    public GemChargerBlockEntity(BlockPos blockpos, BlockState blockstate) {
        super(ModBlockEntities.GEM_CHARGER, blockpos, blockstate);
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
    public ScreenHandler createMenu(int syncId, PlayerInventory inventory, PlayerEntity player) {
        return new GemChargerScreenHandler(syncId, inventory, this, this.delegate);
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

    public static void tick(World world, BlockPos blockPos, BlockState blockState, GemChargerBlockEntity entity) {
        if (world.isClient()) {
            return;
        }

        if(hasRecipe(entity)) {
            entity.fuelProgress++;
            markDirty(world, blockPos, blockState);
            if(entity.fuelProgress >= entity.maxProgress) {
                craftItem(entity);
            } else {
                entity.resetProgress();
                markDirty(world, blockPos, blockState);
            }
        }
    }

    private static void craftItem(GemChargerBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for(int x = 0; x < entity.size(); x++) {
            inventory.setStack(x, entity.getStack(x));
        }
        
        if(hasRecipe(entity)) {
            entity.removeStack(0, 1);
            entity.removeStack(1, 1);
            entity.removeStack(2, 1);
            
            entity.setStack(3, new ItemStack(ExtensiveDiamonds.FUSED_DIAMOND, entity.getStack(3).getCount() + 1));
        }
    }

    private static boolean hasRecipe(GemChargerBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for(int x = 0; x < entity.size(); x++) {
            inventory.setStack(x, entity.getStack(x));
        }
        boolean hasRedGem = entity.getStack(0).getItem() == ExtensiveDiamonds.RED_DIAMOND;
        boolean hasGreenGem = entity.getStack(1).getItem() == ExtensiveDiamonds.GREEN_DIAMOND;
        boolean hasDarkGem = entity.getStack(2).getItem() == ExtensiveDiamonds.DARK_DIAMOND;

        return hasRedGem && hasGreenGem && hasDarkGem && canInsertAmountIntoOutputSlot(inventory, 1) && canInsertItemIntoOutputSlot(inventory);
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(0).isEmpty() && inventory.getStack(0).getItem() == ExtensiveDiamonds.RED_DIAMOND || inventory.getStack(1).isEmpty() && inventory.getStack(1).getItem() == ExtensiveDiamonds.GREEN_DIAMOND || inventory.getStack(2).isEmpty() && inventory.getStack(2).getItem() == ExtensiveDiamonds.DARK_DIAMOND;
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory, int count) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount() && inventory.getStack(1).getMaxCount() > inventory.getStack(1).getCount() && inventory.getStack(0).getMaxCount() > inventory.getStack(0).getCount();
    }
}