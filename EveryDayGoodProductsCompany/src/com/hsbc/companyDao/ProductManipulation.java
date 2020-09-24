package com.hsbc.companyDao;

import java.util.TreeSet;
import java.util.Set;

/*
 * Author : Vishnu
 * Date : 24-09-2020
 * This class is created for the data layer which holds computation methods such as add a item display item etc.
 *  currently this class adds and displays FoodItems and Apparels.
 */

public class ProductManipulation {
	TreeSet<FoodItems> ftSet = new TreeSet<>();
	TreeSet<Apparel> ASet = new TreeSet<>();
	TreeSet<Electronics> ESet = new TreeSet<>();

	public void addFoodItems(FoodItems fItem) {	//add food item to set
		ftSet.add(fItem);
	}

	public void displayFoodItems() {			//displays the top 3 sold food items 
		int count = 0;

		for (FoodItems foodItems : ftSet) {
			if (count < 3)
				System.out.println(foodItems);
			count++;
		}
	}

	public void addApparelItems(Apparel aItem) {//add apparel item to set
		ASet.add(aItem);
	}

	public void displayApparelItems() {			//displays the top 3 sold apparels  
		int count = 0;							//a counter to limit the top sold items for displaying
		for (Apparel apparelItems : ASet) {
			if (count < 3)
				System.out.println(apparelItems);
			count++;
		}
	}
	
	public void addElectronicItems(Electronics EItem) {	//add food item to set
		ESet.add(EItem);
	}

	public void displayElectronicItems() {			//displays the top 3 sold food items 
		int count = 0;

		for (Electronics ElectonicItems : ESet) {
			if (count < 3)
				System.out.println(ElectonicItems);
			count++;
		}
	}
}
