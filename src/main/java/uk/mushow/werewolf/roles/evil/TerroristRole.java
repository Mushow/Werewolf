package uk.mushow.werewolf.roles.evil;

import org.bukkit.ChatColor;
import uk.mushow.werewolf.roles.Role;

import java.util.List;

public class TerroristRole implements Role {

    private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDgyMzViZjBiMDViMzdjZGJhOTkxNDlkMGJhY2E0OWM2YWExZGU2NjNkZGRiYTdmOThhOTk5YzA0MTE5MGViNiJ9fX0==";

    @Override
    public String getRoleName() {
        return "Terrorist";
    }

    @Override
    public ChatColor getRoleColor() {
        return ChatColor.RED;
    }

    @Override
    public List<String> getRoleDescription() {
        return List.of("As a Terrorist, your objective is to sacrifice yourself in the initial round.",
                "Encouraging every player to vote for your elimination. ",
                "Your mission is to create chaos and confusion among the villagers to achieve your ultimate goal.");
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
