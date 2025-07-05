package net.matthew.more_materials.world;

import net.matthew.more_materials.MoreMaterials;
import net.matthew.more_materials.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldAluminiumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.ALUMINIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEEPSLATE_ALUMINIUM_ORE.getDefaultState()));

        register(context, ALUMINIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAluminiumOres, 8));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreMaterials.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static class ModOrePlacement {
    }
}