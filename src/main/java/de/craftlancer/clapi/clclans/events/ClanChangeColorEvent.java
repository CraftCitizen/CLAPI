package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.ChatColor;
import org.bukkit.event.HandlerList;

public class ClanChangeColorEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private ChatColor oldColor;
    private ChatColor newColor;
    
    public ClanChangeColorEvent(AbstractClan clan, ChatColor oldColor, ChatColor newColor) {
        super(clan);
        this.oldColor = oldColor;
        this.newColor = newColor;
    }
    
    public ChatColor getOldColor() {
        return oldColor;
    }
    
    public ChatColor getNewColor() {
        return newColor;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
