package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class ClanChangeBannerEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private ItemStack oldBanner;
    private ItemStack newBanner;
    
    public ClanChangeBannerEvent(AbstractClan clan, ItemStack oldBanner, ItemStack newBanner) {
        super(clan);
        this.oldBanner = oldBanner;
        this.newBanner = newBanner;
    }
    
    public ItemStack getNewBanner() {
        return newBanner != null ? newBanner.clone() : null;
    }
    
    public ItemStack getOldBanner() {
        return oldBanner != null ? oldBanner.clone() : null;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
