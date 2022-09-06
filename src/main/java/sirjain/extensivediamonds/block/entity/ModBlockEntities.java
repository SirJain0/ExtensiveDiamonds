package sirjain.extensivediamonds.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sirjain.extensivediamonds.ExtensiveDiamonds;

public class ModBlockEntities {
    public static BlockEntityType<GemChargerBlockEntity> GEM_CHARGER;

    public static void registerBlockEntites() {
        GEM_CHARGER = Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                new Identifier(ExtensiveDiamonds.MOD_ID, "gem_charger"),
                FabricBlockEntityTypeBuilder.create(GemChargerBlockEntity::new,
                        ExtensiveDiamonds.GEM_CHARGER).build(null)
        );
    }
}
