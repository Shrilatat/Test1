package com.hsbc.model;


public class Electronics implements Comparable<Electronics>{
	public Integer itemCode;
	public String itemName;
	public Integer unitPrice;
	public Integer warranty;
	public Integer quantity;
	public Integer getItemCode() {
		return itemCode;
	}
	
	
	
	public Electronics(Integer itemCode, String itemName, Integer unitPrice, Integer warranty, Integer quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
		this.quantity = quantity;
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
	public Integer getWarranty() {
		return warranty;
	}
	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}



	@Override
	public int compareTo(Electronics o) {
		if(this.quantity>o.getQuantity())
			return 1;
		else if(this.quantity<o.getQuantity())
			return -1;
		else
			return 0;

	}
	
	
	
}
