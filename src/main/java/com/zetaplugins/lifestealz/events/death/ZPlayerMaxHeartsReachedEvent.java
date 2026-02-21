package com.zetaplugins.lifestealz.events.death;

import com.zetaplugins.lifestealz.events.ZPlayerDeathEventBase;
import com.zetaplugins.lifestealz.util.MessageUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ZPlayerMaxHeartsReachedEvent extends ZPlayerDeathEventBase {
        private final Player killer;
    
        private final double maxHeartsLimit;
    
    private boolean shouldDropHeartsInstead;
    
    private Component maxHeartsMessage;

    public ZPlayerMaxHeartsReachedEvent(PlayerDeathEvent originalEvent, Player killer, double maxHearts) {
        super(originalEvent);
        this.killer = killer;
        this.maxHeartsLimit = maxHearts;
        this.shouldDropHeartsInstead = false;
        this.maxHeartsMessage = MessageUtils.getAndFormatMsg(
                false,
                "maxHeartLimitReached",
                "&cYou already reached the limit of %limit% hearts!",
                new MessageUtils.Replaceable("%limit%", String.valueOf((int) (maxHearts / 2)))
        );
    }

    public Player getKiller() {
        return killer;
    }

    public double getMaxHeartsLimit() {
        return maxHeartsLimit;
    }

    public boolean isShouldDropHeartsInstead() {
        return shouldDropHeartsInstead;
    }

    public void setShouldDropHeartsInstead(boolean shouldDropHeartsInstead) {
        this.shouldDropHeartsInstead = shouldDropHeartsInstead;
    }

    public Component getMaxHeartsMessage() {
        return maxHeartsMessage;
    }

    public void setMaxHeartsMessage(Component maxHeartsMessage) {
        this.maxHeartsMessage = maxHeartsMessage;
    }

}