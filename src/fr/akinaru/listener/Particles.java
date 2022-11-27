package fr.akinaru.listener;

import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import javax.xml.stream.Location;

public class Particles {

    EnumParticle particletype;
    boolean longdistance;
    float locX;
    float locY;
    float locZ;
    float offsetx;
    float offsety;
    float offsetz;
    float speed;
    int amount;

    public Particles(EnumParticle particletype, float locX, float locY, float locZ, boolean londgdistance, float offsetx, float offsety, float offsetz, float speed, int amount) {
        this.particletype = particletype;
        this.locX = locX;
        this.locY = locY;
        this.locZ = locZ;
        this.longdistance = londgdistance;
        this.offsetx = offsetx;
        this.offsety = offsety;
        this.offsetz = offsetz;
        this.speed = speed;
        this.amount = amount;
    }

    public static void sendParticle(Particles particule){
        for(Player player : Bukkit.getOnlinePlayers()){
            PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(particule.particletype, particule.longdistance, particule.locX, particule.locY, particule.locZ, particule.offsetx, particule.offsety, particule.offsetz, particule.speed, particule.amount);
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
        }
    }

}
