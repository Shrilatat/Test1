package com.hsbc.companyDao;

/*
 * Author : Vishnu
 * Date : 24-09-2020
 * This is FoodItems class which contains elements required for FoodItem.
 * This also implements Comparable Interface which overrides compareTo for the TreeSet created.
 */

public class FoodItems implements Comparable<FoodItems>{
	private int code;
	private String name;
	private double price;
	private int quantity;
	private String dateOfManufacture;
	private String dateOfExpiry;
	private boolean isVegetarian;
	
	public FoodItems(int code, String name, double price, int quantity, String dateOfManufacture, String dateOfExpiry,
			boolean isVegetarian) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegetarian = isVegetarian;
	}
;

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	@Override
	public String toString() {
		return "FoodItems [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", isVegetarian="
				+ isVegetarian + "]";
	}
	@Override
	public int compareTo(FoodItems o) {
		// TODO Auto-generated method stub
		return o.quantity - this.quantity;
	}

}
