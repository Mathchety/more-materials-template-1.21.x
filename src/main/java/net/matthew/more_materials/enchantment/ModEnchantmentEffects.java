package net.matthew.more_materials.enchantment;

import com.mojang.serialization.MapCodec;
import net.matthew.more_materials.MoreMaterials;
import net.matthew.more_materials.enchantment.custom.LightningStrikerEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {
    public static final MapCodec<? extends EnchantmentEntityEffect> LIGHTNING_STRIKER =
            registerEntityEffect("lightning_striker", LightningStrikerEnchantmentEffect.CODEC);

    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec){
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(MoreMaterials.MOD_ID, name), codec);
    }


    public static void registerEnchantmentEffects(){
        MoreMaterials.LOGGER.info("Registering Mod Enchantment Effects for "+MoreMaterials.MOD_ID);
    }
}
