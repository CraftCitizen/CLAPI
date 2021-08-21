package de.craftlancer.clapi.clfeatures;

import de.craftlancer.clapi.clcore.structure.AbstractBlockStructure;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

public interface AbstractFeatureInstance {
    
    void destroy();
    
    Location getInitialBlock();
    
    void setOwnerId(UUID ownerId);
    
    UUID getOwnerId();
    
    AbstractBlockStructure getStructure();
    
    boolean isOwner(OfflinePlayer player);
    
    boolean isOwner(UUID uuid);
    
}
