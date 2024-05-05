package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class CupidRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODE4NWM5ZDdlYTM3NTUzM2RkNjBkZDQ3OGViYjE0OWExY2NkOTQ0YTRhM2ZjYTcxZDE5ZjlkNzg3YjQ2NDZmYyJ9fX0==";

    @Override
    public String getRoleName() {
        return "Cupid";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.LIGHT_PURPLE;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As Cupid, you have the ability to link two players together at the start of the game.",
                "Your goal is to ensure that the two players you link together survive to the end of the game.",
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
