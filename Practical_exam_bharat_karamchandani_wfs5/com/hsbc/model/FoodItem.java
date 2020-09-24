package com.hsbc.model;

import java.util.Date;

/**
 * 
 * @author bk
 * purpose: model class for food item reusing Product class attributes and methods
 */
public class FoodItem extends Product{
	private Date dateOfManufacture;
	private Date dateOfExpiry;
	private boolean isVegeterian;
	
	public FoodItem() {}
	
	public FoodItem(int itemCode, String itemName, float price, Date dateOfManufacture, Date dateOfExpiry,
			boolean isVegeterian, int quantity) {
		super(itemCode, itemName, price, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegeterian = isVegeterian;
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

	public boolean isVegeterian() {
		return isVegeterian;
	}

	public void setVegeterian(boolean isVegeterian) {
		this.isVegeterian = isVegeterian;
	}

	@Override
	public String toString() {
		return "FoodItem [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", isVegeterian="
				+ isVegeterian + ", getItemCode()=" + getItemCode() + ", getItemName()=" + getItemName()
				+ ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()=" + getQuantity() + "]";
	}


	
	
	
	
	
	
	
}
