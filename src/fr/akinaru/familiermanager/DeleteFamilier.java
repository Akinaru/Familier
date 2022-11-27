package fr.akinaru.familiermanager;

import fr.akinaru.familier.Familier;
import fr.akinaru.listener.Particles;
import net.minecraft.server.v1_8_R3.EnumParticle;
import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class DeleteFamilier {

    public static void Delete(Player p){
        if(Familier.FamilierList.containsKey(p)) {
            p.sendMessage("§7Tu as supprimé ton familier ("+ Familier.FamilierList.get(p).getCustomName() +"§7)");
            LivingEntity familier = (LivingEntity) Familier.FamilierList.get(p);
            familier.remove();
            Familier.FamilierList.remove(p);
            Particles.sendParticle(new Particles(EnumParticle.CLOUD, (float)familier.getLocation().getX(), (float)familier.getLocation().getY(), (float)familier.getLocation().getZ(), true, 0.75f, 0.75f, 0.75f, 0, 10));
        }
    }
}
