package de.craftlancer.clapi.clfeatures;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;

public interface PluginCLFeatures {
    
    Map<String, ? extends AbstractFeature> getFeatures();
    
    @Nullable
    AbstractFeature getFeature(@Nonnull String string);
}
