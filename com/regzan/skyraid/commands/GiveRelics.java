package com.regzan.skyraid.commands;

import com.regzan.skyraid.commandsapi.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static com.regzan.skyraid.items.BlueRelic.blueRelic;
import static com.regzan.skyraid.items.GreenRelic.greenRelic;
import static com.regzan.skyraid.items.PurpleRelic.purpleRelic;
import static com.regzan.skyraid.items.RedRelic.redRelic;

public class GiveRelics extends CommandExecutor {

    public GiveRelics(){
        setCommmand("relics");
        setPermission("sr.relics");
        setUsage("/sr relics");
        setPlayer(true);
        setLength(1);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        //TODO: Give items
        Player player = (Player)sender;
        player.getInventory().setItem(0, blueRelic);//Slot 1 = 0, etc
        player.getInventory().setItem(1, purpleRelic);
        player.getInventory().setItem(2, redRelic);
        player.getInventory().setItem(3, greenRelic);
    }
}
