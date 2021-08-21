package de.craftlancer.clapi.blueprints.event;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Called when a blueprint placement is confirmed.
 **/
public class BlueprintPostPasteEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    
    private String type;
    private Player player;
    private String schematic;
    private GameMode gamemode;
    private ItemStack item;
    private Location location;
    private List<Location> pasteSet;
    private List<Entity> pastedEntities;
    private boolean isPlayerBlueprint;
    
    public BlueprintPostPasteEvent(String type, Player player, String schematic, GameMode gamemode, ItemStack item, Location location,
                                   List<Location> set, boolean isPlayerBlueprint, List<Entity> pastedEntities) {
        this.type = type;
        this.player = player;
        this.schematic = schematic;
        this.gamemode = gamemode;
        this.item = item;
        this.location = location;
        this.pasteSet = set;
        this.isPlayerBlueprint = isPlayerBlueprint;
        this.pastedEntities = pastedEntities;
    }
    
    @Override
    public @Nonnull
    HandlerList getHandlers() {
        return handlers;
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
    
    /**
     * Gets the type of blueprint, to add a blueprint type do
     * /blueprints addtype [type]
     *
     * @return Blueprint type
     **/
    public String getType() {
        return type;
    }
    
    /**
     * @return Origin block location
     */
    public Location getFeatureLocation() {
        return location;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    /**
     * @return Name of the schematic file
     */
    public String getSchematic() {
        return schematic;
    }
    
    /**
     * @return The blueprint item
     */
    public ItemStack getItem() {
        return item;
    }
    
    /**
     * @return The gamemode the player was in upon
     * placement
     */
    public GameMode getGamemode() {
        return gamemode;
    }
    
    /**
     * @return A list of ALL blocks pasted, including the origin block
     */
    public List<Location> getBlocksPasted() {
        return pasteSet;
    }
    
    public boolean isPlayerBlueprint() {
        return isPlayerBlueprint;
    }
    
    /**
     * @return a list of all pasted entities. This will either be empty or have entries.
     */
    public List<Entity> getPastedEntities() {
        return pastedEntities;
    }
}
