package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class GuardRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBlODFjMDA2ZDhmYzM3MGViODI4ODMwZTJkODcxZmQ4YWRjNjQwYTA0ZjE1YmRhMjhlMDM3NGJhYzQzZjNhNSJ9fX0==";

    @Override
    public String getRoleName() {
        return "Guard";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.DARK_AQUA;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Guard, you have the ability to protect one player each night.",
                "Your goal is to use your power to protect the villagers and eliminate the Werewolves before they outnumber the villagers.",
                "Work with the other villagers to gather information and vote to eliminate the Werewolves during the day.");
    }

    @Override
    public boolean isGood() {
        return true;
    }

    @Override
    public String getTexture() {
        return texture;
    }
}
