package com.hsbc.entityClass;

public class ElectronicsPojo {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private int quantity;

	public ElectronicsPojo() {
	}

	public ElectronicsPojo(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
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
		return "ElectronicsPojo [itemCode=" + itemCode + ", itemName=" + itemName + ", warranty=" + warranty
				+ ", quantity=" + quantity + "]";
	}

	public int compareTo(ElectronicsPojo p) {
		if (this.getQuantity() < p.getQuantity())
			return -1;
		else if (this.getQuantity() > p.getQuantity())
			return 1;
		else
			return 0;

	}

}
