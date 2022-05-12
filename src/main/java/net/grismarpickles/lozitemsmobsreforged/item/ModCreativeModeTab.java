package net.grismarpickles.lozitemsmobsreforged.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab LZIM_TAB = new CreativeModeTab("lzimtab01")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TRUE_MASTER_SWORD.get());
        }
    };
}
