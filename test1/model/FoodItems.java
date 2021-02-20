package com.hsbc.test1.model;
/**
 * 
 * @author Parth Bapat
 * Food Item Module
 *
 */
public class FoodItems extends Product implements Comparable<FoodItems> {

	private int price;
	private String dom;
	private String doe;
	private String veg;
	private int Quantity;
	
	public FoodItems(int iCode, String iName, int price, String dom, String doe, String veg, int quantity) {
		super(iCode,iName);
		this.price = price;
		this.dom = dom;
		this.doe = doe;
		this.veg = veg;
		Quantity = quantity;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDom() {
		return dom;
	}
	public void setDom(String dom) {
		this.dom = dom;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public String getVeg() {
		return veg;
	}
	public void setVeg(String veg) {
		this.veg = veg;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "FoodItems [iCode=" + this.getiCode() + ", iName=" + this.getiName() + ", veg=" + veg + ", Quantity Sold=" + Quantity + "]";
	}
	@Override
	public int compareTo(FoodItems e) {
		if(this.getQuantity()<e.getQuantity())
			return -1;
		else if(this.getQuantity()>e.getQuantity())
			return 1;
		else return 0;
	}
	
	
	
}
