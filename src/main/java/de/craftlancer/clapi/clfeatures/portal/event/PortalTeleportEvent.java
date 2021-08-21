package de.craftlancer.clapi.clfeatures.portal.event;

import de.craftlancer.clapi.clfeatures.portal.AbstractPortalFeatureInstance;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PortalTeleportEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    
    private boolean isCancelled;
    private final Player player;
    private final AbstractPortalFeatureInstance startingPortal;
    private final AbstractPortalFeatureInstance targetPortal;
    
    public PortalTeleportEvent(Player player, AbstractPortalFeatureInstance startingPortal, AbstractPortalFeatureInstance targetPortal) {
        this.player = player;
        this.startingPortal = startingPortal;
        this.targetPortal = targetPortal;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public AbstractPortalFeatureInstance getStartingPortal() {
        return startingPortal;
    }
    
    public AbstractPortalFeatureInstance getTargetPortal() {
        return targetPortal;
    }
    
    @Override
    public boolean isCancelled() {
        return isCancelled;
    }
    
    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
