package com.hsbc.test1.model;
/**
 * 
 * @author Parth Bapat
 * Electronic model class
 *
 */
public class Electronics extends Product implements Comparable<Electronics>{
	private int price;
	private int Quantity;
	private int warranty;
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int iCode, String iName, int price, int quantity, int warranty) {
		super(iCode,iName);
		this.price = price;
		Quantity = quantity;
		this.warranty = warranty;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	@Override
	public String toString() {
		return "Electronics [iCode=" + this.getiCode() + ", iName=" + this.getiName() + ", Quantity=" + Quantity + ", warranty=" + warranty
				+ "]";
	}
	@Override
	public int compareTo(Electronics e) {
		if(this.getQuantity()<e.getQuantity())
			return -1;
		else if(this.getQuantity()>e.getQuantity())
			return 1;
		else return 0;
	}
	
	
}
