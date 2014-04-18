package com.decker.FoodPlusPlus.Food;

import java.util.LinkedList;
import org.bukkit.Material;

import com.decker.FoodPlusPlus.Component.ConfigManager;

public class FoodData
{
    public LinkedList<Food> IntrinsicFoodList;
    private FoodData()
    {
	this.IntrinsicFoodList = new LinkedList<Food>();
	new LinkedList<Food>();

	this.IntrinsicFoodList.add(new Food(Material.APPLE.name(), 4, 2.4F, Material.APPLE));
	this.IntrinsicFoodList.add(new Food(Material.BAKED_POTATO.name(), 6, 7.2F, Material.BAKED_POTATO));
	this.IntrinsicFoodList.add(new Food(Material.BREAD.name(), 5, 6F, Material.BREAD));
	this.IntrinsicFoodList.add(new Food(Material.CAKE.name(), 2, 0.4F, Material.CAKE));
	this.IntrinsicFoodList.add(new Food(Material.CAKE_BLOCK.name(), 12, 2.4F, Material.CAKE_BLOCK));
	this.IntrinsicFoodList.add(new Food(Material.CARROT_ITEM.name(), 4, 4.8F, Material.CARROT_ITEM));
	this.IntrinsicFoodList.add(new Food(Material.COOKED_CHICKEN.name(), 6, 7.2F, Material.COOKED_CHICKEN));
	this.IntrinsicFoodList.add(new Food(Material.GRILLED_PORK.name(), 8, 12.8F, Material.GRILLED_PORK));
	this.IntrinsicFoodList.add(new Food(Material.COOKED_FISH.name(), 6, 9.6F, Material.COOKED_FISH));
	this.IntrinsicFoodList.add(new Food(Material.COOKIE.name(), 2, 0.4F, Material.COOKIE));
	this.IntrinsicFoodList.add(new Food(Material.GOLDEN_APPLE.name(), 4, 9.6F, Material.GOLDEN_APPLE));
	this.IntrinsicFoodList.add(new Food(Material.GOLDEN_CARROT.name(), 6, 14.4F, Material.GOLDEN_CARROT));
	this.IntrinsicFoodList.add(new Food(Material.MELON.name(), 2, 1.2F, Material.MELON));
	this.IntrinsicFoodList.add(new Food(Material.MUSHROOM_SOUP.name(), 6, 7.2F, Material.MUSHROOM_SOUP));
	this.IntrinsicFoodList.add(new Food(Material.POISONOUS_POTATO.name(), 2, 1.2F, Material.POISONOUS_POTATO));
	this.IntrinsicFoodList.add(new Food(Material.POTATO_ITEM.name(), 1, 0.6F, Material.POTATO_ITEM));
	this.IntrinsicFoodList.add(new Food(Material.PUMPKIN_PIE.name(), 8, 4.8F, Material.PUMPKIN_PIE));
	this.IntrinsicFoodList.add(new Food(Material.RAW_BEEF.name(), 3, 1.8F, Material.RAW_BEEF));
	this.IntrinsicFoodList.add(new Food(Material.RAW_CHICKEN.name(), 2, 1.2F, Material.RAW_CHICKEN));
	this.IntrinsicFoodList.add(new Food(Material.RAW_FISH.name(), 2, 0.4F, Material.RAW_FISH));
	this.IntrinsicFoodList.add(new Food(Material.PORK.name(), 3, 1.8F, Material.PORK));
	this.IntrinsicFoodList.add(new Food(Material.ROTTEN_FLESH.name(), 4, 0.8F, Material.ROTTEN_FLESH));
	this.IntrinsicFoodList.add(new Food(Material.SPIDER_EYE.name(), 2, 3.2F, Material.SPIDER_EYE));
	this.IntrinsicFoodList.add(new Food(Material.COOKED_BEEF.name(), 8, 12.8F, Material.COOKED_BEEF));
    }

    public Food getFood(Material material) throws Exception
    {
	for (Food intrinsic : this.IntrinsicFoodList)
	{
	    if (intrinsic.Material.equals(material))
	    {
		return new Food(material.toString(), intrinsic.FoodPoint - ConfigManager.GetConfig().getInt(intrinsic.FoodName + ".FoodPoint"), intrinsic.Saturation - (float) ConfigManager.GetConfig().getDouble(intrinsic.FoodName + ".Saturation"), material);
	    }
	}
	throw new Exception("Cant Fin Food!");
    }

    private static FoodData _instance;

    public static FoodData GetInstance()
    {
	if (_instance == null)
	{
	    _instance = new FoodData();
	}
	return _instance;
    }

}
