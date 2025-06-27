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
                      entries.add(ModItems.EMERALD_SWORD);
                      entries.add(ModItems.EMERALD_PICKAXE);
                      entries.add(ModItems.EMERALD_AXE);
                      entries.add(ModItems.EMERALD_SHOVEL);
                      entries.add(ModItems.EMERALD_HOE);
                      entries.add(ModItems.IRON_STICK);
                      entries.add(ModItems.ALUMINIUM_INGOT);
                      entries.add(ModItems.RAW_ALUMINIUM);

                      entries.add(ModItems.CHISEL);

                      entries.add(ModItems.EMERALDFLOWER);

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
                      entries.add(ModBlocks.MAGIC_BLOCK);
                      entries.add(ModBlocks.EMERALD_STAIRS);
                      entries.add(ModBlocks.EMERALD_SLAB);
                      entries.add(ModBlocks.EMERALD_DOOR);
                      entries.add(ModBlocks.EMERALD_TRAPDOOR);
                      entries.add(ModBlocks.EMERALD_BUTTON);
                      entries.add(ModBlocks.EMERALD_FENCE);
                      entries.add(ModBlocks.EMERALD_FENCE_GATE);
                      entries.add(ModBlocks.EMERALD_PRESSURE_PLATE);
                      entries.add(ModBlocks.EMERALD_WALL);

                      entries.add(ModBlocks.EMERALD_LAMP);

                    }).build());


    public static void registerItemGroups(){
        MoreMaterials.LOGGER.info("Registering Item Groups for "+MoreMaterials.MOD_ID);
    }
}
