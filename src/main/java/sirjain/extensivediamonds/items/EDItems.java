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
		RED_DIAMOND = registerBasicItem("red_diamond");
		GREEN_DIAMOND = registerBasicItem("green_diamond");
		DARK_DIAMOND = registerBasicItem("dark_diamond");
		FUSED_DIAMOND = registerBasicItemWithSettings("fused_diamond", new Item.Settings().rarity(Rarity.UNCOMMON));
	}

	public static void registerCombat() {
		RED_DIAMOND_SWORD = registerCustomItem("red_diamond_sword", new RedDiamondSwordItem(EDToolMaterials.RED_DIAMOND, 5, -2.8f, new Item.Settings()));
		GREEN_DIAMOND_SWORD = registerCustomItem("green_diamond_sword", new GreenDiamondSwordItem(EDToolMaterials.GREEN_DIAMOND, 6, -2.8f, new Item.Settings()));
		DARK_DIAMOND_SWORD = registerCustomItem("dark_diamond_sword", new DarkDiamondSwordItem(EDToolMaterials.DARK_DIAMOND, 8, -2.5f, new Item.Settings()));

		FUSED_DIAMOND_SWORD = registerCustomItem("fused_diamond_sword", new FusedDiamondSwordItem(EDToolMaterials.FUSED_DIAMOND, 13, -2f, new Item.Settings().rarity(Rarity.UNCOMMON)));
		FUSED_DIAMOND_AXE = registerCustomItem("fused_diamond_axe", new FusedDiamondAxeItem(EDToolMaterials.FUSED_DIAMOND, 6, -2.5f, new Item.Settings().rarity(Rarity.UNCOMMON)));
		FUSED_DIAMOND_HOE = registerCustomItem("fused_diamond_hoe", new FusedDiamondHoeItem(EDToolMaterials.FUSED_DIAMOND, 3, -2.5f, new Item.Settings().rarity(Rarity.UNCOMMON)));
		FUSED_DIAMOND_SHOVEL = registerCustomItem("fused_diamond_shovel", new FusedDiamondShovelItem(EDToolMaterials.FUSED_DIAMOND, 4, -2.7f, new Item.Settings().rarity(Rarity.UNCOMMON)));
		FUSED_DIAMOND_PICKAXE = registerCustomItem("fused_diamond_pickaxe",new FusedDiamondPickaxeItem(EDToolMaterials.FUSED_DIAMOND, 5, -2.7f, new Item.Settings().rarity(Rarity.UNCOMMON)));
	}

	public static void registerArmorSprites() {
		FUSED_DIAMOND_HELMET = registerFusedArmorItem("fused_diamond_helmet", ArmorItem.Type.HELMET);
		FUSED_DIAMOND_CHEST = registerFusedArmorItem("fused_diamond_chestplate", ArmorItem.Type.CHESTPLATE);
		FUSED_DIAMOND_LEGS = registerFusedArmorItem("fused_diamond_leggings", ArmorItem.Type.LEGGINGS);
		FUSED_DIAMOND_BOOTS = registerFusedArmorItem("fused_diamond_boots", ArmorItem.Type.BOOTS);
	}

	public static Item registerBasicItem(String id) {
		return Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, id),
			new Item(new Item.Settings())
		);
	}

	public static Item registerBasicItemWithSettings(String id, Item.Settings settings) {
		return Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, id),
			new Item(settings)
		);
	}

	public static Item registerCustomItem(String id, Item item) {
		return Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, id),
			item
		);
	}

	public static Item registerFusedArmorItem(String id, ArmorItem.Type type) {
		return Registry.register(
			Registries.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, id),
			new FusedDiamondArmor(FusedDiamondArmorMaterial.MATERIAL, type, new Item.Settings().rarity(Rarity.UNCOMMON))
		);
	}
}
