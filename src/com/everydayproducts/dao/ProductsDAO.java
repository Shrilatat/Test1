package com.everydayproducts.dao;

import java.util.Collection;
import com.everydayproducts.model.*;

public interface ProductsDAO {
	
	public FoodItems saveFoodItem(FoodItems foodItem);
	public ElectronicItems saveElectronicItem(ElectronicItems electronicItem);
	public Apparel saveApparel(Apparel apparel);
	
	public Collection<FoodItems> fetchFoodItems();
	public Collection<ElectronicItems> fetchElectronicItems();
	public Collection<Apparel> fetchApparels();
}
