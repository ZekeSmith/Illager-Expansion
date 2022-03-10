package me.sandbox.sounds;

import me.sandbox.Sandbox;
import net.minecraft.client.sound.Sound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundRegistry {
    public static SoundEvent ENDERGON_ORE_BREAK = registerSoundEvent("endergon_ore_break");
    public static SoundEvent LOST_MINER_AMBIENT = registerSoundEvent("lost_miner_ambient");
    public static SoundEvent LOST_MINER_HURT = registerSoundEvent("lost_miner_hurt");
    public static SoundEvent LOST_MINER_DEATH = registerSoundEvent("lost_miner_death");
    public static SoundEvent LOST_CANDLE_DIAMOND = registerSoundEvent("lost_candle_diamond");
    public static SoundEvent LOST_CANDLE_IRON = registerSoundEvent("lost_candle_iron");
    public static SoundEvent LOST_CANDLE_COAL = registerSoundEvent("lost_candle_coal");
    public static SoundEvent LOST_CANDLE_COPPER = registerSoundEvent("lost_candle_copper");
    public static SoundEvent LOST_CANDLE_GOLD = registerSoundEvent("lost_candle_gold");
    public static SoundEvent SURRENDERED_AMBIENT = registerSoundEvent("surrendered_ambient");
    public static SoundEvent SURRENDERED_HURT = registerSoundEvent("surrendered_hurt");
    public static SoundEvent SURRENDERED_CHARGE = registerSoundEvent("surrendered_charge");
    public static SoundEvent SURRENDERED_DEATH = registerSoundEvent("surrendered_death");
    public static SoundEvent NECROMANCER_SUMMON = registerSoundEvent("necromancer_summon");
    public static SoundEvent SORCERER_AMBIENT = registerSoundEvent("sorcerer_ambient");
    public static SoundEvent SORCERER_HURT = registerSoundEvent("sorcerer_hurt");
    public static SoundEvent SORCERER_DEATH = registerSoundEvent("sorcerer_death");
    public static SoundEvent SORCERER_CAST = registerSoundEvent("sorcerer_cast");
    public static SoundEvent SORCERER_COMPLETE_CAST = registerSoundEvent("sorcerer_complete_cast");
    public static SoundEvent HORN_OF_SIGHT = registerSoundEvent("horn_of_sight");
    public static SoundEvent EQUIP_ENDERGON = registerSoundEvent("equip_endergon");
    public static SoundEvent FLAMECALLER_CAST = registerSoundEvent("flamecaller_cast");
    public static SoundEvent INVOKER_FANGS = registerSoundEvent("invoker_fangs");
    public static SoundEvent INVOKER_HURT = registerSoundEvent("invoker_hurt");
    public static SoundEvent INVOKER_DEATH = registerSoundEvent("invoker_death");
    public static SoundEvent INVOKER_AMBIENT = registerSoundEvent("invoker_ambient");
    public static SoundEvent INVOKER_COMPLETE_CAST = registerSoundEvent("invoker_completecast");
    public static SoundEvent INVOKER_TELEPORT_CAST = registerSoundEvent("invoker_teleport_cast");
    public static SoundEvent INVOKER_FANGS_CAST = registerSoundEvent("invoker_fangs_cast");
    public static SoundEvent INVOKER_BIG_CAST = registerSoundEvent("invoker_big_cast");
    public static SoundEvent INVOKER_SUMMON_CAST = registerSoundEvent("invoker_summon_cast");
    public static SoundEvent INVOKER_SHIELD_CREATE = registerSoundEvent("invoker_shield_create");
    public static SoundEvent INVOKER_SHIELD_BREAK = registerSoundEvent("invoker_shield_break");
    public static SoundEvent ILLAGER_BRUTE_AMBIENT = registerSoundEvent("illager_brute_ambient");
    public static SoundEvent ILLAGER_BRUTE_HURT = registerSoundEvent("illager_brute_hurt");
    public static SoundEvent ILLAGER_BRUTE_DEATH = registerSoundEvent("illager_brute_death");



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Sandbox.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    public static void registerSounds() {
        Sandbox.LOGGER.info("Registering sounds...");
    }
}
