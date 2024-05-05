package uk.mushow.werewolf.roles;

import org.bukkit.ChatColor;

import java.util.List;

public interface Role {

    String getRoleName();
    List<String> getRoleDescription();
    ChatColor getRoleColor();
    boolean isGood();
    void performNightAction();

    default String getRoleDisplayName() {
        return getRoleColor() + getRoleName();
    }

}
