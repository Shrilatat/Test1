package com.hsbc.model;
public class FoodItems implements Comparable<FoodItems>{
	public Integer itemCode;
	public String itemName;
	public Integer unitPrice;
	public String dateManufacture;
	public String dateExpiry;
	public boolean Vegetarian;
	public Integer quantity;
	public FoodItems(Integer itemCode, String itemName, Integer unitPrice, String dateManufacture, String dateExpiry,
			boolean vegetarian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateManufacture = dateManufacture;
		this.dateExpiry = dateExpiry;
		this.Vegetarian = vegetarian;
		this.quantity = quantity;
	}
	public Integer getItemCode() {
		return itemCode;
	}
	public void setItemCode(Integer itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDateManufacture() {
		return dateManufacture;
	}
	public void setDateManufacture(String dateManufacture) {
		this.dateManufacture = dateManufacture;
	}
	public String getDateExpiry() {
		return dateExpiry;
	}
	public void setDateExpiry(String dateExpiry) {
		this.dateExpiry = dateExpiry;
	}
	public boolean isVegetarian() {
		return Vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		Vegetarian = vegetarian;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateManufacture=" + dateManufacture + ", dateExpiry=" + dateExpiry + ", Vegetarian=" + Vegetarian
				+ ", Quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(FoodItems f) {
		
		if(this.quantity>f.getQuantity())
			return 1;
		else if(this.quantity<f.getQuantity())
			return -1;
		else
			return 0;

		
	}
	
	
	
	

}
