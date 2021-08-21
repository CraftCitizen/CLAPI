package de.craftlancer.clapi.blueprints;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public interface PluginBlueprints {
    
    List<? extends AbstractBlueprint> getBlueprints();
    
    Optional<? extends AbstractBlueprint> getBlueprint(String schematic);
    
    Optional<? extends AbstractBlueprint> getBlueprint(ItemStack item);
}
