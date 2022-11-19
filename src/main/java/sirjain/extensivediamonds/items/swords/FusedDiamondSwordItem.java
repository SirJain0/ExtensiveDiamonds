package sirjain.extensivediamonds.items.swords;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class FusedDiamondSwordItem extends SwordItem {
    public FusedDiamondSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 80, 1), attacker);
        target.setOnFireFor(5);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 1), attacker);

        return super.postHit(stack, target, attacker);
    }
}
