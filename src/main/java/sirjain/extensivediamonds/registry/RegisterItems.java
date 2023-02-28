package sirjain.extensivediamonds.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
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
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond"),
                new Item(new Item.Settings())
        );

        GREEN_DIAMOND = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond"),
                new Item(new Item.Settings())
        );

        DARK_DIAMOND = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond"),
                new Item(new Item.Settings())
        );

        FUSED_DIAMOND = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond"),
                new Item(new Item.Settings().rarity(Rarity.UNCOMMON))
        );
    }

    public static void registerCombat() {
        RED_DIAMOND_SWORD = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_sword"),
                new RedDiamondSwordItem(ModToolMaterials.RED_DIAMOND, 5, 2f, new Item.Settings())
        );

        GREEN_DIAMOND_SWORD = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_sword"),
                new GreenDiamondSwordItem(ModToolMaterials.GREEN_DIAMOND, 6, 2f, new Item.Settings())
        );

        DARK_DIAMOND_SWORD = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_sword"),
                new DarkDiamondSwordItem(ModToolMaterials.DARK_DIAMOND, 8, 2f, new Item.Settings())
        );

        FUSED_DIAMOND_SWORD = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_sword"),
                new FusedDiamondSwordItem(ModToolMaterials.FUSED_DIAMOND, 13, 2f, new Item.Settings())
        );

        FUSED_DIAMOND_AXE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_axe"),
                new FusedDiamondAxeItem(ModToolMaterials.FUSED_DIAMOND, 6, 2.5f, new Item.Settings())
        );

        FUSED_DIAMOND_HOE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_hoe"),
                new FusedDiamondHoeItem(ModToolMaterials.FUSED_DIAMOND, 3, 2f, new Item.Settings())
        );

        FUSED_DIAMOND_SHOVEL = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_shovel"),
                new FusedDiamondShovelItem(ModToolMaterials.FUSED_DIAMOND, 4, 2.5f, new Item.Settings())
        );

        FUSED_DIAMOND_PICKAXE = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_pickaxe"),
                new FusedDiamondPickaxeItem(ModToolMaterials.FUSED_DIAMOND, 5, 2f, new Item.Settings().rarity(Rarity.UNCOMMON))
        );
    }

    public static void registerArmorSprites() {
        FUSED_DIAMOND_HELMET = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_helmet"),
                new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.HEAD, new Item.Settings().rarity(Rarity.UNCOMMON))
        );

        FUSED_DIAMOND_CHEST = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_chestplate"),
                new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.CHEST, new Item.Settings().rarity(Rarity.UNCOMMON))
        );

        FUSED_DIAMOND_LEGS = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_leggings"),
                new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.LEGS, new Item.Settings().rarity(Rarity.UNCOMMON))
        );

        FUSED_DIAMOND_BOOTS = Registry.register(
                Registries.ITEM,
                new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_boots"),
                new FusedDiamondArmor(FusedDiamondArmorMaterial.material, EquipmentSlot.FEET, new Item.Settings().rarity(Rarity.UNCOMMON))
        );
    }

    public static void addItemsToTabs() {
        addItemToTab(RED_DIAMOND);
        addItemToTab(GREEN_DIAMOND);
        addItemToTab(DARK_DIAMOND);
        addItemToTab(FUSED_DIAMOND);
        addItemToTab(RED_DIAMOND_SWORD);
        addItemToTab(GREEN_DIAMOND_SWORD);
        addItemToTab(DARK_DIAMOND_SWORD);
        addItemToTab(FUSED_DIAMOND_SWORD);
        addItemToTab(FUSED_DIAMOND_AXE);
        addItemToTab(FUSED_DIAMOND_SHOVEL);
        addItemToTab(FUSED_DIAMOND_HOE);
        addItemToTab(FUSED_DIAMOND_PICKAXE);
        addItemToTab(FUSED_DIAMOND_HELMET);
        addItemToTab(FUSED_DIAMOND_CHEST);
        addItemToTab(FUSED_DIAMOND_LEGS);
        addItemToTab(FUSED_DIAMOND_BOOTS);
    }


    public static void addItemToTab(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.EXTENSIVEDIAMONDS_ITEM_GROUP).register(entries -> entries.add(item));
    }
}
