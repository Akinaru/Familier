package fr.akinaru.familiermanager;

import org.bukkit.entity.Player;
import org.bukkit.entity.Squid;

public class SquidManager {

    public static void CreateFamilier(Player p){
        Squid familier = p.getWorld().spawn(p.getLocation(), Squid.class);
        familier.setCustomNameVisible(true);

        familier.setCustomName(EntityManager.SQUID.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.SQUID.getSpeed());
    }

}
