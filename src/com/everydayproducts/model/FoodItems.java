package com.everydayproducts.model;

import java.util.*;

public class FoodItems extends Products implements Comparable<FoodItems>{
	
	private String dateOfManufacture;
	
	private String dateOfExpiry;
	
	private String typeOfFood;
	
	public FoodItems(String itemName, double price, String dateOfManufacturing, String dateOfExpiry, String foodType, int quantity) {
		this.itemName = itemName;
		this.itemCode = ++itemCodeTracker;
		this.unitPrice = price;
		this.dateOfManufacture = dateOfManufacturing;
		this.dateOfExpiry = dateOfExpiry;
		this.typeOfFood = foodType;
		this.quantity = quantity;
		
	}

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	@Override
	public int compareTo(FoodItems foodItems) {
		// TODO Auto-generated method stub
		return (int) (this.getItemCode()-foodItems.getItemCode());
	}
	
	
}
