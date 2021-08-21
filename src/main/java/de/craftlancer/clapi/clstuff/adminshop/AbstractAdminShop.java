package de.craftlancer.clapi.clstuff.adminshop;

import org.bukkit.Location;

public interface AbstractAdminShop {
    
    Location getLocation();
    
    AbstractAdminShopTrade getTrade(int id);
}
