package com.hsbc.model;
//Author: Ritakshi Sen
//Purpose : This class is contains data about electronics items in  the retail store
public class Electronics extends Item {
	
	int warranty;
	
	//Constructor that initializes the Electronics parameters
	public Electronics(int itemCode, String name, int unitPrice, int quantity , int warranty) {
		super(itemCode, name, unitPrice, quantity);
		this.warranty=warranty;
		
	}

	
	
	public int getWarranty() {
		return warranty;
	}


	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}


	
	
	
	

}
