package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.block.custom.EmeraldLampBlock;
import net.matthew.more_materials.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ALUMINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);

    }

    @Override
    public void generateItemModels(@NotNull ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_BOOTS));
        itemModelGenerator.register(ModItems.COPPER_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.ALUMINIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALUMINIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ALUMINIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ALUMINIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ALUMINIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ALUMINIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ALUMINIUM_BOOTS));
        itemModelGenerator.register(ModItems.ALUMINIUM_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_BOOTS));
        itemModelGenerator.register(ModItems.EMERALD_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_BOOTS));
        itemModelGenerator.register(ModItems.STEEL_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.IRON_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.POWERED_COAL, Models.GENERATED);



    }
}
