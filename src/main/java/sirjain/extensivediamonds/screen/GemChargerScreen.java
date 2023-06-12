package sirjain.extensivediamonds.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sirjain.extensivediamonds.ExtensiveDiamonds;

public class GemChargerScreen extends HandledScreen<GemChargerScreenHandler> {
    public static final Identifier GUI_TEXTURE = new Identifier(ExtensiveDiamonds.MOD_ID, "textures/gui/gem_charger_gui.png");

    public GemChargerScreen(GemChargerScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(GUI_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);

        renderProgressArrow(context, x, y);
    }

//    @Override
//    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
//        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
//        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
//        RenderSystem.setShaderTexture(0, GUI_TEXTURE);
//        int x = (width - backgroundWidth) / 2;
//        int y = (height - backgroundHeight) / 2;
//        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
//
//        renderProgressArrow(matrices, x, y);
//    }

    private void renderProgressArrow(DrawContext context, int x, int y) {
        if (handler.isCrafting()) {
            context.drawTexture(GUI_TEXTURE, x + 61, y + 39, 0, 171, handler.getScaledProgress(), 13);
            // u and v = coordinates of progress bar texture
            // x and y = coordinates of starting point
            // height = height of progress bar's dimensions
        }
    }

//    @Override
//    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float delta) {
//        renderBackground(matrixStack);
//        super.render(matrixStack, mouseX, mouseY, delta);
//        drawMouseoverTooltip(matrixStack, mouseX, mouseY);
//    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
