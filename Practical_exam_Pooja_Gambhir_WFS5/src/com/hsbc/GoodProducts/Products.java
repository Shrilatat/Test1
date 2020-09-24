package com.hsbc.GoodProducts;
/*
 * Author:Pooja Gambhir
 * Purpose: Parent class Product
 */
public class Products implements Comparable<Products>{
	int itemCode;
	String itemN;
	int unitPrice;
	int quantity;
	
	public Products(int itemCode, String itemN, int unitPrice, int quantity) {
		//super();
		this.itemCode = itemCode;
		this.itemN = itemN;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemN() {
		return itemN;
	}

	public void setItemN(String itemN) {
		this.itemN = itemN;
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
		return "Products [itemCode=" + itemCode + ", itemN=" + itemN + ", unitPrice=" + unitPrice + ", quanitity=" + quantity+"]";
	}

	@Override
	public int compareTo(Products o) {
		return o.quantity-this.quantity;
	}


	
}
