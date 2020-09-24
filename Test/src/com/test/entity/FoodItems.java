package com.test.entity;

/**
 * @author siddhant nilesh shah
 *
 */
import java.util.Date;

public class FoodItems {

	private int itemCode, unitPrice, quantity;
	private String itemName;
	private Date dateOfManufacture, dateOfExpiry;
	private boolean vegeterian;
	
	public FoodItems() {
		super();
	}

	public FoodItems(int itemCode, int unitPrice, int quantity, String itemName, Date dateOfManufacture,
			Date dateOfExpiry, boolean vegeterian) {
		super();
		this.itemCode = itemCode;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.itemName = itemName;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegeterian = vegeterian;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(boolean vegeterian) {
		this.vegeterian = vegeterian;
	}

	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", itemName="
				+ itemName + ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry
				+ ", vegeterian=" + vegeterian + "]";
	}
	
	
}
