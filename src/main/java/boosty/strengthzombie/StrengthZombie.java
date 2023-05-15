package boosty.strengthzombie;

import boosty.strengthzombie.EventHandlers.EventHandlers;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.beans.EventHandler;

public final class StrengthZombie extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new EventHandlers(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
