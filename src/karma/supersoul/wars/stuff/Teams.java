package karma.supersoul.wars.stuff;

import org.bukkit.entity.Player;

import karma.supersoul.wars.Main;
import karma.supersoul.wars.config.MyConfig;
import net.md_5.bungee.api.ChatColor;

public class Teams {
	
	public static void setRedTeam(Player player)
	{
		MyConfig config = Main.manager.getNewConfig("Team.yml");
		config.set(".Red", player.getName());
		if (config.getList(".Blue").contains(player.getName())) {config.set(".Blue" + player.getName(), null);}
		config.saveConfig();
		player.sendMessage(Main.prefix + ChatColor.YELLOW + "You have joined " + ChatColor.RED + "Red" + ChatColor.YELLOW + "team!");
	}
	public static void setBlueTeam(Player player)
	{
		MyConfig config = Main.manager.getNewConfig("Team.yml");
		config.set(".Blue", player.getName());
		if (config.getList(".Red").contains(player.getName())) {config.set(".Red" + player.getName(), null);}
		config.saveConfig();
		player.sendMessage(Main.prefix + ChatColor.YELLOW + "You have joined " + ChatColor.BLUE + "Blue" + ChatColor.YELLOW + "team!");
	}
	public static boolean isRedTeam(Player player)
	{
		MyConfig config = Main.manager.getNewConfig("Team.yml");
		if (config.getList(".Red").contains(player.getName()))
		{
			return true;
		}
		else if (config.getList(".Blue").contains(player.getName())){
			return false;
		}
		return false;
	}
	public static boolean isBlueTeam(Player player)
	{
		MyConfig config = Main.manager.getNewConfig("Team.yml");
		if (config.getList(".Blue").contains(player.getName()))
		{
			return true;
		}
		else if (config.getList(".Red").contains(player.getName())){
			return false;
		}
		return false;
	}
}
