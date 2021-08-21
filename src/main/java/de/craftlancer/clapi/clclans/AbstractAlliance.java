package de.craftlancer.clapi.clclans;

import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.Set;
import java.util.UUID;

public interface AbstractAlliance {
    
    @Nonnull
    UUID getUniqueId();
    
    @Nonnull
    String getId();
    
    @Nonnull
    AbstractClan getCreator();
    
    @Nonnull
    Set<AbstractClan> getMembers();
    
    boolean addMember(@Nonnull AbstractClan clan);
    
    boolean removeMember(@Nonnull AbstractClan clan);
    
    boolean hasMember(@Nonnull AbstractClan clan);
    
    boolean isMember(@Nonnull OfflinePlayer player);
    
    void sendMessage(@Nonnull BaseComponent message, @Nonnull de.craftlancer.clapi.clclans.ClanRank minRank);
    
    void sendMessage(@Nonnull String message, @Nonnull de.craftlancer.clapi.clclans.ClanRank minRank);
    
    void sendMessage(@Nonnull BaseComponent message);
    
    void sendMessage(@Nonnull String message);
    
    void sendAllianceChat(@Nonnull Player sender, @Nonnull AbstractClan clan, @Nonnull AbstractClanMember senderMember, @Nonnull String message);
}
