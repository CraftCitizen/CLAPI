package de.craftlancer.clapi.blueprints;

import org.bukkit.inventory.ItemStack;

public interface AbstractBlueprint {
    ItemStack getItem();

    String getSchematic();

    String getType();

    boolean canItemFrameRotate45Degrees();

    boolean canTranslate();

    boolean canRotate90Degrees();

    boolean compareItem(ItemStack item);
}
