package me.buch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;


import java.util.List;
import java.util.Random;

public class TipCommand implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        String Prefix = ChatColor.GOLD + "[" + ChatColor.YELLOW + "RandomTip" + ChatColor.GOLD + "] ";
        if(args.length == 0){
        List<String> tips = RandomTip.instance.getConfig().getStringList("tips");
        String Tips1 = tips.get(new Random().nextInt(tips.size()));
        sender.sendMessage(Prefix + ChatColor.translateAlternateColorCodes('&',Tips1));
        }


        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }
}
