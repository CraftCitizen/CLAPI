package de.craftlancer.clapi.clfeatures;

import org.bukkit.inventory.ItemStack;

public interface AbstractManualPlacementFeatureInstance extends AbstractFeatureInstance {
    
    ItemStack getUsedItem();
}
