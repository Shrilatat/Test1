package com.hsbc.entityClass;

public class ApparelPojo {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int size;
	private String material;
	private int quantity;

	public ApparelPojo() {
	}

	public ApparelPojo(int itemCode, String itemName, double unitPrice, int size, String material, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ApparelPojo [itemCode=" + itemCode + ", itemName=" + itemName + ", size=" + size + ", material="
				+ material + ", quantity=" + quantity + "]";
	}

	public int compareTo(ApparelPojo p) {
		if (this.getQuantity() < p.getQuantity())
			return -1;
		else if (this.getQuantity() > p.getQuantity())
			return 1;
		else
			return 0;

	}
}
