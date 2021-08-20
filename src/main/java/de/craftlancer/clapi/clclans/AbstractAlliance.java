package de.craftlancer.clapi.clclans;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.stream.Collectors;

public interface AbstractAlliance {

    @Nonnull
    public UUID getUniqueId();

    @Nonnull
    public String getId();
    @Nonnull
    public AbstractClan getCreator();

    @Nonnull
    public Set<AbstractClan> getMembers();

    public boolean addMember(@Nonnull AbstractClan clan);

    public boolean removeMember(@Nonnull AbstractClan clan);

    public boolean hasMember(@Nonnull AbstractClan clan);

    public boolean isMember(@Nonnull OfflinePlayer player);
}
