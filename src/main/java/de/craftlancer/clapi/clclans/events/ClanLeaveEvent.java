package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import de.craftlancer.clapi.clclans.ClanLeaveReason;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.HandlerList;

public class ClanLeaveEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private OfflinePlayer player;
    private ClanLeaveReason reason;
    
    public ClanLeaveEvent(AbstractClan clan, OfflinePlayer p, ClanLeaveReason reason) {
        super(clan);
        this.player = p;
        this.reason = reason;
    }
    
    public OfflinePlayer getPlayer() {
        return player;
    }
    
    public ClanLeaveReason getReason() {
        return reason;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
