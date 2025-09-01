package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    public static final Supplier<CreativeModeTab> EXAMPLE_TAB = TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.examplemod"))
            .icon(() -> new ItemStack(ModBlocks.EXAMPLE_BLOCK.get()))
            .displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output output) -> {
                ModItems.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                ModBlocks.BLOCKS.getEntries().forEach(block -> output.accept(new ItemStack(block.get())));
            })
            .build()
    );

    public static void init(IEventBus bus) { TABS.register(bus); }
}
