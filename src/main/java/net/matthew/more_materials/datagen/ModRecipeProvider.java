package net.matthew.more_materials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.item.ModItems;
import net.minecraft.block.SmithingTableBlock;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GOLDEN_HORSE_ARMOR, 1)
                .pattern("G G")
                .pattern("GGG")
                .pattern("G G")
                .input('G', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SWORD, 1)
                .pattern("C")
                .pattern("C")
                .pattern("I")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE, 1)
                .pattern("CCC")
                .pattern(" I ")
                .pattern(" I ")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE, 1)
                .pattern("CC")
                .pattern("CI")
                .pattern(" I")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL, 1)
                .pattern("C")
                .pattern("I")
                .pattern("I")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE, 1)
                .pattern("CC")
                .pattern(" I")
                .pattern(" I")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET, 1)
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE, 1)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS, 1)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS, 1)
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HORSE_ARMOR, 1)
                .pattern("C C")
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_SWORD, 1)
                .pattern("A")
                .pattern("A")
                .pattern("I")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_PICKAXE, 1)
                .pattern("AAA")
                .pattern(" I ")
                .pattern(" I ")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_AXE, 1)
                .pattern("AA")
                .pattern("AI")
                .pattern(" I")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_SHOVEL, 1)
                .pattern("A")
                .pattern("I")
                .pattern("I")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_HOE, 1)
                .pattern("AA")
                .pattern(" I")
                .pattern(" I")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_HELMET, 1)
                .pattern("AAA")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_CHESTPLATE, 1)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_LEGGINGS, 1)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_BOOTS, 1)
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINIUM_HORSE_ARMOR, 1)
                .pattern("A A")
                .pattern("AAA")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.IRON_HORSE_ARMOR, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("I I")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER, 1)
                .pattern("DBD")
                .pattern("DSD")
                .pattern(" S ")
                .input('D', Items.DIAMOND)
                .input('B', Items.DIAMOND_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND_HORSE_ARMOR, 1)
                .pattern("D D")
                .pattern("DDD")
                .pattern("D D")
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_HAMMER, 1)
                .pattern("EBE")
                .pattern("EIE")
                .pattern(" I ")
                .input('E', Items.EMERALD)
                .input('B', Items.EMERALD_BLOCK)
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_HORSE_ARMOR, 1)
                .pattern("E E")
                .pattern("EEE")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(recipeExporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SWORD, 1)
                .pattern("S")
                .pattern("S")
                .pattern("I")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE, 1)
                .pattern("SSS")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE, 1)
                .pattern("SS")
                .pattern("SI")
                .pattern(" I")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL, 1)
                .pattern("S")
                .pattern("I")
                .pattern("I")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE, 1)
                .pattern("SS")
                .pattern(" I")
                .pattern(" I")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HAMMER, 1)
                .pattern("SBS")
                .pattern("SIS")
                .pattern(" I ")
                .input('S', ModItems.STEEL_INGOT)
                .input('B', ModBlocks.STEEL_BLOCK)
                .input('I', ModItems.IRON_STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_HELMET, 1)
                .pattern("SSS")
                .pattern("S S")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_CHESTPLATE, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_LEGGINGS, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_BOOTS, 1)
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_HORSE_ARMOR, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("S S")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);


//        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
//                        Ingredient.ofItems(ModItems.DIAMOND_HAMMER), Ingredient.ofItems(Items.NETHERITE_INGOT),
//                        RecipeCategory.MISC, ModItems.NETHERITE_HAMMER )
//                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT));
//
//        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
//                        Ingredient.ofItems(Items.DIAMOND_HORSE_ARMOR), Ingredient.ofItems(Items.NETHERITE_INGOT),
//                        RecipeCategory.MISC, ModItems.NETHERITE_HORSE_ARMOR )
//                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT));





//      ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_ALUMINIUM, 9)
//                .input(ModBlocks.RAW_ALUMINIUM_BLOCK)
//                .criterion(hasItem(ModBlocks.RAW_ALUMINIUM_BLOCK), conditionsFromItem(ModBlocks.RAW_ALUMINIUM_BLOCK))
//                .offerTo(recipeExporter);
    }
}
