package karma.supersoul.wars.stuff;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import karma.supersoul.wars.Main;
import net.md_5.bungee.api.ChatColor;

public class FlagTaken {
	
	public static void blueFlag(Player player)
	{
		for (Player all : Bukkit.getOnlinePlayers())
		{
			all.sendMessage(Main.prefix + ChatColor.translateAlternateColorCodes('&', "&eThe &9Blue &eteam has taken &cRed&e's flag!"));
		}
		player.getInventory().getHelmet().setType(Material.BANNER);
		player.getInventory().getHelmet().setDurability((short) 4);
	}
	public static void redFlag(Player player)
	{
		for (Player all : Bukkit.getOnlinePlayers())
		{
			all.sendMessage(Main.prefix + ChatColor.translateAlternateColorCodes('&', "&eThe &cRed &eteam has taken &9Blue&e's flag!"));
		}
		player.getInventory().getHelmet().setType(Material.BANNER);
		player.getInventory().getHelmet().setDurability((short) 1);
	}
}
