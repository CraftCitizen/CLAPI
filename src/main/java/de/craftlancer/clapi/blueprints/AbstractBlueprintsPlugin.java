package de.craftlancer.clapi.blueprints;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public interface AbstractBlueprintsPlugin {

    List<AbstractBlueprint> getBlueprints();

    Optional<AbstractBlueprint> getBlueprint(String schematic);

    Optional<AbstractBlueprint> getBlueprint(ItemStack item);
}
