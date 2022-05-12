package net.grismarpickles.lozitemsmobsreforged.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers
{
    public static final ForgeTier ORDONTIER = new ForgeTier(2, 600, 1.6f, 0f, 14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.IRON_INGOT));
    public static final ForgeTier GODDESSTIER = new ForgeTier(3, 1100, 1.6f, 0f, 16, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.LOFTSTEEL.get()));
    public static final ForgeTier GODDESSLTIER = new ForgeTier(3, 3300, 1.6f, 0f, 16, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.LOFTSTEEL.get()));
    public static final ForgeTier GODDESSWTIER = new ForgeTier(3, 3400, 1.6f, 0f, 16, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.LOFTSTEEL.get()));
    public static final ForgeTier MASTERTIER = new ForgeTier(3, -1, 1.6f, 0f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.MASTERORE.get()));
}
