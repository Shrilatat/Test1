package com.hsbc.test1.model;
/**
 * Author Parth Bapat
 * Apparel Model class
 */
enum mat{COTTON,WOOL}
public class Apparel extends Product implements Comparable<Apparel> {
	private int price;
	private String size;
	private mat material;
	private int Quantity;
	
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apparel(int iCode, String iName, int price, String size, mat material, int quantity) {
		super(iCode,iName);

		this.price = price;
		this.size = size;
		this.material = material;
		Quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public mat getMaterial() {
		return material;
	}
	public void setMaterial(mat material) {
		this.material = material;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Apparel [iCode=" + this.getiCode() + ", iName=" + this.getiName() + ", size=" + size + ", material=" + material
				+ ", Quantity=" + Quantity + "]";
	}
	@Override
	public int compareTo(Apparel e) {
		if(this.getQuantity()<e.getQuantity())
			return -1;
		else if(this.getQuantity()>e.getQuantity())
			return 1;
		else return 0;
	}
	

}
