package com.decker.FoodPlusPlus;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.decker.FoodPlusPlus.Component.ConfigManager;
import com.decker.FoodPlusPlus.Component.PluginLogger;

public class FoodPlusPlusPlugin extends JavaPlugin
{
    /**
     * Will execute when plug-in start execute
     */
    @Override
    public void onEnable()
    {
	ConfigManager.Init(this);
	PluginLogger.Init(this);
	getServer().getPluginManager().registerEvents(new EventListener(this),this);
	PluginLogger.Info("Enable Finished. Every Thing is OK!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
	return false;
    }

    @Override
    public void onDisable()
    {

    }
}
