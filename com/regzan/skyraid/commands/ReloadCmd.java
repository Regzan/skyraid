package com.regzan.skyraid.commands;

import com.regzan.skyraid.Main;
import com.regzan.skyraid.commandsapi.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCmd extends CommandExecutor {

    public ReloadCmd(){
        setCommmand("reload");
        setPermission("sr.reload");
        setUsage("/sr reload");
        setBoth();
        setLength(1);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        //TODO: Reload command
        sender.sendMessage("§3Succesfully reloaded the §bconfig§3!");
        Main.instance.reloadConfig();
    }
}
