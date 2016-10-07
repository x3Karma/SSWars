package karma.supersoul.wars.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerInventoryEvent;

@SuppressWarnings({ "deprecation", "unused" })
public class ArmorListener extends Event implements Listener {

	@EventHandler
	public void getArmor(ArmorEquipEvent e)
	{
		Player player = e.getPlayer();
		if (e.getOldArmorPiece().getType() == Material.BANNER)
		{
			e.setCancelled(true);
		}
	}
	
	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return null;
	}

}
