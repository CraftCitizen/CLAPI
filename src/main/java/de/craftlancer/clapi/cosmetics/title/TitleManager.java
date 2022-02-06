package de.craftlancer.clapi.cosmetics.title;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Set;

public interface TitleManager {
    
    /**
     * Updates an entity's title
     *
     * @param entity the entity to update
     * @return true if the entity has a title
     */
    boolean updateTitle(@Nonnull Entity entity);
    
    /**
     * Updates an entity's title
     *
     * @param entity the entity to update
     * @param player the player to update for
     * @return true if the entity has a title
     */
    boolean updateTitleFor(@Nonnull Entity entity, Player player);
    
    /**
     * Removes a title from an entity
     *
     * @param entity the entity to remove from
     * @return true if the entity had a title
     */
    boolean removeTitle(@Nonnull Entity entity);
    
    /**
     * Sets a cosmetic title for an entity.
     * This will always take up the bottommost available row in a title.
     * For a player, this will be the second row, as their displayname shows on the bottom line.
     *
     * @param entity  the entity to set a cosmetic title for
     * @param titleId the id of the title, which must exist in the set returned by TitleManager#getTitleIds()
     * @return true if the titleId exists
     */
    boolean setCosmeticTitle(@Nonnull Entity entity, @Nullable String titleId);
    
    /**
     * Gets the cosmetic title for an entity
     *
     * @param entity the entity that may have the title
     */
    @Nullable
    Title getCosmeticTitle(@Nonnull Entity entity);
    
    /**
     * Adds a title to the list of titles
     *
     * @param titleId the id for the title to use. This will also be the permission a player needs to use this title (taking the format clcosmetics.title.x)
     * @param title   The title to be displayed. Color codes accepted
     * @return true if a title by this id doesn't exist.
     */
    boolean addTitle(@Nonnull String titleId, @Nonnull String title);
    
    /**
     * Removes an existing title
     *
     * @param titleId the id to remove with
     * @return true if a title existed
     */
    boolean removeTitle(@Nonnull String titleId);
    
    /**
     * Gets a title by id
     *
     * @param titleId the id to get the title by
     */
    Title getTitle(@Nonnull String titleId);
    
    /**
     * @return a set of all existing ids.
     */
    Set<String> getTitleIds();
    
    /**
     * @return a collection of all titles the player has permission to
     */
    Collection<? extends Title> getTitlesForPlayer(Player player);
}
