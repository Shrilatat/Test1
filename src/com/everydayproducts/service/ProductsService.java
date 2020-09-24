package com.everydayproducts.service;

import java.util.Collection;
import java.util.Date;

import com.everydayproducts.model.Apparel;
import com.everydayproducts.model.ElectronicItems;
import com.everydayproducts.model.FoodItems;

public interface ProductsService {
	
	public FoodItems createFoodItem(String itemName, double price, String dateOfManufacturing, String dateOfExpiry, String foodType, int quantity);
	public ElectronicItems createElectronicItem(String itemName, double price, int warranty, int quantity);
	public Apparel createApparel(String itemName, double price, int size, String material, int quantity);
	
	public Collection<FoodItems> fetchFoodItems();
	public Collection<ElectronicItems> fetchElectronicItems();
	public Collection<Apparel> fetchApparels();
}
