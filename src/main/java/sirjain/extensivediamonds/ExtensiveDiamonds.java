package sirjain.extensivediamonds;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirjain.extensivediamonds.block.gem_charger.entity.EDBlockEntities;
import sirjain.extensivediamonds.data.EDLootTableModifier;
import sirjain.extensivediamonds.data.EDOrePlacement.EDOreGeneration;
import sirjain.extensivediamonds.painting.EDPaintings;
import sirjain.extensivediamonds.items.EDItemGroup;
import sirjain.extensivediamonds.block.EDBlocks;
import sirjain.extensivediamonds.items.EDItems;
import sirjain.extensivediamonds.block.gem_charger.screen.EDScreenHandlers;

public class ExtensiveDiamonds implements ModInitializer {
	public static final String MOD_ID = "extensivediamonds";
	private static final String INIT_MESSAGE = "Hello, Extensive Diamonds!";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		System.out.println(INIT_MESSAGE);

		EDItems.registerDiamonds();
		EDItems.registerCombat();
		EDItems.registerArmorSprites();
		EDBlocks.registerOres();
		EDBlocks.registerOreBlocks();
		EDBlocks.registerGemCharger();

		EDOreGeneration.registerOres();
		EDPaintings.registerPaintings();
		EDBlockEntities.registerBlockEntities();
		EDScreenHandlers.registerScreenHandlers();
		EDLootTableModifier.registerLootTableModifiers();

		EDItemGroup.registerItemGroup();
	}
}