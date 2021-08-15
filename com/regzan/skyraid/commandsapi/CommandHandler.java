package com.regzan.skyraid.commandsapi;

import com.regzan.skyraid.commands.GiveRelics;
import com.regzan.skyraid.commands.HelpCmd;
import com.regzan.skyraid.commands.ReloadCmd;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandHandler implements org.bukkit.command.CommandExecutor, TabCompleter {

    private final HashMap<String, CommandExecutor> commands = new HashMap<String, CommandExecutor>();

    public CommandHandler() {
        commands.put("help", new HelpCmd());
        commands.put("relics", new GiveRelics());
        commands.put("reload", new ReloadCmd());
    }

    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if (cmd.getName().equalsIgnoreCase("sr")){

            if(args.length == 0){
                sender.sendMessage("§c§l(!) §cTry '/sr help' for help!");
                Bukkit.dispatchCommand(sender, "sr help");
                return true;
            }

            if (args[0] != null) {
                String name = args[0].toLowerCase();
                if (commands.containsKey(name)){
                    final CommandExecutor command = commands.get(name);

                    if (command.getPermission() != null && !sender.hasPermission(command.getPermission())) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }

                    if (!command.isBoth()) {

                        if (command.isConsole() && sender instanceof Player) {
                            sender.sendMessage(ChatColor.RED + "Only console can use that command!");
                            return true;
                        }
                        if (command.isPlayer() && sender instanceof ConsoleCommandSender) {
                            sender.sendMessage(ChatColor.RED + "Only players can use that command!");
                            return true;
                        }
                    }

                    if (command.getLength() > args.length) {
                        sender.sendMessage(ChatColor.RED + "Usage: " + command.getUsage());
                        return true;
                    }

                    command.execute(sender, args);

                }

            }
        }

        return false;

    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        List<String> list = new ArrayList<>();
        if (strings.length == 1){
            for (Map.Entry<String, CommandExecutor> cmd : commands.entrySet()){
                if (cmd.getKey().startsWith(strings[0])) {
                    list.add(cmd.getKey());
                }

            }

        }
        return list;

    }

}
