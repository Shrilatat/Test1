package com.hsbc.model;
//Author: Ritakshi Sen
//Purpose : This class is contains data about food items in  the retail store
public class FoodItems extends Item {
	
	String dateOfManufacture;
	String dateOfExpiry;
	String vegetarian;
	
	//Constructor that initializes the FoodItems parameters
	public FoodItems(int itemCode, String name, int unitPrice, int quantity , String dateOfManufacture, String dateOfExpiry,
			String vegetarian )
			{
				super(itemCode, name, unitPrice, quantity);
				this.dateOfManufacture = dateOfManufacture;
				this.dateOfExpiry = dateOfExpiry;
				this.vegetarian = vegetarian;
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


	public String getVegetarian() {
		return vegetarian;
	}


	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	
	
	

}
