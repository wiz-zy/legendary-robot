package com.blastbrean.helpfulplugin.commands;

import com.blastbrean.helpfulplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StarveCommand implements CommandExecutor {
    private final Main main;

    public StarveCommand(Main main) {
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player){
            player.setFoodLevel(0);
            player.sendMessage(ChatColor.GREEN + "You're starved now.");
        } else {
            main.getLogger().info("Not a player. GTFO.");
        }
        return true;
    }

}
