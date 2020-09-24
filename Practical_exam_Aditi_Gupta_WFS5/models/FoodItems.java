package com.hsbc.models;

import java.util.Date;

/**
 * 
 * @author ADITI GUPTA
 *
 *         Model class which contains information about FoodItems
 *
 * 
 */
public class FoodItems implements Comparable<FoodItems> {
	int price;
	Date dateOfManufac;
	Date dateOfExpiry;
	String isVegetarian;
	int itemCode;
	String itemName;
	int Quantity;

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

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getisVegetarian() {
		return isVegetarian;
	}

	public void setisVegetarian(String isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDateOfManufac() {
		return dateOfManufac;
	}

	public void setDateOfManufac(Date dateOfManufac) {
		this.dateOfManufac = dateOfManufac;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItems(int price, Date dateOfManufac, Date dateOfExpiry, String isVegetarian, int itemCode,
			String itemName, int quantity) {
		super();
		this.price = price;
		this.dateOfManufac = dateOfManufac;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegetarian = isVegetarian;
		this.itemCode = itemCode;
		this.itemName = itemName;
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodItems [  itemCode=" + itemCode + ", itemName=" + itemName + ", Quantity=" + Quantity
				+ " isVegetarian=\" + isVegetarian + \"]";
	}

	@Override
	public int compareTo(FoodItems o) {
		// TODO Auto-generated method stub
		if (this.getQuantity() > o.getQuantity())
			return -1;
		else if (this.getQuantity() < o.getQuantity())
			return 1;
		else
			return 0;
	}

}
