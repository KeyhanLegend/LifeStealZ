package com.zetaplugins.lifestealz.events;

import org.bukkit.event.entity.PlayerDeathEvent;

public abstract class ZPlayerDeathEventBase extends ZEvent {
    protected final PlayerDeathEvent originalEvent;

    public ZPlayerDeathEventBase(PlayerDeathEvent originalEvent) {
        this.originalEvent = originalEvent;
    }

    public PlayerDeathEvent getOriginalEvent() {
        return originalEvent;
    }

    public org.bukkit.entity.Player getEntity() {
        return originalEvent.getEntity();
    }

    public String getDeathMessage() {
        return originalEvent.getDeathMessage();
    }

    public void setDeathMessage(String deathMessage) {
        originalEvent.setDeathMessage(deathMessage);
    }

    public java.util.List<org.bukkit.inventory.ItemStack> getDrops() {
        return originalEvent.getDrops();
    }

    public int getDroppedExp() {
        return originalEvent.getDroppedExp();
    }

    public void setDroppedExp(int exp) {
        originalEvent.setDroppedExp(exp);
    }

    public int getNewExp() {
        return originalEvent.getNewExp();
    }

    public void setNewExp(int exp) {
        originalEvent.setNewExp(exp);
    }

    public int getNewLevel() {
        return originalEvent.getNewLevel();
    }

    public void setNewLevel(int level) {
        originalEvent.setNewLevel(level);
    }

    public int getNewTotalExp() {
        return originalEvent.getNewTotalExp();
    }

    public void setNewTotalExp(int totalExp) {
        originalEvent.setNewTotalExp(totalExp);
    }

    public boolean getKeepLevel() {
        return originalEvent.getKeepLevel();
    }

    public void setKeepLevel(boolean keepLevel) {
        originalEvent.setKeepLevel(keepLevel);
    }

    public boolean getKeepInventory() {
        return originalEvent.getKeepInventory();
    }

    public void setKeepInventory(boolean keepInventory) {
        originalEvent.setKeepInventory(keepInventory);
    }
}