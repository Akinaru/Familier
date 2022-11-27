package fr.akinaru.player;

import fr.akinaru.familier.Familier;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class ClickEvent implements Listener {

    @EventHandler
    public void clickOnEntity(PlayerInteractEntityEvent e){
        for(Entity familiers : Familier.FamilierList.values()){
            if(e.getRightClicked().equals(familiers)){
                familiers.setPassenger(e.getPlayer());

            }
        }
    }

}
