package com.hsbc.model;
/*
 * 
 *  autor:abhinav
 * date:24/09/2020
 */
public class Electronics extends Items {
private int warranty;
public Electronics(int itemCode, String itemNAme, int unitPrice, int quantity,int sold, int warranty) {
	super(itemCode, itemNAme, unitPrice, quantity,sold);
	this.warranty = warranty;
}
public int getWarranty() {
	return warranty;
}
public void setWarranty(int warranty) {
	this.warranty = warranty;
}
@Override
public String toString() {
	return "Apparel [ItemCode=" + itemCode + ", ItemName" + itemNAme + ",Quantity Sold="+sold;

}}
