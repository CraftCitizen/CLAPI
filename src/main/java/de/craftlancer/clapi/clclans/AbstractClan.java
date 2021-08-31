package de.craftlancer.clapi.clclans;

import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public interface AbstractClan {
    
    boolean isMember(@Nonnull OfflinePlayer player);
    
    boolean isMember(@Nonnull UUID uuid);
    
    @Nonnull
    UUID getUniqueId();
    
    @Nonnull
    ChatColor getColor();
    
    @Nonnull
    String getName();
    
    @Nonnull
    String getDescription();
    
    @Nonnull
    String getTag();
    
    @Nonnull
    String getRankName(@Nonnull ClanRank rank);
    
    @Nonnull
    List<? extends AbstractClanMember> getMembers();
    
    @Nullable
    ItemStack getBanner();
    
    @Nonnull
    List<UUID> getRivals();
    
    boolean hasRival(@Nonnull AbstractClan clan);
    
    @Nullable
    AbstractClanMember getMember(@Nonnull OfflinePlayer target);
    
    @Nonnull
    List<? extends AbstractClanMember> getMembersWithRank(@Nonnull ClanRank rank);
    
    @Nullable
    ClanRank getRank(@Nonnull String string);
    
    String getMotd();
    
    void setColor(@Nonnull ChatColor color);
    
    void setDescription(@Nonnull String description);
    
    void setName(@Nonnull String name);
    
    void setTag(@Nonnull String tag);
    
    boolean addRival(@Nonnull AbstractClan clan);
    
    boolean removeRival(@Nonnull AbstractClan clan);
    
    boolean addMember(@Nonnull Player player);
    
    boolean removeMember(@Nonnull OfflinePlayer leavingPlayer, @Nonnull ClanLeaveReason reason);
    
    void setRankName(@Nonnull ClanRank rank, @Nonnull String string);
    
    void setMotd(String motd);
    
    void setBanner(@Nonnull ItemStack item);
    
    void sendMessage(@Nonnull String message, @Nonnull ClanRank minRank);
    
    void sendMessage(@Nonnull BaseComponent message, @Nonnull ClanRank minRank);
    
    void sendMessage(@Nonnull BaseComponent message);
    
    void sendMessage(@Nonnull String message);
    
    void sendClanChat(@Nonnull Player sender, @Nonnull String message);
    
    void sendOfficerChat(@Nonnull Player sender, @Nonnull String message);
    
    double calculateClanScore();
}
