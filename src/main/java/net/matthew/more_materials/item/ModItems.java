package net.matthew.more_materials.item;

import net.matthew.more_materials.MoreMaterials;
import net.matthew.more_materials.item.custom.ChiselItem;
import net.matthew.more_materials.item.custom.HammerItem;
import net.matthew.more_materials.item.custom.ModArmorItem;
import net.matthew.more_materials.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {

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
    public static final Item EMERALD_BOW = registerItem("emerald_bow",
            new BowItem(new Item.Settings().maxDamage(500)));

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


    public static final Item IRON_STICK = registerItem("iron_stick", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(512)));

    public static final Item EMERALDFLOWER = registerItem("emerald_flower", new Item(new Item.Settings().food(ModFoodComponents.EMERALDFLOWER)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.more-materials.emerald_flower"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item POWERED_COAL = registerItem("powered_coal", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.more-materials.powered_coal"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BAR_BRAWL_KEY).maxCount(1)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MoreMaterials.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MoreMaterials.LOGGER.info("Registering Mod Items for "+ MoreMaterials.MOD_ID);


    }
}
