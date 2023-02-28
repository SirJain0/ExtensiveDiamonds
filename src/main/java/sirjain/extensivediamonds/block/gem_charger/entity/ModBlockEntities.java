package sirjain.extensivediamonds.block.gem_charger.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sirjain.extensivediamonds.ExtensiveDiamonds;
import sirjain.extensivediamonds.registry.RegisterBlocks;

public class ModBlockEntities {
    public static BlockEntityType<GemChargerBlockEntity> GEM_CHARGER;

    public static void registerBlockEntities() {
        GEM_CHARGER = Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                new Identifier(ExtensiveDiamonds.MOD_ID, "gem_charger"),
                FabricBlockEntityTypeBuilder.create(GemChargerBlockEntity::new,
                        RegisterBlocks.GEM_CHARGER).build(null));
    }
}
