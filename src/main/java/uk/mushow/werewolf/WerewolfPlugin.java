package uk.mushow.werewolf;

import org.bukkit.plugin.java.JavaPlugin;
import uk.mushow.werewolf.commands.WerewolfHelp;
import uk.mushow.werewolf.commands.WerewolfInfo;
import uk.mushow.werewolf.enums.WerewolfState;
import uk.mushow.werewolf.listeners.WerewolfListener;
import uk.mushow.werewolf.managers.RoleManager;

import static org.bukkit.Bukkit.getPluginCommand;
import static org.bukkit.Bukkit.getPluginManager;

public final class WerewolfPlugin extends JavaPlugin {

    private WerewolfState state = WerewolfState.WAITING;

    @Override
    public void onEnable() {
        getLogger().info("Werewolf plugin enabled");
        registerEvents();
        registerCommands();
    }

    @Override
    public void onDisable() {
        getLogger().info("Werewolf plugin disabled");
    }

    private void registerEvents() {
        RoleManager roleManager = new RoleManager();
        WerewolfListener werewolfListener = new WerewolfListener(this, roleManager);
        getPluginManager().registerEvents(werewolfListener, this);
    }

    private void registerCommands() {
        getPluginCommand("info").setExecutor(new WerewolfInfo());
        getPluginCommand("help").setExecutor(new WerewolfHelp());
    }

    public WerewolfState getState() {
        return state;
    }

    public void setState(WerewolfState state) {
        this.state = state;
    }

    public boolean isState(WerewolfState state) {
        return this.state == state;
    }

}
