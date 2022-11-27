package fr.akinaru.familierstockage;

import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.EntityManager;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

public class ZombieManager {

    public static void CreateFamilier(Player p){
        Zombie familier = p.getWorld().spawn(p.getLocation(), Zombie.class);
        familier.setCustomNameVisible(true);

        familier.setCustomName(EntityManager.ZOMBIE.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.ZOMBIE.getSpeed());
    }

}
