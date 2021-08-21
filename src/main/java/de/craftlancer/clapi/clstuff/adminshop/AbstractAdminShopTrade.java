package de.craftlancer.clapi.clstuff.adminshop;

import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface AbstractAdminShopTrade {
    
    @Nonnull
    ItemStack[] getInput();
    
    boolean isValid();
    
    void setInput(int j, @Nullable ItemStack item);
    
    void setOutput(@Nullable ItemStack output);
    
    void setBroadcast(boolean broadcast);
    
    ItemStack getOutput();
    
    boolean isBroadcast();
    
    @Nullable
    String getBroadcastString();
}
