package karma.supersoul.wars.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import karma.supersoul.wars.Main;
import karma.supersoul.wars.stuff.Teams;
import net.md_5.bungee.api.ChatColor;

public class PlayerDeath extends Event implements Listener {

	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		Player player = e.getEntity();
		Player killer = player.getKiller();
		if (killer != null) {
			if (Teams.isRedTeam(player)) {
				for (Player all : Bukkit.getOnlinePlayers()) {
					all.sendMessage(Main.prefix + ChatColor.translateAlternateColorCodes('&', "&c" + player.getName() + "&e was killed by &9" + killer.getName() + "&e."));
				}
			}
			else if (Teams.isBlueTeam(player))
			{
				for (Player all : Bukkit.getOnlinePlayers()) {
					all.sendMessage(Main.prefix + ChatColor.translateAlternateColorCodes('&', "&9" + player.getName() + "&e was killed by &c" + killer.getName() + "&e."));
				}
			}
		}
		if (player.getInventory().getHelmet().equals(Material.BANNER))
		{
			if (Teams.isRedTeam(player))
			{
				
			}
			else if (Teams.isBlueTeam(player))
			{
				
			}
		}
	}

	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return null;
	}

}
