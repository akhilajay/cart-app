/**
 * 
 */
package com.fab.cart.model;

/**
 * @author akhilajay
 *
 */
public enum CartItemType {

	GROCERY(200, "Grocery"), CLOTH(201, "Fashion"), BEAUTY(203, "Beauty"),ELECTRONICS(204,"Electronics");

	private int cartItemCode;
	private String cartItemName;

	CartItemType(int itemCode, String itemName) {
		this.cartItemCode = itemCode;
		this.cartItemName = itemName;
	}

	/**
	 * @return the cartItemCode
	 */
	public int getCartItemCode() {
		return cartItemCode;
	}

	/**
	 * @return the cartItemName
	 */
	public String getCartItemName() {
		return cartItemName;
	}

}
