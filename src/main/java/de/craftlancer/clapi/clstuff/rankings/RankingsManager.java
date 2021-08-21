package de.craftlancer.clapi.clstuff.rankings;

import de.craftlancer.clapi.ModuleManager;
import org.bukkit.OfflinePlayer;

import java.util.Map;
import java.util.UUID;

public interface RankingsManager extends ModuleManager {
    
    Map<UUID, ? extends AbstractRankingsEntry> updateScores();
    
    void checkRankingRewards();
    
    AbstractRankingsEntry getRankingsEntry(OfflinePlayer player);
    
    AbstractRankingsEntry getRankingsEntry(UUID uuid);
    
    double getScore(UUID uuid);
    
    double getScore(OfflinePlayer player);
}
