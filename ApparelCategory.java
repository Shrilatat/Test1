package com.hsbc.model;

import java.util.Comparator;

//Author: Bhavya Chhabra
//Date: 24 Sept 2020
//Purpose: The following file intialise the variables required for Apparel Category items and contains the methods to add new items.

public class ApparelCategory implements Comparator<ApparelCategory> {
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private String size;
	private String material;
	private int quantity;

	public ApparelCategory() {
	}

	public ApparelCategory(int itemCode, String itemName, int unitPrice, String size, String material, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ApparelCategory [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", size=" + size + ", material=" + material + ", quantity=" + quantity + "]";
	}
	
	public int compareTo(ApparelCategory apparelItems) {
		if(quantity==apparelItems.quantity)
			return 0;
		else if(quantity>apparelItems.quantity)
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

	@Override
	public int compare(ApparelCategory o1, ApparelCategory o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
