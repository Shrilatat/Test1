package com.hsbc.model;

import java.util.Comparator;

//Author: Bhavya Chhabra
//Date: 24 Sept 2020
//Purpose: The following file intialise the variables required for Electronics Category items and contains the methods to add new items.

public class ElectronicsCategory implements Comparator<ElectronicsCategory>{
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private int warranty;
	private int quantity;

	public ElectronicsCategory() {
	}

	public ElectronicsCategory(int itemCode, String itemName, int unitPrice, int warranty, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
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

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ElectronicsCategory [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}

	@Override
	public int compare(ElectronicsCategory o1, ElectronicsCategory o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int compareTo(ElectronicsCategory electronicsItems) {
		if(quantity==electronicsItems.quantity)
			return 0;
		else if(quantity>electronicsItems.quantity)
			return 1;
		else
			return -1;
	}

	/*
	 * @Override public int hashCode() { // TODO Auto-generated method stub return
	 * super.hashCode(); }
	 * 
	 * 
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub return super.equals(obj); }
	 */

}
