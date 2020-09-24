package com.hsbc.model;
/**
 * 
 * @author bk
 * purpose: model class for Electronic reusing Product class attributes and methods
 *
 */
public class Electronic extends Product{

	private int warranty;
	
	public Electronic() {}
	public Electronic(int itemCode, String itemName, float price, int warranty,int quantity) {
		super(itemCode, itemName, price, quantity);
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
		return "Electronic [warranty=" + warranty + ", getItemCode()=" + getItemCode() + ", getItemName()="
				+ getItemName() + ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()=" + getQuantity() + "]";
	}

	
}
