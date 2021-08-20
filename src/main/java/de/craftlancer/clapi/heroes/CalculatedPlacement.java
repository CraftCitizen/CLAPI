package de.craftlancer.clapi.heroes;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.UUID;

public class CalculatedPlacement {
    
    private List<String> signContent;
    private ItemStack bannerItem;
    private UUID player;
    
    public CalculatedPlacement(List<String> signContent) {
        this(signContent, null, null);
    }
    
    public CalculatedPlacement(List<String> signContent, UUID player) {
        this(signContent, null, player);
    }
    
    public CalculatedPlacement(List<String> signContent, ItemStack bannerItem) {
        this(signContent, bannerItem, null);
    }
    
    public CalculatedPlacement(List<String> signContent, ItemStack bannerItem, UUID player) {
        this.signContent = signContent;
        this.bannerItem = bannerItem;
        this.player = player;
    }
    
    public List<String> getSignContent() {
        return signContent;
    }
    
    public ItemStack getBannerItem() {
        return bannerItem;
    }
    
    public UUID getPlayer() {
        return player;
    }
}
