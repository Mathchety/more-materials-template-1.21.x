package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.matthew.more_materials.item.ModItems;
import net.matthew.more_materials.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.EMERALDFLOWER)
                .add(ModItems.CHISEL)
                .add(ModItems.EMERALD_SWORD)
                .add(ModItems.EMERALD_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.EMERALD_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.EMERALD_PICKAXE)
                .add(ModItems.EMERALD_HAMMER);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.EMERALD_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.EMERALD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.EMERALD_HOE);
        getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.EMERALD_BOW);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS);
    }
}
