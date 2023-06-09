package net.henrico.bull.item.custom;

import net.henrico.bull.Bull;
import net.henrico.bull.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bull.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> BULL_SPAWN_EGG = ITEMS.register("bull_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BULL, 0x000000, 0xffffff,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
