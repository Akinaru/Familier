package fr.akinaru.familierstockage;

import fr.akinaru.familiermanager.CreateFamilier;
import fr.akinaru.familiermanager.EntityManager;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wither;

public class WitherManager {

    public static void CreateFamilier(Player p){
        Wither familier = p.getWorld().spawn(p.getLocation(), Wither.class);
        familier.setCustomNameVisible(true);
        familier.setCustomName(EntityManager.WITHER.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.WITHER.getSpeed());
    }

}
