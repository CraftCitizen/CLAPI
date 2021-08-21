package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.HandlerList;

public class ClanChangeTagEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private String oldTag;
    private String newTag;
    
    public ClanChangeTagEvent(AbstractClan clan, String oldTag, String newTag) {
        super(clan);
        this.oldTag = oldTag;
        this.newTag = newTag;
    }
    
    public String getOldTag() {
        return oldTag;
    }
    
    public String getNewTag() {
        return newTag;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
