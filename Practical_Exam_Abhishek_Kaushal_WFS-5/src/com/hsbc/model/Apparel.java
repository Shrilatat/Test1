package com.hsbc.model;

/**
 * 
 * @author Abhishek Kaushal
 * 
 * Apparel class is sub class of Product class and has attributes of Apparels.
 *
 */



public class Apparel extends Product {
	public enum MATERIAL
	{COTTON , WOOLEN}
	private int size;
	private MATERIAL material;

	public Apparel(int itemCode, String itemName, int unitPrice, int quantity, int size, MATERIAL material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.material = material;
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

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + "]";
	}


	
	

}
