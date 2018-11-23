package com.hellfire212.diamondnugget;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "diamondnugget", useMetadata = true)
@Mod.EventBusSubscriber
public class DiamondNugget {
    private static Item DIAMOND_NUGGET;

    static {
        DIAMOND_NUGGET = new Item()
                .setRegistryName("diamond_nugget")
                .setUnlocalizedName("diamond_nugget")
                .setCreativeTab(CreativeTabs.MISC)
                .setMaxStackSize(64);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(DIAMOND_NUGGET);
        OreDictionary.registerOre("nuggetDiamond", DIAMOND_NUGGET);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(DIAMOND_NUGGET, 0, new ModelResourceLocation(DIAMOND_NUGGET.getRegistryName(), "inventory"));
    }
}