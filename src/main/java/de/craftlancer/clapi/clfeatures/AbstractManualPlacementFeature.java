package de.craftlancer.clapi.clfeatures;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public interface AbstractManualPlacementFeature extends AbstractFeature {
    
    boolean createInstance(Player creator, Block initialBlock, ItemStack hand);
    
    Collection<Block> checkEnvironment(Block initialBlock);
    
    boolean isFeatureItem(ItemStack item);
    
}
