package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> ALUMINIUM_SMELTABLES = List.of(ModItems.RAW_ALUMINIUM, ModBlocks.ALUMINIUM_ORE,
                ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

        offerSmelting(recipeExporter, ALUMINIUM_SMELTABLES, RecipeCategory.MISC,
                ModItems.ALUMINIUM_INGOT, 0.25f, 200, "aluminium");
        offerBlasting(recipeExporter, ALUMINIUM_SMELTABLES, RecipeCategory.MISC,
                ModItems.ALUMINIUM_INGOT, 0.25f, 100, "aluminium");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ALUMINIUM_INGOT,
                RecipeCategory.MISC, ModBlocks.ALUMINIUM_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ALUMINIUM,
                RecipeCategory.MISC, ModBlocks.RAW_ALUMINIUM_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT,
                RecipeCategory.MISC, ModBlocks.STEEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_STICK, 1)
                .pattern("I")
                .pattern("I")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWERED_COAL, 2)
                .pattern("CEC")
                .input('E', Items.EMERALD)
                .input('C', Items.CHARCOAL)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD, 1)
                .pattern("E")
                .pattern("E")
                .pattern("I")
                .input('E', Items.EMERALD)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE, 1)
                .pattern("EEE")
                .pattern(" I ")
                .pattern(" I ")
                .input('E', Items.EMERALD)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_AXE, 1)
                .pattern("EE")
                .pattern("EI")
                .pattern(" I")
                .input('E', Items.EMERALD)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL, 1)
                .pattern("E")
                .pattern("I")
                .pattern("I")
                .input('E', Items.EMERALD)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_HOE, 1)
                .pattern("EE")
                .pattern(" I")
                .pattern(" I")
                .input('E', Items.EMERALD)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET, 1)
                .pattern("EEE")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE, 1)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS, 1)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS, 1)
                .pattern("E E")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);





//      ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_ALUMINIUM, 9)
//                .input(ModBlocks.RAW_ALUMINIUM_BLOCK)
//                .criterion(hasItem(ModBlocks.RAW_ALUMINIUM_BLOCK), conditionsFromItem(ModBlocks.RAW_ALUMINIUM_BLOCK))
//                .offerTo(recipeExporter);
    }
}
