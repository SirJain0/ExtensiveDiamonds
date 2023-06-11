package sirjain.extensivediamonds.data;

import net.fabricmc.fabric.api.loot.v2.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import sirjain.extensivediamonds.registry.RegisterItems;

public class ModLootTableModifier {
	public static void registerLootTableModifiers() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			addItem(LootTables.VILLAGE_DESERT_HOUSE_CHEST, RegisterItems.FUSED_DIAMOND, 0.2f, id, tableBuilder);
			addItem(LootTables.ANCIENT_CITY_CHEST, RegisterItems.FUSED_DIAMOND, 0.5f, id, tableBuilder);
			addItem(LootTables.VILLAGE_ARMORER_CHEST, RegisterItems.FUSED_DIAMOND, 0.2f, id, tableBuilder);
			addItem(LootTables.VILLAGE_BUTCHER_CHEST, RegisterItems.FUSED_DIAMOND, 0.2f, id, tableBuilder);
			addItem(LootTables.VILLAGE_TEMPLE_CHEST, RegisterItems.FUSED_DIAMOND, 0.2f, id, tableBuilder);
		});
	}

	public static void addItem(Identifier target, Item item, float chance, Identifier id, FabricLootTableBuilder tableBuilder) {
		if (!target.equals(id)) return;

		LootPool.Builder poolBuilder = LootPool.builder()
			.rolls(ConstantLootNumberProvider.create(1))
			.conditionally(RandomChanceLootCondition.builder(chance))
			.with(ItemEntry.builder(item))
			.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

		tableBuilder.pool(poolBuilder.build());
	}
}
