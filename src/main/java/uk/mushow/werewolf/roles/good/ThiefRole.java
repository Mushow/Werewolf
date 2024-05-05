package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class ThiefRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjUzYzE1NTliZjEyNTI1Y2E5Y2RlYWYxNDMxMTI2OGZiMzlhZDM2M2VhYjhjYTNiODUyNmQ5YjQwYTJjNzU4ZCJ9fX0==";

    @Override
    public String getRoleName() {
        return "Thief";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.DARK_RED;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Thief, you have the ability to exchange your role with another player during the night.",
                "Your goal is to use your power to eliminate the Werewolves before they outnumber the villagers.",
                "Work with the other villgers to gather information and vote to eliminate the Werewolves during the day.");
    }

    @Override
    public boolean isGood() {
        return true;
    }

    @Override
    public String getTexture() {
        return null;
    }
}
