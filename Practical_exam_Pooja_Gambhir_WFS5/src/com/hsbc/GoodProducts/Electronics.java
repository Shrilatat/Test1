package com.hsbc.GoodProducts;
/*
 * Author: Pooja Gambhir
 * Purpose: Electronics POJO 
 */
public class Electronics extends Products {
	
	int warranty;
	
	public Electronics(int itemCode, String itemN, int unitPrice, int quantity,int warranty) {
		super(itemCode, itemN, unitPrice, quantity);
		this.warranty=warranty;
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
