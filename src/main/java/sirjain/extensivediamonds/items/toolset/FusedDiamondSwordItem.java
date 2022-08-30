package sirjain.extensivediamonds.items.toolset;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.world.ServerWorld;
import sirjain.extensivediamonds.ExtensiveDiamonds;

import java.util.List;

public class FusedDiamondSwordItem extends SwordItem {
    public FusedDiamondSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 110, 6), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 60, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 80, 3), attacker);
        return super.postHit(stack, target, attacker);
    }
}

