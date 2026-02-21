package com.zetaplugins.lifestealz.events.death;

import com.zetaplugins.lifestealz.events.ZPlayerDeathEventBase;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ZPlayerNaturalDeathEvent extends ZPlayerDeathEventBase {
    private double heartsToLose;

    private boolean shouldDropHearts;

    private String deathMessage;

    public ZPlayerNaturalDeathEvent(PlayerDeathEvent originalEvent, double heartsToLose) {
        super(originalEvent);
        this.heartsToLose = heartsToLose;
        this.shouldDropHearts = false;
        this.deathMessage = originalEvent.getDeathMessage();
    }

    public double getHeartsToLose() {
        return heartsToLose;
    }

    public void setHeartsToLose(double heartsToLose) {
        this.heartsToLose = heartsToLose;
    }

    public boolean isShouldDropHearts() {
        return shouldDropHearts;
    }

    public void setShouldDropHearts(boolean shouldDropHearts) {
        this.shouldDropHearts = shouldDropHearts;
    }

    public String getDeathMessage() {
        return deathMessage;
    }

    public void setDeathMessage(String deathMessage) {
        this.deathMessage = deathMessage;
    }

}