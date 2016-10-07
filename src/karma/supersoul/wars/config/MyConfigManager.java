package karma.supersoul.wars.config;

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import org.bukkit.plugin.java.JavaPlugin;

#code snipped for safety

public class MyConfigManager 
{
	private JavaPlugin plugin;

	public MyConfigManager(JavaPlugin plugin) 
	{
		this.plugin = plugin;
	}

	public MyConfig getNewConfig(String fileName, String[] header) 
	{
		return null;
	}

	public MyConfig getNewConfig(String fileName) 
	{
		return null;
	}

	private File getConfigFile(String file) 
	{
		return null;
	}

	public void prepareFile(String filePath, String resource) 
	{
		return null;
	}

	public void prepareFile(String filePath)
	{
		this.prepareFile(filePath, null);
	}

	public void setHeader(File file, String[] header)
	{
		return null;
	}
	
	public InputStream getConfigContent(File file) 
	{
		return null;
	}

	private int getCommentsNum(File file)
	{
		return null;
	}

	public InputStream getConfigContent(String filePath) 
	{
		return null;
	}

	private String prepareConfigString(String configString) 
	{
		return null;
	}

	public void saveConfig(String configString, File file)
	{
		return null;
	}

	public String getPluginName() 
	{
		return plugin.getDescription().getName();
	}
	
	private void copyResource(InputStream resource, File file) 
	{
		return null;
	}
}
