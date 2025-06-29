package net.matthew.more_materials;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.component.ModDataComponentTypes;
import net.matthew.more_materials.effect.ModEffects;
import net.matthew.more_materials.item.ModItemGroups;
import net.matthew.more_materials.item.ModItems;
import net.matthew.more_materials.potion.ModPotions;
import net.matthew.more_materials.sound.ModSounds;
import net.matthew.more_materials.util.HammerUsageEvent;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMaterials implements ModInitializer {
	public static final String MOD_ID = "more-materials";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();

		ModEffects.registerEffects();
		ModPotions.registerPotions();

		ModDataComponentTypes.registerModDataComponentTypes();

		FuelRegistry.INSTANCE.add(ModItems.POWERED_COAL, 12800);

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.SLIMEY_POTION);
		});
	}
}