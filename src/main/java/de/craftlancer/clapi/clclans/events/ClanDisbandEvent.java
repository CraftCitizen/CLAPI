package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.HandlerList;

public class ClanDisbandEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    public ClanDisbandEvent(AbstractClan clan) {
        super(clan);
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
