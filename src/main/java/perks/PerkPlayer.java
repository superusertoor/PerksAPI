package perks;

import handler.PerkHandler;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PerkPlayer {

    private List<Perk> activePerks = new ArrayList<>();
    private UUID uuid;
    private List<Perk> perks = new ArrayList<>();

    public PerkPlayer(Player player) {
        this.uuid = player.getUniqueId();
        PerkHandler.addPerkPlayer(this);
    }

    public List<Perk> getPerks() {
        return perks;
    }

    public Player bukkit() {
        return Bukkit.getPlayer(uuid);
    }

    public void remove(Perk perk) {
        perks.remove(this);
        setPerkDisabled(perk);
    }

    public void addPerk(Perk perk) {
        perks.add(perk);
    }

    public void setPerkEnabled(Perk perk) {
        activePerks.add(perk);
    }

    public void setPerkDisabled(Perk perk) {
        activePerks.remove(perk);
    }

    public List<Perk> getEnabledPerks() {
        return activePerks;
    }
}
