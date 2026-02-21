package com.zetaplugins.lifestealz.events.death;

import com.zetaplugins.lifestealz.events.ZPlayerDeathEventBase;
import com.zetaplugins.lifestealz.util.MessageUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ZPlayerEliminationEvent extends ZPlayerDeathEventBase {
        private final Player killer; // Can be null for natural elimination
    
        private final boolean isNaturalElimination;
    
    private boolean shouldBanPlayer;
    
    private boolean shouldAnnounceElimination;
    
    private Component eliminationMessage;

    private Component kickMessage;

    public ZPlayerEliminationEvent(PlayerDeathEvent originalEvent, Player killer) {
        super(originalEvent);
        this.killer = killer;
        this.isNaturalElimination = killer == null;
        this.shouldBanPlayer = true;
        this.shouldAnnounceElimination = true;
        this.kickMessage = MessageUtils.getAndFormatMsg(
                false,
                "eliminatedJoin",
                "&cYou don't have any hearts left!"
        );
    }

    public Player getKiller() {
        return killer;
    }

    public boolean isNaturalElimination() {
        return isNaturalElimination;
    }

    public boolean isShouldBanPlayer() {
        return shouldBanPlayer;
    }

    public void setShouldBanPlayer(boolean shouldBanPlayer) {
        this.shouldBanPlayer = shouldBanPlayer;
    }

    public boolean isShouldAnnounceElimination() {
        return shouldAnnounceElimination;
    }

    public void setShouldAnnounceElimination(boolean shouldAnnounceElimination) {
        this.shouldAnnounceElimination = shouldAnnounceElimination;
    }

    public Component getEliminationMessage() {
        return eliminationMessage;
    }

    public void setEliminationMessage(Component eliminationMessage) {
        this.eliminationMessage = eliminationMessage;
    }

    public Component getKickMessage() {
        return kickMessage;
    }

    public void setKickMessage(Component kickMessage) {
        this.kickMessage = kickMessage;
    }

}