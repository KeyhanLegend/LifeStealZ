package com.zetaplugins.lifestealz.events.death;

import com.zetaplugins.lifestealz.events.ZPlayerDeathEventBase;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ZPlayerPvPDeathEvent extends ZPlayerDeathEventBase {
        private final Player killer;
    
    private double heartsToLose;
    
    private double heartsKillerGains;
    
    private boolean shouldDropHearts;
    
    private boolean killerShouldGainHearts;
    
    private String deathMessage;

    public ZPlayerPvPDeathEvent(PlayerDeathEvent originalEvent, Player killer, double heartsToLose, double heartsKillerGains) {
        super(originalEvent);
        this.killer = killer;
        this.heartsToLose = heartsToLose;
        this.heartsKillerGains = heartsKillerGains;
        this.shouldDropHearts = false;
        this.killerShouldGainHearts = true;
        this.deathMessage = originalEvent.getDeathMessage();
    }

    public Player getKiller() {
        return killer;
    }

    public double getHeartsToLose() {
        return heartsToLose;
    }

    public void setHeartsToLose(double heartsToLose) {
        this.heartsToLose = heartsToLose;
    }

    public double getHeartsKillerGains() {
        return heartsKillerGains;
    }

    public void setHeartsKillerGains(double heartsKillerGains) {
        this.heartsKillerGains = heartsKillerGains;
    }

    public boolean isShouldDropHearts() {
        return shouldDropHearts;
    }

    public void setShouldDropHearts(boolean shouldDropHearts) {
        this.shouldDropHearts = shouldDropHearts;
    }

    public boolean isKillerShouldGainHearts() {
        return killerShouldGainHearts;
    }

    public void setKillerShouldGainHearts(boolean killerShouldGainHearts) {
        this.killerShouldGainHearts = killerShouldGainHearts;
    }

    public String getDeathMessage() {
        return deathMessage;
    }

    public void setDeathMessage(String deathMessage) {
        this.deathMessage = deathMessage;
    }

}
