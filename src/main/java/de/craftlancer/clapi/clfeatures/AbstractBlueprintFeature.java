package de.craftlancer.clapi.clfeatures;

import de.craftlancer.clapi.blueprints.event.BlueprintPostPasteEvent;
import org.bukkit.entity.Player;

public interface AbstractBlueprintFeature extends AbstractFeature {
    
    boolean createInstance(Player creator, BlueprintPostPasteEvent event);
}
