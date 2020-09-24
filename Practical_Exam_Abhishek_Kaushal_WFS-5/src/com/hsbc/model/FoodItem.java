package com.hsbc.model;


/**
 * 
 * @author Abhishek Kaushal
 * 
 * Food_Item class is sub class of Product class and has attributes of Food Items.
 *
 */

import java.util.Calendar;



public class FoodItem extends Product {
	public enum VEGETARIAN
	{YES , NO}
	private Calendar dateOfManufacture;
	private Calendar dateOfExpiry;
	private VEGETARIAN vegetarian;
	
	public FoodItem(int itemCode, String itemName, int unitPrice, int quantity, Calendar dateOfManufacture,
			Calendar dateOfExpiry, VEGETARIAN vegetarian) {
		super(itemCode, itemName, unitPrice, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}
	public Calendar getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(Calendar dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public Calendar getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Calendar dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public VEGETARIAN getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(VEGETARIAN vegetarian) {
		this.vegetarian = vegetarian;
	}
	@Override
	public String toString() {
		return "FoodItem [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + "]";
	}
	
	
	
	
	
}
