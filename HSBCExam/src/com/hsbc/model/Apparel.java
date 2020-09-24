package com.hsbc.model;
//Author: Ritakshi Sen
//Purpose : This class is contains data about Apparels in  the retail store
public class Apparel extends Item{
	
	int size;
	String material;
	
	//Constructor that initializes the Apparel parameters
	public Apparel(int itemCode, String name, int unitPrice, int quantity , int size , String material) {
		super(itemCode, name, unitPrice, quantity);
		this.size = size;
		this.material = material;
		
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

	
	


}
