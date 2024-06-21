package grondag.darkness;

import grondag.darkness.config.DarknessConfig;
import grondag.darkness.enforcement.ClientModPacket;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;

public class DarknessInit implements ModInitializer {
    @Override
    public void onInitialize() {
        AutoConfig.register(DarknessConfig.class, JanksonConfigSerializer::new);
        ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
            ClientPlayNetworking.send(ClientModPacket.ID, ClientModPacket.create());
        });
    }
}
