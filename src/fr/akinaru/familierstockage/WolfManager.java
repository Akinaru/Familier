package fr.akinaru.familierstockage;

import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.EntityManager;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;

public class WolfManager {

    public static void CreateFamilier(Player p){
        Wolf familier = p.getWorld().spawn(p.getLocation(), Wolf.class);
        familier.setCustomNameVisible(true);

        familier.setCustomName(EntityManager.WOLF.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.WOLF.getSpeed());
    }

}
