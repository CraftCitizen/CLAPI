package de.craftlancer.clapi.clclans.events;

import de.craftlancer.clapi.clclans.AbstractClan;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import java.util.List;

public class ClanChatEvent extends ClanEvent {
    private static final HandlerList handlers = new HandlerList();
    
    private final Player sender;
    private final boolean isOfficerChat;
    private String message;
    private List<Player> recipients;
    
    public ClanChatEvent(Player sender, AbstractClan clan, String message, List<Player> recipients, boolean isOfficerChat) {
        super(clan);
        this.sender = sender;
        this.message = message;
        this.recipients = recipients;
        this.isOfficerChat = isOfficerChat;
    }
    
    public Player getSender() {
        return sender;
    }
    
    public boolean isOfficerChat() {
        return isOfficerChat;
    }
    
    public String getMessage() {
        return message;
    }
    
    public List<Player> getRecipients() {
        return recipients;
    }
    
    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
