package karma.supersoul.wars;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import karma.supersoul.wars.config.MyConfigManager;
import karma.supersoul.wars.listener.ArmorListener;
import karma.supersoul.wars.listener.BlockBreak;
import karma.supersoul.wars.listener.PlayerDeath;
import karma.supersoul.wars.listener.PlayerHit;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	public static String prefix = new String(ChatColor.translateAlternateColorCodes('&', "&8[&aSS &cWars&8] "));
	public static MyConfigManager manager;
	
	@Override
	public void onEnable () {
	this.eventRegister();	
	manager = new MyConfigManager(this);
	}
	
	@Override
	public void onDisable() {}
	
	public void eventRegister() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new ArmorListener(), this);
		pm.registerEvents(new BlockBreak(), this);
		pm.registerEvents(new PlayerDeath(), this);
		pm.registerEvents((Listener) new PlayerHit(), this);
	}
}
