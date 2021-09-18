package example;

import org.bukkit.entity.Player;
import perks.Perk;
import perks.PerkPlayer;

public class FlyPerk extends Perk {

    @Override
    public void active(PerkPlayer perkPlayer) {
        final Player player = perkPlayer.bukkit();
        player.setAllowFlight(true);
        player.setFlying(true);
    }

    @Override
    public void deactivate(PerkPlayer perkPlayer) {
        final Player player = perkPlayer.bukkit();
        player.setFlying(false);
        player.setAllowFlight(false);
    }
}
