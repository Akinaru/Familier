package fr.akinaru.familiermanager;

import fr.akinaru.familier.Familier;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageEntity implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        for(Entity familiers : Familier.FamilierList.values()){
            if(event.getEntity() == familiers){
                event.setCancelled(true);
            }
        }
    }

}
