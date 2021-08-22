package de.craftlancer.clapi;

import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.function.Consumer;

public class ServiceListener<T> {
    
    private Consumer<T> onRegister;
    
    public ServiceListener(Consumer<T> onRegister) {
        this.onRegister = onRegister;
    }
    
    public void accept(RegisteredServiceProvider<?> provider) {
        onRegister.accept((T) provider.getProvider());
    }
}
