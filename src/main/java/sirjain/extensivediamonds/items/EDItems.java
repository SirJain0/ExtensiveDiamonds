package sirjain.extensivediamonds.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import sirjain.extensivediamonds.ExtensiveDiamonds;
import sirjain.extensivediamonds.items.material.FusedDiamondArmor;
import sirjain.extensivediamonds.items.material.FusedDiamondArmorMaterial;
import sirjain.extensivediamonds.items.material.EDToolMaterials;
import sirjain.extensivediamonds.items.swords.DarkDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.FusedDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.GreenDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.RedDiamondSwordItem;
import sirjain.extensivediamonds.items.tools.FusedDiamondAxeItem;
import sirjain.extensivediamonds.items.tools.FusedDiamondHoeItem;
import sirjain.extensivediamonds.items.tools.FusedDiamondPickaxeItem;
import sirjain.extensivediamonds.items.tools.FusedDiamondShovelItem;

public class EDItems {
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
			new RedDiamondSwordItem(EDToolMaterials.RED_DIAMOND, 5, -2.8f, new Item.Settings())
		);

		GREEN_DIAMOND_SWORD = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_sword"),
			new GreenDiamondSwordItem(EDToolMaterials.GREEN_DIAMOND, 6, -2.8f, new Item.Settings())
		);

		DARK_DIAMOND_SWORD = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_sword"),
			new DarkDiamondSwordItem(EDToolMaterials.DARK_DIAMOND, 8, -2.5f, new Item.Settings())
		);

		FUSED_DIAMOND_SWORD = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_sword"),
			new FusedDiamondSwordItem(EDToolMaterials.FUSED_DIAMOND, 13, -2f, new Item.Settings())
		);

		FUSED_DIAMOND_AXE = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_axe"),
			new FusedDiamondAxeItem(EDToolMaterials.FUSED_DIAMOND, 6, -2.5f, new Item.Settings())
		);

		FUSED_DIAMOND_HOE = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_hoe"),
			new FusedDiamondHoeItem(EDToolMaterials.FUSED_DIAMOND, 3, -2.5f, new Item.Settings())
		);

		FUSED_DIAMOND_SHOVEL = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_shovel"),
			new FusedDiamondShovelItem(EDToolMaterials.FUSED_DIAMOND, 4, -2.7f, new Item.Settings())
		);

		FUSED_DIAMOND_PICKAXE = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_pickaxe"),
			new FusedDiamondPickaxeItem(EDToolMaterials.FUSED_DIAMOND, 5, -2.7f, new Item.Settings().rarity(Rarity.UNCOMMON))
		);
	}

	public static void registerArmorSprites() {
		FUSED_DIAMOND_HELMET = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_helmet"),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.material, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.UNCOMMON))
		);

		FUSED_DIAMOND_CHEST = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_chestplate"),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.material, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.UNCOMMON))
		);

		FUSED_DIAMOND_LEGS = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_leggings"),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.material, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.UNCOMMON))
		);

		FUSED_DIAMOND_BOOTS = Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond_boots"),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.material, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.UNCOMMON))
		);
	}
}