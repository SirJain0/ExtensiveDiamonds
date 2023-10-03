package sirjain.extensivediamonds.items.material;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import sirjain.extensivediamonds.items.EDItems;

public class FusedDiamondArmorMaterial implements ArmorMaterial {
	public static final FusedDiamondArmorMaterial material = new FusedDiamondArmorMaterial();

	private static final int[] BASE_DURABILITY = new int[]{904, 1020, 929, 890};
	private static final int[] PROTECTION_VALUES = new int[]{8, 10, 12, 8};

	@Override
	public int getProtection(ArmorItem.Type type) {
		return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
	}

	@Override
	public int getDurability(ArmorItem.Type type) {
		return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()];
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
		return Ingredient.ofItems(EDItems.FUSED_DIAMOND);
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
