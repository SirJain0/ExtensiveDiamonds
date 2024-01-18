package sirjain.extensivediamonds.items.material;

import com.google.common.collect.Lists;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.item.TooltipData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import sirjain.extensivediamonds.clientutils.ClientUtil;

import java.util.List;
import java.util.Optional;

public class FusedDiamondArmor extends ArmorItem {
    public FusedDiamondArmor(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (
                !world.isClient() &&
                        world.getTimeOfDay() % 20 == 0 &&
                        this.getSlotType() == EquipmentSlot.HEAD &&
                        entity instanceof LivingEntity wearer &&
                        isWearingFusedDiamondArmor(wearer) &&
                        wearer.getEquippedStack(EquipmentSlot.HEAD) == stack
        ) {
            wearer.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20 * 3, 1));
            wearer.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 3, 0));
            wearer.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 3, 0));
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        Formatting color = isWearingFusedDiamondArmor(ClientUtil.getClientPlayer()) ? Formatting.GREEN : Formatting.GRAY;
        tooltip.add(Text.translatable("item.extensivediamonds.fused_diamond_armor.tooltip1").formatted(color));
        tooltip.add(Text.translatable("item.extensivediamonds.fused_diamond_armor.tooltip2").formatted(color));
        tooltip.add(Text.translatable("item.extensivediamonds.fused_diamond_armor.tooltip3").formatted(color));
        tooltip.add(Text.translatable("item.extensivediamonds.fused_diamond_armor.tooltip4").formatted(color));
    }

    private boolean isWearingFusedDiamondArmor(LivingEntity wearer) {
        return Lists.newArrayList(wearer.getArmorItems()).stream().filter(itemStack -> itemStack.getItem() instanceof FusedDiamondArmor).count() == 4;
    }
}