package sirjain.extensivediamonds.clientutils;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public class ClientUtil {
    public static PlayerEntity getClientPlayer(){
        return MinecraftClient.getInstance().player;
    }
}
