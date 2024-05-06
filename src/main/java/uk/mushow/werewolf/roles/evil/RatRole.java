package uk.mushow.werewolf.roles.evil;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class RatRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmEyMTE2MjMxOThiZDkwODQ2MDk3YTVhZDIzODgzNjAyOTdmMDA0MjgzZDQwOThjYTA0MzBlNGM5Njk3ZWZmMSJ9fX0==";

    @Override
    public String getRoleName() {
        return "Rat";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.GOLD;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Rat, you have the ability to infect two player each night.",
                "Your goal is to use your power to infect all the villagers and outnumber them.",
                "Work with the other werewolves to gather information and vote to eliminate the villagers during the day.");
    }

    @Override
    public boolean isGood() {
        return false;
    }

    @Override
    public String getTexture() {
        return texture;
    }
}
