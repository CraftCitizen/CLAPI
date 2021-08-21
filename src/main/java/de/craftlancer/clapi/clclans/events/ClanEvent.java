package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.Event;

public abstract class ClanEvent extends Event {
    
    private final AbstractClan clan;
    
    public ClanEvent(AbstractClan clan) {
        this.clan = clan;
    }
    
    public AbstractClan getClan() {
        return clan;
    }
    
}
