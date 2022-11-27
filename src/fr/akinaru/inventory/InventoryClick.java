package fr.akinaru.inventory;

import fr.akinaru.familier.Familier;
import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.DeleteFamilier;
import fr.akinaru.familiermanager.EntityManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {


    @EventHandler
    public void FamilierClick(final InventoryClickEvent e){
        if (e.getInventory().getName().equals("§7Familier")) {
            if(e.getCurrentItem() != null){
                Player p = Bukkit.getPlayer(e.getWhoClicked().getName());
                for(EntityManager entityType : EntityManager.values()){
                    if(e.getCurrentItem().getType() == entityType.getGuiMaterial()){
                        if(Familier.FamilierList.containsKey(p)){
                            DeleteFamilier.Delete(p);
                        }
                        CreateFamilier.Create(p, entityType.getEntityType());
                        p.closeInventory();
                    }
                }

                if(e.getCurrentItem().getType() == Material.BARRIER){
                    DeleteFamilier.Delete(p);
                    p.closeInventory();
                }
            }
        }
    }

}
