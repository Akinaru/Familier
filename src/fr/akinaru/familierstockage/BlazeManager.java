package fr.akinaru.familierstockage;

import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.EntityManager;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Player;

public class BlazeManager {

    public static void CreateFamilier(Player p){
        Blaze familier = p.getWorld().spawn(p.getLocation().add(0,1,0), Blaze.class);
        familier.setCustomNameVisible(true);
        familier.setCustomName(EntityManager.BLAZE.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.BLAZE.getSpeed());
    }


}
