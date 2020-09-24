package com.hsbc.model;
/*
 * 
 *  autor:abhinav
 * date:24/09/2020
 */
public class FoodItems extends Items{
private String dateOfManufacture;
private String dateOfExpiry;
private String checkVegetairan;
public FoodItems(int itemCode, String itemNAme, int unitPrice, int quantity,int sold, String dateOfManufacture,
		String dateOfExpiry, String checkVegetairan) {
	super(itemCode, itemNAme, unitPrice, quantity,sold);
	this.dateOfManufacture = dateOfManufacture;
	this.dateOfExpiry = dateOfExpiry;
	this.checkVegetairan = checkVegetairan;
	
}

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
public String getCheckVegetairan() {
	return checkVegetairan;
}
public void setCheckVegetairan(String checkVegetairan) {
	this.checkVegetairan = checkVegetairan;
}
@Override
public String toString() {
	return "FoodItems [ItemCode=" + itemCode + ", ItemName" + itemNAme + ",Quantity Sold="+sold;
}

}
