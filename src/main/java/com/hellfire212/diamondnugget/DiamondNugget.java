package com.hellfire212.diamondnugget;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(DiamondNugget.MODID)
@Mod.EventBusSubscriber(modid = DiamondNugget.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiamondNugget
{
    public static final String MODID = "diamondnugget";

    public DiamondNugget() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DiamondNugget.MODID);

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register(
            "diamond_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
}
