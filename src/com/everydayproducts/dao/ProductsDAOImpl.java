package com.everydayproducts.dao;
import com.everydayproducts.model.*;
import java.util.*;

public class ProductsDAOImpl implements ProductsDAO{
	
	private static Set<FoodItems> foodItems = new TreeSet<>();
	private static Set<ElectronicItems> electronicItems = new TreeSet<>();
	private static Set<Apparel> apparels = new TreeSet<>();
	
	
	@Override
	public FoodItems saveFoodItem(FoodItems foodItem) {
		this.foodItems.add(foodItem);
		return foodItem;
	}
	@Override
	public ElectronicItems saveElectronicItem(ElectronicItems electronicItem) {
		this.electronicItems.add(electronicItem);
		return electronicItem;
	}
	@Override
	public Apparel saveApparel(Apparel apparel) {
		this.apparels.add(apparel);
		return apparel;
	}
	@Override
	public Collection<FoodItems> fetchFoodItems() {
		return foodItems;
	}
	@Override
	public Collection<ElectronicItems> fetchElectronicItems() {
		return electronicItems;
	}
	@Override
	public Collection<Apparel> fetchApparels() {
		return apparels;
	}
	
	
	
	

}
