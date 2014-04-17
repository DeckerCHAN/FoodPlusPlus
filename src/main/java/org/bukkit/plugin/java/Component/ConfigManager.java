package org.bukkit.plugin.java.Component;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class ConfigManager
{
    Plugin ProvidePlugin;
    FileConfiguration Config;

    private ConfigManager(Plugin plugin)
    {
	this.ProvidePlugin = plugin;
	plugin.getConfig();
    }

    private static ConfigManager _Instance;

    public static ConfigManager Init(Plugin plugin)
    {
	if (_Instance == null)
	{
	    _Instance = new ConfigManager(plugin);
	}
	return _Instance;
    }

    public static FileConfiguration GetConfig()
    {
	return _Instance.Config;
    }
    /**
     * Reload configuration to instance
     */
    public static void ReloadConfig()
    {
	_Instance.ProvidePlugin.reloadConfig();
	_Instance.Config=_Instance.ProvidePlugin.getConfig();
    }
    {
	
    }

}
