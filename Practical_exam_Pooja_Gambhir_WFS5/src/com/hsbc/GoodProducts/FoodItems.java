package com.hsbc.GoodProducts;
/*
 * Author:Pooja Gambhir
 * purpose: Food Items class POJO
 * 
 */
public class FoodItems extends Products{

	String dateM;
	String dateE;
	boolean veg;
	
	public FoodItems(int itemCode, String itemN, int unitPrice, int quantity, String dateM, String dateE, boolean veg) {
		super(itemCode, itemN, unitPrice, quantity);
		this.dateM = dateM;
		this.dateE = dateE;
		this.veg = veg;
	}

	public String getDateM() {
		return dateM;
	}

	public void setDateM(String dateM) {
		this.dateM = dateM;
	}

	public String getDateE() {
		return dateE;
	}

	public void setDateE(String dateE) {
		this.dateE = dateE;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	

	@Override
	public String toString() {
		return "FoodItems [dateM=" + dateM + ", dateE=" + dateE + ", veg=" + veg + "]";
	}
	

}
