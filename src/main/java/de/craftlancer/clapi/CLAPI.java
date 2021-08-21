package de.craftlancer.clapi;

import org.bukkit.plugin.java.JavaPlugin;

public class CLAPI extends JavaPlugin {
    
    private static CLAPI instance;
    
    @Override
    public void onLoad() {
        instance = this;
    }
    
    public static CLAPI getInstance() {
        return instance;
    }
}
