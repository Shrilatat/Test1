package com.hsbc.model;
/**
 * 
 * @author bk
 * Purpose: Following a heirarchy , this class is parent class of other three
 * as 4 variables are common for the 3 categories
 *
 */
public class Product implements Comparable<Product>{
	//common attributes
	private int itemCode;
	private String itemName;
	private float unitPrice;
	private int quantity;
	
	//constructors
	public Product() {}
	public Product(int itemCode, String itemName, float unitPrice, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	//getters and setters
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//tostring methods
	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity="
				+ quantity + "]";
	}
	@Override
	public int compareTo(Product o) {
		return  o.getQuantity() -this.getQuantity();
	}
	
	
}
