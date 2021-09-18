package events;

import handler.PerkHandler;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import perks.PerkPlayer;

public class PerkJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        new PerkPlayer(event.getPlayer());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        PerkHandler.removePerkPlayer(PerkHandler.getPerkPlayer(event.getPlayer()));
    }
}
