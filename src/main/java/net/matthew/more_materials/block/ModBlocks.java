package net.matthew.more_materials.block;

import net.matthew.more_materials.MoreMaterials;
import net.matthew.more_materials.block.custom.*;
import net.matthew.more_materials.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
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

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1,2).requiresTool()));

    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs",
            new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block EMERALD_BUTTON = registerBlock("emerald_button",
            new ButtonBlock(BlockSetType.IRON, 20, AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.METAL).noCollision()));
    public static final Block EMERALD_PRESSURE_PLATE = registerBlock("emerald_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block EMERALD_FENCE = registerBlock("emerald_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block EMERALD_FENCE_GATE = registerBlock("emerald_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block EMERALD_WALL = registerBlock("emerald_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block EMERALD_DOOR = registerBlock("emerald_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block EMERALD_TRAPDOOR = registerBlock("emerald_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block EMERALD_LAMP = registerBlock("emerald_lamp",
            new EmeraldLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).requiresTool().luminance(state -> state.get(EmeraldLampBlock.CLICKED) ? 10 : 0)));

    public static final Block CAULIFLOWER_CROP = registerBlockWithoutBlockItem("cauliflower_crop",
            new CauliflowerCropBlock(AbstractBlock.Settings.create().noCollision().mapColor(MapColor.DARK_GREEN)
                    .ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block HONEY_BARRY_BUSH = registerBlockWithoutBlockItem("honey_berry_bush",
            new HoneyBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final Block DRIFTWOOD_LOG = registerBlock("driftwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block DRIFTWOOD_WOOD = registerBlock("driftwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_DRIFTWOOD_LOG = registerBlock("stripped_driftwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_DRIFTWOOD_WOOD = registerBlock("stripped_driftwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block DRIFTWOOD_PLANKS = registerBlock("driftwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block DRIFTWOOD_LEAVES = registerBlock("driftwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static final Block DRIFTWOOD_SAPLING = registerBlock("driftwood_sapling",
            new ModSaplingBlock(ModSaplingGenerators.DRIFTWOOD,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING),Blocks.TERRACOTTA));

    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMaterials.MOD_ID, name), block);
    }

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

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
//            entries.add(ModBlocks.ALUMINIUM_BLOCK);
//        });
    }
}
