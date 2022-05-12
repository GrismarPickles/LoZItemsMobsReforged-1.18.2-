package net.grismarpickles.lozitemsmobsreforged.item;

import net.grismarpickles.lozitemsmobsreforged.LoZItemsMobsReforged;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    // Items ************
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LoZItemsMobsReforged.MOD_ID);

    public static final RegistryObject<Item> MASTERORE = ITEMS.register("master_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> LOFTSTEEL = ITEMS.register("loftsteel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> RAWLOFTSTEEL = ITEMS.register("raw_loftsteel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> GOATHORN = ITEMS.register("horn_goat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    // Weapons ************
    public static final RegistryObject<Item> ORDON_SWORD = ITEMS.register("ordon_sword",
            () -> new SwordItem(ModTiers.ORDONTIER, 5, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> GODDESS_SWORD = ITEMS.register("goddess_sword",
            () -> new SwordItem(ModTiers.GODDESSTIER, 6, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> GODDESSL_SWORD = ITEMS.register("goddess_longsword",
            () -> new SwordItem(ModTiers.GODDESSLTIER, 7, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> GODDESSW_SWORD = ITEMS.register("goddess_white_sword",
            () -> new SwordItem(ModTiers.GODDESSWTIER, 8, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> MASTER_SWORD = ITEMS.register("master_sword",
            () -> new SwordItem(ModTiers.MASTERTIER, 9, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> TRUE_MASTER_SWORD = ITEMS.register("true_master_sword",
            () -> new SwordItem(ModTiers.MASTERTIER, 11, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> TRUE_MASTER_SWORD2 = ITEMS.register("true_master_sword2",
            () -> new SwordItem(ModTiers.MASTERTIER, 13, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> TRUE_MASTER_SWORD3 = ITEMS.register("true_master_sword3",
            () -> new SwordItem(ModTiers.MASTERTIER, 13, -2.0f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static final RegistryObject<Item> AWAKENED_MASTER_SWORD = ITEMS.register("awakened_master_sword",
            () -> new SwordItem(ModTiers.MASTERTIER, 15, -2.0f,
                    new Item.Properties().tab(ModCreativeModeTab.LZIM_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
