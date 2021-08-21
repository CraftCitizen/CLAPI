package de.craftlancer.clapi.clfeatures;

import org.bukkit.entity.Entity;

import java.util.List;

public interface AbstractItemFrameFeatureInstance extends AbstractBlueprintFeatureInstance {
    
    List<Entity> getEntities();
}
