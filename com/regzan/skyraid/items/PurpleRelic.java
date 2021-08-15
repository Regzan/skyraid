package com.regzan.skyraid.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PurpleRelic {
    public static ItemStack purpleRelic;

    public static void init() {
        createPurpleRelic();
    }

    private static void createPurpleRelic() {
        ItemStack item = new ItemStack(Material.POPPED_CHORUS_FRUIT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§d§lDragon Scale");
        List<String> lore = new ArrayList<>();
        lore.add("§8§oDeep in a cave there lied");
        lore.add("§8§oa small purple dragon.");
        lore.add("§8§oThey say it's scales bring");
        lore.add("§8§ogood luck.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        purpleRelic = item;
    }
}
