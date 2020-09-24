package com.hsbc.model;
/*
 * 
 *  autor:abhinav
 * date:24/09/2020
 */
public class Apparel extends Items{
	private String size;
	private String material;
	public Apparel(int itemCode, String itemNAme, int unitPrice, int quantity,int sold, String size, String material) {
		super(itemCode, itemNAme, unitPrice, quantity,sold);
		this.size = size;
		this.material = material;
		

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
		return "Apparel [ItemCode=" + itemCode + ", ItemName" + itemNAme + ",Quantity Sold="+sold+"]";
	}
	

}
