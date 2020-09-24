/**
 * 
 */
package com.hsbc.test;

import java.util.Date;

/**
 * @author Mauli purpose: To create a class for food items and its properties
 *         like item code, price, name etc
 */
public class FoodItems implements Comparable <FoodItems> {
	
	int itemCode = 0;
	String itemName = null;
	int quantity = 0;
	int unitPrice = 0;
	String mfgDate;
	String expDate;
	String isVeg;

	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	
	public FoodItems(int itemCode, String itemName, int quantity, int unitPrice, String mfgDate, String expDate,
			String isVeg) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.isVeg = isVeg;
	}





	public String getIsVeg() {
		return isVeg;
	}

	public void setIsVeg(String isVeg) {
		this.isVeg = isVeg;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}



	@Override
	public String toString() {
		return "FoodItems [mfgDate=" + mfgDate + ", expDate=" + expDate + ", isVeg=" + isVeg + ", itemCode=" + itemCode
				+ ", itemName=" + itemName + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}
	
	public int compareTo(FoodItems foodItems) {
		// TODO Auto-generated method stub
		return (int) (this.getItemCode()-foodItems.getItemCode());
	}
	

	}
