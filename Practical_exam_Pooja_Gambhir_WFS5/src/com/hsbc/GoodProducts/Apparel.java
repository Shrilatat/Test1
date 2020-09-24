package com.hsbc.GoodProducts;
/*
 * Author: Pooja Gambhir
 * Purpose: Apparel POJO
 */
public class Apparel extends Products {
	
	String size;
	String material;
	
	public Apparel(int itemCode, String itemN, int unitPrice, int quantity, String size, String material) {
		super(itemCode, itemN, unitPrice, quantity);
		this.size=size;
		this.material=material;
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

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + "]";
	}
}
