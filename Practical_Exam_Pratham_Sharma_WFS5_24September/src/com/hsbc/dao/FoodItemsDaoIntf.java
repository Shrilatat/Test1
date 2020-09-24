package com.hsbc.dao;

import com.hsbc.model.FoodItems;
import com.hsbc.userdefinedexceptions.ItemAlreadyExists;
import com.hsbc.userdefinedexceptions.ItemNotFound;

/*
 * @Author Pratham Sharma
 * 
 * Interface created to be show zero implementation of the operation that can be done on Electronic item
 */

public interface FoodItemsDaoIntf {
	public void addFoodItem(FoodItems item) throws ItemAlreadyExists;//adds an object to the DB
	public void deleteFoodItem(int itemCode) throws ItemNotFound;//deletes the object by entering just the itemcode
	public void addQuantity(int itemCode, int quantity);//Method to increase quantity of object by entering item code and quantity
	public void reduceQuantity(int itemCode, int quantity);//Method to decrease quantity of object by entering item code and quantity
	public void displayAllItems();//method to display all items
	public void displayTop3();//method to display top 3 objects by decreasing order of quantity
}
