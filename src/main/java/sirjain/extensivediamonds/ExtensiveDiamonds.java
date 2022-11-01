package sirjain.extensivediamonds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirjain.extensivediamonds.block.gem_charger.entity.ModBlockEntities;
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