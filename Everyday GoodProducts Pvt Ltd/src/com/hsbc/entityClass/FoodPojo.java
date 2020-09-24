package com.hsbc.entityClass;

import java.util.*;

public class FoodPojo {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private Date dateOfManf;
	private Date dateOfExp;
	private String isVeg;
	private int quantity;

	public FoodPojo() {
	}

	public FoodPojo(int itemCode, String itemName, double unitPrice, Date dateOfManf, Date dateOfExp, String isVeg,
			int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfManf = dateOfManf;
		this.dateOfExp = dateOfExp;
		this.isVeg = isVeg;
		this.quantity = quantity;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getDateOfManf() {
		return dateOfManf;
	}

	public void setDateOfManf(Date dateOfManf) {
		this.dateOfManf = dateOfManf;
	}

	public Date getDateOfExp() {
		return dateOfExp;
	}

	public void setDateOfExp(Date dateOfExp) {
		this.dateOfExp = dateOfExp;
	}

	public String getIsVeg() {
		return isVeg;
	}

	public void setIsVeg(String isVeg) {
		this.isVeg = isVeg;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodPojo [itemCode=" + itemCode + ", itemName=" + itemName + ", isVeg=" + isVeg + ", quantity="
				+ quantity + "]";
	}

	public int compareTo(FoodPojo p) {
		if (this.getQuantity() < p.getQuantity())
			return -1;
		else if (this.getQuantity() > p.getQuantity())
			return 1;
		else
			return 0;

	}
}
