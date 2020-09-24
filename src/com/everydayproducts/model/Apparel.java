package com.everydayproducts.model;

public class Apparel extends Products implements Comparable<Apparel>{
	
	private int size;
	
	private String material;
	
	public Apparel(String itemName, double price, int size, String material, int quantity ) {
		this.itemCode = ++itemCodeTracker;
		this.itemName = itemName;
		this.unitPrice = price;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int compareTo(Apparel apparel) {
		// TODO Auto-generated method stub
		return (int) (this.getItemCode()-apparel.getItemCode());
	}
	
	
}
