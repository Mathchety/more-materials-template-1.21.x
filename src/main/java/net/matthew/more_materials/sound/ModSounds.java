package net.matthew.more_materials.sound;

import net.matthew.more_materials.MoreMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent CHISEL_USE = registerSoundEvent("chisel_use");


    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(MoreMaterials.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        MoreMaterials.LOGGER.info("Registering Mod Sounds for "+ MoreMaterials.MOD_ID);
    }
}
