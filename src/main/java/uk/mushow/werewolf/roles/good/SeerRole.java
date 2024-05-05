package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class SeerRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGM3N2RmZDIxNTk4YTM5NzRmYTg1OTE5YTE1YzA5NDlmZWM3MzQ0NTFiMTIyMTg5YmEyMTVkMGE5ZDhiZWJmIn19fQ==";

    @Override
    public String getRoleName() {
        return "Seer";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.AQUA;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Seer, you have the ability to see the true identity of one player each night.",
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
