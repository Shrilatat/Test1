package com.everydayproducts.model;

public class Products {
	
	protected String itemName;
	
	protected long itemCode;
	
	protected double unitPrice;
	
	protected static long itemCodeTracker = 1000;
	
	protected int quantity;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getItemCode() {
		return itemCode;
	}
	
	
}
