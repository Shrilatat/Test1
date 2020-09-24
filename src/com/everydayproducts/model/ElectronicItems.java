package com.everydayproducts.model;

import java.util.Date;

public class ElectronicItems extends Products implements Comparable<ElectronicItems>{
	
	private int warranty;
	
	public ElectronicItems(String itemName, double price, int warranty, int quantity ) {
		this.itemCode = ++itemCodeTracker;
		this.itemName = itemName;
		this.unitPrice = price;
		this.warranty = warranty;
		this.quantity = quantity;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public int compareTo(ElectronicItems electronicItems) {
		// TODO Auto-generated method stub
		return (int) (this.getItemCode()-electronicItems.getItemCode());
	}
	
}
