package com.hsbc.practical;

import java.util.Date;

//enum Vegetarian {
//	YES, NO;
//}

public class Food implements Comparable<Food>{
	
	int itemCode;
	String itemName;
	int unitPrice;
	Date manufactureDate;
	Date expiryDate;
	String vegetarian;
	
	public Food(int itemCode, String itemName,int quantity, String vegetarian) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.vegetarian = vegetarian;
		this.quantity = quantity;
	}
	int quantity;
	public int getItemCode() {
		return itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public String getVegetarian() {
		return vegetarian;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "Food [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + ", Vegetarian=" + vegetarian
				+ ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Food o) {
		return o.quantity-this.quantity;
	}
	
	
	
}
