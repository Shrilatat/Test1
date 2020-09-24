package com.hsbc.model;

/**
 * 
 * @author Abhishek Kaushal
 * 
 * Electronics class is sub class of Product class and has attributes of Electronics.
 *
 */

public class Electronics extends Product {
	
	private int warranty;

	public Electronics(int itemCode, String itemName, int unitPrice, int quantity, int warranty) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + "]";
	}

	
	
	

}
