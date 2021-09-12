package de.craftlancer.clapi.clclans;

import org.bukkit.OfflinePlayer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.UUID;

public interface PluginClans {
    
    Collection<? extends AbstractClan> getClans();
    
    boolean hasClanByName(@Nonnull String name);
    
    boolean hasClanByTag(@Nonnull String tag);
    
    boolean hasClan(@Nonnull String string);
    
    @Nullable
    AbstractClan getClanByNameOrTag(@Nonnull String name);
    
    AbstractClan getClan(@Nonnull OfflinePlayer player);
    
    @Nullable
    AbstractClan getClanByUUID(@Nullable UUID uuid);
    
    boolean removeClan(@Nonnull AbstractClan clan);
    
    boolean hasAlliance(@Nonnull String string);
    
    @Nullable
    AbstractAlliance getAlliance(@Nonnull String string);
    
    @Nonnull
    Collection<? extends AbstractAlliance> getAlliances();
    
    AbstractAlliance createAlliance(@Nonnull AbstractClan ownClan, @Nonnull String tag);
    
    boolean removeAlliance(@Nonnull AbstractAlliance alliance);
}
