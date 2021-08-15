package com.regzan.skyraid;

import com.regzan.skyraid.commandsapi.CommandHandler;
import com.regzan.skyraid.events.lootRoomEvents;
import com.regzan.skyraid.items.BlueRelic;
import com.regzan.skyraid.items.GreenRelic;
import com.regzan.skyraid.items.PurpleRelic;
import com.regzan.skyraid.items.RedRelic;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        this.getConfig();
        getServer().getPluginManager().registerEvents(new lootRoomEvents(), this);

        BlueRelic.init();
        PurpleRelic.init();
        RedRelic.init();
        GreenRelic.init();

        getCommand("sr").setExecutor(new CommandHandler());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[SkyRaid]: Plugin is enabled!");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[SkyRaid]: Plugin is disabled!");
        instance = null;
    }

    public static Main getInstance() {
        return instance;
    }
}
