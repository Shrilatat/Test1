package com.hsbc.model;



//Author: Ritakshi Sen
//Purpose : This class is the base class for Apparel, Electronics , Food Items

public class Item {
	int itemCode;
	String name;
	int unitPrice;
	int Quantity;
	
	
	
	public Item(int itemCode, String name, int unitPrice, int quantity) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.unitPrice = unitPrice;
		Quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	

}
