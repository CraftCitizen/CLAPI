package de.craftlancer.clapi.clclans;

import net.md_5.bungee.api.ChatColor;

import javax.annotation.Nonnull;

public enum ClanRank {
    LEADER("Leader", ChatColor.RED),
    CO_LEADER("Co-Leader", ChatColor.GOLD),
    OFFICER("Officer", ChatColor.YELLOW),
    MEMBER("Member", ChatColor.BLUE),
    RECRUIT("Recruit", ChatColor.GRAY);
    
    private final String defaultName;
    private final ChatColor color;
    
    private ClanRank(String defaultName, ChatColor color) {
        this.defaultName = defaultName;
        this.color = color;
    }
    
    public String getDefaultName() {
        return defaultName;
    }
    
    public boolean isRankOrHigher(@Nonnull ClanRank rank) {
        return rank.ordinal() >= this.ordinal();
    }
    
    public static ClanRank getRank(@Nonnull String name) {
        for (ClanRank rank : values())
            if (rank.getDefaultName().equalsIgnoreCase(name) || rank.name().equalsIgnoreCase(name))
                return rank;
        
        return null;
    }
    
    public ChatColor getColor() {
        return color;
    }
}
