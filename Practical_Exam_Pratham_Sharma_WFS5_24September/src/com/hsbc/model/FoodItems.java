package com.hsbc.model;

import java.util.Calendar;

import com.hsbc.enumerations.IS_VEGETARIAN;

/*
 * @Author - Pratham Sharma
 * 
 * Model Class for Food Items
 */
public class FoodItems implements Comparable<FoodItems> {
	
	private int itemCode;
	private String itemName;
	private float unitPrice;
	private Calendar dateOfManufacture;
	private Calendar dateOfExpiry;
	private IS_VEGETARIAN isVegetarian;
	private int quantity;
	
	public FoodItems() {
		super();
	}

	public FoodItems(int itemCode, String itemName, float unitPrice, Calendar dateOfManufacture, Calendar dateOfExpiry,
			IS_VEGETARIAN isVegetarian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegetarian = isVegetarian;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
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

	public IS_VEGETARIAN getIsVegetarian() {
		return isVegetarian;
	}

	public void setIsVegetarian(IS_VEGETARIAN isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "["+itemCode+","+itemName+","+unitPrice+","+dateOfManufacture+","+dateOfExpiry+","+isVegetarian+","+quantity+"]";
	}

	@Override
	public int compareTo(FoodItems o) {
		// TODO Auto-generated method stub
		return this.getQuantity()-o.getQuantity();
	}
}
