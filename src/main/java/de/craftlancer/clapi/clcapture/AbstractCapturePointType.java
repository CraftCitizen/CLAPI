package de.craftlancer.clapi.clcapture;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.NavigableMap;
import java.util.UUID;

public interface AbstractCapturePointType {
    
    String getName();
    
    String getDisplayName();
    
    List<ItemStack> getItems();
    
    ArtifactModifier getArtifactModifier();
    
    NavigableMap<Integer, Float> getPlayerModifier();
    
    int getBossbarDistance();
    
    boolean isBroadcastStart();
    
    
    boolean isPing();
    
    boolean isExcludeTopClans();
    
    /**
     * @param uuid - the player
     * @return - true if the point is excluding top x clans, and that player is in a top x clan
     */
    boolean isPlayerExcluded(UUID uuid);
}
