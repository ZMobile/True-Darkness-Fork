package grondag.darkness.enforcement;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
//import net.minecraft.util.Identifier;

public class ClientModPacket {
    public static final ResourceLocation ID = new ResourceLocation("mobitone", "mobitone_mod_packet");
    //public static final CustomPacketPayload.Type<ClientModPacket> TYPE = new CustomPacketPayload.Type<>(ID);

    public static FriendlyByteBuf create() {
        // Add any custom data to the packet if needed
        return PacketByteBufs.create();
    }

    public static ResourceLocation getId() {
        return ID;
    }
}