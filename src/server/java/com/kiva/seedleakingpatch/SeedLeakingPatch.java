package com.kiva.seedleakingpatch;

import com.fox2code.foxloader.loader.Mod;
import com.fox2code.foxloader.loader.ServerMod;

public class SeedLeakingPatch extends Mod implements ServerMod {
    @Override
    public void onPostInit() {
        System.out.println("SeedLeakingPatch initialized");
    }
}
