package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ALUMINIUM_BLOCK);
        addDrop(ModBlocks.RAW_ALUMINIUM_BLOCK);
        addDrop(ModBlocks.MAGIC_BLOCK);

        addDrop(ModBlocks.ALUMINIUM_ORE, oreDrops(ModBlocks.ALUMINIUM_ORE, ModItems.RAW_ALUMINIUM));
        addDrop(ModBlocks.DEEPSLATE_ALUMINIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_ALUMINIUM_ORE,ModItems.RAW_ALUMINIUM));

        addDrop(ModBlocks.EMERALD_STAIRS);
        addDrop(ModBlocks.EMERALD_SLAB, slabDrops(ModBlocks.EMERALD_SLAB));
        addDrop(ModBlocks.EMERALD_DOOR, doorDrops(ModBlocks.EMERALD_DOOR));
        addDrop(ModBlocks.EMERALD_TRAPDOOR);
        addDrop(ModBlocks.EMERALD_FENCE);
        addDrop(ModBlocks.EMERALD_FENCE_GATE);
        addDrop(ModBlocks.EMERALD_BUTTON);
        addDrop(ModBlocks.EMERALD_PRESSURE_PLATE);
        addDrop(ModBlocks.EMERALD_WALL);
    }
}
