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

        addDrop(ModBlocks.ALUMINIUM_ORE, oreDrops(ModBlocks.ALUMINIUM_ORE, ModItems.RAW_ALUMINIUM));
        addDrop(ModBlocks.DEEPSLATE_ALUMINIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_ALUMINIUM_ORE,ModItems.RAW_ALUMINIUM));

        addDrop(ModBlocks.STEEL_BLOCK);

    }
}
