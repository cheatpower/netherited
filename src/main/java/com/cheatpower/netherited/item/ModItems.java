package com.cheatpower.netherited.item;

import com.cheatpower.netherited.Netherited;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Netherited.MOD_ID);


public static final DeferredItem<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot",
        () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



}
