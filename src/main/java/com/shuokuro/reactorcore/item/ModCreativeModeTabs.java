package com.shuokuro.reactorcore.item;

import com.shuokuro.reactorcore.ReactorCore;
import com.shuokuro.reactorcore.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReactorCore.MOD_ID);

    public static final Supplier<CreativeModeTab> REACTOR_ITEMS_TAB = CREATIVE_MODE_TAB.register("reactor_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.URANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.reatorcore.reactor_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.RAW_URANIUM);
                        output.accept(Moditems.URANIUM_INGOT);
                        output.accept(Moditems.EMPTY_FUEL_ROD);
                        output.accept(Moditems.URANIUM_FUEL_ROD);

                    }).build());


    public static final Supplier<CreativeModeTab> REACTOR_BLOCKS_TAB = CREATIVE_MODE_TAB.register("reactor_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.URANIUM_ORE))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ReactorCore.MOD_ID, "reactor_items_tab"))
                    .title(Component.translatable("creativetab.reatorcore.reactor_block"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.URANIUM_ORE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
