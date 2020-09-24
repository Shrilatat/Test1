package com.hsbc.test;
/**
 * @author Mauli 
 * purpose: main class 
 */
public class TestProduct {
	public static void main(String[] args) {
		ProductDao p = new ProductDao();
		p.addFoodItem(new FoodItems(10, "Milk", 4, 30, "23-9", "24-10", "Yes"));
		p.addFoodItem(new FoodItems(12, "icecream", 6, 20,"21-9", "25-10", "Yes"));
		p.addFoodItem(new FoodItems(13, "meat", 8, 10, "13-9", "28-10", "No"));
	
		p.addApp(new Apparel(01, "Shirt", 2, 250, "woolen"));
		p.addApp(new Apparel(02, "kurti", 1, 500, "woolen"));
		
		p.addElec(new Electronics(3, 21, "TV", 2, 1000 ));
		p.addElec(new Electronics(6, 22, "mobile", 5, 500 ));
		
		p.displayThreeElec();
		p.displayThreeFood();
		p.displayThreeApp();
		
	}
}
