package com.decker.FoodPlusPlus;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.Plugin;

import com.decker.FoodPlusPlus.Component.PluginLogger;
import com.decker.FoodPlusPlus.Food.Food;
import com.decker.FoodPlusPlus.Food.FoodData;

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
	this.ServerPlugin = plugin;
    }
    
    
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event)
    {
	try
	{
	   

	    for (Food food : FoodData.GetInstance().IntrinsicFoodList)
	    {

		if (food.Material == event.getItem().getType())
		{
		    Player currentPlayer = event.getPlayer();
		    PluginLogger.Info(currentPlayer.getDisplayName() + " Eating " + food.Material.name());
		    currentPlayer.setSaturation(currentPlayer.getSaturation() - FoodData.GetInstance().getFood(food.Material).Saturation);
		    currentPlayer.setFoodLevel(currentPlayer.getFoodLevel() - FoodData.GetInstance().getFood(food.Material).FoodPoint);
		    // Filter
		    if (currentPlayer.getFoodLevel() < 0)
		    {
			currentPlayer.setFoodLevel(0);
		    } else if (currentPlayer.getFoodLevel() > 20)
		    {
			currentPlayer.setFoodLevel(20);
		    }
		    if (currentPlayer.getSaturation() > 17)
		    {
			currentPlayer.setSaturation(17F);
		    }
		    continue;
		}
		
	    }


	} catch (Exception e)
	{
	    // TODO: handle exception and write to file
	    PluginLogger.Warning(e);
	}

    }

}
