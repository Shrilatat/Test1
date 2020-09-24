package com.hsbc.model;


import com.hsbc.enumerations.MATERIAL;


/*
 * @Author Pratham Sharma
 * 
 * Model class for Apparel item
 */

public class Apparel implements Comparable<Apparel>{
	private int itemCode;
	private String itemName;
	private float unitPrice;
	private int size;
	private MATERIAL material;
	private int quantity;
	
	
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Apparel(int itemCode, String itemName, float unitPrice, int size, MATERIAL material, int quantity) {
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


	public MATERIAL getMaterial() {
		return material;
	}


	public void setMaterial(MATERIAL material) {
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
		return "["+itemCode+","+itemName+","+unitPrice+","+material+","+quantity+"]";
	}


	@Override
	public int compareTo(Apparel o) {
		// TODO Auto-generated method stub
		return this.getQuantity()-o.getQuantity();
	}
	
}
