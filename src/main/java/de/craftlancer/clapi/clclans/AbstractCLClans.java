package de.craftlancer.clapi.clclans;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public interface AbstractCLClans {
    
    List<AbstractClan> getClans();

    boolean hasClanByName(@Nonnull String name);

    public boolean hasClanByTag(@Nonnull String tag);

    public boolean hasClan(@Nonnull String string);

    @Nullable
    public AbstractClan getClanByNameOrTag(@Nonnull String name);

    public AbstractClan getClan(@Nonnull OfflinePlayer player);
    @Nullable
    public AbstractClan getClanByUUID(@Nullable UUID uuid);

    @Nonnull
    public AbstractClan addClan(@Nonnull AbstractClan clan);

    public boolean removeClan(@Nonnull AbstractClan clan);

    public boolean hasAlliance(@Nonnull String string);

    @Nullable
    public AbstractAlliance getAlliance(@Nonnull String string);

    @Nonnull
    public Collection<AbstractAlliance> getAlliances();

    public AbstractAlliance createAlliance(@Nonnull AbstractClan ownClan, @Nonnull String tag);

    public boolean removeAlliance(@Nonnull AbstractAlliance alliance);
}
