package sirjain.extensivediamonds.items.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class FusedDiamondArmorMaterial implements ArmorMaterial {
    public static final FusedDiamondArmorMaterial material = new FusedDiamondArmorMaterial();

    private static final int[] BASE_DURABILITY = new int[] {904, 1020, 929, 890};
    private static final int[] PROTECTION_VALUES = new int[] {8, 12, 10, 8};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 8;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        //TODO: Change it to appropriate ingredient
        return Ingredient.EMPTY;
    }

    @Override
    public String getName() {
        return "fused_diamond";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
