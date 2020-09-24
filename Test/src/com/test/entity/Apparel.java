/**
 * 
 */
package com.test.entity;

/**
 * @author siddhant nilesh shah
 *
 */
public class Apparel {

	private int itemCode,unitPrice,quantity;
	private String itemName,size,material;
	public Apparel() {
		super();
	}
	public Apparel(int itemCode, int unitPrice, int quantity, String itemName, String size, String material) {
		super();
		this.itemCode = itemCode;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.itemName = itemName;
		this.size = size;
		this.material = material;
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
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", itemName="
				+ itemName + ", size=" + size + ", material=" + material + "]";
	}
}
