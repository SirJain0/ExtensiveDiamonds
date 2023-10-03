package sirjain.extensivediamonds.block.gem_charger.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
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

	protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
		int x = (width - backgroundWidth) / 2;
		int y = (height - backgroundHeight) / 2;

		RenderSystem.setShader(GameRenderer::getPositionTexProgram);
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
		RenderSystem.setShaderTexture(0, GUI_TEXTURE);

		context.drawTexture(GUI_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
		renderProgressArrow(context, x, y);
	}

	/*
	u and v = coordinates of progress bar texture
	x and y = coordinates of starting point
	height = height of progress bar's dimensions
	*/
	 private void renderProgressArrow(DrawContext context, int x, int y) {
		if (handler.isCrafting())
			context.drawTexture(GUI_TEXTURE, x + 19, y + 53, 0, 173, handler.getScaledProgress(), 13);
	}

	public void render(DrawContext context, int mouseX, int mouseY, float delta) {
		renderBackground(context, mouseX, mouseY, delta);
		super.render(context, mouseX, mouseY, delta);
		drawMouseoverTooltip(context, mouseX, mouseY);
	}
}
