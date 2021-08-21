package de.craftlancer.clapi.clfeatures.trophydepositor;

import de.craftlancer.clapi.clfeatures.AbstractBlueprintFeature;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface AbstractTrophyDepositorFeature extends AbstractBlueprintFeature {
    
    void addBoost(double boost, int size);
    
    double getBaseItemValue(ItemStack a);
    
    boolean addTrophyItem(ItemStack item, int value);
    
    Map<ItemStack, Integer> getTrophyItems();
    
    List<? extends AbstractTrophyDepositorBoost> getBoosts();
    
    void clearScores();
    
    boolean removeTrophyByHash(int hash);
    
    double deposit(UUID uuid, ItemStack item);
    
    void setScore(UUID uuid, double score);
    
    double getScore(OfflinePlayer player);
    
    double getScore(UUID uuid);
}
