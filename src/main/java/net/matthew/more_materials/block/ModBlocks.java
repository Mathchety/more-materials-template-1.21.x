package net.matthew.more_materials.block;

import net.matthew.more_materials.MoreMaterials;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(AbstractBlock.Settings.create().strength(4f, 6f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            new Block(AbstractBlock.Settings.create().strength(3f, 5f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1,2),
                    AbstractBlock.Settings.create().strength(3f, 5f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,3),
                    AbstractBlock.Settings.create().strength(4f, 6f)
                            .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create().strength(6f, 8f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMaterials.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(MoreMaterials.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        MoreMaterials.LOGGER.info("Registering Mod Blocks for "+ MoreMaterials.MOD_ID);


    }
}
