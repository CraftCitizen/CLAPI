package de.craftlancer.clapi.clcapture;

import org.bukkit.Location;

public interface AbstractCapturePoint {
    
    String getName();
    
    String getId();
    
    AbstractCapturePointType getType();
    
    Location getChestLocation();
    
    CapturePointState getState();
    
    ArtifactModifier getArtifactModifier();
}
