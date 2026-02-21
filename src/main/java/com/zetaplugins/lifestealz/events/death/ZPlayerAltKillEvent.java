package com.zetaplugins.lifestealz.events.death;

import com.zetaplugins.lifestealz.events.ZPlayerDeathEventBase;
import com.zetaplugins.lifestealz.util.MessageUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ZPlayerAltKillEvent extends ZPlayerDeathEventBase {
        private final Player suspectedAlt;
    
        private final String sharedIP;
    
    private boolean shouldPreventKill;
    
    private boolean shouldLogAttempt;
    
    private boolean shouldSendMessage;
    
    private Component warningMessage;

    public ZPlayerAltKillEvent(PlayerDeathEvent originalEvent, Player suspectedAlt, String sharedIP) {
        super(originalEvent);
        this.suspectedAlt = suspectedAlt;
        this.sharedIP = sharedIP;
        this.shouldPreventKill = true;
        this.shouldLogAttempt = true;
        this.shouldSendMessage = true;
        this.warningMessage = MessageUtils.getAndFormatMsg(
                false,
                "altKill",
                "&cPlease don't kill alts! This attempt has been logged!"
        );
    }

    public Player getSuspectedAlt() {
        return suspectedAlt;
    }

    public String getSharedIP() {
        return sharedIP;
    }

    public boolean isShouldPreventKill() {
        return shouldPreventKill;
    }

    public void setShouldPreventKill(boolean shouldPreventKill) {
        this.shouldPreventKill = shouldPreventKill;
    }

    public boolean isShouldLogAttempt() {
        return shouldLogAttempt;
    }

    public void setShouldLogAttempt(boolean shouldLogAttempt) {
        this.shouldLogAttempt = shouldLogAttempt;
    }

    public boolean isShouldSendMessage() {
        return shouldSendMessage;
    }

    public void setShouldSendMessage(boolean shouldSendMessage) {
        this.shouldSendMessage = shouldSendMessage;
    }

    public Component getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(Component warningMessage) {
        this.warningMessage = warningMessage;
    }

}