package com.hsbc.practical;

public class Electronics implements Comparable<Electronics>{
	
	int itemCode;
	String itemName;
	int unitPrice;
	int warranty;
	int quantity;
	public Electronics(int itemCode, String itemName, int quantity, int warranty) {
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
	public String getItemName() {
		return itemName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public int getWarranty() {
		return warranty;
	}
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(Electronics o) {
		return o.quantity-this.quantity;
	}
	
}
