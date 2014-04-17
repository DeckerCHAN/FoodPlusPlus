package com.decker.FoodPlusPlus.Food;

public class Food
{
    public Food(String foodName, int foodPoint, Float saturation,
	    org.bukkit.Material material)
    {
	super();
	FoodName = foodName;
	FoodPoint = foodPoint;
	Saturation = saturation;
	Material = material;
    }
    public String FoodName;
    public int FoodPoint;
    public Float  Saturation;
    public org.bukkit.Material Material;
    
    @Override
    public String toString()
    {
	return this.FoodName;
    }
}
