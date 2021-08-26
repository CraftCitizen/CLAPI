package de.craftlancer.clapi.blueprints;

import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public interface AbstractBlueprint {

    /**
     * @return The item used in the blueprint
     */
    @Nonnull
    ItemStack getItem();

    /**
     * The returned object of this method will never be null but
     * it is possible the schematic does not exist in World Edit.
     * @return The world edit schematic as string.
     */
    @Nonnull
    String getSchematic();

    /**
     * The type of the schematic, used for generalizing a group of blueprints.
     * @return The type of the schematic, NORMAL for no specified type.
     */
    @Nonnull
    String getType();

    /**
     * Used to determine item rotation within item frames if players place blueprints at a 45 degree
     * angle.
     * @return true if blueprint will rotate 45 degrees or false if otherwise.
     */
    boolean canItemFrameRotate45Degrees();

    /**
     * Used to determine if blueprint can move in the x, y, and z axis.
     * @return true if it can move
     */
    boolean canTranslate();

    /**
     * Used to determine if blueprint can be rotated by player during a placement session.
     * @return true if it can be rotated
     */
    boolean canRotate90Degrees();

    /**
     * Used to compare an item to the blueprint's item in order to determine if the items are similar.
     * This will make use of persistent data tags which are automatically applied to blueprints.
     * @param item the item being compared
     * @return true if the inputted item is similar.
     */
    boolean compareItem(ItemStack item);
}
