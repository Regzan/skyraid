package com.regzan.skyraid.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class RedRelic {
    public static ItemStack redRelic;

    public static void init() {
        createRedRelic();
    }

    private static void createRedRelic() {
        ItemStack item = new ItemStack(Material.GLISTERING_MELON_SLICE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lMelon From Hell");
        meta.addItemFlags();
        List<String> lore = new ArrayList<>();
        lore.add("§8§oEven Satan needs a ");
        lore.add("§8§otasty snack every");
        lore.add("§8§onow and again.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
        redRelic = item;
    }
}
