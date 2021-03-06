package de.craftlancer.clapi.clstuff.heroes;

import org.bukkit.Location;

import java.util.List;

public interface AbstractHeroesLocation {
    
    String getCategory();
    
    String getRanking();
    
    List<Location> getDisplayLocations();
    
    List<Location> getSignLocations();
}
