package com.hsbc.dao;
//interface for Fooditems
import com.hsbc.model.FoodItemCategory;
import java.util.List;

public interface FoodItemsDao {

	void addFoodItem(FoodItemCategory foodItems);
	List<FoodItemCategory> getFoodItemByQuantity();

}
