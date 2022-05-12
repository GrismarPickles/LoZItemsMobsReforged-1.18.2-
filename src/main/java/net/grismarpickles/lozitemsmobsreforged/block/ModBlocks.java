package net.grismarpickles.lozitemsmobsreforged.block;

import net.grismarpickles.lozitemsmobsreforged.LoZItemsMobsReforged;
import net.grismarpickles.lozitemsmobsreforged.item.ModCreativeModeTab;
import net.grismarpickles.lozitemsmobsreforged.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LoZItemsMobsReforged.MOD_ID);

    public static final RegistryObject<Block> LOFTSTEEL_ORE = registerBlock("loftsteel_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.LZIM_TAB);
    public static final RegistryObject<Block> LOFTSTEEL_BLOCK = registerBlock("loftsteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(11f).requiresCorrectToolForDrops()), ModCreativeModeTab.LZIM_TAB);
    public static final RegistryObject<Block> RAW_LOFTSTEEL_BLOCK = registerBlock("raw_loftsteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.LZIM_TAB);
    public static final RegistryObject<Block> MASTERORE_BLOCK = registerBlock("masterore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(11f).requiresCorrectToolForDrops()), ModCreativeModeTab.LZIM_TAB);
    public static final RegistryObject<Block> DEEPSLATE_MASTERORE_BLOCK = registerBlock("deepslate_masterore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(16f).requiresCorrectToolForDrops()), ModCreativeModeTab.LZIM_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
