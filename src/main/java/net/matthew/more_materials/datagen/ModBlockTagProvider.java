package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.item.ModToolMaterials;
import net.matthew.more_materials.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ALUMINIUM_BLOCK)
                .add(ModBlocks.ALUMINIUM_ORE)
                .add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE)
                .add(ModBlocks.RAW_ALUMINIUM_BLOCK)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.EMERALD_STAIRS)
                .add(ModBlocks.EMERALD_SLAB)
                .add(ModBlocks.EMERALD_DOOR)
                .add(ModBlocks.EMERALD_FENCE)
                .add(ModBlocks.EMERALD_FENCE_GATE)
                .add(ModBlocks.EMERALD_TRAPDOOR)
                .add(ModBlocks.EMERALD_PRESSURE_PLATE)
                .add(ModBlocks.EMERALD_BUTTON)
                .add(ModBlocks.EMERALD_WALL)
                .add(ModBlocks.EMERALD_LAMP);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ALUMINIUM_BLOCK)
                .add(ModBlocks.ALUMINIUM_ORE)
                .add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE)
                .add(ModBlocks.RAW_ALUMINIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.EMERALD_STAIRS)
                .add(ModBlocks.EMERALD_SLAB)
                .add(ModBlocks.EMERALD_DOOR)
                .add(ModBlocks.EMERALD_FENCE)
                .add(ModBlocks.EMERALD_FENCE_GATE)
                .add(ModBlocks.EMERALD_TRAPDOOR)
                .add(ModBlocks.EMERALD_PRESSURE_PLATE)
                .add(ModBlocks.EMERALD_BUTTON)
                .add(ModBlocks.EMERALD_WALL)
                .add(ModBlocks.EMERALD_LAMP);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.EMERALD_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.EMERALD_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.EMERALD_WALL);

//        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ALUMINIUM_TOOL)
//                .addTag(BlockTags.NEEDS_IRON_TOOL);
//        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_EMERALD_TOOL)
//                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}
