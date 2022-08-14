package sirjain.extensivediamonds.items;

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

public class DarkDiamondSwordItem extends SwordItem {
    public DarkDiamondSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 70, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 120, 1), attacker);
        return super.postHit(stack, target, attacker);
    }
}
