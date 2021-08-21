package de.craftlancer.clapi.clfeatures;

import org.bukkit.entity.Player;

import java.util.List;

public interface AbstractFeature {
    
    int getLimit(Player player);
    
    boolean checkFeatureLimit(Player player);
    
    void addFeatureLimit(Player player, int amount);
    
    int getMaxLimit();
    
    List<? extends AbstractFeatureInstance> getFeatures();
}
