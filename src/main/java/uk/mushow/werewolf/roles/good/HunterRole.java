package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class HunterRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQwZjY4OWZjNDdkM2Y3NzczZGJmYzM2YWY0NmE0MWUxNGU0M2I0ODBkODkxYmY0YjliZjFlYjgwNDM4MTc0MiJ9fX0==";

    @Override
    public String getRoleName() {
        return "Hunter";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.DARK_GREEN;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Hunter, you have the ability to shoot one player during the day before you die.",
                "Your goal is to use your power to eliminate the Werewolves before they outnumber the villagers.",
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
