package de.craftlancer.clapi.clcore.clipboard;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.util.BoundingBox;

import java.util.List;
import java.util.UUID;

public interface AbstractClipboard {
    
    void remove();
    
    void setLocation1(Location location);
    
    void setLocation2(Location location);
    
    Location getLocation1();
    
    Location getLocation2();
    
    World getWorld();
    
    boolean hasTwoPoints();
    
    double getVolume();
    
    double getHeight();
    
    double getLength();
    
    double getWidth();
    
    List<Block> toBlockList();
    
    BoundingBox toBoundingBox();
    
    UUID getOwner();
    
}
