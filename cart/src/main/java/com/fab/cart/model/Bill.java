/**
 * 
 */
package com.fab.cart.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author akhilajay
 *
 */
public class Bill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3581301293959413585L;

	private int userType;

	private List<Cart> cart;

	private double totalAmout;

	/**
	 * @return the userType
	 */
	public int getUserType() {
		return userType;
	}

	/**
	 * @return the cart
	 */
	public List<Cart> getCart() {
		return cart;
	}

	/**
	 * @return the totalAmout
	 */
	public double getTotalAmout() {
		return totalAmout;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	/**
	 * @param totalAmout the totalAmout to set
	 */
	public void setTotalAmout(double totalAmout) {
		this.totalAmout = totalAmout;
	}

	/**
	 * @param userType
	 * @param cart
	 * @param totalAmout
	 */
	public Bill(int userType, List<Cart> cart, double totalAmout) {
		super();
		this.userType = userType;
		this.cart = cart;
		this.totalAmout = totalAmout;
	}

	/**
	 * 
	 */
	public Bill() {
		super();
	}

}
