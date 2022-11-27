package fr.akinaru.familiermanager;

import fr.akinaru.familier.Familier;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class FamilierTarget implements Listener {

    @EventHandler
    public void onEntityTarget(EntityTargetEvent event){
        if (event.getEntity() instanceof Monster ){
            for(Entity familier : Familier.FamilierList.values()){
                if(event.getEntity().equals(familier)) {
                    event.setCancelled(true);
                    return;
                }
            }

        }
    }

}
