package com.hsbc.test;

/**
 * @author Mauli purpose: To create a class for electronics items and its
 *         properties like item code, price, name etc
 */
public class Electronics implements Comparable<Electronics> {
	int warrantyInMonths;
	int itemCode = 0;
	String itemName = null;
	int quantity = 0;
	int unitPrice = 0;
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int warrantyInMonths, int itemCode, String itemName, int quantity, int unitPrice) {
		super();
		this.warrantyInMonths = warrantyInMonths;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}
	public void setWarrantyInMonths(int warrantyInMonths) {
		this.warrantyInMonths = warrantyInMonths;
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
		return "Electronics [warrantyInMonths=" + warrantyInMonths + ", itemCode=" + itemCode + ", itemName=" + itemName
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}
	
	public int compareTo(Electronics elec) {
		// TODO Auto-generated method stub
		return (int) (this.getItemCode()-elec.getItemCode());
	}

}
