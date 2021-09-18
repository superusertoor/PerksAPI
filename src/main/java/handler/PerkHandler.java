package handler;

import example.FlyPerk;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;
import perks.Perk;
import perks.PerkPlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class PerkHandler {

    private static List<Perk> perks = new ArrayList<>();
    private static HashMap<UUID, PerkPlayer> players = new HashMap<>();

    public static void createCustomPerks() {
        Perk fire = new Perk().setPotionEffectType(PotionEffectType.FIRE_RESISTANCE).setName("§4Blaze");
        Perk hulk = new Perk().setPotionEffectType(PotionEffectType.DAMAGE_RESISTANCE).setAmplifier(2).setName("§2Hulk");
        Perk fly = new FlyPerk().setName("§fAntigravitation");
    }

    public static void addPerkPlayer(PerkPlayer player) {
        players.put(player.bukkit().getUniqueId(), player);
    }

    public static void removePerkPlayer(PerkPlayer player) {
        players.remove(player.bukkit().getUniqueId());
    }

    public static PerkPlayer getPerkPlayer(Player player) {
        return players.get(player.getUniqueId());
    }

    public static void add(Perk perk) {
        perks.add(perk);
    }

    public static void remove(Perk perk) {
        perks.remove(perk);
    }

    public static List<Perk> getPerks() {
        return perks;
    }

}
