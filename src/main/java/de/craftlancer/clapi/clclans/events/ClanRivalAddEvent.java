package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.HandlerList;

public class ClanRivalAddEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private AbstractClan rivalClan;
    
    public ClanRivalAddEvent(AbstractClan clan, AbstractClan rivalClan) {
        super(clan);
        this.rivalClan = rivalClan;
    }
    
    public AbstractClan getRivalClan() {
        return rivalClan;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
