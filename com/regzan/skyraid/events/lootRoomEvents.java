package com.regzan.skyraid.events;

import com.regzan.skyraid.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static com.regzan.skyraid.items.BlueRelic.blueRelic;
import static com.regzan.skyraid.items.GreenRelic.greenRelic;
import static com.regzan.skyraid.items.PurpleRelic.purpleRelic;
import static com.regzan.skyraid.items.RedRelic.redRelic;

public class lootRoomEvents implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player player = (Player) event.getPlayer();

        int relicCount = 0;
        int blueRelicFound = 0;
        int purpleRelicFound = 0;
        int redRelicFound = 0;
        int greenRelicFound = 0;

        if (event.getPlayer().getInventory().getItemInMainHand().equals(blueRelic)) {
            if (event.getAction().equals(Action.PHYSICAL)) {
                if (player.getLocation().equals(Main.instance.getConfig().getString("bluePos"))){
                    player.sendMessage(Main.instance.getConfig().getStringList("bluePos"));
                }
                if (event.getClickedBlock().getType() == Material.LIGHT_WEIGHTED_PRESSURE_PLATE) {
                    if (blueRelicFound == 0) {
                        blueRelicFound = 1;
                        player.sendMessage(ChatColor.AQUA + "Blue Relic Is Found, Number Is " + blueRelicFound);

                    }
                }
                player.sendMessage("Blue Relic Is Found (End), Number Is " + blueRelicFound);
            }
        }


        if (event.getPlayer().getInventory().getItemInMainHand().equals(purpleRelic)) {
            if (event.getAction().equals(Action.PHYSICAL)) {
                if (event.getClickedBlock().getType() == Material.LIGHT_WEIGHTED_PRESSURE_PLATE) {
                    purpleRelicFound = 1;
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Purple Relic Is Found Number Is " + purpleRelicFound);
                }
                player.sendMessage("Purple Relic Is Found (End), Number Is " + purpleRelicFound);
            }
        }


        if (event.getPlayer().getInventory().getItemInMainHand().equals(redRelic)) {
            if (event.getAction().equals(Action.PHYSICAL)) {
                if (event.getClickedBlock().getType() == Material.LIGHT_WEIGHTED_PRESSURE_PLATE) {
                    redRelicFound = 1;
                    player.sendMessage(ChatColor.RED + "Red Relic Is Found Number Is " + redRelicFound);
                }
                player.sendMessage("Red Relic Is Found (End), Number Is " + redRelicFound);
            }
        }


        if (event.getPlayer().getInventory().getItemInMainHand().equals(greenRelic)) {
            if (event.getAction().equals(Action.PHYSICAL)) {
                if (event.getClickedBlock().getType() == Material.LIGHT_WEIGHTED_PRESSURE_PLATE) {
                    greenRelicFound = 1;
                    player.sendMessage(ChatColor.GREEN + "Green Relic Is Found Number Is " + greenRelicFound);
                }
                player.sendMessage("Green Relic Is Found (End), Number Is " + greenRelicFound);
            }
        }
    }
}