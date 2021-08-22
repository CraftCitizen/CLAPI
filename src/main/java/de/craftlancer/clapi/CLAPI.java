package de.craftlancer.clapi;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServiceRegisterEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CLAPI extends JavaPlugin implements Listener {
    
    private static CLAPI instance;
    
    private Map<Class<?>, List<ServiceListener<?>>> loadMap = new HashMap<>();
    
    @Override
    public void onEnable() {
        instance = this;
        
        Bukkit.getPluginManager().registerEvents(this, this);
    }
    
    public static CLAPI getInstance() {
        return instance;
    }
    
    public void onLoad(Class<?> clazz, ServiceListener<?> listener) {
        loadMap.computeIfAbsent(clazz, c -> new ArrayList<>()).add(listener);
    }
    
    @EventHandler(ignoreCancelled = true)
    public void onServiceRegister(ServiceRegisterEvent event) {
        Optional.ofNullable(loadMap.remove(event.getProvider().getService()))
                .ifPresent(l -> l.forEach(s -> s.accept(event.getProvider())));
    }
}
