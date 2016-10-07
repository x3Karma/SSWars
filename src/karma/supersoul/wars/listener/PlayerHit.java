package karma.supersoul.wars.listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import karma.supersoul.wars.Main;
import karma.supersoul.wars.config.MyConfig;
import karma.supersoul.wars.stuff.Teams;

public class PlayerHit extends Event implements Listener {

	@EventHandler
	public void onHit(EntityDamageByEntityEvent e) {
		Entity entity = e.getEntity();
		Entity damager = e.getDamager();
		if (entity.getType() == EntityType.PLAYER) {
			Player player = (Player) entity;
			if (damager.getType() == EntityType.PLAYER) {
				Player dm = (Player) damager;
				@SuppressWarnings("unused")
				MyConfig config = Main.manager.getNewConfig("Team.yml");
				if (Teams.isRedTeam(dm)) {
					if (Teams.isRedTeam(player)) {
						e.setCancelled(true);
					}
				} else if (Teams.isBlueTeam(dm)) {
					if (Teams.isBlueTeam(player)) {
						e.setCancelled(true);
					}
				}
			}
		}
	}

	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return null;
	}

}
