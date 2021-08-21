package de.craftlancer.clapi.clclans;

import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.entity.Player;

public interface PluginCLChat {
    BaseComponent applyMarkdown(Player sender, String input);
}
