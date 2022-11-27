package fr.akinaru.player;

import fr.akinaru.familier.Familier;
import fr.akinaru.familiermanager.DeleteFamilier;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        if(Familier.FamilierList.containsKey(e.getPlayer())){
            DeleteFamilier.Delete(e.getPlayer());
        }
    }

}
