package net.matthew.more_materials;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.util.ModModelPredicates;
import net.minecraft.client.render.RenderLayer;

public class MoreMaterialsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EMERALD_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EMERALD_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAULIFLOWER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HONEY_BARRY_BUSH, RenderLayer.getCutout());

        ModModelPredicates.registerModelPredicates();
    }
}
