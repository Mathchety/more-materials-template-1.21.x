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

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);

        BlockStateModelGenerator.BlockTexturePool emeraldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EMERALD_BLOCK);

        emeraldPool.stairs(ModBlocks.EMERALD_STAIRS);
        emeraldPool.slab(ModBlocks.EMERALD_SLAB);
        emeraldPool.button(ModBlocks.EMERALD_BUTTON);
        emeraldPool.pressurePlate(ModBlocks.EMERALD_PRESSURE_PLATE);
        emeraldPool.fence(ModBlocks.EMERALD_FENCE);
        emeraldPool.fenceGate(ModBlocks.EMERALD_FENCE_GATE);
        emeraldPool.wall(ModBlocks.EMERALD_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.EMERALD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.EMERALD_TRAPDOOR);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.EMERALD_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.EMERALD_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.EMERALD_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(EmeraldLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
    }

    @Override
    public void generateItemModels(@NotNull ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ALUMINIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALUMINIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_STICK, Models.HANDHELD);

        //itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.POWERED_COAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.EMERALDFLOWER, Models.GENERATED);

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
        itemModelGenerator.register(ModItems.BAR_BRAWL_MUSIC_DISC, Models.GENERATED);

    }
}
