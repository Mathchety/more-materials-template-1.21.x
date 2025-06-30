package net.matthew.more_materials.item;

import net.matthew.more_materials.MoreMaterials;
import net.matthew.more_materials.item.custom.HammerItem;
import net.matthew.more_materials.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER, 3, -2.4f))));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 1, -2.8f))));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 5, -3.2f))));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER, 1.5f, -3.0f))));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER, -3, 0f))));
    public static final Item COPPER_HAMMER = registerItem("copper_hammer",
            new HammerItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 6, -3.2f))));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ModArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));
    public static final Item COPPER_HORSE_ARMOR = registerItem("copper_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings()
                    .maxCount(1)));

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_SWORD = registerItem("aluminium_sword",
            new SwordItem(ModToolMaterials.ALUMINIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM, 3, -2.4f))));
    public static final Item ALUMINIUM_PICKAXE = registerItem("aluminium_pickaxe",
            new PickaxeItem(ModToolMaterials.ALUMINIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM, 1, -2.8f))));
    public static final Item ALUMINIUM_AXE = registerItem("aluminium_axe",
            new AxeItem(ModToolMaterials.ALUMINIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM, 5, -3.2f))));
    public static final Item ALUMINIUM_SHOVEL = registerItem("aluminium_shovel",
            new ShovelItem(ModToolMaterials.ALUMINIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM, 1.5f, -3.0f))));
    public static final Item ALUMINIUM_HOE = registerItem("aluminium_hoe",
            new HoeItem(ModToolMaterials.ALUMINIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM, -3, 0f))));
    public static final Item ALUMINIUM_HAMMER = registerItem("aluminium_hammer",
            new HammerItem(ModToolMaterials.ALUMINIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM, 6, -3.2f))));

    public static final Item ALUMINIUM_HELMET = registerItem("aluminium_helmet",
            new ModArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item ALUMINIUM_CHESTPLATE = registerItem("aluminium_chestplate",
            new ArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item ALUMINIUM_LEGGINGS = registerItem("aluminium_leggings",
            new ArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item ALUMINIUM_BOOTS = registerItem("aluminium_boots",
            new ArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));
    public static final Item ALUMINIUM_HORSE_ARMOR = registerItem("aluminium_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings()
                    .maxCount(1)));


    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.EMERALD, 3, -2.4f))));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new PickaxeItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 1, -2.8f))));
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new AxeItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 5, -3.2f))));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EMERALD, 1.5f, -3.0f))));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new HoeItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.EMERALD, -3, 0f))));
    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new HammerItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 6, -3.2f))));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ModArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));
    public static final Item EMERALD_HORSE_ARMOR = registerItem("emerald_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings()
                    .maxCount(1)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, 3, -2.4f))));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 1, -2.8f))));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 5, -3.2f))));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STEEL, 1.5f, -3.0f))));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STEEL, -3, 0f))));
    public static final Item STEEL_HAMMER = registerItem("steel_hammer",
            new HammerItem(ModToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 6, -3.2f))));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ModArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));
    public static final Item STEEL_HORSE_ARMOR = registerItem("steel_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings()
                    .maxCount(1)));

    public static final Item IRON_STICK = registerItem("iron_stick", new Item(new Item.Settings()));


    public static final Item POWERED_COAL = registerItem("powered_coal", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.more-materials.powered_coal"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MoreMaterials.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MoreMaterials.LOGGER.info("Registering Mod Items for "+ MoreMaterials.MOD_ID);


    }
}
