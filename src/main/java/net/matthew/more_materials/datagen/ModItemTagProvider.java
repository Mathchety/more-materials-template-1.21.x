package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.matthew.more_materials.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD)
                .add(ModItems.ALUMINIUM_SWORD)
                .add(ModItems.EMERALD_SWORD)
                .add(ModItems.STEEL_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE)
                .add(ModItems.COPPER_HAMMER)
                .add(ModItems.ALUMINIUM_PICKAXE)
                .add(ModItems.ALUMINIUM_HAMMER)
                .add(ModItems.EMERALD_PICKAXE)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.STEEL_PICKAXE)
                .add(ModItems.STEEL_HAMMER);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.COPPER_AXE)
                .add(ModItems.ALUMINIUM_AXE)
                .add(ModItems.EMERALD_AXE)
                .add(ModItems.STEEL_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL)
                .add(ModItems.ALUMINIUM_SHOVEL)
                .add(ModItems.EMERALD_SHOVEL)
                .add(ModItems.STEEL_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE)
                .add(ModItems.ALUMINIUM_HOE)
                .add(ModItems.EMERALD_HOE)
                .add(ModItems.STEEL_HOE);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS)
                .add(ModItems.ALUMINIUM_HELMET)
                .add(ModItems.ALUMINIUM_CHESTPLATE)
                .add(ModItems.ALUMINIUM_LEGGINGS)
                .add(ModItems.ALUMINIUM_BOOTS)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.STEEL_BOOTS);
    }
}
