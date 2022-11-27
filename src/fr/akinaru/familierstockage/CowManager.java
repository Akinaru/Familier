package fr.akinaru.familierstockage;

import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.EntityManager;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;

public class CowManager {

    public static void CreateFamilier(Player p){
        Cow familier = p.getWorld().spawn(p.getLocation(), Cow.class);
        familier.setCustomNameVisible(true);
        familier.setCustomName(EntityManager.COW.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.COW.getSpeed());
    }

}
