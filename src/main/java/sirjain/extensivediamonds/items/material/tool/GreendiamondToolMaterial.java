package sirjain.extensivediamonds.items.material.tool;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GreendiamondToolMaterial implements ToolMaterial {

    public static final GreendiamondToolMaterial INSTANCE = new GreendiamondToolMaterial();

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}

