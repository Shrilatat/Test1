package com.hsbc.model;
/**
 * 
 * @author bk
 *purpose: Model class for apparel reusing attributes and methods of Product class
 */
public class Apparel extends Product{
	private String size;
	private String material;
	public Apparel() {}
	public Apparel(int itemCode, String itemName, float price, String size, String material,int quantity) {
		super(itemCode, itemName, price, quantity);
		this.size = size;
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + ", getItemCode()=" + getItemCode()
				+ ", getItemName()=" + getItemName() + ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()="
				+ getQuantity() + "]";
	}
	
	
	
	
	
	
	
	
}
