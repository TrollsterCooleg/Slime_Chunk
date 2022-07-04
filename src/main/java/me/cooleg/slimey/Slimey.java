package me.cooleg.slimey;

import org.bukkit.plugin.java.JavaPlugin;

public final class Slimey extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("slimechunk").setExecutor(new Checker());

    }

}
