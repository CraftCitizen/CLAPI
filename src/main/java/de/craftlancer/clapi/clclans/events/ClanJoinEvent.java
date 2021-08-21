package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class ClanJoinEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private Player player;
    
    public ClanJoinEvent(AbstractClan clan, Player player) {
        super(clan);
        this.player = player;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
