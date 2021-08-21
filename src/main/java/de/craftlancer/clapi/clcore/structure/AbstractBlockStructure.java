package de.craftlancer.clapi.clcore.structure;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.util.BoundingBox;

import java.util.Collection;
import java.util.Set;

public interface AbstractBlockStructure extends Iterable<Location> {
    
    void addBlock(Block block);
    
    void addBlock(Location block);
    
    boolean containsBlock(Block block);
    
    boolean containsBlock(Location block);
    
    boolean containsBoundingBox(BoundingBox box);
    
    boolean containsAnyBlock(Collection<Block> otherBlocks);
    
    Set<Location> getBlocks();
}
