package com.everydayproducts.service;

import java.util.Collection;
import java.util.Date;
import com.everydayproducts.dao.*;
import com.everydayproducts.model.Apparel;
import com.everydayproducts.model.*;
import com.everydayproducts.model.ElectronicItems;
import com.everydayproducts.model.FoodItems;

public class ProductsServiceImpl implements ProductsService {
	
	ProductsDAO productService = new ProductsDAOImpl();

	@Override
	public FoodItems createFoodItem(String itemName, double price, String dateOfManufacturing, String dateOfExpiry,
			String foodType, int quantity) {
		
		FoodItems foodItem = new FoodItems(itemName, price, dateOfManufacturing, dateOfExpiry, foodType, quantity);
		return this.productService.saveFoodItem(foodItem);
	}

	@Override
	public ElectronicItems createElectronicItem(String itemName, double price, int warranty, int quantity) {
		
		ElectronicItems electronicItem = new ElectronicItems(itemName, price, warranty, quantity);
		return this.productService.saveElectronicItem(electronicItem);
	}

	@Override
	public Apparel createApparel(String itemName, double price, int size, String material, int quantity) {
		
		Apparel apparel = new Apparel(itemName, price, size, material, quantity);
		return this.productService.saveApparel(apparel);
	}

	@Override
	public Collection<FoodItems> fetchFoodItems() {
		return this.productService.fetchFoodItems();
	}

	@Override
	public Collection<ElectronicItems> fetchElectronicItems() {
		return this.productService.fetchElectronicItems();
	}

	@Override
	public Collection<Apparel> fetchApparels() {
		return this.productService.fetchApparels();
	}
	

}
