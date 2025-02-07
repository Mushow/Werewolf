package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class VillagerRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjE5ZjY1YzE3OWI3MmZhOThjNjFjOGYwZDVhZGQ1ODQ3Zjg3MWJhZDk4M2IxMThmMzgzZDk1YWFjY2JhNDc2In19fQ==";

    @Override
    public String getRoleName() {
        return "Villager";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.GRAY;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Villager, you are a simple and innocent villager who must work with the other villagers to identify and eliminate the Werewolves.",
                "Your goal is to eliminate all the Werewolves before they outnumber the villagers.",
                "Use your keen observation skills to identify suspicious behavior and vote to eliminate the Werewolves during the day.");
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
