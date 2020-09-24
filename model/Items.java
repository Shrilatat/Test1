package com.hsbc.model;
/*
 * autor:abhinav
 * date:24/09/2020
 * 
 */
public class Items {
protected int itemCode;
protected String itemNAme;
private int unitPrice;
private int Quantity;
protected int sold;
public Items(int itemCode, String itemNAme, int unitPrice, int quantity,int sold) {
	super();
	this.itemCode = itemCode;
	this.itemNAme = itemNAme;
	this.unitPrice = unitPrice;
	this.Quantity = quantity;
	this.sold=sold;
}
public int getItemCode() {
	return itemCode;
}
public void setItemCode(int itemCode) {
	this.itemCode = itemCode;
}
public String getItemNAme() {
	return itemNAme;
}
public void setItemNAme(String itemNAme) {
	this.itemNAme = itemNAme;
}
public int getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(int unitPrice) {
	this.unitPrice = unitPrice;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public int getSold() {
	return sold;
}
public void setSold(int sold) {
	this.sold = sold;
}
@Override
public String toString() {
	return "Items [itemCode=" + itemCode + ", itemNAme=" + itemNAme + ", unitPrice=" + unitPrice + ", Quantity="
			+ Quantity + "]";
}

}
