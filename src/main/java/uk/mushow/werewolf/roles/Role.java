package uk.mushow.werewolf.roles;

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Role {

    String getRoleName();
    ChatColor getRoleColor();
    List<String> getRoleDescription();
    boolean isGood();
    String getTexture();

    default String getRoleDisplayName() {
        return getRoleColor() + getRoleName();
    }

    default ItemStack getItemStack() {
        return RoleItemFactory.createRoleItem(getTexture(), getRoleDisplayName());
    }

}
