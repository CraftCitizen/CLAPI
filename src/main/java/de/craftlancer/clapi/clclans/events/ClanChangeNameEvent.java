package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.HandlerList;

public class ClanChangeNameEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private String oldName;
    private String newName;
    
    public ClanChangeNameEvent(AbstractClan clan, String oldName, String newName) {
        super(clan);
        this.oldName = oldName;
        this.newName = newName;
    }
    
    public String getOldName() {
        return oldName;
    }
    
    public String getNewName() {
        return newName;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
