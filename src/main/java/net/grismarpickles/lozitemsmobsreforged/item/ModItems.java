package net.grismarpickles.lozitemsmobsreforged.item;

import net.grismarpickles.lozitemsmobsreforged.LoZItemsMobsReforged;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LoZItemsMobsReforged.MOD_ID);

    public static final RegistryObject<Item> MASTERORE = ITEMS.register("master_ore",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> LOFTSTEEL = ITEMS.register("loftsteel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> RAWLOFTSTEEL = ITEMS.register("raw_loftsteel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}