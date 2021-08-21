package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractAlliance;
import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.HandlerList;

public class AllianceMemberRemoveEvent extends AllianceEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private AbstractClan removedClan;
    
    public AllianceMemberRemoveEvent(AbstractAlliance alliance, AbstractClan removedClan) {
        super(alliance);
        this.removedClan = removedClan;
    }
    
    public AbstractClan getRemovedClan() {
        return removedClan;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
