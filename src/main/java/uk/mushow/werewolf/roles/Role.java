package uk.mushow.werewolf.roles;

import org.bukkit.ChatColor;

public interface Role {

    String getRoleName();
    String getRoleDescription();
    ChatColor getRoleColor();
    boolean isGood();
    void performNightAction();

}
