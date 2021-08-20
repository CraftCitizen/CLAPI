package de.craftlancer.clapi.clans;

import javax.annotation.Nonnull;
import java.util.UUID;

public interface AbstractClanMember {
    UUID getUniqueId();
    
    ClanRank getRank();
    
    void setRank(@Nonnull ClanRank rank);
}
