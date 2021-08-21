package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractAlliance;
import org.bukkit.event.Event;

public abstract class AllianceEvent extends Event {
    
    private final AbstractAlliance alliance;
    
    public AllianceEvent(AbstractAlliance alliance) {
        this.alliance = alliance;
    }
    
    public AbstractAlliance getAlliance() {
        return alliance;
    }
    
}
