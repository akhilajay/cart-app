/**
 * 
 */
package com.fab.cart.model;

import java.io.Serializable;

/**
 * @author akhilajay
 *
 */
public class Cart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3811077755491738807L;

	private int cartId;

	private String unitPrice;

	private String item;

	private int itemType;

	private String unit;

	private int quantity;

	private String currency;

	/**
	 * @return the cartId
	 */
	public int getCartId() {
		return cartId;
	}

	/**
	 * @return the unitPrice
	 */
	public String getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @return the itemType
	 */
	public int getItemType() {
		return itemType;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @param cartId
	 * @param unitPrice
	 * @param item
	 * @param itemType
	 * @param unit
	 * @param quantity
	 * @param currency
	 */
	public Cart(int cartId, String unitPrice, String item, int itemType, String unit, int quantity, String currency) {
		super();
		this.cartId = cartId;
		this.unitPrice = unitPrice;
		this.item = item;
		this.itemType = itemType;
		this.unit = unit;
		this.quantity = quantity;
		this.currency = currency;
	}

	/**
	 * 
	 */
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

}
