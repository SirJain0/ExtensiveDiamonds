package sirjain.extensivediamonds.items.material;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
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
			entity instanceof PlayerEntity player &&
			checkForWearingArmor(player) &&
			checkForCorrectArmor(player)
		) {
			player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20 * 3, 1));
			player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 3, 0));
			player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 3, 0));
		}

		super.inventoryTick(stack, world, entity, slot, selected);
	}

	// Check 1: Is the player wearing armor?
	private boolean checkForWearingArmor(PlayerEntity player) {
		ItemStack head = player.getInventory().getArmorStack(0);
		ItemStack chest = player.getInventory().getArmorStack(1);
		ItemStack legs = player.getInventory().getArmorStack(2);
		ItemStack boots = player.getInventory().getArmorStack(3);

		return !chest.isEmpty() &&
			!head.isEmpty() &&
			!legs.isEmpty() &&
			!boots.isEmpty();
	}

	// Check 2: Is said armor the correct material?
	private boolean checkForCorrectArmor(PlayerEntity player) {
		ArmorItem head = (ArmorItem) player.getInventory().getArmorStack(0).getItem();
		ArmorItem chest = (ArmorItem) player.getInventory().getArmorStack(1).getItem();
		ArmorItem legs = (ArmorItem) player.getInventory().getArmorStack(2).getItem();
		ArmorItem boots = (ArmorItem) player.getInventory().getArmorStack(3).getItem();

		return chest.getMaterial() == FusedDiamondArmorMaterial.MATERIAL &&
			head.getMaterial() == FusedDiamondArmorMaterial.MATERIAL &&
			legs.getMaterial() == FusedDiamondArmorMaterial.MATERIAL &&
			boots.getMaterial() == FusedDiamondArmorMaterial.MATERIAL;
	}
}