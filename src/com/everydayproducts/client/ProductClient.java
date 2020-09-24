package com.everydayproducts.client;

import com.everydayproducts.service.*;
import com.everydayproducts.model.*;
import java.util.*;



public class ProductClient {

	public static void main(String[] args) {
		
		ProductsService productsService = new ProductsServiceImpl();
		
		Calendar now = Calendar.getInstance();
		String manufactureDate = (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR);
		String expiryDate = (now.get(Calendar.MONTH)) + "-" + (now.get(Calendar.DATE) + 3) + "-" + now.get(Calendar.YEAR);
		FoodItems bread = productsService.createFoodItem("Bread", 60.0, manufactureDate, expiryDate, "Yes", 30);
		
		Collection<FoodItems> fi = productsService.fetchFoodItems();
		
		for(FoodItems food : fi) {
			System.out.println(food.getItemCode());
		}
		
		ElectronicItems electronicItem = productsService.createElectronicItem("Samsung M31", 174999, 1, 50);
		
		Collection<ElectronicItems> ei = productsService.fetchElectronicItems();
		
		for(ElectronicItems electronic : ei) {
			System.out.println(electronic.getItemCode());
		}
		
		Apparel apparel = productsService.createApparel("Skirt", 700, 28, "Cotton", 20);
		Collection<Apparel> ap = productsService.fetchApparels();
		
		for(Apparel app : ap) {
			System.out.println(app.getItemCode());
		}
	}

}
