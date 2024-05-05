package uk.mushow.werewolf;

import org.bukkit.plugin.java.JavaPlugin;

public final class WerewolfPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Werewolf plugin enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("Werewolf plugin disabled");
    }
}
