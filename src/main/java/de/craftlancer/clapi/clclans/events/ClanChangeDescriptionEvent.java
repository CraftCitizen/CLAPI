package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.HandlerList;

public class ClanChangeDescriptionEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private String oldDescription;
    private String newDescription;
    
    public ClanChangeDescriptionEvent(AbstractClan clan, String oldDescription, String newDescription) {
        super(clan);
        this.oldDescription = oldDescription;
        this.newDescription = newDescription;
    }
    
    public String getOldDescription() {
        return oldDescription;
    }
    
    public String getNewDescription() {
        return newDescription;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
