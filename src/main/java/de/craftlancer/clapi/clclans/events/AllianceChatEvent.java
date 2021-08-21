package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractAlliance;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import java.util.List;

// TODO sender
public class AllianceChatEvent extends AllianceEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private final Player sender;
    private String message;
    private List<Player> recipients;
    
    public AllianceChatEvent(Player sender, AbstractAlliance alliance, String message, List<Player> recipients) {
        super(alliance);
        this.sender = sender;
        this.message = message;
        this.recipients = recipients;
    }
    
    public String getMessage() {
        return message;
    }
    
    public List<Player> getRecipients() {
        return recipients;
    }
    
    public Player getSender() {
        return sender;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
