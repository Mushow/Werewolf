package uk.mushow.werewolf.roles.evil;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class WerewolfRole implements Role {

    private final String texture = "";

    @Override
    public String getRoleName() {
        return "Werewolf";
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Werewolf, you are disguised as a villager during the day but transform at night to hunt the villagers.",
                "Your goal is to secretly eliminate all the villagers without being discovered.",
                "Work closely with other Werewolves to strategize and survive until you outnumber the villagers.");
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.DARK_RED;
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
