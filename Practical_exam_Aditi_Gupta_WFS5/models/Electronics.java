package com.hsbc.models;

/**
 * Model class which contains information about Electronics
 */
public class Electronics implements Comparable<Electronics> {

	int warranty;

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

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	int itemCode;
	String itemName;
	int Quantity;

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(int warranty, int itemCode, String itemName, int quantity) {
		super();
		this.warranty = warranty;
		this.itemCode = itemCode;
		this.itemName = itemName;
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + ", itemCode=" + itemCode + ", itemName=" + itemName + ", Quantity="
				+ Quantity + "]";
	}

	@Override
	public int compareTo(Electronics o) {
		// TODO Auto-generated method stub
		if (this.getQuantity() > o.getQuantity())
			return -1;
		else if (this.getQuantity() < o.getQuantity())
			return 1;
		else
			return 0;
	}

}
