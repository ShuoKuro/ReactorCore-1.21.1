package com.shuokuro.reactorcore.item;

import com.shuokuro.reactorcore.ReactorCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ReactorCore.MOD_ID);

    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EMPTY_FUEL_ROD = ITEMS.register("empty_fuel_rod",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> URANIUM_FUEL_ROD = ITEMS.register("uranium_fuel_rod",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
