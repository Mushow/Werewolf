package uk.mushow.werewolf.roles.good;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class VillagerRole implements Role {

    private final String texture = "";

    @Override
    public String getRoleName() {
        return "Villager";
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Villager, you are a simple and innocent villager who must work with the other villagers to identify and eliminate the Werewolves.",
                "Your goal is to eliminate all the Werewolves before they outnumber the villagers.",
                "Use your keen observation skills to identify suspicious behavior and vote to eliminate the Werewolves during the day.");
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.GRAY;
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
