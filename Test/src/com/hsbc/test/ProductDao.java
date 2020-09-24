package com.hsbc.test;
import java.util.*;

/**
 * @author Mauli
 * purpose: creating DAo class for manipulation of data
 */

public class ProductDao {
	Set<FoodItems> food = new TreeSet<>();
	Set<Apparel> apparel = new TreeSet<>();
	Set<Electronics> elec = new TreeSet<>();


	public void addFoodItem(FoodItems f)
	{
		food.add(f);
	}
	public void addApp(Apparel app)
	{
		apparel.add(app);
	}
	public void addElec(Electronics e)
	{
		elec.add(e);
	}
	
	public void retriveData()
	{
		System.out.println(food);
		System.out.println(apparel);
		
	}
	
	public void displayThreeFood() {			
		int count = 0;

		for (FoodItems foodItems : food) {
			if (count < 3)
				System.out.println(foodItems);
			count++;
		}
	}
	
	public void displayThreeApp() {			
		int count = 0;

		for (Apparel a : apparel) {
			if (count < 3)
				System.out.println(a);
			count++;
		}
	}
	public void displayThreeElec() {			
		int count = 0;

		for (Electronics e : elec) {
			if (count < 3)
				System.out.println(e);
			count++;
		}
	}
}
