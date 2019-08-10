/**
 * 
 */
package com.fab.cart.model;

import java.io.Serializable;

/**
 * @author akhilajay
 *
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -704217763745208711L;
	
	private int userId;
	private String userStatus;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userStatus
	 */
	public String getUserStatus() {
		return userStatus;
	}
	/**
	 * @param userStatus the userStatus to set
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	/**
	 * @param userId
	 * @param userStatus
	 */
	public User(int userId, String userStatus) {
		super();
		this.userId = userId;
		this.userStatus = userStatus;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	
	

}
