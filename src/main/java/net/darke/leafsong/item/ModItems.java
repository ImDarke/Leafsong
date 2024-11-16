package net.darke.leafsong.item;

import net.darke.leafsong.Leafsong;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Leafsong.MODID);

    public static final DeferredItem<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_MILK_BUCKET = ITEMS.register("goat_milk_bucket",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_MILK_BOTTLE = ITEMS.register("goat_milk_bottle",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
