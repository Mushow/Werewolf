package uk.mushow.werewolf.roles;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.UUID;

public class RoleItemFactory {

    public static ItemStack createRoleItem(String texture, String displayName) {
        try {
            ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
            SkullMeta meta = (SkullMeta) skull.getItemMeta();

            Field profileField = Objects.requireNonNull(meta).getClass().getDeclaredField("profile");
            profileField.setAccessible(true);

            Class<?> gameProfileClass = Class.forName("com.mojang.authlib.GameProfile");
            Class<?> propertyClass = Class.forName("com.mojang.authlib.properties.Property");

            Object gameProfile = gameProfileClass.getConstructor(UUID.class, String.class).newInstance(UUID.randomUUID(), null);
            Object propertyMap = gameProfileClass.getMethod("getProperties").invoke(gameProfile);
            Method putMethod = propertyMap.getClass().getMethod("put", Object.class, Object.class);

            Object textureProperty = propertyClass.getConstructor(String.class, String.class).newInstance("textures", texture);
            putMethod.invoke(propertyMap, "textures", textureProperty);

            profileField.set(meta, gameProfile);

            meta.setDisplayName(displayName);
            skull.setItemMeta(meta);
            return skull;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
