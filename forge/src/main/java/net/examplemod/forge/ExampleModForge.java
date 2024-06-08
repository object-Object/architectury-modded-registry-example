package net.examplemod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.examplemod.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(ExampleMod.MOD_ID, modEventBus);
        ExampleMod.init();
        ExampleMod.getDeferredRegisters().forEach((key, register) -> {
            modEventBus.addListener((RegisterEvent event) -> {
                if (event.getRegistryKey().equals(key)) {
                    register.register();
                }
            });
        });
    }
}
