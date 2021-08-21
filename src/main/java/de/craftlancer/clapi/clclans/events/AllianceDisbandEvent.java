package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractAlliance;
import org.bukkit.event.HandlerList;

public class AllianceDisbandEvent extends AllianceEvent {
    
    private static final HandlerList handlers = new HandlerList();
    
    public AllianceDisbandEvent(AbstractAlliance alliance) {
        super(alliance);
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
