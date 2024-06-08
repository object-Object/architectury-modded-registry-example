package net.examplemod;

import at.petrak.hexcasting.api.casting.ActionRegistryEntry;
import at.petrak.hexcasting.api.casting.castables.Action;
import at.petrak.hexcasting.api.casting.iota.DoubleIota;
import at.petrak.hexcasting.api.casting.math.HexDir;
import at.petrak.hexcasting.api.casting.math.HexPattern;
import at.petrak.hexcasting.common.lib.HexRegistries;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public class ExampleModActions {
    public static final ResourceKey<Registry<ActionRegistryEntry>> KEY = HexRegistries.ACTION;
    public static final DeferredRegister<ActionRegistryEntry> ACTIONS = DeferredRegister.create(
        ExampleMod.MOD_ID,
        KEY
    );

    public static final RegistrySupplier<ActionRegistryEntry> EXAMPLE_ACTION = ACTIONS.register(
        "example_action",
        () -> new ActionRegistryEntry(
            HexPattern.fromAngles("aqwed", HexDir.EAST),
            Action.makeConstantOp(new DoubleIota(0.0))
        )
    );
}
