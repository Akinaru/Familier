package fr.akinaru.familier;

import fr.akinaru.familiermanager.DeleteFamilier;
import fr.akinaru.inventory.InventoryManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CommandManager implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        if(args.length >= 1 && args[0].equals("remove")){
            DeleteFamilier.Delete((Player)sender);
        }
        else{
            Player p = (Player) sender;
            InventoryManager.OpenInventory(p);

        }
        return false;
    }
}
