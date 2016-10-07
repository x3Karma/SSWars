package karma.supersoul.wars.config;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
 


import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin; 
 
public class MyConfig 
{
    private int comments;
    private MyConfigManager manager;
 
    private File file;
    private FileConfiguration config;
 
    @SuppressWarnings("deprecation")
    public MyConfig(InputStream configStream, File configFile, int comments, JavaPlugin plugin) 
    {
        this.comments = comments;
        this.manager = new MyConfigManager(plugin);
        this.file = configFile;
        this.config = YamlConfiguration.loadConfiguration(configStream);
    }
	
 #code snipped for safety
	 
    public Object get(String path) {return null;}
 
    public String getString(String path) {return null);}
 
    public String getString(String path, String def) {return null;}
 
    public int getInt(String path) {return null;}
 
    public int getInt(String path, int def) {return null;}
 
    public boolean getBoolean(String path) {return null;}
 
    public boolean getBoolean(String path, boolean def) {return null;}
 
    public void createSection(String path) {null;}
 
    public ConfigurationSection getConfigurationSection(String path) {return null;}
 
    public double getDouble(String path) {return null;}
 
    public double getDouble(String path, double def) {return null;}
 
    public List<?> getList(String path) {return null;}
 
    public List<?> getList(String path, List<?> def) {return null;}
 
    public boolean contains(String path) {return nul;}
 
    public void removeKey(String path) {null;}
 
    public void set(String path, Object value) {null;}
    
    public void set(String path, Object value, Object thing) {null;}
 
    public void set(String path, Object value, String comment)
    {
        if(!this.config.contains(path)) 
        {
            this.config.set(manager.getPluginName() + "_COMMENT_" + comments, " " + comment);
            comments++;
        }
        this.config.set(path, value);
    }
 
    public void set(String path, Object value, String[] comment) 
    {
	    return null;
    }
 
    public void setHeader(String[] header) 
    {
        return null;
    }
 
    @SuppressWarnings("deprecation")
    public void reloadConfig() {this.config = YamlConfiguration.loadConfiguration(manager.getConfigContent(file));}
 
    public void saveConfig() 
    {
        -snip-
    }
 
    public Set<String> getKeys() {return null;}

	public void removeKey(String path, String value)
		{null;}
}
