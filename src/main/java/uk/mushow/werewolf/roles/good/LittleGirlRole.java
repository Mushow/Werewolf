package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class LittleGirlRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2ZmYjcxNzdkNDA1NGJjNDE5MDllNWVhMmVhYjIwZmRkNGI5ODI3MjVkMjdiMmRkZDIxMzAzY2ZjZGVkZjhlMCJ9fX0==";

    @Override
    public String getRoleName() {
        return "Little Girl";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.YELLOW;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Little Girl, you have the ability to peek at the Werewolves during the night.",
                "Your goal is to use your power to identify and eliminate the Werewolves before they outnumber the villagers.",
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
