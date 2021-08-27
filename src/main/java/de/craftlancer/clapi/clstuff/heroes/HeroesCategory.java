package de.craftlancer.clapi.clstuff.heroes;

import java.util.List;

public interface HeroesCategory {
    
    List<CalculatedPlacement> calculate();
    
    String getCategoryName();
    
    boolean isCalculateAsync();
    
    boolean hasHead();
    
    boolean hasBanner();
}
