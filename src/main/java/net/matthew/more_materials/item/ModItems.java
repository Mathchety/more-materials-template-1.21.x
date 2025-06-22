package net.matthew.more_materials.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.matthew.more_materials.MoreMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new Item(new Item.Settings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new Item(new Item.Settings()));
    public static final Item IRON_STICK = registerItem("iron_stick", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new Item.Settings()));

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
