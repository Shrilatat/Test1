package com.hsbc.practical;

//enum Material{
//	COTTON, WOOLEN;
//}

public class Apparel implements Comparable<Apparel>{
	int itemCode;
	String itemName;
	int unitPrice;
	String size;
	String material;
	int quantity;
	public Apparel(int itemCode, String itemName, int quantity, String size, String material) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}
	public int getItemCode() {
		return itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public String getSize() {
		return size;
	}
	public String getMaterial() {
		return material;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", size="
				+ size + ", material=" + material + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Apparel o) {
		return o.quantity-this.quantity;
	}
	
	
}
