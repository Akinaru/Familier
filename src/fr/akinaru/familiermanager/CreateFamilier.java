package fr.akinaru.familiermanager;

import fr.akinaru.familier.Familier;
import fr.akinaru.familierstockage.*;
import fr.akinaru.listener.Particles;
import net.minecraft.server.v1_8_R3.EnumParticle;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CreateFamilier {

    public static void Create(Player p, EntityType entityType){
        if(entityType == EntityManager.CHICKEN.getEntityType()) ChickenManager.CreateFamilier(p);
        if(entityType == EntityManager.COW.getEntityType()) CowManager.CreateFamilier(p);
        if(entityType == EntityManager.BLAZE.getEntityType()) BlazeManager.CreateFamilier(p);
        if(entityType == EntityManager.SHEEP.getEntityType()) SheepManager.CreateFamilier(p);
        if(entityType == EntityManager.SQUID.getEntityType()) SquidManager.CreateFamilier(p);
        if(entityType == EntityManager.WOLF.getEntityType()) WolfManager.CreateFamilier(p);
        if(entityType == EntityManager.SPIDER.getEntityType()) SpiderManager.CreateFamilier(p);
        if(entityType == EntityManager.ZOMBIE.getEntityType()) ZombieManager.CreateFamilier(p);
        if(entityType == EntityManager.WITHER.getEntityType()) WitherManager.CreateFamilier(p);
    }

    public static void CreationFinal(Player p, Entity familier, double speed){
        Familier.FamilierList.put(p, familier);
        FollowFamilier.follow(p, familier, speed);
        Location loc = p.getLocation();
        Particles.sendParticle(new Particles(EnumParticle.CLOUD, (float)p.getLocation().getX(), (float)p.getLocation().getY() + 1, (float)p.getLocation().getZ(), true, 0.75f, 0.75f, 0.75f, 0, 10));
    }

}
