package karma.supersoul.wars.stuff;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import karma.supersoul.wars.Main;
import karma.supersoul.wars.config.MyConfig;
import net.md_5.bungee.api.ChatColor;

public class Scoreboards {
	public void setScore()
	{
		MyConfig config = Main.manager.getNewConfig("Team.yml");
		ScoreboardManager sbm = Bukkit.getScoreboardManager();
		Scoreboard sb = sbm.getNewScoreboard();
		int ri = config.getList(".Red").size();
		String n1 = new String("" + ri);
		sb.registerNewObjective(ChatColor.RED + "Red", n1);
	}
}
