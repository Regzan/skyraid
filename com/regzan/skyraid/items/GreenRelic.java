package com.regzan.skyraid.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GreenRelic {
    public static ItemStack greenRelic;

    public static void init() {
        createGreenRelic();
    }

    private static void createGreenRelic() {
        ItemStack item = new ItemStack(Material.SCUTE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lGriffin Scale");
        List<String> lore = new ArrayList<>();
        lore.add("§8§oDespite it's look, this");
        lore.add("§8§oscale is particularly");
        lore.add("§8§ogentle to the touch.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
        greenRelic = item;
    }
}
