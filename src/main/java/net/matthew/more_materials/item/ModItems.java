package net.matthew.more_materials.item;

import net.matthew.more_materials.MoreMaterials;
import net.matthew.more_materials.item.custom.ChiselItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {

    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new Item(new Item.Settings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new Item(new Item.Settings()));
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

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MoreMaterials.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MoreMaterials.LOGGER.info("Registering Mod Items for "+ MoreMaterials.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
//            entries.add(EMERALD_SWORD);
//        });
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
//            entries.add(IRON_STICK);
//        });
    }
}
