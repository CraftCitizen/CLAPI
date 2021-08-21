package de.craftlancer.clapi.clfeatures.portal;

import de.craftlancer.clapi.clfeatures.AbstractBlueprintFeatureInstance;

public interface AbstractPortalFeatureInstance extends AbstractBlueprintFeatureInstance {
    
    long getNewBookDelay();
    
    void setNewBookDelay(long newBookDelay);
    
    boolean isValid();
    
    String getName();
    
    void setName(String name);
}
