package de.craftlancer.clapi.clstuff.heroes;

import de.craftlancer.clapi.ModuleManager;

public interface HeroesManager extends ModuleManager {
    
    void registerCategory(HeroesCategory category);
    
    void refreshDisplays();
}
