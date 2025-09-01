package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MOD_ID);

    public static final DeferredItem<Item> EXAMPLE = ITEMS.register("example", () -> new Item(new Item.Properties()));

    public static void init(IEventBus bus) { ITEMS.register(bus); }
}
