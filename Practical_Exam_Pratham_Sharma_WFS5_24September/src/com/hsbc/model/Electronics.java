package com.hsbc.model;

/*
 * @Author Pratham Sharma
 * 
 * Model class for electornic item
 */
public class Electronics implements Comparable<Electronics>{
	private int itemCode;
	private String itemName;
	private float unitPrice;
	private int size;
	private int warrantyMonths;
	private int quantity;
	
	
	
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Electronics(int itemCode, String itemName, float unitPrice, int size, int warrantyMonths, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
		this.warrantyMonths = warrantyMonths;
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



	public float getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getWarrantyMonths() {
		return warrantyMonths;
	}



	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "["+itemCode+","+itemName+","+unitPrice+","+warrantyMonths+","+quantity+"]";
	}



	@Override
	public int compareTo(Electronics o) {
		// TODO Auto-generated method stub
		return this.getQuantity()-o.getQuantity();
	}
	
}
