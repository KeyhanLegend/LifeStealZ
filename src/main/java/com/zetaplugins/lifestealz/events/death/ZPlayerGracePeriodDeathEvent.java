package com.zetaplugins.lifestealz.events.death;

import com.zetaplugins.lifestealz.events.ZPlayerDeathEventBase;
import com.zetaplugins.lifestealz.util.MessageUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ZPlayerGracePeriodDeathEvent extends ZPlayerDeathEventBase {
        private final Player killer; // Can be null
    
        private final boolean isHeartLossBlocked;
    
        private final boolean isHeartGainBlocked;
    
    private Component messageToVictim;
    
    private Component messageToKiller;

    public ZPlayerGracePeriodDeathEvent(PlayerDeathEvent originalEvent, Player killer,
                                        boolean heartLossBlocked, boolean heartGainBlocked) {
        super(originalEvent);
        this.killer = killer;
        this.isHeartLossBlocked = heartLossBlocked;
        this.isHeartGainBlocked = heartGainBlocked;
        this.messageToVictim = MessageUtils.getAndFormatMsg(
                false,
                "noHeartLossInGracePeriod",
                "&cYou can't lose hearts during the grace period!"
        );
        this.messageToKiller = killer != null ? MessageUtils.getAndFormatMsg(
                false,
                "noHeartGainInGracePeriod",
                "&cYou can't gain hearts during the grace period!") : Component.text("");
    }

    public Player getKiller() {
        return killer;
    }

    public boolean isHeartLossBlocked() {
        return isHeartLossBlocked;
    }

    public boolean isHeartGainBlocked() {
        return isHeartGainBlocked;
    }

    public Component getMessageToVictim() {
        return messageToVictim;
    }

    public void setMessageToVictim(Component messageToVictim) {
        this.messageToVictim = messageToVictim;
    }

    public Component getMessageToKiller() {
        return messageToKiller;
    }

    public void setMessageToKiller(Component messageToKiller) {
        this.messageToKiller = messageToKiller;
    }

}
