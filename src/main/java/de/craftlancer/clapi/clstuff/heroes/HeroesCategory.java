package de.craftlancer.clapi.clstuff.heroes;

import java.util.List;

public interface HeroesCategory {
    
    List<CalculatedPlacement> calculate();
    
    String getHeroesCategoryName();
    
    boolean calculateAsynchronously();
}
