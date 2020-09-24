package com.hsbc.companyDao;

/*
 * Author : Vishnu
 * Date : 24-09-2020
 * This is Electronics class which contains attributes required for a electronics item.
 * This also implements Comparable Interface which overrides compareTo for the TreeSet created.
 */

public class Electronics implements Comparable<Electronics> {
	private int code;
	private String name;
	private double price;
	private int quantity;
	private int warranty;	
	
	public Electronics(int code, String name, double price, int quantity, int warranty) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.warranty = warranty;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", warranty=" + warranty + "]";
	}

	@Override
	public int compareTo(Electronics o) {
		// TODO Auto-generated method stub
		return o.quantity - this.quantity;
	}

}
