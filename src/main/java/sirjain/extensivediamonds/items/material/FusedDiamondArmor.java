package sirjain.extensivediamonds.items.material;

import net.minecraft.item.ArmorItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class FusedDiamondArmor extends ArmorItem {
    public FusedDiamondArmor(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity player) {
                if(checkForWearingArmor(player) && checkForCorrectArmor(player)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20*3, 1));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*3, 0));
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    // Check 1 - armor slots are not empty
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

    // Check 2 - armor slots have correct material
    private boolean checkForCorrectArmor(PlayerEntity player) {
        ArmorItem head = (ArmorItem)player.getInventory().getArmorStack(0).getItem();
        ArmorItem chest = (ArmorItem)player.getInventory().getArmorStack(1).getItem();
        ArmorItem legs = (ArmorItem)player.getInventory().getArmorStack(2).getItem();
        ArmorItem boots = (ArmorItem)player.getInventory().getArmorStack(3).getItem();

        return chest.getMaterial() == FusedDiamondArmorMaterial.material &&
                head.getMaterial() == FusedDiamondArmorMaterial.material &&
                legs.getMaterial() == FusedDiamondArmorMaterial.material &&
                boots.getMaterial() == FusedDiamondArmorMaterial.material;
    }
}