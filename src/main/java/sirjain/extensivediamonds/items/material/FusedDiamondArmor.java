package sirjain.extensivediamonds.items.material;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FusedDiamondArmor extends ArmorItem {
	public FusedDiamondArmor(ArmorMaterial material, Type type, Settings settings) {
		super(material, type, settings);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if (
			!world.isClient() &&
			entity instanceof LivingEntity wearer &&
			isWearingFusedDiamondArmor(wearer)
		) {
			wearer.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20 * 3, 1));
			wearer.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 3, 0));
			wearer.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 3, 0));
		}

		super.inventoryTick(stack, world, entity, slot, selected);
	}

	private boolean isWearingFusedDiamondArmor(LivingEntity wearer) {
		Item head = wearer.getEquippedStack(EquipmentSlot.HEAD).getItem();
		Item chest = wearer.getEquippedStack(EquipmentSlot.CHEST).getItem();
		Item legs = wearer.getEquippedStack(EquipmentSlot.LEGS).getItem();
		Item boots = wearer.getEquippedStack(EquipmentSlot.FEET).getItem();

		return head instanceof ArmorItem headItem && headItem.getMaterial() == FusedDiamondArmorMaterial.MATERIAL &&
			chest instanceof ArmorItem chestItem && chestItem.getMaterial() == FusedDiamondArmorMaterial.MATERIAL &&
			legs instanceof ArmorItem legItem && legItem.getMaterial() == FusedDiamondArmorMaterial.MATERIAL &&
			boots instanceof ArmorItem bootItem && bootItem.getMaterial() == FusedDiamondArmorMaterial.MATERIAL;
	}
}