package de.craftlancer.clapi.blueprints;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public interface PluginBlueprints {

    /**
     * @return A list of all blueprints, including but not limited to player blueprints
     */
    List<? extends AbstractBlueprint> getBlueprints();

    /**
     * @param schematic the schematic the sought upon blueprint would use.
     * @return An optional that, if present, contains a blueprint.
     */
    Optional<? extends AbstractBlueprint> getBlueprint(String schematic);

    /**
     * @return An optional that, if pressent, contains a blueprint with matching item.
     */
    Optional<? extends AbstractBlueprint> getBlueprint(ItemStack item);
}
