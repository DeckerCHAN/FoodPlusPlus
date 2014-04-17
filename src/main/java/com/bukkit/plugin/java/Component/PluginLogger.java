package com.bukkit.plugin.java.Component;

import java.util.logging.Logger;

import org.bukkit.plugin.Plugin;

/**
 * Provide multi type log function
 * @author Decker
 * 
 */
public class PluginLogger
{
    Plugin ProvidePlugin;
    Logger PluginLogger;
    Boolean IsDebug;
    private PluginLogger(Plugin plugin)
    {
	this.ProvidePlugin = plugin;
	this.PluginLogger = this.ProvidePlugin.getLogger();
	this.IsDebug=ConfigManager.GetConfig().getBoolean("DebugMode");
    }
    
    
    
    private static PluginLogger _Instance;
    
    public static PluginLogger Init(Plugin plugin)
    {
	if(_Instance==null)
	{
	    _Instance =new PluginLogger(plugin);
	}
	return _Instance;
    }
    

    public static void Info(String messege)
    {
	if(_Instance.IsDebug)
	{
	    _Instance.PluginLogger.info(messege);
	}	
    }
    
    public static void Warning(String messege)
    {
	_Instance.PluginLogger.warning(messege);
    }
    
    public static void Warning(Exception exception)
    {
	_Instance.PluginLogger.warning(exception.toString());
    }
}
