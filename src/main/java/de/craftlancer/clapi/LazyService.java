package de.craftlancer.clapi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.Optional;
import java.util.function.Consumer;

public class LazyService<T> {
    
    private Optional<T> service = Optional.empty();
    private final Class<T> clazz;
    
    public LazyService(Class<T> clazz) {
        this.clazz = clazz;
    }
    
    public Optional<T> getOptional() {
        if (service.isPresent())
            return service;
        
        RegisteredServiceProvider<T> rsp = Bukkit.getServer().getServicesManager().getRegistration(clazz);
        service = rsp == null ? Optional.empty() : Optional.ofNullable(rsp.getProvider());
        
        return service;
    }
    
    public T get() {
        return getOptional().get();
    }
    
    public void ifPresent(Consumer<T> action) {
        getOptional().ifPresent(action);
    }
    
    public boolean isPresent() {
        return getOptional().isPresent();
    }
    
    public T orElse(T other) {
        return getOptional().orElse(other);
    }
}
