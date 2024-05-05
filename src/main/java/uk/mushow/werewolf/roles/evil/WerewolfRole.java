package uk.mushow.werewolf.roles.evil;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class WerewolfRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY4ZDQzMTI5MzliYjMxMTFmYWUyOGQ2NWQ5YTMxZTc3N2Y4ZjJjOWZjNDI3NTAxY2RhOGZmZTNiMzY3NjU4In19fQ==";

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
