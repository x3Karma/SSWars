package karma.supersoul.wars.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import karma.supersoul.wars.Main;
import karma.supersoul.wars.stuff.FlagTaken;
import karma.supersoul.wars.stuff.Teams;
import net.md_5.bungee.api.ChatColor;

public class BlockBreak extends Event implements Listener {

	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Block b = e.getBlock();
		Player player = e.getPlayer();
		if (b.getType() == Material.WOOL) {
			if (b.getType().getMaxDurability() == 14) {
				if (Teams.isRedTeam(player)) {
					e.setCancelled(true);
					b.setType(Material.STAINED_GLASS);
					Material is = b.getType();
					ItemStack i = new ItemStack(is);
					i.setDurability((short) 14);
					FlagTaken.redFlag(player);
				}
				else {
					e.setCancelled(true);
					player.sendMessage(Main.prefix + ChatColor.RED + "You can't break your own flag!");
				}
			}
			else if (b.getType().getMaxDurability() == 11) {
				if (Teams.isBlueTeam(player)) {
					e.setCancelled(true);
					b.setType(Material.STAINED_GLASS);
					Material is = b.getType();
					ItemStack i = new ItemStack(is);
					i.setDurability((short) 11);
					FlagTaken.blueFlag(player);
				}
				else {
					e.setCancelled(true);
					player.sendMessage(Main.prefix + ChatColor.RED + "You can't break your own flag!");
				}
			}
		}
		else if (b.getType() == Material.STAINED_GLASS) {
			e.setCancelled(true);
			player.sendMessage(Main.prefix + ChatColor.RED + "Someone else has taken this flag!");
		}
		else {
			e.setCancelled(true);
		}
	}

	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return null;
	}

}
