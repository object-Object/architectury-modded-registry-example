package net.examplemod;

public class ExampleMod {
    public static final String MOD_ID = "examplemod";

    public static void init() {}

    public static void initRegistries() {
        ExampleModActions.ACTIONS.register();
    }
}
