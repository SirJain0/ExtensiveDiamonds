package sirjain.extensivediamonds.items.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import sirjain.extensivediamonds.registry.RegisterItems;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    RED_DIAMOND(3, 1422, 8.0F, 0.0F, 30, () -> Ingredient.ofItems(RegisterItems.RED_DIAMOND)),

    GREEN_DIAMOND(3, 1149, 7.0F, 0.0F, 16, () -> Ingredient.ofItems(RegisterItems.GREEN_DIAMOND)),

    DARK_DIAMOND(4, 1729, 9.0F, 0.0F, 18, () -> Ingredient.ofItems(RegisterItems.DARK_DIAMOND)),

    FUSED_DIAMOND(5, 1729, 9.0F, 0.0F, 22, () -> Ingredient.ofItems(RegisterItems.FUSED_DIAMOND));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
