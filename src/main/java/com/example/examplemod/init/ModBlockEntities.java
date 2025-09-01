package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ExampleMod.MOD_ID);

    /*
    public static final Supplier<BlockEntityType<ExampleBlockEntity>> EXAMPLE_BE =
            BLOCK_ENTITIES.register("example_be", () ->
                    BlockEntityType.Builder.of(ExampleBlockEntity::new, ModBlocks.EXAMPLE_BLOCK.get()).build(null));
     */

    public static void init(IEventBus bus) { BLOCK_ENTITIES.register(bus); };
}
