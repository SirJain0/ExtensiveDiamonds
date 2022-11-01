package sirjain.extensivediamonds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfDarkDiamond;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfGreenDiamond;
import sirjain.extensivediamonds.block.ore_blocks.BlockOfRedDiamond;
import sirjain.extensivediamonds.block.gem_charger.GemChargerBlock;
import sirjain.extensivediamonds.block.gem_charger.entity.ModBlockEntities;
import sirjain.extensivediamonds.items.material.FusedDiamondArmor;
import sirjain.extensivediamonds.items.material.FusedDiamondArmorMaterial;
import sirjain.extensivediamonds.items.swords.DarkDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.FusedDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.GreenDiamondSwordItem;
import sirjain.extensivediamonds.items.swords.RedDiamondSwordItem;
import sirjain.extensivediamonds.items.material.ModToolMaterials;
import sirjain.extensivediamonds.items.toolset.*;
import sirjain.extensivediamonds.painting.ModPaintings;
import sirjain.extensivediamonds.registry.RegisterBlocks;
import sirjain.extensivediamonds.registry.RegisterItems;
import sirjain.extensivediamonds.screen.ModScreenHandlers;
import sirjain.extensivediamonds.world.feature.ModConfiguredFeatures;
import sirjain.extensivediamonds.world.gen.ModOreGeneration;

public class ExtensiveDiamonds implements ModInitializer {
	public static final String MOD_ID = "extensivediamonds";
	private static final String messageNameInitialize = "Hello, Extensive Diamonds!";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup EXTENSIVEDIAMONDS_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, MOD_ID), () -> new ItemStack(RegisterItems.FUSED_DIAMOND));

	@Override
	public void onInitialize() {
		System.out.println(messageNameInitialize);

		RegisterBlocks.registerOres();
		RegisterBlocks.registerOreBlocks();
		RegisterItems.registerDiamonds();
		RegisterItems.registerCombat();
		RegisterItems.registerArmorSprites();
		RegisterBlocks.registerGemCharger();

		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();
		ModPaintings.registerPaintings();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}