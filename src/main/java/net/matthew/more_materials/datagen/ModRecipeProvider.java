package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHISEL, 1)
                .pattern("E")
                .pattern("I")
                .input('E', Items.EMERALD)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_STICK, 1)
                .pattern("I")
                .pattern("I")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.EMERALDFLOWER, 2)
                .pattern(" A ")
                .pattern("WEW")
                .pattern(" W ")
                .input('E', Items.EMERALD)
                .input('A', Items.APPLE)
                .input('W', Items.WHEAT_SEEDS)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWERED_COAL, 2)
                .pattern("CEC")
                .input('E', Items.EMERALD)
                .input('C', Items.CHARCOAL)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MAGIC_BLOCK, 1)
                .pattern("AAA")
                .pattern("AEA")
                .pattern("AAA")
                .input('E', Items.EMERALD)
                .input('A', ModItems.ALUMINIUM_INGOT)
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

        createStairsRecipe(ModBlocks.EMERALD_STAIRS, Ingredient.ofItems(Items.EMERALD))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD_BLOCK))
                .offerTo(recipeExporter);

        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, Items.EMERALD_BLOCK);

        createDoorRecipe(ModBlocks.EMERALD_DOOR, Ingredient.ofItems(Items.EMERALD))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);

        createTrapdoorRecipe(ModBlocks.EMERALD_TRAPDOOR, Ingredient.ofItems(Items.EMERALD))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.EMERALD_BUTTON, 2)
                .input(Blocks.EMERALD_BLOCK)
                .criterion(hasItem(Blocks.EMERALD_BLOCK), conditionsFromItem(Blocks.EMERALD_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_FENCE, 6)
                .pattern("EIE")
                .pattern("EIE")
                .input('E', Items.EMERALD)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_FENCE_GATE, 2)
                .pattern("IEI")
                .pattern("IEI")
                .input('E', Items.EMERALD)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);

        offerPressurePlateRecipe(recipeExporter, ModBlocks.EMERALD_PRESSURE_PLATE, Blocks.EMERALD_BLOCK);

        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_WALL, Blocks.EMERALD_BLOCK);



//        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_ALUMINIUM, 9)
//                .input(ModBlocks.RAW_ALUMINIUM_BLOCK)
//                .criterion(hasItem(ModBlocks.RAW_ALUMINIUM_BLOCK), conditionsFromItem(ModBlocks.RAW_ALUMINIUM_BLOCK))
//                .offerTo(recipeExporter);
    }
}
