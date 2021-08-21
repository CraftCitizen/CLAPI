package de.craftlancer.clapi.clstuff.rankings;

import java.util.UUID;

public interface AbstractRankingsEntry {
    
    public UUID getUUID();
    
    public double getScore();
    
    public double getBalance();
    
    public int getPlaytime();
    
    public int getSpent();
    
    public int getUnspent();
    
    public long getLastUpdate();
}
