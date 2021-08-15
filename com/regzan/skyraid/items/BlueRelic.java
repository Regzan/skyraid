package com.regzan.skyraid.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class BlueRelic {
    public static ItemStack blueRelic;

    public static void init() {
        createBlueRelic();
    }

    private static void createBlueRelic() {
        ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§9§lSerpent's Eye");
        List<String> lore = new ArrayList<>();
        lore.add("§8§oThere was an old");
        lore.add("§8§otale of a Grand Sea");
        lore.add("§8§oSerpent with one eye.");
        lore.add("§8§oSome say the Serpent still");
        lore.add("§8§oseeks for it's missing part.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.CHANNELING, 1);
        blueRelic = item;
    }
}
