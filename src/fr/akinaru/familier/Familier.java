package fr.akinaru.familier;

import fr.akinaru.familiermanager.DamageEntity;
import fr.akinaru.familiermanager.FamilierTarget;
import fr.akinaru.familierstockage.ChickenManager;
import fr.akinaru.familiermanager.DeleteFamilier;
import fr.akinaru.inventory.InventoryClick;
import fr.akinaru.inventory.InventoryManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class Familier extends JavaPlugin {

    private static Familier instance;
    public static HashMap<Player, Entity> FamilierList = new HashMap<Player, Entity>();

    public static Familier GetInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new InventoryManager(), this);
        Bukkit.getPluginManager().registerEvents(new ChickenManager(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryClick(), this);
        Bukkit.getPluginManager().registerEvents(new DamageEntity(), this);
        Bukkit.getPluginManager().registerEvents(new FamilierTarget(), this);
        this.getCommand("familier").setExecutor(new fr.akinaru.familier.CommandManager());
        instance = this;
    }

    @Override
    public void onDisable() {
        for(Player p : Bukkit.getOnlinePlayers()){
            DeleteFamilier.Delete(p);
        }
    }
}
