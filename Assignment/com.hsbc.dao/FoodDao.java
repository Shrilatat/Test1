package com.hsbc.practical;

import java.util.Scanner;
import java.util.TreeSet;

public class FoodDao implements FoodIntf{
	
	TreeSet<Food> foods = new TreeSet<>();
	
	public void addFood() throws ItemAlreadyExistException {
		
		int itemCode;
		String itemName;
		int quantity;
		String vegetarian;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Item Code: ");
		itemCode = in.nextInt();
		if(foods.contains(itemCode))
			throw new ItemAlreadyExistException();
		System.out.println("Enter Item Name:");
		itemName = in.next();
		System.out.println("Enter Quantity:");
		quantity = in.nextInt();
		System.out.println("Enter Vegetarian(YES/NO):");
		vegetarian = in.next();
		foods.add(new Food(itemCode,itemName,quantity,vegetarian));
	}
	
	public void display() {
		int count = 0;
		for (Food food : foods) {
			if(count > 3)
				break;
			System.out.println(food);
			count++;
			
		}
	}
	
	
}
