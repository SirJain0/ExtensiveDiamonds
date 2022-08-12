package sirjain.extensivediamonds.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sirjain.extensivediamonds.ExtensiveDiamonds;

public class ModPaintings {

    public static final PaintingVariant GEMS = registerPainting("gems", new PaintingVariant(32, 16));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(ExtensiveDiamonds.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        ExtensiveDiamonds.LOGGER.debug("Registering paintings for Extensive Diamonds!");
    }
}
