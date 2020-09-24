package com.hsbc.models;

/**
 * Model class which contains information about Apparels
 */
import java.util.Date;

public class Apparel implements Comparable<Apparel> {

	int itemCode;

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

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	String itemName;
	String size;

	String material;
	int Quantity;

	public Apparel() {
		super();

	}

	public Apparel(int itemCode, String itemName, String size, String material, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.size = size;
		this.material = material;
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", size=" + size + ", material=" + material
				+ ", Quantity=" + Quantity + "]";
	}

	@Override
	public int compareTo(Apparel o) {
		// TODO Auto-generated method stub
		if (this.getQuantity() > o.getQuantity())
			return -1;
		else if (this.getQuantity() < o.getQuantity())
			return 1;
		else
			return 0;
	}

}
