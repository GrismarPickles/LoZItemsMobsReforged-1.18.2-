package net.grismarpickles.lozitemsmobsreforged.painting;

import net.grismarpickles.lozitemsmobsreforged.LoZItemsMobsReforged;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings
{
    public static final DeferredRegister<Motive> PAINTING_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, LoZItemsMobsReforged.MOD_ID);

    public static final RegistryObject<Motive> GANONPAINTING =
            PAINTING_MOTIVES.register("ganonpainting", () -> new Motive(16,16));

    public static void register(IEventBus eventbus)
    {
        PAINTING_MOTIVES.register(eventbus);
    }
}
