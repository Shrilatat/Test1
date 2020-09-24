package com.hsbc.model;

/**
 * 
 * @author Abhishek Kaushal
 * 
 * Product class has common attributes of all category of items.
 *
 */

public class Product implements Comparable<Product> {
	
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private int quantity;
	
	private void Product() {}
	
	

	public Product(int itemCode, String itemName, int unitPrice, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
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



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity="
				+ quantity + "]";
	}



	@Override
	public int compareTo(Product product) {
		// TODO Auto-generated method stub
		if(this.quantity < product.quantity)
			return 1;
		else if(this.quantity > product.quantity)
			return -1;
		else
			return 0;
	}
	
	
	
	
}
