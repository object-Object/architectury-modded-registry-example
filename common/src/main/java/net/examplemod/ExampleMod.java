package net.examplemod;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

import java.util.Map;

public class ExampleMod {
    public static final String MOD_ID = "examplemod";

    public static void init() {}

    public static Map<ResourceKey<? extends Registry<?>>, DeferredRegister<?>> getDeferredRegisters() {
        return Map.of(
            ExampleModActions.KEY, ExampleModActions.ACTIONS
        );
    }
}
