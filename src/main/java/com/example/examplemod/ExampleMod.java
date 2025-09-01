package com.example.examplemod;

import com.example.examplemod.init.ModBlockEntities;
import com.example.examplemod.init.ModBlocks;
import com.example.examplemod.init.ModCreativeTab;
import com.example.examplemod.init.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExampleMod(IEventBus bus) {
        bus.addListener(this::commonSetup);
        ModItems.init(bus);
        ModBlocks.init(bus);
        ModBlockEntities.init(bus);
        ModCreativeTab.init(bus);
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
}
