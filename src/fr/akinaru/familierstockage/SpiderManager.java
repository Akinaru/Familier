package fr.akinaru.familierstockage;

import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.EntityManager;
import org.bukkit.entity.Player;
import org.bukkit.entity.Spider;

public class SpiderManager {

    public static void CreateFamilier(Player p){
        Spider familier = p.getWorld().spawn(p.getLocation(), Spider.class);
        familier.setCustomNameVisible(true);
        familier.setCustomName(EntityManager.SPIDER.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.SPIDER.getSpeed());
    }

}
