package com.hellfire212.diamondnugget;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "diamondnugget", name = "Diamond Nugget", version = "0.0.0-0.0.0.0")
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

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_SWORD, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_PICKAXE, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_AXE, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_SHOVEL, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_HOE, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_HELMET, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_CHESTPLATE, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_LEGGINGS, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_BOOTS, new ItemStack(DIAMOND_NUGGET), 0.1f);
        FurnaceRecipes.instance().addSmelting(Items.DIAMOND_HORSE_ARMOR, new ItemStack(DIAMOND_NUGGET), 0.1f);
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