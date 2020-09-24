package com.hsbc.companyDao;

/*
 * Author : Vishnu
 * Date : 24-09-2020
 * Class created for storing Apparel products having their own characteristics
 * It implements Comparable and overrides compareTo method because we are creating 
 * Treeset of this class so to give basis to sort the objects.
 */


public class Apparel implements Comparable<Apparel> {
	private int code;
	private String name;
	private double price;
	private int quantity;
	private SIZE size;
	private MATERIAL material;

	public Apparel(int code, String name, double price, int quantity, SIZE size, MATERIAL material) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
		this.material = material;
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

	public SIZE getSize() {
		return size;
	}

	public void setSize(SIZE size) {
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
		return "Apparel [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", size="
				+ size + ", material=" + material + "]";
	}

	@Override
	public int compareTo(Apparel o) {
		// TODO Auto-generated method stub
		return o.quantity - this.quantity;
	}

}
