package com.hsbc.model;

import java.util.Comparator;

//Author: Bhavya Chhabra
//Date: 24 Sept 2020
//Purpose: The following file intialise the variables required for Food Item Category items and contains the methods to add new items.

import java.util.Date;

public class FoodItemCategory implements Comparator <FoodItemCategory>{
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private Date dateOfManufacture;
	private Date dateOfExpiry;
	private String vegetarianCheck;
	private int quantity;

	public FoodItemCategory() {
	}

	public FoodItemCategory(int itemCode, String itemName, int unitPrice, Date dateOfManufacture, Date dateOfExpiry,
			String vegetarianCheck, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarianCheck = vegetarianCheck;
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

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getVegetarianCheck() {
		return vegetarianCheck;
	}

	public void setVegetarianCheck(String vegetarianCheck) {
		this.vegetarianCheck = vegetarianCheck;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodItemCategory [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarianCheck="
				+ vegetarianCheck + ", quantity=" + quantity + "]";
	}

	@Override
	public int compare(FoodItemCategory o1, FoodItemCategory o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int compareTo(FoodItemCategory foodItems) {
		if(quantity==foodItems.quantity)
			return 0;
		else if(quantity>foodItems.quantity)
			return 1;
		else
			return -1;
	}

	/*
	 * @Override public int hashCode() { // TODO Auto-generated method stub return
	 * super.hashCode(); }
	 * 
	 * 
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub return super.equals(obj); }
	 */

}
