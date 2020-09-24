package com.hsbc.model;


public class Apparel implements Comparable<Apparel>{
	public Integer itemCode;
	public String itemName;
	public Integer unitPrice;
	public String size;
	public String material;
	public Integer quantity;
	
	public Apparel(Integer itemCode, String itemName, Integer quantity, String size, String material,
			Integer unitPrice) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
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



	public Integer getQuantity() {
		return quantity;
	}



	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	

	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", size="
				+ size + ", material=" + material + ", Quantity=" + quantity + "]";
	}



	@Override
	public int compareTo(Apparel o) {
		if(this.quantity>o.getQuantity())
			return 1;
		else if(this.quantity<o.getQuantity())
			return -1;
		else
			return 0;
	}
}
