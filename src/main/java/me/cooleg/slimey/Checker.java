package me.cooleg.slimey;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Checker implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {return false;}
        Player p = ((Player) sender).getPlayer();
        if (p.getLocation().getChunk().isSlimeChunk()) {
            p.sendMessage(ChatColor.GREEN + "You are currently in a slime chunk!");
        } else {
            p.sendMessage(ChatColor.RED + "The chunk you are in is not a slime chunk :(");
        }
        return true;
    }
}
