package net.matthew.more_materials.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent EMERALDFLOWER = new FoodComponent.Builder().nutrition(10).saturationModifier(1.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000, 1), 0.50f).build();
}
