package fr.akinaru.familierstockage;

import fr.akinaru.familier.Familier;
import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.EntityManager;
import fr.akinaru.familiermanager.FollowFamilier;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class ChickenManager implements Listener {

    public static void CreateFamilier(Player p){
        Chicken familier = p.getWorld().spawn(p.getLocation(), Chicken.class);
        familier.setCustomNameVisible(true);
        familier.setCustomName(EntityManager.CHICKEN.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.CHICKEN.getSpeed());
    }

}
