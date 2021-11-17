package de.craftlancer.clapi.clcore.clipboard;

import org.bukkit.World;

import java.util.Optional;
import java.util.UUID;

public interface AbstractClipboardManager {
    
    Optional<? extends AbstractClipboard> getClipboard(UUID uuid);
    
    void removeClipboard(UUID owner);
    
    void addClipboard(UUID owner, World world);
}
