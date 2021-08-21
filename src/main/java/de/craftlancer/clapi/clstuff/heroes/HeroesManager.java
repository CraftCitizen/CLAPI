package de.craftlancer.clapi.clstuff.heroes;

import de.craftlancer.clapi.ModuleManager;
import org.bukkit.Location;

import java.util.List;
import java.util.UUID;

public interface HeroesManager extends ModuleManager {
    
    void registerCategory(AbstractHeroesCategory category);
    
    List<AbstractHeroesLocation> getHeroesLocations();
    
    AbstractHeroesLocation getHeroLocation(String category, String ranking);
    
    void addHeadUpdate(UUID key, Location location);
    
    void refreshDisplays();
}
