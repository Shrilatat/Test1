package com.test.entity;

/**
 * @author siddhant nilesh shah
 *
 */
public class Electronics {

	private int itemCode, unitPrice, warranty, quantity;
	private String itemName;

	/**
	 * 
	 */
	public Electronics() {
		super();
	}

	/**
	 * @param itemCode
	 * @param unitPrice
	 * @param warranty
	 * @param quantity
	 * @param itemName
	 */
	public Electronics(int itemCode, int unitPrice, int warranty, int quantity, String itemName) {
		super();
		this.itemCode = itemCode;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
		this.quantity = quantity;
		this.itemName = itemName;
	}

	/**
	 * @return the itemCode
	 */
	public int getItemCode() {
		return itemCode;
	}

	/**
	 * @param itemCode the itemCode to set
	 */
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * @return the unitPrice
	 */
	public int getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the warranty
	 */
	public int getWarranty() {
		return warranty;
	}

	/**
	 * @param warranty the warranty to set
	 */
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", unitPrice=" + unitPrice + ", warranty=" + warranty
				+ ", quantity=" + quantity + ", itemName=" + itemName + "]";
	}
	
	
}
