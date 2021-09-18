package events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import perks.Perk;
import perks.PerkPlayer;

public class PerkDisableEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private PerkPlayer perkPlayer;
    private Perk perk;

    public PerkDisableEvent(PerkPlayer perkPlayer, Perk perk) {
        this.perkPlayer = perkPlayer;
        this.perk = perk;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public PerkPlayer getPerkPlayer() {
        return perkPlayer;
    }

    public Perk getPerk() {
        return perk;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

}
