package net.matthew.more_materials;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.matthew.more_materials.block.ModBlocks;
import net.matthew.more_materials.item.ModItemGroups;
import net.matthew.more_materials.item.ModItems;
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

		FuelRegistry.INSTANCE.add(ModItems.POWERED_COAL, 12800);
	}
}