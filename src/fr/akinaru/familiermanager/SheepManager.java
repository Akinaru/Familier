package fr.akinaru.familiermanager;

import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

public class SheepManager {

    public static void CreateFamilier(Player p){
        Sheep familier = p.getWorld().spawn(p.getLocation(), Sheep.class);
        familier.setCustomNameVisible(true);
        familier.setCustomName(EntityManager.SHEEP.getGuiName() + " §7de "+p.getDisplayName());
        CreateFamilier.CreationFinal(p, familier, EntityManager.SHEEP.getSpeed());
    }

}
