package com.decker.FoodPlusPlus;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.Plugin;


/**
 * 
 * @author Decker
 *
 */
public class EventListener implements Listener 
{
    private Plugin ServerPlugin;
     public EventListener(Plugin plugin)
     {
	 this.ServerPlugin=plugin;
     }
     
     public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event)
     {
	 try
	{
	    
	} catch (Exception e)
	{
	    // TODO: handle exception and write to file
	}
     
     }
     
     
}
