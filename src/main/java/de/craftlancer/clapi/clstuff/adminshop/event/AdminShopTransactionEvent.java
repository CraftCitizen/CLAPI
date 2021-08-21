package de.craftlancer.clapi.clstuff.adminshop.event;

import de.craftlancer.clapi.clstuff.adminshop.AbstractAdminShop;
import de.craftlancer.clapi.clstuff.adminshop.AbstractAdminShopTrade;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

public class AdminShopTransactionEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    
    private AbstractAdminShop shop;
    private AbstractAdminShopTrade trade;
    private Player player;
    private int row;
    
    public AdminShopTransactionEvent(Player player, AbstractAdminShop shop, AbstractAdminShopTrade trade, int row) {
        this.player = player;
        this.trade = trade;
        this.row = row;
        this.shop = shop;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public AbstractAdminShop getShop() {
        return shop;
    }
    
    public int getRow() {
        return row;
    }
    
    public AbstractAdminShopTrade getTrade() {
        return trade;
    }
    
    @Override
    public @Nonnull
    HandlerList getHandlers() {
        return handlers;
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
