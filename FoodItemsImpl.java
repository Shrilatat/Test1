package com.hsbc.dao;

import com.hsbc.model.*;

//Author: Bhavya Chhabra
//Date: 24 Sept 2020
//Purpose: The following file implements the methods for the food items.

public class FoodItemsImpl {
	HashMap<String, FoodItemsCategory> foodItems;

	@Override
	public void addFoodItem(FoodItemsCategory foodItem) {
		if (foodItems.containsKey(foodItem.getItemCode()))
			// throw an exception

			foodItems.put(foodItem.getItemCode(), foodItem);
	}

	@Override
	public List<FoodItems> getFoodItemsByQuantity() {
		TreeSet<FoodItems> itemByQuantity = new TreeSet<>();
		List<FoodItems> report = new ArrayList<>();

		for (Map.Entry en : foodItems.entrySet()) {
			itemByQuantity.add((FoodItems) en.getValue());
		}
		Iterator<FoodItems> iterator = itemByQuantity.iterator();
		int i = 3;

		while (iterator.hasNext() && i > 0) {
			i--;
			report.add((FoodItems) iterator.next());
		}

		if (i > 0) {
			// throw exception
			System.out.println("Nos such Method");
		}
		return report;
	}

}
