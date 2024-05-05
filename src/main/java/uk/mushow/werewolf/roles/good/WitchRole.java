package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class WitchRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTViYjM1NGYwNWZkMmZhN2FlMGZlNzZhNmJmYTBhYTE1MjQ3OTAwNzhjYjgxM2U2MjQzOGMyNDU2ZTNlZTllYiJ9fX0==";

    @Override
    public String getRoleName() {
        return "Witch";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.DARK_PURPLE;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Witch, you have the ability to save or kill one player each night.",
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
