package com.BXVK.bettterintens.util;

import com.BXVK.armor.BArmorMaterial;
import com.BXVK.bettterintens.BetterItens;
import com.BXVK.bettterintens.blocks.BPlankBlock;
import com.BXVK.bettterintens.blocks.BlockItemBase;
import com.BXVK.bettterintens.blocks.FlintBlock;
import com.BXVK.bettterintens.blocks.MeteoriteBlock;
import com.BXVK.bettterintens.items.ItemBase;
import com.BXVK.bettterintens.tools.BItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BetterItens.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BetterItens.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items

    public static final RegistryObject<Item> BWOOD = ITEMS.register("rough_wood", ItemBase::new);

    public static final RegistryObject<Item> BROCK = ITEMS.register("rough_stone", ItemBase::new);

    //Tools
    //ROUGH WOOD
    public static final RegistryObject<SwordItem> BSWORD = ITEMS.register("rough_wood_sword", ()->
    new SwordItem(BItemTier.ROUGH, 3, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<AxeItem> BAXE = ITEMS.register("rough_wood_axe", ()->
    new AxeItem(BItemTier.ROUGH, 4, -3.1F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<PickaxeItem> BPICKAXE = ITEMS.register("rough_wood_pickaxe", ()->
            new PickaxeItem(BItemTier.ROUGH, 0, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ShovelItem> BSHOVEL = ITEMS.register("rough_wood_shovel", ()->
            new ShovelItem(BItemTier.ROUGH, 0, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<HoeItem> BHOE = ITEMS.register("rough_wood_hoe", ()->
            new HoeItem(BItemTier.ROUGH, 0.0F, new Item.Properties().group(BetterItens.TAB)));

    //METEORITE

    public static final RegistryObject<SwordItem> MSWORD = ITEMS.register("meteorite_sword", ()->
            new SwordItem(BItemTier.METEOR, 4, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<PickaxeItem> MPICKAXE = ITEMS.register("meteorite_pickaxe", ()->
            new PickaxeItem(BItemTier.METEOR, -2, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<AxeItem> MAXE = ITEMS.register("meteorite_axe", ()->
            new AxeItem(BItemTier.METEOR, 6, -3.1F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ShovelItem> MSHOVEL = ITEMS.register("meteorite_shovel", ()->
            new ShovelItem(BItemTier.METEOR, -2, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<HoeItem> MHOE = ITEMS.register("meteorite_hoe", ()->
            new HoeItem(BItemTier.METEOR, 0.0F, new Item.Properties().group(BetterItens.TAB)));

    //FLINT

    public static final RegistryObject<SwordItem> FSWORD = ITEMS.register("flint_sword", ()->
            new SwordItem(BItemTier.FLINT, 2, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<PickaxeItem> FPICKAXE = ITEMS.register("flint_pickaxe", ()->
            new PickaxeItem(BItemTier.FLINT, 0, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<AxeItem> FAXE = ITEMS.register("flint_axe", ()->
            new AxeItem(BItemTier.FLINT, 3, -3.1F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ShovelItem> FSHOVEL = ITEMS.register("flint_shovel", ()->
            new ShovelItem(BItemTier.FLINT, 0, -2.4F, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<HoeItem> FHOE = ITEMS.register("flint_hoe", ()->
            new HoeItem(BItemTier.FLINT, 0.0F, new Item.Properties().group(BetterItens.TAB)));

    //Armor
    //rough
    public static final RegistryObject<ArmorItem> ROUGH_HELMET = ITEMS.register("rough_wood_helmet", () ->
            new ArmorItem(BArmorMaterial.ROUGH, EquipmentSlotType.HEAD, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> ROUGH_CHEST = ITEMS.register("rough_wood_chest", () ->
            new ArmorItem(BArmorMaterial.ROUGH, EquipmentSlotType.CHEST, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> ROUGH_LEGGINGS = ITEMS.register("rough_wood_leggings", () ->
            new ArmorItem(BArmorMaterial.ROUGH, EquipmentSlotType.LEGS, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> ROUGH_BOOTS = ITEMS.register("rough_wood_boots", () ->
            new ArmorItem(BArmorMaterial.ROUGH, EquipmentSlotType.FEET, new Item.Properties().group(BetterItens.TAB)));

    //flint

    public static final RegistryObject<ArmorItem> FLINT_HELMET = ITEMS.register("flint_helmet", () ->
            new ArmorItem(BArmorMaterial.FLINT, EquipmentSlotType.HEAD, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> FLINT_CHEST = ITEMS.register("flint_chest", () ->
            new ArmorItem(BArmorMaterial.FLINT, EquipmentSlotType.CHEST, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> FLINT_LEGGINGS = ITEMS.register("flint_leggings", () ->
            new ArmorItem(BArmorMaterial.FLINT, EquipmentSlotType.LEGS, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> FLINT_BOOTS = ITEMS.register("flint_boots", () ->
            new ArmorItem(BArmorMaterial.FLINT, EquipmentSlotType.FEET, new Item.Properties().group(BetterItens.TAB)));

    //meteorite

    public static final RegistryObject<ArmorItem> METEORITE_HELMET = ITEMS.register("meteorite_helmet", () ->
            new ArmorItem(BArmorMaterial.METEOR, EquipmentSlotType.HEAD, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> METEORITE_CHEST = ITEMS.register("meteorite_chest", () ->
            new ArmorItem(BArmorMaterial.METEOR, EquipmentSlotType.CHEST, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> METEORITE_LEGGINGS = ITEMS.register("meteorite_leggings", () ->
            new ArmorItem(BArmorMaterial.METEOR, EquipmentSlotType.LEGS, new Item.Properties().group(BetterItens.TAB)));

    public static final RegistryObject<ArmorItem> METEORITE_BOOTS = ITEMS.register("meteorite_boots", () ->
            new ArmorItem(BArmorMaterial.METEOR, EquipmentSlotType.FEET, new Item.Properties().group(BetterItens.TAB)));

    //blocks

    public static final RegistryObject<Block> BPLANK = BLOCKS.register("rough_plank",
            BPlankBlock::new);

    public static final RegistryObject<Block> METEORITE = BLOCKS.register("meteorite",
            MeteoriteBlock::new);

    public static final RegistryObject<Block> BFLINT = BLOCKS.register("rough_flint_block",
            FlintBlock::new);


    //BlockItems

    public static final RegistryObject<Item> BPLANK_ITEM = ITEMS.register("rough_plank", ()-> new BlockItemBase(BPLANK.get()));
    public static final RegistryObject<Item> METEORITE_ITEM = ITEMS.register("meteorite", ()-> new BlockItemBase(METEORITE.get()));
    public static final RegistryObject<Item> BFLINT_ITEM = ITEMS.register("rough_flint_block", ()-> new BlockItemBase(BFLINT.get()));
}
