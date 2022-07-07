package me.buch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RandomTip extends JavaPlugin {
    public static RandomTip instance;



    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        this.getCommand("tip").setExecutor(new TipCommand());





    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
