package net.matthew.more_materials.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.matthew.more_materials.MoreMaterials;
import net.matthew.more_materials.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MORE_MATERIALS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMaterials.MOD_ID, "more_materials_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EMERALD_SWORD))
                    .displayName(Text.translatable("itemgroup.more-materials.more_materials_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_HAMMER);

                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.COPPER_HORSE_ARMOR);

                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModItems.RAW_ALUMINIUM);

                        entries.add(ModItems.ALUMINIUM_SWORD);
                        entries.add(ModItems.ALUMINIUM_PICKAXE);
                        entries.add(ModItems.ALUMINIUM_AXE);
                        entries.add(ModItems.ALUMINIUM_SHOVEL);
                        entries.add(ModItems.ALUMINIUM_HOE);
                        entries.add(ModItems.ALUMINIUM_HAMMER);

                        entries.add(ModItems.ALUMINIUM_HELMET);
                        entries.add(ModItems.ALUMINIUM_CHESTPLATE);
                        entries.add(ModItems.ALUMINIUM_LEGGINGS);
                        entries.add(ModItems.ALUMINIUM_BOOTS);
                        entries.add(ModItems.ALUMINIUM_HORSE_ARMOR);

                        entries.add(ModItems.EMERALD_SWORD);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.EMERALD_HAMMER);

                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);
                        entries.add(ModItems.EMERALD_HORSE_ARMOR);

                        entries.add(ModItems.STEEL_INGOT);

                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_HAMMER);

                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);
                        entries.add(ModItems.STEEL_HORSE_ARMOR);

                        entries.add(ModItems.IRON_STICK);

                        entries.add(ModItems.POWERED_COAL);





                    }).build());

    public static final ItemGroup MORE_MATERIALS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMaterials.MOD_ID, "more_materials_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ALUMINIUM_BLOCK))
                    .displayName(Text.translatable("itemgroup.more-materials.more_materials_blocks"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.ALUMINIUM_BLOCK);
                      entries.add(ModBlocks.RAW_ALUMINIUM_BLOCK);
                      entries.add(ModBlocks.ALUMINIUM_ORE);
                      entries.add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);


                      entries.add(ModBlocks.STEEL_BLOCK);

                    }).build());


    public static void registerItemGroups(){
        MoreMaterials.LOGGER.info("Registering Item Groups for "+MoreMaterials.MOD_ID);
    }
}
