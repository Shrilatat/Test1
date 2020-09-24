package com.hsbc.test;

/**
 * @author Mauli purpose: To create a class for apparel items and its properties
 *         like item code, price, name etc
 */
public class Apparel implements Comparable<Apparel> {
	int itemCode = 0;
	String itemName = null;
	int quantity = 0;
	int unitPrice = 0;

	String material;

	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apparel(int itemCode, String itemName, int quantity, int unitPrice, String material) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.material = material;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + ", unitPrice="
				+ unitPrice + "]";
	}

	public int compareTo(Apparel app) {
		// TODO Auto-generated method stub
		return (int) (this.getItemCode()-app.getItemCode());
	}
	
}
