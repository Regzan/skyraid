package com.regzan.skyraid.commands;

import com.regzan.skyraid.commandsapi.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelpCmd extends CommandExecutor {

    public HelpCmd(){
        setCommmand("help");
        setPermission("sr.help");
        setUsage("/sr help");
        setBoth();
        setLength(1);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        //TODO: Help list
        String[] msg;
        msg = new String[]{
                "§f§l-=-=-=-= §a§lHelp §f§l=-=-=-=-",
                "§a/sr help: §fShows this list of commands",
                "§a/sr relics: §fGives the relic items for testing purposes"};
        sender.sendMessage(msg);
    }
}