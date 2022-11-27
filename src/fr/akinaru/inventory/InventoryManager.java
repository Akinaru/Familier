package fr.akinaru.inventory;

import fr.akinaru.familier.Familier;
import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.EntityManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class InventoryManager implements Listener {

    private final Inventory inv;

    public Inventory GetInv(){
        return inv;
    }

    public InventoryManager() {
        inv = Bukkit.createInventory(null, 54, "§7Familier");
        InitialiseItems();
    }

    private void InitialiseItems(){
        inv.setItem(EntityManager.CHICKEN.getGuiPlace(),createGuiItem(EntityManager.CHICKEN.getGuiMaterial(),EntityManager.CHICKEN.getGuiName(),"§7Un poulet mignon de fortnite !"));
        inv.setItem(EntityManager.COW.getGuiPlace(),createGuiItem(EntityManager.COW.getGuiMaterial(),EntityManager.COW.getGuiName(),"§7Une vache Meu-Meu !"));
        inv.setItem(EntityManager.BLAZE.getGuiPlace(),createGuiItem(EntityManager.BLAZE.getGuiMaterial(),EntityManager.BLAZE.getGuiName(),"§7Un Blaze de fou !"));
        inv.setItem(EntityManager.WITHER.getGuiPlace(),createGuiItem(EntityManager.WITHER.getGuiMaterial(),EntityManager.WITHER.getGuiName(),"§7Un Wither méchant !"));
        inv.setItem(EntityManager.SHEEP.getGuiPlace(),createGuiItem(EntityManager.SHEEP.getGuiMaterial(),EntityManager.SHEEP.getGuiName(),"§7Un mouton tout doux !"));
        inv.setItem(EntityManager.SQUID.getGuiPlace(),createGuiItem(EntityManager.SQUID.getGuiMaterial(),EntityManager.SQUID.getGuiName(),"§7Un poulpe visqueux !"));
        inv.setItem(EntityManager.WOLF.getGuiPlace(),createGuiItem(EntityManager.WOLF.getGuiMaterial(),EntityManager.WOLF.getGuiName(),"§7Un loup sauvage !"));
        inv.setItem(EntityManager.SPIDER.getGuiPlace(),createGuiItem(EntityManager.SPIDER.getGuiMaterial(),EntityManager.SPIDER.getGuiName(),"§7Une araignée de roblox !"));
        inv.setItem(EntityManager.ZOMBIE.getGuiPlace(),createGuiItem(EntityManager.ZOMBIE.getGuiMaterial(),EntityManager.ZOMBIE.getGuiName(),"§7Un zombie fou furieux !"));
        inv.setItem(53, createGuiItem(Material.BARRIER, "§cSupprimer le familier", "§7Clique pour supprimer ton familier.", "§8usage: /familier remove"));
        setGlass(inv);
    }

    private static void setGlass(Inventory inv){
        final ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 8);
        final ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("");
        item.setItemMeta(meta);
        for(int i = 36; i < 45; i++){
            inv.setItem(i, item);
        }
    }

    public static void OpenInventory(Player p){
        Inventory inv = new InventoryManager().GetInv();
        if(Familier.FamilierList.containsKey(p)){
            final ItemStack item = new ItemStack(Material.PAPER, 1);
            final ItemMeta meta = item.getItemMeta();

            // Set the name of the item
            meta.setDisplayName("§7Ton familier: "+Familier.FamilierList.get(p).getCustomName());

            // Set the lore of the item
            meta.setLore(Arrays.asList("§7Ton familier actuel !"));

            item.setItemMeta(meta);
            inv.setItem(49, item);
        }
        p.openInventory(inv);
    }

    private ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        // Set the name of the item
        meta.setDisplayName(name);

        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }


    @EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {
        if (e.getInventory().getName().equals("§7Familier")) {
            e.setCancelled(true);
        }
    }

}