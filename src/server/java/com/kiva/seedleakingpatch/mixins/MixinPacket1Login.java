package com.kiva.seedleakingpatch.mixins;

import net.minecraft.src.server.packets.Packet1Login;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Packet1Login.class)
public class MixinPacket1Login {
    @Shadow public long mapSeed;

    @Inject(method = "<init>(Ljava/lang/String;IJB)V", at = @At("RETURN"))
    public void dontLeakSeed(String name, int ver, long seed, byte dim, CallbackInfo ci){
        this.mapSeed = 0;
    }
}
