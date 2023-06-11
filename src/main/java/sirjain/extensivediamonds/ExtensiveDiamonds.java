package sirjain.extensivediamonds;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirjain.extensivediamonds.block.gem_charger.entity.ModBlockEntities;
import sirjain.extensivediamonds.data.ModLootTableModifier;
import sirjain.extensivediamonds.data.ModOreGeneration;
import sirjain.extensivediamonds.data.ModOrePlacement;
import sirjain.extensivediamonds.painting.ModPaintings;
import sirjain.extensivediamonds.registry.ModItemGroup;
import sirjain.extensivediamonds.registry.RegisterBlocks;
import sirjain.extensivediamonds.registry.RegisterItems;
import sirjain.extensivediamonds.screen.ModScreenHandlers;

public class ExtensiveDiamonds implements ModInitializer {
	public static final String MOD_ID = "extensivediamonds";
	private static final String messageNameInitialize = "Hello, Extensive Diamonds!";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		System.out.println(messageNameInitialize);

		ModItemGroup.registerItemGroup();

		RegisterItems.registerDiamonds();
		RegisterItems.registerCombat();
		RegisterItems.registerArmorSprites();
		RegisterItems.addItemsToTabs();
		RegisterBlocks.registerOres();
		RegisterBlocks.registerOreBlocks();
		RegisterBlocks.registerGemCharger();
		RegisterBlocks.addItemsToTabs();

		ModOreGeneration.registerOres();
		ModPaintings.registerPaintings();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModLootTableModifier.registerLootTableModifiers();
	}
}