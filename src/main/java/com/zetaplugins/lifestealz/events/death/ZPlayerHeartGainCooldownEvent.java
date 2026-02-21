package com.zetaplugins.lifestealz.events.death;

import com.zetaplugins.lifestealz.events.ZPlayerDeathEventBase;
import com.zetaplugins.lifestealz.util.MessageUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ZPlayerHeartGainCooldownEvent extends ZPlayerDeathEventBase {
        private final Player killer;
    
        private final long timeLeftOnCooldown;
    
    private boolean shouldDropHeartsInstead;
    
    private Component cooldownMessage;

    public ZPlayerHeartGainCooldownEvent(PlayerDeathEvent originalEvent, Player killer, long timeLeft) {
        super(originalEvent);
        this.killer = killer;
        this.timeLeftOnCooldown = timeLeft;
        this.shouldDropHeartsInstead = false;
        this.cooldownMessage = MessageUtils.getAndFormatMsg(
                false,
                "heartGainCooldown",
                "You have to wait before gaining another heart!",
                new MessageUtils.Replaceable("%time%", MessageUtils.formatTime(timeLeft))
        );
    }

    public Player getKiller() {
        return killer;
    }

    public long getTimeLeftOnCooldown() {
        return timeLeftOnCooldown;
    }

    public boolean isShouldDropHeartsInstead() {
        return shouldDropHeartsInstead;
    }

    public void setShouldDropHeartsInstead(boolean shouldDropHeartsInstead) {
        this.shouldDropHeartsInstead = shouldDropHeartsInstead;
    }

    public Component getCooldownMessage() {
        return cooldownMessage;
    }

    public void setCooldownMessage(Component cooldownMessage) {
        this.cooldownMessage = cooldownMessage;
    }

}
