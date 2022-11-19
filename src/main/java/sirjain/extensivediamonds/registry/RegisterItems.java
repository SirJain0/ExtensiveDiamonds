package sirjain.extensivediamonds.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import sirjain.extensivediamonds.ExtensiveDiamonds;
import sirjain.extensivediamonds.items.material.FusedDiamondArmor;
import sirjain.extensivediamonds.items.material.FusedDiamondArmorMaterial;
import sirjain.extensivediamonds.items.material.ModToolMaterials;
import sirjain.extensivediamonds.items.swords.DarkDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.FusedDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.GreenDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.RedDiamondSwordItem;
import sirjain.extensivediamonds.items.toolset.FusedDiamondAxeItem;
import sirjain.extensivediamonds.items.toolset.FusedDiamondHoeItem;
import sirjain.extensivediamonds.items.toolset.FusedDiamondPickaxeItem;
import sirjain.extensivediamonds.items.toolset.FusedDiamondShovelItem;

public class RegisterItems {
    public static Item RED_DIAMOND;
    public static Item GREEN_DIAMOND;
    public static Item DARK_DIAMOND;
    public static Item FUSED_DIAMOND;
    public static Item RED_DIAMOND_SWORD;
    public static Item GREEN_DIAMOND_SWORD;
    public static Item DARK_DIAMOND_SWORD;
    public static Item FUSED_DIAMOND_SWORD;
    public static Item FUSED_DIAMOND_AXE;
    public static Item FUSED_DIAMOND_HOE;
    public static Item FUSED_DIAMOND_SHOVEL;
    public static Item FUSED_DIAMOND_PICKAXE;
    public static Item FUSED_DIAMOND_HELMET;
    public static Item FUSED_DIAMOND_CHEST;
    public static Item FUSED_DIAMOND_LEGS;
    public static Item FUSED_DIAMOND_BOOTS;

    public static void registerDiamonds() {
        RED_DIAMOND = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond"),
                new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        GREEN_DIAMOND = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond"),
                new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        DARK_DIAMOND = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond"),
                new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        FUSED_DIAMOND = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond"),
                new Item(new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );
    }

    public static void registerCombat() {
        RED_DIAMOND_SWORD = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_sword"),
                new RedDiamondSwordItem(ModToolMaterials.RED_DIAMOND, 5, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        GREEN_DIAMOND_SWORD = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_sword"),
                new GreenDiamondSwordItem(ModToolMaterials.GREEN_DIAMOND, 6, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        DARK_DIAMOND_SWORD = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_sword"),
                new DarkDiamondSwordItem(ModToolMaterials.DARK_DIAMOND, 8, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
        );

        FUSED_DIAMOND_SWORD = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_sword"),
                new FusedDiamondSwordItem(ModToolMaterials.FUSED_DIAMOND, 13, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );

        FUSED_DIAMOND_AXE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_axe"),
                new FusedDiamondAxeItem(ModToolMaterials.FUSED_DIAMOND, 6, 2.5f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );

        FUSED_DIAMOND_HOE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_hoe"),
                new FusedDiamondHoeItem(ModToolMaterials.FUSED_DIAMOND, 3, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );

        FUSED_DIAMOND_SHOVEL = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_shovel"),
                new FusedDiamondShovelItem(ModToolMaterials.FUSED_DIAMOND, 4, 2.5f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );

        FUSED_DIAMOND_PICKAXE = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_pickaxe"),
                new FusedDiamondPickaxeItem(ModToolMaterials.FUSED_DIAMOND, 5, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );
    }

    public static void registerArmorSprites() {
        FUSED_DIAMOND_HELMET = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_helmet"),
                new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.HEAD, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );

        FUSED_DIAMOND_CHEST = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_chestplate"),
                new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.CHEST, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );

        FUSED_DIAMOND_LEGS = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_leggings"),
                new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.LEGS, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );

        FUSED_DIAMOND_BOOTS = Registry.register(
                Registry.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_boots"),
                new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.FEET, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP).rarity(Rarity.RARE))
        );
    }
}
