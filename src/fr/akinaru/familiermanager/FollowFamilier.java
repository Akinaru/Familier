package fr.akinaru.familiermanager;

import fr.akinaru.familier.Familier;
import fr.akinaru.listener.Particles;
import net.minecraft.server.v1_8_R3.EnumParticle;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftCreature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;

public class FollowFamilier implements Listener {

    public static void follow(final Player p, final Entity familier, Double speed){
        new BukkitRunnable(){
            @Override
            public void run() {
                if(!(Familier.FamilierList.get(p).equals(familier)) || !(p.isOnline())){
                    return;
                }
                if(p.getLocation().distance(familier.getLocation()) > 15){
                    familier.teleport(p);
                    Particles.sendParticle(new Particles(EnumParticle.CLOUD, (float)familier.getLocation().getX(), (float)familier.getLocation().getY(), (float)familier.getLocation().getZ(), true, 0.75f, 0.75f, 0.75f, 0, 10));
                }else{
                    if(!familier.getLocation().equals(p.getLocation().add(-1,0,-1))){
                        ((CraftCreature)familier).getHandle().getNavigation().a(p.getLocation().getX() - 1, p.getLocation().getY(), p.getLocation().getZ() -1 ,  speed);
                    }
                }
            }
        }.runTaskTimer(Familier.GetInstance(), 0, 5);
    }
}
