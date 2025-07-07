package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.block.custom.CauliflowerCropBlock;
import net.matthew.more_materials.block.custom.HoneyBerryBushBlock;
import net.matthew.more_materials.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
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
        addDrop(ModBlocks.EMERALD_LAMP);

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, CauliflowerCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CAULIFLOWER_CROP, this.cropDrops(ModBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder2));

        this.addDrop(ModBlocks.HONEY_BARRY_BUSH,
                block ->  this.applyExplosionDecay(
                        block, LootTable.builder().pool(
                                    LootPool.builder().conditionally(
                                            BlockStatePropertyLootCondition
                                                    .builder(Blocks.SWEET_BERRY_BUSH).properties(StatePredicate.Builder
                                                            .create().exactMatch(SweetBerryBushBlock.AGE, 3)))
                                    .with(ItemEntry.builder(ModItems.HONEY_BERRIES)).apply(SetCountLootFunction
                                    .builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                    .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))
                                    .pool(LootPool.builder().conditionally(BlockStatePropertyLootCondition.builder(ModBlocks.HONEY_BARRY_BUSH)
                                    .properties(StatePredicate.Builder.create().exactMatch(HoneyBerryBushBlock.AGE, 2)))
                                    .with(ItemEntry.builder(ModItems.HONEY_BERRIES)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                    .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))))
        );

        addDrop(ModBlocks.DRIFTWOOD_LOG);
        addDrop(ModBlocks.DRIFTWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_DRIFTWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
        addDrop(ModBlocks.DRIFTWOOD_PLANKS);
        addDrop(ModBlocks.DRIFTWOOD_SAPLING);

        addDrop(ModBlocks.DRIFTWOOD_LEAVES, leavesDrops(ModBlocks.DRIFTWOOD_LEAVES, ModBlocks.DRIFTWOOD_SAPLING, 0.0625f));
    }
}
