package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractAlliance;
import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.HandlerList;

public class AllianceMemberAddEvent extends AllianceEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private AbstractClan addedClan;
    
    public AllianceMemberAddEvent(AbstractAlliance alliance, AbstractClan addedClan) {
        super(alliance);
        this.addedClan = addedClan;
    }
    
    public AbstractClan getAddedClan() {
        return addedClan;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
